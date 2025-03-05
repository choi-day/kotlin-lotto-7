package lotto.controller

import lotto.model.Lotto
import lotto.model.LottoTickets
import lotto.model.Profit
import lotto.model.Purchase
import lotto.util.WinningResultCalculator
import lotto.view.Input
import lotto.view.Output

object ActionController {
    fun runLotto() {
        val lottoTickets = LottoTickets(startLotto(), ArrayList()).getLottoTickets()
        getLottoTickets(lottoTickets)
        val winnerNumber = getWinnerNumber()
        val bonusNumber = getBonusNumber()
        val result = getWinnerResult(lottoTickets, winnerNumber, bonusNumber)
        getProfit(lottoTickets, result)
    }

    private fun startLotto(): Int {
        Output.printPurchaseMessage()
        val purchase = Input.getPurchase()
        val purcharseCount = Purchase.getPurchaseCount(purchase)
        Output.printTicketNumberMessage(purcharseCount)
        return purcharseCount
    }

    private fun getLottoTickets(lottoTickets: LottoTickets) {
        Output.printTickets(lottoTickets.tickets)
    }

    private fun getWinnerNumber(): Lotto{
        Output.printWineerNumberMessage()
        val winnerNumber =  Lotto(Input.getWinnerNumber().map { it.toInt() })
        return winnerNumber
    }

    private fun getBonusNumber(): Int{
        Output.printBonusNumberMessage()
        val bonusNumber = Input.getBonusNumber()
        return bonusNumber
    }

    private fun getWinnerResult(lottoTickets: LottoTickets, winnerNumber: Lotto, bonusNumber: Int): Map<Int, Int> {
        val winningResultCalculator = WinningResultCalculator(winnerNumber, bonusNumber, lottoTickets)
        val result = winningResultCalculator.calculcateResult()
        Output.printWinningResultMessage()
        Output.printWinningResult(result)
        return result
    }

    private fun getProfit(lottoTickets: LottoTickets, result: Map<Int, Int>) {
        val profit = Profit(lottoTickets.purchaseCount, result)
        Output.printProfitMessage(profit.calculateProfit())
    }
}