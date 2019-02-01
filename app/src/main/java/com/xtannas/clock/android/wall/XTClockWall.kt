package com.xtannas.clock.android.wall

import android.content.SharedPreferences
import android.content.SharedPreferences.OnSharedPreferenceChangeListener
import android.graphics.*
import android.os.Handler
import android.preference.PreferenceManager
import android.service.wallpaper.WallpaperService
import android.view.SurfaceHolder
import com.xtannas.clock.android.wall.base.*
import com.xtannas.clock.android.wall.grid.Cell
import com.xtannas.clock.android.wall.grid.Grid
import com.xtannas.clock.android.wall.time.Time
import com.xtannas.clock.android.wall.time.TimeBank
import java.util.concurrent.Executors
import java.util.concurrent.ScheduledExecutorService
import java.util.concurrent.ScheduledFuture
import java.util.concurrent.TimeUnit

class XTClockWall : WallpaperService() {

    override fun onCreateEngine(): Engine {
        return XTClockWallInstance().engine
    }


    private inner class XTClockWallInstance {

        val update by lazy(initializer = ::XTClockWallpaperUpdate)
        val engine by lazy(initializer = ::XTClockWallpaperEngine)


        private fun updateEngineWithNewTime() {
            engine.updateGridTo(TimeBank.search())
        }


        private inner class XTClockWallpaperUpdate {

            private lateinit var task: ScheduledFuture<*>


            fun load() {
                if (::task.isInitialized && !task.isCancelled) {
                    return
                }

                task = executor.scheduleAtFixedRate(::updateEngineWithNewTime, 0L, 1L, TimeUnit.SECONDS)
            }

            fun kill() {
                if (!::task.isInitialized) {
                    return
                }

                task.cancel(true)
            }

        }

        private inner class XTClockWallpaperEngine : Engine(), OnSharedPreferenceChangeListener {

            private val handler = Handler()
            private val drawing = Runnable(this::draw)


            private var w = 0
            private var h = 0
            private var o = false // unused obfuscate option

            private val p0 = Paint()
            private val p1 = Paint()

            private var visible = true

            private val grid = Grid()
            private var time = TimeBank.search()
            private val pref = PreferenceManager.getDefaultSharedPreferences(this@XTClockWall)

            init {
                updateGridTo(time)

                pref.registerOnSharedPreferenceChangeListener(this)

                this.o = pref.getBoolean("obfuscate", false)

                this.p0.isAntiAlias = true
                this.p1.isAntiAlias = true

                this.p0.color = Color.WHITE
                this.p1.color = Color.DKGRAY

                val textSize = ((GRID_CELL_S_X / 2F) + ((GRID_CELL_S_X / 2F) / 4F)).toFloat()
                this.p0.textSize = textSize
                this.p1.textSize = textSize

                update.load()
                handler.post(drawing)
            }


            override fun onVisibilityChanged(visible: Boolean) {
                this.visible = visible

                when (this.visible) {
                    true -> {
                        update.load()
                        handler.post(drawing)
                    }
                    else -> {
                        update.kill()
                        handler.removeCallbacks(drawing)
                    }
                }
            }

            override fun onSurfaceChanged(holder: SurfaceHolder?, format: Int, width: Int, height: Int) {
                this.w = width
                this.h = height

                super.onSurfaceChanged(holder, format, width, height)
            }

            override fun onSurfaceDestroyed(holder: SurfaceHolder?) {
                super.onSurfaceDestroyed(holder)

                this.visible = false

                update.kill()
                handler.removeCallbacks(drawing)
                pref.unregisterOnSharedPreferenceChangeListener(this)
            }

            override fun onSharedPreferenceChanged(sharedPreferences: SharedPreferences, key: String) {
                if (key != "obfuscate") return

                this.o = sharedPreferences.getBoolean("obfuscate", false)
            }


            fun updateGridTo(time: Time) {
                grid.cells.forEach { it.lit = false }
                time[grid].forEach { it.lit = true }
            }


            private fun draw() {
                val holder = surfaceHolder

                var canvas: Canvas? = null


                try {
                    canvas = holder.lockCanvas()

                    if (canvas != null) {
                        draw(canvas)
                    }

                } finally {

                    if (canvas != null) {
                        holder.unlockCanvasAndPost(canvas)
                    }

                }


                handler.removeCallbacks(drawing)

                if (visible) {
                    handler.postDelayed(drawing, 1000L)
                }
            }

            private fun draw(canvas: Canvas) {
                canvas.drawColor(Color.TRANSPARENT, PorterDuff.Mode.CLEAR)

                grid.cells.forEach { cell ->
                    canvas.drawText(cell.txt, cellX(cell, canvas) + textX(cell), cellY(cell, canvas) + textY(cell), if (cell.lit) this.p0 else this.p1)
                }
            }


            private fun cellX(cell: Cell, canvas: Canvas): Float {
                return (((canvas.width / 2F) - ((GRID_SIZE_X * GRID_CELL_S_X) / 2F)) + (cell.x * GRID_CELL_S_X)).toFloat()
            }

            private fun cellY(cell: Cell, canvas: Canvas): Float {
                return ((((canvas.height / 2F) - ((GRID_SIZE_Y * GRID_CELL_S_Y) / 2F)) + (cell.y * GRID_CELL_S_Y)) - (canvas.height / HEIGHT_FACTOR)).toFloat()
            }

            private fun textX(cell: Cell): Float {
                val rect = Rect()
                (if (cell.lit) this.p0 else this.p1).getTextBounds(cell.txt, 0, cell.txt.length, rect)

                return ((GRID_CELL_S_X / 2F) - (rect.width() / 2F)).toFloat()
            }

            private fun textY(cell: Cell): Float {
                val textS = (if (cell.lit) this.p0 else this.p1).textSize
                return (((GRID_CELL_S_Y / 2F) + textS / 2F) - (textS / 7F)).toFloat()
            }

        }

    }


    private companion object {

        val executor: ScheduledExecutorService = Executors.newSingleThreadScheduledExecutor()

    }

}