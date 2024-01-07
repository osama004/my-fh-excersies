package at.technikum.covid.src.CoronaTest;

import at.technikum.covid.model.AntigenTest;
import at.technikum.covid.model.CoronaTest;
import at.technikum.covid.model.PcrTest;
import at.technikum.covid.model.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple demo application
 * 
 *
 */
public class Main {
	
	/**
	 * the main function
	 * 
	 * <ol>
	 * 		<li>creates the test-data</li>
	 * 		<li>diplays the corona-status of all persons for several days</li>
	 * 		<li>prints the test statistics for all persons</li>
	 * 
	 * </ol>
	 * 
	 * @param args
	 *            optional args (not used)
	 */
	public static void main(String[] args) {
		ArrayList<Person> persons = init();

		printPersonsAfterDates(persons, new ArrayList<Date>(
				List.of(
						new Date(2021, 1, 3),
						new Date(2021, 1, 4),
						new Date(2021, 1, 5),
						new Date(2021, 2, 3),
						new Date(2021, 2, 10)
				)));

		int pcrTestCount = 0 , antigenTestCount = 0, negativeTestCount = 0, positiveTestCount = 0 ;

		for (Person person: persons) {
			for (CoronaTest coronaTest : person.getTests()) {
				int i = coronaTest instanceof PcrTest ? pcrTestCount++ : antigenTestCount++;
				i = coronaTest.isPositive() ? positiveTestCount++ : negativeTestCount++;
			}
		}

		System.out.printf("""
				Test Statistics:
				PCR Tests: %d
				Antigen Tests: %d
				Negative Tests: %d
				Positive Tests: %d
				""", pcrTestCount, antigenTestCount, negativeTestCount, positiveTestCount);
	}

	/**
	 * Create some demo-data
	 * 
	 * @ProgrammingProblem.Hint provided
	 * @return the persons
	 */

	private static ArrayList<Person> init() {
		ArrayList<Person> persons = new ArrayList<Person>(4);

		persons.add(new Person("Mimi Musterfrau", new Date(1999, 2, 1), new ArrayList<>(
				List.of(
						new AntigenTest(new Date(2021, 1, 1), false),
						new PcrTest(new Date(2021, 2, 1), true),
						new AntigenTest(new Date(2021, 2, 3), false),
						new AntigenTest(new Date(2021, 2, 16), false)
				))));

		persons.add(new Person("Max Mustermann", new Date(1970, 6, 10), new ArrayList<>(
				List.of(
						new AntigenTest(new Date(2021, 1, 1), false),
						new AntigenTest(new Date(2021, 2, 1), false),
						new AntigenTest(new Date(2021, 2, 3), false),
						new AntigenTest(new Date(2021, 3, 1), true)
				))));

		persons.add(new Person("Marla Mustermann", new Date(1985, 11, 7), new ArrayList<>(
				List.of(
						new PcrTest(new Date(2021, 1, 1), false),
						new PcrTest(new Date(2021, 2, 1), false),
						new PcrTest(new Date(2021, 3, 1), false)
				))));

		persons.add(new Person("Mark Mustermann", new Date(1952, 1, 3), new ArrayList<>(
				List.of(
						new AntigenTest(new Date(2021, 1, 1), false),
						new PcrTest(new Date(2021, 2, 1), true),
						new PcrTest(new Date(2021, 2, 7), true),
						new AntigenTest(new Date(2021, 2, 20), false),
						new PcrTest(new Date(2021, 3, 1), false)
				))));

		return persons;
	}

	private static void printPersonsAfterDates(ArrayList<Person> persons, ArrayList<Date> dates) {
		dates.forEach(date -> {
			System.out.printf("Status for %s\n", date);
			for (Person person: persons)
				System.out.printf("\t%s\n", person.coronaStatus(date));
			System.out.println();
		});
	}

//	private static Person[] init() {
//		Person[] persons = new Person[4];
//
//		persons[0] = new Person("Mimi Musterfrau", new Date(1999, 2, 1), new ArrayList<>());
//		persons[0].getTests().add(new AntigenTest(new Date(2021, 1, 1), false));
//		persons[0].getTests().add(new PcrTest(new Date(2021, 2, 1), true));
//		persons[0].getTests().add(new AntigenTest(new Date(2021, 2, 3), false));
//		persons[0].getTests().add(new AntigenTest(new Date(2021, 2, 16), false));
//
//		persons[1] = new Person("Max Mustermann", new Date(1970, 6, 10), new ArrayList<>());
//		persons[1].getTests().add(new AntigenTest(new Date(2021, 1, 1), false));
//		persons[1].getTests().add(new AntigenTest(new Date(2021, 2, 1), false));
//		persons[1].getTests().add(new AntigenTest(new Date(2021, 2, 3), false));
//		persons[1].getTests().add(new AntigenTest(new Date(2021, 3, 1), true));
//
//		persons[2] = new Person("Marla Mustermann", new Date(1985, 11, 7), new ArrayList<>());
//		persons[2].getTests().add(new PcrTest(new Date(2021, 1, 1), false));
//		persons[2].getTests().add(new PcrTest(new Date(2021, 2, 1), false));
//		persons[2].getTests().add(new PcrTest(new Date(2021, 3, 1), false));
//
//		persons[3] = new Person("Mark Mustermann", new Date(1952, 1, 3), new ArrayList<>());
//		persons[3].getTests().add(new AntigenTest(new Date(2021, 1, 1), false));
//		persons[3].getTests().add(new PcrTest(new Date(2021, 2, 1), true));
//		persons[3].getTests().add(new PcrTest(new Date(2021, 2, 7), true));
//		persons[3].getTests().add(new AntigenTest(new Date(2021, 2, 20), false));
//		persons[3].getTests().add(new PcrTest(new Date(2021, 3, 1), false));
//
//		return persons;
//	}


}
