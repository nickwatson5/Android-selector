package nickwatson.lib.productselection

interface CarouselListener {
    /**
     * @param position current position
     */
    fun onPositionChange(position: Int)

    /**
     * @param dx delta x
     * @param dy delta y
     */
    fun onScroll(dx: Int, dy: Int)
}
