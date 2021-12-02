package nickwatson.carouselview.sample

import nickwatson.lib.productselection.CarouselModel

class SampleModel constructor(private var id: Int) : CarouselModel() {

    fun getId(): Int {
        return id
    }
}
