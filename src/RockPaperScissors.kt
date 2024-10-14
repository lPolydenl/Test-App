import kotlin.math.roundToInt
import kotlin.random.Random

fun main()
{
    println("1 - камень");
    println("2 - ножницы");
    println("3 - бумага");
    while(true)
    {
        val choice:Int = readln().toInt();
        if(choice < 1 || choice > 3)
        {
            println("Ошибка!");
            continue;
        }
        val enemyChoice:Int = play();
        if(choice == enemyChoice)
        {
            println("Ничья!")
        }
        else if((choice == 1 && enemyChoice == 3) || (choice == 2 && enemyChoice == 1) || (choice == 3 && enemyChoice == 2))
        {
            println("Вы проиграли!");
        }
        else
        {
            println("Вы выиграли!");
        }
    }
}
fun play():Int
{
    val q:Int = (Math.random() * 2).roundToInt() + 1;
    when (q) {
        1 -> println("Камень!");
        2 -> println("Ножницы!");
        3 -> println("Бумага!");
    }
    return q;
}