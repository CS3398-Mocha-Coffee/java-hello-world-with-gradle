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


   //Assignment 13 - part 2a
   @Test
   public void test_charles_GreeterPass()
   {
       g.setName("Charlie bit my finger");
       assertEquals(g.getName(), "Charlie bit my finger");
       assertEquals(g.sayHello(), "Hello Charlie bit my finger!");
   }

/*   //Assignment 13 - part 5a
   @Test
   public void test_charles_GreeterFail()
   {
      g.setName("Lets go to candy mountain");
      assertEquals(g.getName(), "Lets not go to candy mountain");
      assertEquals(g.sayHello(), "Hello Lets not go to candy mountain");
   }
*/
}
