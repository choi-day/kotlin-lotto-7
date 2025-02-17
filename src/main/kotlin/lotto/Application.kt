package lotto

import lotto.controller.ActionController
import lotto.controller.TiketsController
import lotto.controller.TiketsController.getPurchaseNumber
import lotto.model.LottoTickets

fun main() {
    ActionController.startLotto()
    ActionController.getLottoTicketsResult()
}
