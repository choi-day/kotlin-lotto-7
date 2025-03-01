package lotto.model

import lotto.util.LottoNumberGenerator

class LottoTickets(val amount: Int) {
    val purchaseCount = Purchase.getPurchaseCount(amount)
    private var lottoTickets = ArrayList<Lotto>()
    fun getLottoTickets(): ArrayList<Lotto> {
        for (i in 0..purchaseCount - 1) {
            val lotto = Lotto(LottoNumberGenerator.generator())
            lottoTickets.add(lotto)
        }
        return lottoTickets
    }
}