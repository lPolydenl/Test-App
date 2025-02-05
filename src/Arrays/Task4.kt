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
var thirdList:MutableList<Int> = mutableListOf();
    for(i in 0 until firstList.size)
    {
        for(j in 0 until secondList.size)
        {
            if(firstList[i] == secondList[j])
            {
                thirdList.addLast(secondList[j])
                secondList.removeAt(j);
                break;
            }
        }
    }
    for(i in 0 until thirdList.size)
    {
        println(thirdList[i]);
    }
}