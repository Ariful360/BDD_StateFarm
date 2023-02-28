package utils;

public class AutoData {
	private String homePageTitle;
	private String zipCode;
	private String firstName;
	private String lastName;

	public AutoData(String homePageTitle, String zipCode, String firstName, String lastName) {
		if (homePageTitle == null || zipCode == null || firstName == null || lastName == null
				|| homePageTitle.length() == 0 || zipCode.length() == 0 || firstName.length() == 0
				|| lastName.length() == 0) {
			throw new NullPointerException();
		} else {
			this.homePageTitle = homePageTitle;
			this.zipCode = zipCode;
			this.firstName = firstName;
			this.lastName = lastName;
		}
	}

	public String getZipCode() {
		return zipCode;
	}

	public String getHomePageTitle() {
		return homePageTitle;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

}
