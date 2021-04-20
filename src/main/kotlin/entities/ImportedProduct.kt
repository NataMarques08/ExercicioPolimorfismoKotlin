package entities

class ImportedProduct:Product {
    var customFree:Double

    constructor(name: String, price: Double, customFree: Double) : super(name, price) {
        this.customFree = customFree
    }


    override fun priceTag():String{
        return "${name} $ ${totalPrice()} (Custom free ${customFree})"
    }

    fun totalPrice(): Double {
      return price + customFree
    }
}

