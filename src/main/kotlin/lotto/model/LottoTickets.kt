package lotto.model

class LottoTickets(val amount: Int) {
    val purchaseCount = Purchase.getPurchaseCount(amount)
    private var lottoTickets = ArrayList<Lotto>()
    fun getLottoTickets(): ArrayList<Lotto> {
        for (i in 0..purchaseCount - 1) {
            val lotto = Lotto.getLotto()
            lottoTickets.add(lotto)
        }
        return lottoTickets
    }
}