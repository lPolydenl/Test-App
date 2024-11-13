package Arrays

fun main()
{
    val alphabet:String = ("АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ");
    print("Введите ключевое слово: ");
    val keyWord = readln();
    print("Введите исходный текст: ");
    val text = readln();
    var newText = "";
    var j = 0;
    var arrayOfNumbers:Array<Int> = Array(keyWord.length, {0});
    var arrayOfNumbers2:Array<Int> =Array(text.length, {0});
    for(i in 0 until  keyWord.length)
    {
        for(k in 0 until alphabet.length)
        {
            if(alphabet[k] == keyWord[i])
            {
                arrayOfNumbers[i] = k + 1;
                break;
            }
        }
    }
    for(i in 0 until  text.length)
    {
        for(k in 0 until alphabet.length)
        {
            if(alphabet[k] == text[i])
            {
                arrayOfNumbers2[i] = k + 1;
                break;
            }
        }
    }
    for(i in 0..text.length - 1)
    {
        j++;
        if(j == keyWord.length)
        {
            j = 0;
        }
        arrayOfNumbers2[i] += arrayOfNumbers[j];
        if(arrayOfNumbers2[i] > alphabet.length)
        {
            arrayOfNumbers2[i] -= alphabet.length;
        }
    }
    for(i in 0 until  text.length)
    {
        for(k in 0 until alphabet.length)
        {
            if(k + 1 == arrayOfNumbers2[i])
            {
                newText += alphabet[k];
                break;
            }
        }
    }
    println(newText);

}