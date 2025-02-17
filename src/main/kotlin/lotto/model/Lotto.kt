package lotto.model

import camp.nextstep.edu.missionutils.Randoms

private const val MAX_RANGE = 45
private const val MIN_RANGE = 1
private const val LOTTO_NUMBER_COUNT = 6

class Lotto(private val numbers: List<Int>) {
    init {
        require(numbers.size == 6) { "[ERROR] 로또 번호는 6개여야 합니다." }
        numbers = Randoms.pickUniqueNumbersInRange(MIN_RANGE, MAX_RANGE, LOTTO_NUMBER_COUNT).sorted()

    }

    fun getRandoms():List<Int>{
        numbers = Randoms.pickUniqueNumbersInRange(MIN_RANGE, MAX_RANGE, LOTTO_NUMBER_COUNT).sorted()
        return numbers
    }
}
