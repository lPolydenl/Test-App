fun main(){
    var input:Int = readln().toInt();
    var outputReversed:String = "";
    do {
        outputReversed += (input % 2).toString();
        input /= 2;
    }
    while(input >= 1)
    var output:String = "";
    for(i in outputReversed.length - 1 downTo 0)
    {
        output += outputReversed[i];
    }
    println(output);
}