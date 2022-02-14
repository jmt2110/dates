import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit

fun main(args: Array<String>) {
    val formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy")//formatting //
    val today = LocalDate.now()//today's date//
    val formattedToday = today.format(formatter)//today's date formatted//

    var fMoon: LocalDate = LocalDate.of(2022, 1, 17)//date of Full Moon in Jan//
    println("Today is $formattedToday")//print today's date //
    while (fMoon.isBefore(today)) {
        fMoon = fMoon.plusDays(30)//finding next Full Moon //
    }
    val formatMoon = fMoon.format(formatter) //formatting//
    val daysUntilMoon = today.until(fMoon, ChronoUnit.DAYS) //days until Full Moon//
    if (daysUntilMoon.toInt() == 0){ //If today is a Full Moon//
        println("Today is a full moon!\nWatch out for Howling Beasts!")
    }
    else//days until next Full Moon is today is not a Full Moon //
        println("The next full moon is on $formatMoon\nThat is in $daysUntilMoon days")

}

