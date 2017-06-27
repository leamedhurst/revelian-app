package com.revelian.lea;

/**
 * Aprox value of Pi
 * 
 * Author : Lea Medhurst Date : 27/06/2017
 */
public class App {
	public static void main(String[] args) {

		try {
			// Read the config file and find out how many iterations to run to
			ReadConfig configVar = new ReadConfig();

			// Run the algorithm
			ApproxPi pi = new ApproxPi();			
			System.out.println(pi.getPi(configVar.getNumberOfIterations()));
		} catch (Exception e) {
			System.out.println("Couldn't find the value of pi , see below");
			e.printStackTrace();
		}
	}
}
