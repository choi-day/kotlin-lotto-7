package lotto.controller

object TiketsController {
    fun getPurchaseNumber(purchase: Int): Int = purchase / 1000
}
