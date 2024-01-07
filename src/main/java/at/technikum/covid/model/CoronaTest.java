package at.technikum.covid.model;

import at.technikum.covid.src.CoronaTest.Date;

public abstract class CoronaTest {

    private Date testDate;

    private boolean isPositive;

    public CoronaTest(Date testDate, boolean isPositive) {
        this.testDate = testDate;
        this.isPositive = isPositive;
    }

    public CoronaTest(CoronaTest test) {
        this(test.testDate, test.isPositive);
    }

    public boolean isPositive() {
        return isPositive;
    }

    public void setPositive(boolean positive) {
        isPositive = positive;
    }

    public Date getTestDate() {
        return testDate;
    }

    public void setTestDate(Date testDate) {
        this.testDate = testDate;
    }

    public abstract Date validUntil() ;

    public String outcome() {
        if (isPositive)
            return String.format("positive, quarantine till: %s", validUntil().numericString());
        else
            return String.format("negative, valid till: %s", validUntil().numericString());
    }

    @Override
    public String toString() {
        return "CoronaTest{" +
                "isPositive=" + isPositive +
                ", testDate=" + testDate +
                '}';
    }
}
