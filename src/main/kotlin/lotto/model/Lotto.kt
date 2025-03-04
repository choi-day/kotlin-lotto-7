package lotto.model

import lotto.util.LottoNumberGenerator

class Lotto(private val numbers: List<Int>) {
    init {
        require(numbers.size == 6) { "[ERROR] 로또 번호는 6개여야 합니다." }
    }

    override fun toString(): String {
        return numbers.toString()
    }

    companion object {
        fun getRandomLotto(): Lotto {
            val Lotto = Lotto(LottoNumberGenerator.generator())
            return Lotto
        }
    }

    fun countSameNumbers(winnerNumber: Lotto): Int {
        return this.numbers.count{it -> winnerNumber.numbers.contains(it)}
    }

    fun checkBonusNumber(bonus: Int): Boolean {
        return this.numbers.contains(bonus)
    }
}