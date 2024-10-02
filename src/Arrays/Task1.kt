package Arrays

fun main()
{
    val x:Int = readln().toInt();
    val y:Int = readln().toInt();
    var array = arrayOfNulls<Array<Int>>(x);
    var stringArray = "";
    for(i in 0..x)
    {
        var row:Array<Int> = arrayOf();
        for(j in 0..y)
        {
            row[j] = readln().toInt();
            stringArray += row[j].toString()
        }
        array[i] = row;
    }
    stringArray.toSet()
    println(stringArray.length);
}