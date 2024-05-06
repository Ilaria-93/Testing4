import java.time.DayOfWeek;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testYearExtraction() {
        ZonedDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z").toZonedDateTime();
        int expectedYear = 2023;
        int actualYear = date.getYear();
        assertEquals(expectedYear, actualYear);
    }

    @Test
    public void testMonthExtraction() {
        ZonedDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z").toZonedDateTime();
        int expectedMonth = 3;
        int actualMonth = date.getMonthValue();
        assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void testDayExtraction() {
        ZonedDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z").toZonedDateTime();
        int expectedDay = 1;
        int actualDay = date.getDayOfMonth();
        assertEquals(expectedDay, actualDay);
    }

    @Test
    public void testDayOfWeekExtraction() {
        ZonedDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z").toZonedDateTime();
        DayOfWeek expectedDayOfWeek = DayOfWeek.WEDNESDAY;
        DayOfWeek actualDayOfWeek = date.getDayOfWeek();
        assertEquals(expectedDayOfWeek, actualDayOfWeek);
    }
}