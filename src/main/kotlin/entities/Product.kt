package entities

open class Product {
    var name:String
    var price:Double

    constructor(name:String,price:Double){
        this.name = name
        this.price = price
    }
    open fun priceTag():String{
        return name +" $ "+ price
    }

}