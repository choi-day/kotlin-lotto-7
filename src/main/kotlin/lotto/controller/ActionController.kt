package lotto.controller

import lotto.model.LottoTickets
import lotto.model.Purchase
import lotto.view.Input

import lotto.view.Output

object ActionController {
    fun startLotto(): Int {
        Output.printPurchase()
        val amount = Input.getAmount()
        val purcharseCount = Purchase.getPurchaseCount(amount)
        Output.printTicketNumber(purcharseCount)
        return amount
    }

    fun getLottoTicketsResult() {
        val lottoTickets = LottoTickets(startLotto())
        Output.printTickets(lottoTickets.getLottoTickets())
    }

}