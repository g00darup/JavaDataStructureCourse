import introduction.HelloWorld;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
    @Test
    public void sayHitest(){
        HelloWorld helloWorld = new HelloWorld();
        assertEquals(helloWorld.message("hi"),"hi");
    }
}
