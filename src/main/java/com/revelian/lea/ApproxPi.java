package com.revelian.lea;

/**
 * Aprox value of Pi using the following formula
 * pi = 4 * (1 - 1/3 + 1/5 -1/7 + 1/9 ....)
 *
 */
public class ApproxPi {
	
	public double getPi(double iterations){
		  double pi = 1.0;  //this is the starting value for Pi
	        
	        int x = 1;  //This is going to keep count of whether we are even or ood and either - or +
	        
	        for (double i = 3.0; i < iterations; i=i+2){  //i is the bottom part of the fraction we need
	        	if (x % 2 ==0 )         
	        		pi = pi + (1/i);  // its even so add
	        	else
	        	    pi = pi - (1/i);  // its odd so subtract	
	        	x = x + 1;
	        }
	        
	        return (4*pi);
	    }
	
		
	}


