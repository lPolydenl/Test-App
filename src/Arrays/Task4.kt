package Arrays

fun main()
{
    println("Введите элементы двух массивов. Чтобы закончить заполнение массива, отправьте точку.")
    var firstList:MutableList<Int> = mutableListOf();
    var secondList:MutableList<Int> = mutableListOf();
    while(true)
    {
        var i = readln();
        if(i == ".")
        {
            break;
        }
        firstList.addLast(i.toInt());
    }
    while(true) {
        var i = readln();
        if (i == ".") {
            break;
        }
        secondList.addLast(i.toInt());
    }
}