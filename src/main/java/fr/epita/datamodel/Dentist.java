package fr.epita.datamodel;

/**
 * Enterprise data object to hold the dentist information. 
 * 
 * @author Binoy Cherian
 *
 */
public class Dentist {
	
	/** The unique id. */
	private String id;
	
	/** The name of the dentist. */
	private String firstName;
	
	/** The name of the dentist. */
	private String lastName;
	
	/** The address. */
	private String address;
	
	/**The city. */
	private String city;
	
	/**The email address of the dentist. */
	private String emailAddress;
	
	/**The gender. */
	private String gender;
	
	/** The phone number. */
	private String phoneNumber;
	
	/**The image. */
	private String image;
	
	/** The opening hours.  */
	private String opening;

	/** The speciality.  */
	private String speciality;
	
	/** Constructor */
	public Dentist() {
	}
	
	
	/**
	 * Parameterised Constructor
	 * 
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param address
	 * @param city
	 * @param email
	 * @param gender
	 * @param number
	 * @param image
	 * @param opening
	 * @param speciality
	 */
	public Dentist(String id, String firstName, String lastName, String address, String city,
			String email, String gender, String number, String image, String opening,String speciality ) {

		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.address=address;
		this.city=city;
		this.emailAddress=email;
		this.gender=gender;
		this.phoneNumber=number;
		this.image=image;
		this.opening=opening;
		this.speciality=speciality;
	}

	/**
	 * Gets the address.
	 * 
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Sets the address.
	 * 
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Gets the email address.
	 * 
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * Sets the email address.
	 * 
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	/**
	 * Gets the phone number.
	 * 
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Sets the phone number.
	 * 
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the image
	 */
	public String getImage() {
		return image;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}

	/**
	 * @return the opening
	 */
	public String getOpening() {
		return opening;
	}

	/**
	 * @param opening the opening to set
	 */
	public void setOpening(String opening) {
		this.opening = opening;
	}


	/**
	 * @return the speciality
	 */
	public String getSpeciality() {
		return speciality;
	}

	/**
	 * @param speciality the speciality to set
	 */
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

}
