package lotto.model

class Purchase(val amount: Int) {
    companion object {
        fun getPurchaseCount(amount: Int): Int = amount / 1000
    }
}