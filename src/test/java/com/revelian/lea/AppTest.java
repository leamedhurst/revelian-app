package com.revelian.lea;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testConfig()
    {    	
    	
    	ReadConfig config = new ReadConfig();
        assertNotNull( config.getNumberOfIterations() );
    }
    
    public void testPi()
    {    	    	
    	ApproxPi pi = new ApproxPi();
    	//testing algorithm to 15 decimal places
    	assertEquals(3.141392653591791, pi.getPi(10000.0), 0.000000000000001);
    }
    
   
}
