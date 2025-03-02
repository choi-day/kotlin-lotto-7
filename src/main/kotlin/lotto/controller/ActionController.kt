package lotto.controller

import lotto.model.LottoTickets
import lotto.model.Purchase
import lotto.view.Input

import lotto.view.Output

object ActionController {
    fun startLotto(): Int {
        Output.printPurchaseMessage()
        val amount = Input.getAmount()
        val purcharseCount = Purchase.getPurchaseCount(amount)
        Output.printTicketNumberMessage(purcharseCount)
        return purcharseCount
    }

    fun getLottoTickets() {
        val lottoTickets = LottoTickets(startLotto(), ArrayList())
        val getLottoTickets = lottoTickets.getLottoTickets()
        Output.printTickets(getLottoTickets.tickets)
    }
}