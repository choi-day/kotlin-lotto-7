package lotto.controller

import camp.nextstep.edu.missionutils.Randoms
import lotto.model.Lotto
import lotto.model.LottoTickets

private const val MAX_RANGE = 45
private const val MIN_RANGE = 1
private const val LOTTO_NUMBER_COUNT = 6

object TiketsController {
    fun getPurchaseNumber(purchase: Int): Int = purchase / 1000
    fun getRandomNumber(): List<Int> =
        Randoms.pickUniqueNumbersInRange(MIN_RANGE, MAX_RANGE, LOTTO_NUMBER_COUNT).sorted()

//    fun getLottoTickets() {
//        val a = lottoTickets.getLottoTicket()
////        a.forEach { lotto -> println(lotto.getNumbers) }
//    }
}
