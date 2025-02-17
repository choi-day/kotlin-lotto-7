package lotto.view

import lotto.view.Input.getPurchase

object Output {
    fun printPurchase() = println("구입금액을 입력해 주세요.")

    fun printTicketNumber() = println("${getPurchase()}개를 구매했습니다.")

    fun printTickets(tickets: ArrayList<List<Int>>) = println(tickets.joinToString("\n"))
}
