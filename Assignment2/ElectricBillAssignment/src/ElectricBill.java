import java.time.LocalDate;

/**
 * Main class of the program. It obtains information from the Account and
 * MeterReading classes along with the instance variables used for calculations.
 * 
 * @author Nicholas Sycz
 * 		   COSC 210 Section 002
 * 		   09/19/2017
 */

public class ElectricBill {
	private Account account;
	private MeterReading startReading;
	private MeterReading stopReading;
	private LocalDate dateOfBilling;
	private LocalDate discountDateDue;
	private LocalDate dateDue;
	private double totalEnergyUsed;
	private double rate;
	private double costOfEnergy;
	private double energyTax;
	private double totalDue;
	private double discount;

	/**
	 * ElectricBill constructor sets the parameters for the Test class to obtain,
	 * and it includes the calculations / mathematical formulas to be used in the
	 * billing process.
	 * 
	 * @param account
	 *            - Account class with information including customer name, address,
	 *            account number
	 * @param dateOfBilling
	 *            - date the bill is paid
	 * @param startReading
	 *            - the starting date when meter was initially read
	 * @param stopReading
	 *            - the ending date when the meter was last read prior to payment
	 * @param rate
	 *            - the standard payment measured in kWH.
	 */
	public ElectricBill(Account account, LocalDate dateOfBilling, MeterReading startReading, MeterReading stopReading,
			double rate) {
		this.account = account;
		this.startReading = startReading;
		this.stopReading = stopReading;
		this.dateOfBilling = LocalDate.now();
		this.rate = rate;

		totalEnergyUsed = stopReading.getReading() - startReading.getReading();
		costOfEnergy = totalEnergyUsed * rate;
		energyTax = 0.12 * costOfEnergy;
		totalDue = energyTax + costOfEnergy;
		discount = totalDue - (0.10 * totalDue);
		dateDue = dateOfBilling.plusDays(20);
		discountDateDue = dateOfBilling.plusDays(10);

		// for BONUS, figure out the magnitude
		// smallest power of 10 greater than the fist number
		// while (m < initial reading) reading * 10

	}

	/**
	 * 
	 * @return obtains the account info
	 */
	public Account getAccount() {
		return account;
	}

	/**
	 * 
	 * @return obtains the initial reading
	 */
	public MeterReading getStartReading() {
		return startReading;
	}

	/**
	 * 
	 * @return obtains the final reading
	 */
	public MeterReading getStopReading() {
		return stopReading;
	}

	/**
	 * 
	 * @return obtains the dateOfBilling
	 */
	public LocalDate getDateOfBilling() {
		return dateOfBilling;
	}

	/**
	 * 
	 * @return obtains the discountDateDue
	 */
	public LocalDate getDiscountDateDue() {
		return discountDateDue;
	}

	/**
	 * 
	 * @return obtains the dateDue
	 */
	public LocalDate getDateDue() {
		return dateDue;
	}

	/**
	 * 
	 * @return obtains the totalEnergyUsed
	 */
	public double getTotalEnergyUsed() {
		return totalEnergyUsed;
	}

	/**
	 * 
	 * @return obtains the rate
	 */
	public double getRate() {
		return rate;
	}

	/**
	 * 
	 * @return obtains the costOfEnergy
	 */
	public double getCostOfEnergy() {
		return costOfEnergy;
	}

	/**
	 * 
	 * @return obtains the energyTax
	 */
	public double getEnergyTax() {
		return energyTax;
	}

	/**
	 * 
	 * @return obtains the totalDue
	 */
	public double getTotalDue() {
		return totalDue;
	}

	/**
	 * 
	 * @return obtains the discount
	 */
	public double getDiscount() {
		return discount;
	}

	/**
	 * Method printBill is being used by the main method in the Test class. It
	 * displays the format for the electric bill.
	 * 
	 */
	public void printBill() {
		System.out.println();
		System.out.println();
		System.out.println("\t\t\t  B I L L");
		System.out.println();
		System.out.printf("We Power U Electric Co-Operative \tDate:   %2d/%2d/%4d  %n", dateOfBilling.getMonthValue(),
				dateOfBilling.getDayOfMonth(), dateOfBilling.getYear());
		System.out.println();
		System.out.printf("To: %s", account.getName(), account.getName());
		System.out.printf("\t\t\t\tAccount: %d%n", account.getAccountNumber());
		System.out.printf("    %s%n", account.getStreet());
		System.out.printf("    %s, %s %5d%n", account.getCity(), account.getState(), account.getZipCode());
		System.out.println();
		System.out.printf("Meter Readings: %n");
		System.out.printf("    Start Meter Reading:  %.1f", startReading.getReading());
		System.out.printf(" kWH read on %2d/%2d/%4d%n", startReading.getDateOfReading().getMonthValue(),
				startReading.getDateOfReading().getDayOfMonth(), startReading.getDateOfReading().getYear());
		System.out.printf("    End Meter Reading:    %.1f", stopReading.getReading());
		System.out.printf(" kWH read on %2d/%2d/%4d%n", stopReading.getDateOfReading().getMonthValue(),
				stopReading.getDateOfReading().getDayOfMonth(), stopReading.getDateOfReading().getYear());
		System.out.println();
		System.out.printf("    Total kW Used:         %.1f kWH%n", totalEnergyUsed);
		System.out.println();
		System.out.printf("Bill Computation: %n");
		System.out.printf("    Cost of kW Used %.2f X %s per kWH\t$   %.2f%n", totalEnergyUsed, rate, costOfEnergy);
		System.out.printf("    Energy Tax at 12%% \t\t\t\t$   %.2f%n", energyTax);
		System.out.println();
		System.out.printf("    Total Due  (date due %2d/%d/%4d) \t\t$   %.2f%n", dateDue.getMonthValue(),
				dateDue.getDayOfMonth(), dateDue.getYear(), totalDue);
		System.out.printf("    Discount Amount (10%% if paid by %d/%d/%4d)  $   %.2f", discountDateDue.getMonthValue(),
				discountDateDue.getDayOfMonth(), discountDateDue.getYear(), discount);
	}
}
