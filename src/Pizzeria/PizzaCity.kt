package Pizzeria

abstract class PizzaCity (
    val neapolitanPizzaPrice: Double, val romanPizzaPrice: Double,
    val sicilianPizzaPrice: Double, val tyroleanPizzaPrice: Double
)
{
    var neapolitanPizzaCount = 0
    var romanPizzaCount = 0
    var sicilianPizzaCount = 0
    var tyroleanPizzaCount = 0

    protected var checkCount = 0
    protected var discountMoney = 50

    protected var drinkCount = 0
    protected var drinkMoney = 200

    abstract fun neapolitanPizzaSale()
    abstract fun romanPizzaSale()
    abstract fun sicilianPizzaSale()
    abstract fun tyroleanPizzaSale()

    fun showStatistics() {
        println("Продано сицилийской пиццы: $sicilianPizzaCount")
        println("Продано неаполитанской пиццы: $neapolitanPizzaCount")
        println("Продано римской пиццы: $romanPizzaCount")
        println("Продано тирольской пиццы: $tyroleanPizzaCount")
        val count = sicilianPizzaCount + neapolitanPizzaCount + romanPizzaCount + tyroleanPizzaCount

        val money = neapolitanPizzaCount * neapolitanPizzaPrice + romanPizzaCount * romanPizzaPrice +
                sicilianPizzaCount * sicilianPizzaPrice + tyroleanPizzaCount * tyroleanPizzaPrice +
                drinkMoney * drinkCount - discountMoney * checkCount



        println ("Всего заработано денег: $money")

        if (this is Drink)
        {
            val drinkRate:Double = drinkCount.toDouble() / count * 100;
            println("Частота заказов кофе: $drinkRate")
            println("Сколько раз купили кофе: $drinkCount")
        }
        if (this is CheckPhoto)
        {
            val checkRate:Double = checkCount.toDouble() / count * 100;
            println("Частота показа чеков: $checkRate")
            println("Сколько раз показали чеки: $checkCount")
        }


    }
}