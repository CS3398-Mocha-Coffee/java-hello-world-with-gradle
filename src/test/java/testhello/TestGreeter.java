package hello;

import static org.junit.Assert.*;
//import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;



public class TestGreeter {

   private Greeter g;

   @Before
   public void setUp() throws Exception{
   g = new Greeter();
   }

   @Test
   public void testGreeterEmpty()
   {
      assertEquals(g.getName(),"");
      assertEquals(g.sayHello(),"Hello!");
   }

   @Test
   public void testGreeter()
   {
      g.setName("World War");
      assertEquals(g.getName(),"World War");
      assertEquals(g.sayHello(),"Hello World War!");
   }
}
/*  Assignment 13 part 2a
    @Test
    public void newest_AH_GreeterPass()
    {
      g.setName("GO Cowboys!")
      assertEquals(g.getName(),"GO Cowboys!")
      assertEquals(g.sayHello(),"Hello COWBOYS fans")
      System.out.println("TEST Successful");
    }
*/

/*  Assignment 13 part 5a
    @Test
    public void newtest_AH_GreeterFail()
    {
        g.setName("Cowboys Suck!");
        assertEquals(g.getName(),"Cowboys don't suck")
        assertEquals(g.sayHello(),"Hello Cowboys Fans!")
        System.out.println("FAIL");
    }
*/
