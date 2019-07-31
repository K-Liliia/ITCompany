package com.solvd.ITCompany.it.company;

public enum Country {
	ARGENTINA("ARGENTINA"), FRANCE("FRANCE"), TURKEY("TURKEY");
	private String countryName;

	Country(final String countryName) {
		this.countryName = countryName;
	}

	public String getCountryName() {
		return countryName;
	}

}
