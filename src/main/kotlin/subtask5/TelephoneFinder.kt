package subtask5

import java.lang.StringBuilder

class TelephoneFinder {

    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        if (number.toInt()<0) return null
        else
        {
            var result = mutableListOf<String>()
            val digit = listOf(
            listOf('8'),
            listOf('4','2'),
            listOf('1','5','3'),
            listOf('2','6'),
            listOf('1','5','7'),
            listOf('2','4','8','6'),
            listOf('3','5','9'),
            listOf('4','8'),
            listOf('5','7','9','0'),
            listOf('6','8'))
            for ((i,k) in number.withIndex() )
            {
            var phone = StringBuilder(number)
                for (n in digit[k.toString().toInt()])
                {
                phone[i] = n
                result.add(String(phone))
                }
            }
            return result.toTypedArray()
        }
    }
}

