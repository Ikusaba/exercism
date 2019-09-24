import java.time.LocalDate;
import java.util.Date;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
class Gigasecond {
	final long oneGigasecond = (long) Math.pow(10,9);
	LocalDateTime datePlusGiga;

    Gigasecond(LocalDate moment) {
		this.datePlusGiga = moment.plus(oneGigasecond, ChronoUnit.SECONDS).atStartOfDay();	
	}

    Gigasecond(LocalDateTime moment) {
		this.datePlusGiga = moment.plusSeconds(oneGigasecond);
    }

    LocalDateTime getDateTime() {
		return this.datePlusGiga;
	}
}
