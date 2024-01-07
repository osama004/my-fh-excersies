package at.technikum.covid.model;

import at.technikum.covid.src.CoronaTest.Date;

import java.util.ArrayList;

public class Person {
    private String name;

    private Date birthDate;

    private ArrayList<CoronaTest> tests;

    public Person(String name, Date birthDate, ArrayList<CoronaTest> tests) {
        this.name = name;
        setBirthDate(birthDate);
        this.tests = tests;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        if (birthDate == null ||
            birthDate.compareTo(new Date(1951, 1, 1)) < 0 ||
            birthDate.compareTo(new Date(2007, 12, 31)) > 0)
            throw new IllegalArgumentException("ungültiges Geburtsdatum");
        this.birthDate = birthDate;
    }

    public ArrayList<CoronaTest> getTests() {
        return tests;
    }

    public void setTests(ArrayList<CoronaTest> tests) {
        this.tests = tests;
    }

    public CoronaTest lastTestBeforeDate(Date testBefore) {
        tests.sort((c1, c2) -> c2.validUntil().compareTo(c1.validUntil())); // first recent coronaTest Date than later
        for (CoronaTest coronaTest : tests)
            if (coronaTest.getTestDate().compareTo(testBefore) < 0)
                return coronaTest;
        return null;
    }

    public String coronaStatus(Date date) {
        CoronaTest coronaTest = lastTestBeforeDate(date);
        if (coronaTest == null)
            return String.format("%s, %s, Corona Status: no valid test available", name, birthDate.numericString());
        Date coronaTestDate = coronaTest.getTestDate();
        Date validUntil = coronaTest.validUntil();
        if (date.compareTo(coronaTestDate) >= 0 && date.compareTo(validUntil) <= 0)
            return String.format("%s, %s, Corona Status: %s", name, birthDate.numericString(), coronaTest.outcome());
        else
            return String.format("%s, %s, Corona Status: no valid test available", name, birthDate.numericString());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", tests=" + tests +
                '}';
    }
}
