fun main()
{
    val min:Float = 10f;
    val max:Float = 1000f;
    var chance:Float = 5/6f;
    var money = 10000f;
    var casinoMoney = 0f;
    val chancePercentage = Math.round(chance * 100f);
    println("Добро пожаловать в казино господина Евгения Ильича! " +
            "Шанс выигрыша: $chancePercentage%. Минимальная ставка: $min. " +
            "Максимальная ставка: $max.");
    while(true)
    {
        if(money < min)
        {
            println("Вы проиграли все свои сбережения!");
            break;
        }
        println("Ваш баланс: $money");
        println("Баланс казино: $casinoMoney");
        println("Сколько рублей поставите?")
        var betStr = "";
        while (true)
        {

            betStr = readln();
            if(betStr == "%")
            {
                println("${Math.round(chance * 100f)}");
            }
            else
            {
                break;
            }
        }
        val bet = betStr.toFloat();
        if(bet < min || bet > max || bet > money)
        {
            println("Вы не можете поставить такую сумму!");
            continue;
        }
        val spin = Math.random().toFloat();
        if(spin < chance)
        {
            println("Вы выиграли!");
            chance *= 1 - (bet / (max * 1.3f));
            money += bet;
            casinoMoney -= bet;
        }
        else
        {
            println("Вы проиграли!");
            chance *= 1 + (bet / (max * 2f));
            money -= bet;
            casinoMoney += bet;

        }
    }
}