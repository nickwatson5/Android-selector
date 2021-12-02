package nickwatson.lib.productselection

interface CarouselLazyLoadListener {

    fun onLoadMore(page: Int, totalItemsCount: Int, view: CarouselView)

}
