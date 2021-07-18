package subtask3


import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass


class Blocks {


    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {

        var resultInt = 0
        var resultStr = ""
        var resultDate = LocalDate.MIN

        return when (blockB) {
            // if blockB is link by String class, search all Strings in blockA and add up its
            String::class -> {
                for (s in blockA) {
                    if (s is String) {
                        resultStr += s
                    }

                }
                resultStr
            }
            // if blockB is link by Int class, search all Numbers in blockA and add up its
            Int::class -> {
                for (i in blockA) {
                    if (i is Int) {
                        resultInt += i
                    }

                }

                resultInt
            }
            // if blockB is link by LocalDate class, search all Dates in blockA and compare its
            LocalDate::class -> {

                for (d in blockA) {
                    if (d is LocalDate) {

                        if (resultDate.isBefore(d)) {
                            resultDate = d
                        }
                    }

                }

                resultDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))

            }


            else -> {

                "No data"

            }


        }

    }
}
