package at.technikum.covid.model;

import at.technikum.covid.src.CoronaTest.Date;

public class AntigenTest extends CoronaTest {

    public AntigenTest(Date testDate, boolean isPositive) {
        super(testDate, isPositive);
    }

    @Override
    public Date validUntil() {
        Date date = new Date(this.getTestDate());
        if (isPositive())
            date.addDay(14);
        else
            date.addDay(2);
        return date;
    }
}
