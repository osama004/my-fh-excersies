package at.technikum.covid.model;

import at.technikum.covid.src.CoronaTest.Date;

public class PcrTest extends CoronaTest {

    public PcrTest(Date testDate, boolean isPositive) {
        super(testDate, isPositive);
    }

    @Override
    public Date validUntil() {
        Date date = new Date(this.getTestDate());
        date.addDay(isPositive() ? 14 : 3);
        return date;
    }
}
