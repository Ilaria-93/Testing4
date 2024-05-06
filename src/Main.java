/* Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
Ottieni l'anno
Ottieni il mese
Ottieni il giorno
Ottieni il giorno della settimana
Stampa i risultati sulla console
Crea dei test per questo esercizio
 */

import java.time.DayOfWeek;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {
        ZonedDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z").toZonedDateTime();

        int year = date.getYear();
        System.out.println("The year is: " + year);

        int month = date.getMonthValue();
        System.out.println("The month is: " + month);

        int day = date.getDayOfMonth();
        System.out.println("The day is: " + day);

        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println("The day of the week is: " + dayOfWeek);
    }
}