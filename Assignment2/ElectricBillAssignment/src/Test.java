import java.time.LocalDate;

/**
 * The Test class contains the main method of the program. It pulls information
 * from the other classes, then prints the electric bill.
 * 
 * @author Nicholas Sycz
 * 		   COSC 210 Section 002
 * 		   09/19/2017
 */
public class Test {

	/**
	 * Main method of the program. It gathers information from the three instances
	 * listed in the method.
	 * 
	 * @param args
	 *            - arguments gathered from methods instantiated in the Main method.
	 */
	public static void main(String[] args) {
		new Test().account1();
		new Test().account2();
		new Test().account3();
	}

	/**
	 * Method to test and print the information on account1.
	 */
	private void account1() {

		Account account = new Account(389403020, "John Jones", "99 Main Street", "Bigtown", "PA", 15800);

		MeterReading startReading = new MeterReading(1231.2, LocalDate.of(2017, 9, 19));

		MeterReading stopReading = new MeterReading(1874.9, LocalDate.of(2017, 10, 19));

		ElectricBill electricBill = new ElectricBill(account, LocalDate.now(), startReading, stopReading, .132);

		electricBill.printBill();
	}

	/**
	 * Method to test and print the information for account2.
	 */
	private void account2() {
		Account account = new Account(392783400, "Bill Murray", "1801 Century Park West", "Los Angeles", "CA", 90067);

		MeterReading startReading = new MeterReading(1000.9, LocalDate.of(2017, 10, 10));

		MeterReading stopReading = new MeterReading(1645.1, LocalDate.of(2017, 11, 30));

		ElectricBill electricBill = new ElectricBill(account, LocalDate.now(), startReading, stopReading, .132);

		electricBill.printBill();
	}

	/**
	 * Method to test and print the information for account3.
	 */
	private void account3() {
		Account account = new Account(130892743, "Rick Barns", "778 Lonely Avenue", "Hill Valley", "CA", 30230);

		MeterReading startReading = new MeterReading(1300.1, LocalDate.of(2017, 12, 14));

		MeterReading stopReading = new MeterReading(1945.4, LocalDate.of(2018, 1, 14));

		ElectricBill electricBill = new ElectricBill(account, LocalDate.now(), startReading, stopReading, .132);

		electricBill.printBill();
	}
}