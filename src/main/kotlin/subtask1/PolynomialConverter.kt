package subtask1
import kotlin.math.abs
class PolynomialConverter {

    fun convertToStringFrom(numbers: Array<Int>): String? {
        if (numbers.isNullOrEmpty()) return null
        var result =""
        var i=0
        var k =numbers.size-1
        for(i in numbers.indices) {
            if (numbers[i] != 0) {
                if (numbers[i] < 0) {
                    result = result + " - "
                }
                if ((numbers[i] > 0) && (i != 0)) {
                    result = result + " + "
                }
                if ((numbers[i] != 1) && (numbers[i] != -1)) {
                    result = result + abs(numbers[i])
                }
                if(k>1){
                if (i == numbers.size) {
                    result = result + "x"
                }
                if (i != numbers.size) {
                    result = result + "x^" + k
                }}
                if(k==1)
                {if (i == numbers.size) {
                    result = result + "x"
                }
                    if (i != numbers.size) {
                        result = result + "x"
                    }}
                k--
            }
            if(numbers[i]==0)
            {
            k--}
        }
        return result.toString()
    }
}
