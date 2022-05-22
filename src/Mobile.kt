class Mobile {
    var Brand:String? = null
    var Model:String? = null
    var MRP:Int = 0
    var Discount:Float = 0f

    fun getActualPrice(M:Int, D:Float){
        // 𝑆𝑒𝑙𝑙𝑖𝑛𝑔𝑃𝑟𝑖𝑐𝑒=𝐿𝑖𝑠𝑡𝑃𝑟𝑖𝑐𝑒−𝐷𝑖𝑠𝑐𝑜𝑢𝑛𝑡

        MRP = M
        Discount = D
        var price = MRP - Discount
        println("_________________________________\n")
        println("The Actual price is :${price} \n")
    }
    fun printDeatils(B:String, M:String, MM:Int, D:Float){
        Brand = B
        Model = M
        MRP = MM
        Discount = D

        println("The Brand:$Brand \nThe Model:${Model} \nThe MRP:${MRP} \nThe Discount: $Discount" )
    }
}