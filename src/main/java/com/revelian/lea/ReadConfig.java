package com.revelian.lea;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Reads a value from a config file
 * 
 * TODO convert to apache commons when more rigor is required
 */

public class ReadConfig {	
	
	public double getNumberOfIterations(){
	String NAME_OF_VAR = "numberOfIterations";
	String CONFIG_FILE = "config.properties";
	Properties prop = new Properties();
	InputStream input = null;	
	double numberOfIterations = 0.0;	
	
	try {

		input = new FileInputStream(CONFIG_FILE);

		// load a properties file
		prop.load(input);
		//check to see if its empty
		if (!prop.getProperty(NAME_OF_VAR).isEmpty() ){
			//Make sure it has a number in it
			try {
				Double.parseDouble(prop.getProperty(NAME_OF_VAR));
			}
			catch (NumberFormatException e)
			{
				throw new NumberFormatException(prop.getProperty(NAME_OF_VAR) + "is not valid in the config file , please specify a number ");
			}
			numberOfIterations = Double.parseDouble(prop.getProperty(NAME_OF_VAR));
		} else {
			throw new Error("There was no value in the config file");
		}     
		

	} catch (IOException ex) {
		System.out.println("there was a problem reading the config file 'config.properties' and that it contains numberOfIterations=x" );
		ex.printStackTrace();
	} finally {
		if (input != null) {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	return numberOfIterations;
	}
}
