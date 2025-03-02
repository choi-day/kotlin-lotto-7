package lotto.view

import camp.nextstep.edu.missionutils.Console

object Input {
    fun getAmount(): Int = Console.readLine().toInt()
    fun getWinnerNumber(): String = Console.readLine()
    fun getBonusNumber(): Int = Console.readLine().toInt()
}
