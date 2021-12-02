package nickwatson.carouselview.sample

import nickwatson.lib.productselection.CarouselModel

class EmptySampleModel constructor(private val text: String) : CarouselModel() {

    fun getText(): String {
        return text
    }
}