package entities

class UsedProduct:Product {
    var manufactureDate:String

    constructor(name: String, price: Double, manufactureDate: String) : super(name, price) {
        this.manufactureDate = manufactureDate
    }

    override fun priceTag():String{
       return name+"(Used) $ ${price} (Manufacture date: ${manufactureDate})"
    }
}