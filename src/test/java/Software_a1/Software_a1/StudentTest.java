package Software_a1.Software_a1;

import java.util.Date;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class StudentTest
    extends TestCase
{
	
	Date date = new Date(1/10/1995);
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public StudentTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( StudentTest.class );
    }

    /**
     * Rigourous Test :-)
     */
   
	public void testUserName() {
		Student student = new Student("Conor", 21, date);
		String result = student.getUserName();
		Assert.assertEquals("Conor21", result);
	}
}
