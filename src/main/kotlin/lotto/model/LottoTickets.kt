package lotto.model


class LottoTickets(val ticketNumber: Int) {
    var lottoTickets = ArrayList<List<Int>>()

    fun getLottoTicket(): ArrayList<List<Int>> {

        for (i in 0..ticketNumber - 1) {

            val lotto = Lotto()
            lottoTickets.add(lotto.getRandoms())

        }
        return lottoTickets
    }
}