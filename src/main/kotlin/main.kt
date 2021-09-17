fun main() {
    val amount = 4701_00
    val persentTax = amount * 0.0075
    val fixTax = 35_00
    val result = if (persentTax < fixTax) fixTax else persentTax
    println(result)
}