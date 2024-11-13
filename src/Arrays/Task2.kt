package Arrays

fun main()
{
    val array:Array<Array<Int>> = arrayOf(
            arrayOf(1, 0, 0, 0 ,0),
    arrayOf(0, 1, 0, 0, 0),
    arrayOf(0, 0, 1, 0, 0),
        arrayOf(0, 0, 0, 1, 0),
        arrayOf(0, 0, 0, 0, 1)
            );
    for(i in 0..array.size - 1)
    {
        for (j in 0..array.size - 1)
        {
            if(array[i][j] != array[j][i])
            {
                println("Матрица не симметрична");
                return;
            }
        }
    }
    println("Матрица симметрична");
}