package com.luv2code.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		try {
			//create object mapper
			ObjectMapper mapper = new ObjectMapper();
			
			//read JSON file and map/convert to Java POJO
			
			
			
			//data/sample-lite.json
			/*
			Student theStudent = 
					mapper.readValue(new File("data/sample-lite.json"), Student.class);
			*/
			
			//data/sample-full.json
			/*
			Student theStudent = 
					mapper.readValue(new File("data/sample-full.json"), Student.class);
					*/
			Student theStudent = 
					mapper.readValue(new File("data/sample-full_ignore.json"), Student.class);
			
			//print first name and last name
			System.out.println("First name: " + theStudent.getFirstName());
			System.out.println("Last name:" + theStudent.getLastName());
			
			
			//data/sample-full.json
			Address address = theStudent.getAddress();
			System.out.println("Street = " + address.getStreet());
			System.out.println("City = " + address.getCity());
			System.out.println("Country = " + address.getCountry());
			System.out.println("State = " + address.getState());
			System.out.println("Zip = " + address.getZip());
			//Languages
			System.out.println("Langues:");
			for (String tempLang: theStudent.getLanguages()) {
				System.out.println(tempLang);
			}
			
		}
		catch(Exception exc) {
			exc.printStackTrace();
		}
	}

}
