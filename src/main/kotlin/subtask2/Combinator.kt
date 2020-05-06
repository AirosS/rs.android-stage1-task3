package subtask2

class Combinator {

    fun checkChooseFromArray(array: Array<Int>): Int? {
        for(i in 0..array[1])
        {
            if(factorial(i)*factorial(array[1]-i) == factorial(array[1])/array[0])
                return i
        }
        return null
    }
    fun factorial(k: Int): Long
    {
         if (k >= 1)
            return k * factorial(k - 1)
        else return 1
    }
}