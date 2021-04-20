package application

import entities.ImportedProduct
import entities.Product
import entities.UsedProduct
import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    var list: MutableList<Product> = mutableListOf()
    print("Enter the number of products:")
    var n = sc.nextInt()
    for(i in 1..n){
        println("Product #${i} data:")
        print("Common, used or imported (c/u/i)?")
        var ch:Char = sc.next().single()
        print("Name:")
        sc.nextLine()
        var name = sc.nextLine()
        print("Price:")
        var price = sc.nextDouble();
        if(ch == 'i'){
            print("Customs free:")
            var customFree = sc.nextDouble()
            list.add(ImportedProduct(name,price,customFree))
        }else if(ch == 'c'){
             list.add(Product(name,price))
        }else if(ch == 'u'){
            print("Manufacture date (dd/MM/yyyy):")
            sc.nextLine()
            val manufactureDate = sc.nextLine()
            list.add(UsedProduct(name,price,manufactureDate))
        }
    }
    println()
    println("PRICE TAGS")
    list.forEach {
        println(it.priceTag())
    }


    sc.close()
}