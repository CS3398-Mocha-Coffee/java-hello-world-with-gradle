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
   
   
   // Assignment 13 - Part 2a
   @Test
   public void newtest_AJM_GreeterPass()
   {
	  g.setName("Aaron");
	  assertEquals(g.getName(), "Aaron");
	  assertEquals(g.sayHello(),"Hello Aaron!");
   }
   
   // Assignment 13 - Part 5a
   @Test
   public void newtest_AJM_GreeterFail()
   {
	  g.setName("Moontower");
	  assertEquals(g.getName(), "(not) Moontower");
	  assertEquals(g.sayHello(),"Hello (not) Moontower!");
   }
   
}
