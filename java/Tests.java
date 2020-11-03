// Taken from http://tutorials.jenkov.com/java-unit-testing/simple-test.html
//     and https://www.logicbig.com/tutorials/unit-testing/junit/junit-core.html

// Code used to create tests
import org.junit.Test;
import static org.junit.Assert.*;

public class Tests {

    @Test
    public void testWhichPasses() {
        ExampleLibrary myUnit = new ExampleLibrary();

        assertEquals(2, 2);
    }

    public void testWhichFails() {
        ExampleLibrary myUnit = new ExampleLibrary();

        // String result = myUnit.concatenate("one", "two");

        assertEquals(2, 3);
    }
}
