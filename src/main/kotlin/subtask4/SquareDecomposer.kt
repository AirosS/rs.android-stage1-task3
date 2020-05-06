package subtask4
import kotlin.math.sqrt
class SquareDecomposer {
    fun function(value: Int, k: Int): Array<Int>? {
        for (i in k downTo 1) {
            val sq = i * i
            val delta = value - sq

            if (delta == 0) return arrayOf(i)
            if (delta < 0) return null
            var sqrt = sqrt(delta.toDouble()).toInt()
            if (sqrt >= i) {
                sqrt = i - 1
            }
            val result = function(delta, sqrt)
            if (result != null) return result + arrayOf(i)
        }
            return null
        }
        fun decomposeNumber(number: Int): Array<Int>? {
            return function(number * number, number - 1)
        }

    }