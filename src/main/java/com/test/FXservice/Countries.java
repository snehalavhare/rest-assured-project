package com.test.FXservice;

import java.util.List;

public class Countries {
	
	List<Country> countrylist;

	public List<Country> getCountrylist() {
		return countrylist;
	}

	public void setCountrylist(List<Country> countrylist) {
		this.countrylist = countrylist;
	}
	
	
	void display()
	{
		
	for(int i=0 ; i< countrylist.size(); i++)
	{
		
		System.out.println("Details of Country:" + countrylist.get(i).getName());
		System.out.println("ID: " + countrylist.get(0).getId());
		System.out.println("Name: " + countrylist.get(0).getName());
		System.out.println("ShortName: " + countrylist.get(0).getShortName());
		System.out.println("Port: " + countrylist.get(0).getPort());
		
	}
		
	}
	
}
