package lotto.view

import lotto.model.Lotto

object Output {
    fun printPurchaseMessage() = println("구입금액을 입력해 주세요.")

    fun printTicketNumberMessage(purcharseCount: Int) = println("${purcharseCount}개를 구매했습니다.")

    fun printTickets(tickets: ArrayList<Lotto>) = print(tickets.joinToString("\n"))

    fun printWineerNumberMessage() = println("당첨 번호를 입력해 주세요.")

    fun printBonusNumberMessage() = println("보너스 번호를 입력해 주세요.")
}