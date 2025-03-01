package lotto.model

import lotto.util.LottoNumberGenerator

class LottoTickets(val ticketNumber: Int) {

    private var lottoTickets = ArrayList<Lotto>()
    fun getLottoTicket(): ArrayList<Lotto> {
        for (i in 0..ticketNumber - 1) {
            val lotto = Lotto(LottoNumberGenerator.generator())
            lottoTickets.add(lotto)
        }
        return lottoTickets
    }
}
