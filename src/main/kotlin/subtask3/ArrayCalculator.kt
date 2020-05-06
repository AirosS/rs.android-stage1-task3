package subtask3
import kotlin.math.absoluteValue
import kotlin.math.abs
class ArrayCalculator {

    fun maxProductOf(numberOfItems: Int, itemsFromArray: Array<Any>): Int {
        val inresult = itemsFromArray.filterIsInstance<Int>().sortedBy { it.absoluteValue }.reversed()
        val delta = inresult.filter { i -> i>= 0 }
        val ind = numberOfItems
        var alfa=1
        var outresult = 1
        if(inresult.size>0){
            if(inresult.size<= ind)
            {
                for (i in inresult) outresult =outresult* i
                return outresult
            }
            for (i in 0 until ind) alfa =alfa* delta[i]
            for (i in 0 until ind) outresult =outresult*inresult[i]
            if (alfa >= outresult) return alfa
            else return outresult
        }
        return 0

    }
}