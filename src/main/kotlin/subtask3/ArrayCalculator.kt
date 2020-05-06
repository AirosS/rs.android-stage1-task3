package subtask3
import java.lang.Integer.max
import kotlin.math.absoluteValue
class ArrayCalculator {
    fun maxProductOf(numberOfItems: Int, itemsFromArray: Array<Any>): Int {
        var inresult: Array<Int> = itemsFromArray.filterIsInstance<Int>().toTypedArray()
        val ind = numberOfItems
        var outresult=1
        if(inresult.size>0)
        {
            if(ind>inresult.size)
            {
                for(i in inresult)  outresult *=i
                return outresult
            }
        }
        return 0
    }
}
