package lotto.model

class WinnerNumber(private val winnerNumbers: List<Int>) {

    override fun toString(): String {
        return winnerNumbers.toString()
    }

    companion object {
        fun getWinnerNumberList(winnerNumber: String): WinnerNumber {
            val winnerNumberString = winnerNumber.split(',')
            val winnerNumberInt = winnerNumberString.map { it.toInt() }
            return WinnerNumber(winnerNumberInt)
        }
    }
}