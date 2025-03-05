package lotto.view

import camp.nextstep.edu.missionutils.Console

object Input {
    fun getPurchase(): Int = Console.readLine().toInt()
    fun getWinnerNumber(): List<String> = Console.readLine().split(',')
    fun getBonusNumber(): Int = Console.readLine().toInt()
}
