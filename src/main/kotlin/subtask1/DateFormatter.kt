package subtask1


import java.time.DateTimeException
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class DateFormatter {


    fun toTextDay(day: String, month: String, year: String):String {
        return try {
                    //change format from Strings to LocalDate
                    LocalDate.of(year.toInt(), month.toInt(), day.toInt()).format(DateTimeFormatter.ofPattern("d MMMM, EEEE", Locale("ru")))
                }
                    catch (e: DateTimeException){
                    "Такого дня не существует"
                }
            }
        }

