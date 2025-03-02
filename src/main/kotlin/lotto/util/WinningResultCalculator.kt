package lotto.util

import lotto.model.Lotto
import lotto.model.LottoTickets

class WinningResultCalculator(private val winnerNumber: Lotto, private val bonusNumber: Int, val lottoTickets: LottoTickets) {
    fun calculcateResult() {
        var result = mutableMapOf<Int, Int>()
        lottoTickets.tickets.forEach({
            val sameNumberCount = it.countSameNumbers(winnerNumber)
            countResult(result, sameNumberCount, 1)
        })
    }
    fun countResult(result: MutableMap<Int, Int>, key: Int, value: Int) : Map<Int, Int> {
        if(result.containsKey(key)) {
            result[key] = result[key]!! + value
            return result
        }
        result[key] = value
        return result
    }
}