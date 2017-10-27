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
      g.setName("World");
      assertEquals(g.getName(),"World");
      assertEquals(g.sayHello(),"Hello World!");
   }

   // Assignment 13 - Part 2a
   @Test
   public void newtest_BF_GreeterPass()
   {
      g.setName("Deus ex machina");
      assertEquals(g.getName(),"Deus ex machina");
      assertEquals(g.sayHello(),"Hello Deus ex machina!");
   }

   // Assignment 13 - Part 5a
   @Test
   public void newtest_BF_GreeterFail()
   {
      g.setName("Mars");
      assertEquals(g.getName(),"(not) Mars");
      assertEquals(g.sayHello(),"Hello (not) Mars!");
   }
}
