/**
 * The Account class including customer information along with account
 * constructor and getters and setters for the respective parameters
 * 
 * @author Nicholas Sycz
 * 		   COSC 210 Section 002
 * 		   09/19/2017
 */

public class Account {
	private long accountNumber;
	private String name;
	private String street;
	private String city;
	private String state;
	private int zipCode;

	/**
	 * Main constructor
	 * 
	 * @param accountNumber
	 *            - account number linked with customer
	 * @param name
	 *            - name of the customer
	 * @param street
	 *            - street on which the customer's residence
	 * @param city
	 *            - city in which the customer resides
	 * @param state
	 *            - state in which the customer resides
	 * @param zipCode
	 *            - zip code for customer's address
	 */
	public Account(long accountNumber, String name, String street, String city, String state, int zipCode) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	/**
	 * 
	 * @return obtains the account number as a long
	 */
	public long getAccountNumber() {
		return accountNumber;
	}

	/**
	 * 
	 * @return obtains a string for the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 *           - allows one to add an attribute to name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return obtains the street name
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * 
	 * @param street
	 *            - allows one to add an attribute to street
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * 
	 * @return obtains the city of the customer
	 */
	public String getCity() {
		return city;
	}

	/**
	 * 
	 * @param city
	 *            - allows one to add an attribute to city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * 
	 * @return obtains the state of the customer
	 */
	public String getState() {
		return state;
	}

	/**
	 * 
	 * @param state
	 *            - allows one to add an attribute to state
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * 
	 * @return obtains the zip code of the customer
	 */
	public int getZipCode() {
		return zipCode;
	}

	/**
	 * 
	 * @param zipCode
	 *            - allows one to add an attribute to zipCode
	 */
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

}
