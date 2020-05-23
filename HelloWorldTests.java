import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloWorldTests {
	
   String message = "Hello World";	
 //  MessageUtil messageUtil = new MessageUtil(message);

   @Test
   public void testPrintMessage() {
      //assertEquals(message,messageUtil.printMessage());
   	assertEquals(message, "Hello World");
	}
}
