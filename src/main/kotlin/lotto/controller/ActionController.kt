package lotto.controller

import lotto.model.Lotto
import lotto.model.LottoTickets
import lotto.model.Purchase
import lotto.util.WinningResultCalculator
import lotto.view.Input
import lotto.view.Output

object ActionController {
    val lottoTickets = LottoTickets(startLotto(), ArrayList()).getLottoTickets()

    fun startLotto(): Int {
        Output.printPurchaseMessage()
        val amount = Input.getAmount()
        val purcharseCount = Purchase.getPurchaseCount(amount)
        Output.printTicketNumberMessage(purcharseCount)
        return purcharseCount
    }

    fun getLottoTickets() {
        Output.printTickets(lottoTickets.tickets)
    }

    fun getWinnerNumber(): Pair<Lotto, Int> {
        Output.printWineerNumberMessage()
        val winnerNumber =  Lotto(Input.getWinnerNumber().map { it -> it.toInt() })
        Output.printBonusNumberMessage()
        val bonusNumber = Input.getBonusNumber()
        return Pair(winnerNumber, bonusNumber)
    }

    fun getWinnerResult() {
        val (winnerNumber, bonusNumber) = getWinnerNumber()
        val winningResultCalculator = WinningResultCalculator(winnerNumber, bonusNumber, lottoTickets)
        val result = winningResultCalculator.calculcateResult()
    }
}