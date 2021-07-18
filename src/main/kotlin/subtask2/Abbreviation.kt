package subtask2

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String {

        var answer="YES"
        //change by input strings case to lower
        var firstStr = a.toLowerCase()
        val secondStr = b.toLowerCase()
        //search all chars from secondStr in firstStr
        for (i in secondStr) {
                if (firstStr.contains(i)){
                   firstStr=firstStr.substringAfter(i)
                } else {
                answer="NO"
                    break
                }
            }
       return answer
    }
}

