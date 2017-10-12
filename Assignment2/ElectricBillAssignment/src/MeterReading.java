import java.time.LocalDate;

/**
 * MeterReading class containing the reading and dateOfReading instance
 * variables and the constructor with getters
 * 
 * @author Nicholas Sycz
 * 		   COSC 210 Section 002
 * 		   09/19/2017
 */

public class MeterReading {

	private double reading;
	private LocalDate dateOfReading;

	/**
	 * MeterReading constructor initializing the reading and date of reading
	 * parameters.
	 * 
	 * @param reading
	 *            - double value for getting the meter reading values.
	 * @param dateOfReading
	 *            - local date for obtaining the date for each reading.
	 */
	public MeterReading(double reading, LocalDate dateOfReading) {
		this.reading = reading;
		this.dateOfReading = dateOfReading;
	}

	/**
	 * 
	 * @return obtains the meter readings
	 */
	public double getReading() {
		return reading;
	}

	/**
	 * 
	 * @return obtains the date of the readings
	 */
	public LocalDate getDateOfReading() {
		return dateOfReading;
	}

}
