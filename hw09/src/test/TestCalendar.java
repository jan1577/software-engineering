package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import java.util.GregorianCalendar;
import main.Calendar;


class TestCalendar {
	
	@ParameterizedTest
	@ValueSource(ints = {1996, 1992, 1988, 1984, 1980})
	public void Should_check_if_year_is_leap_also_in_gregorian(int year) {
	
	    GregorianCalendar gcal = (GregorianCalendar) GregorianCalendar.getInstance();
		Calendar cal = new Calendar(year);

		Assertions.assertEquals(gcal.isLeapYear(year), cal.isLeapYear());
	}
	
	// equivalence class: leap year
	@ParameterizedTest
	@ValueSource(ints = {4, 1992, 1988, 1984, 1980})
	public void Should_check_if_noleapYear(int year) {
		
		Calendar cal = new Calendar(year);

		Assertions.assertTrue(cal.isLeapYear());
	}
	
	// equivalence class: no leap year
	@ParameterizedTest
	@ValueSource(ints = {1, 1993, 1989, 1981, 1983, Integer.MAX_VALUE})
	public void Should_check_if_leapYear(int year) {
			
		Calendar cal = new Calendar(year);

		Assertions.assertFalse(cal.isLeapYear());
	}
	
	// equivalence class: year <= 0
	@ParameterizedTest
	@ValueSource(ints = {0, -1, Integer.MIN_VALUE})
	public void check_if_year_smaller_zero(int year) {
				
		Calendar cal = new Calendar(year);
		Assertions.assertFalse(cal.isLeapYear());
			
	}
	
}
