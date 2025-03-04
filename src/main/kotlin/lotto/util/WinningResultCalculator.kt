package lotto.util

import lotto.model.Lotto
import lotto.model.LottoTickets

class WinningResultCalculator(private val winnerNumber: Lotto, private val bonusNumber: Int, val lottoTickets: LottoTickets) {
    fun calculcateResult() {
        var result = mutableMapOf<Int, Int>(3 to 0, 4 to 0, 5 to 0, 6 to 0, 0 to 0)
        lottoTickets.tickets.forEach({
            val sameNumberCount = it.countSameNumbers(winnerNumber)
            if (sameNumberCount == 5) {bonusResult(result, it)}
            countResult(result, sameNumberCount, 1)
        })
    }

    fun bonusResult(result: MutableMap<Int, Int>, lotto: Lotto) : Map<Int, Int> {
        if (lotto.checkBonusNumber(bonusNumber)) {
            result[0] = result[0]!!.plus(1)
            return result
        }
        result[5] = result[5]!!.plus(1)
        return result
    }

    fun countResult(result: MutableMap<Int, Int>, key: Int, value: Int) : Map<Int, Int> {
        if(result.containsKey(key)) {
            result[key] = result[key]!!.plus(value)
            return result
        }
        result[key] = value
        return result
    }

}