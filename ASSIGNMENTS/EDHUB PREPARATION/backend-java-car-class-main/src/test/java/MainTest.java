import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;

public class MainTest {

    ByteArrayOutputStream outputStream;
    PrintStream printStream;
    PrintStream originalPrintStream = System.out;

    @BeforeEach
    public void init(){
        outputStream = new ByteArrayOutputStream();
        printStream = new PrintStream(outputStream);
        System.setOut(printStream);
        Main.main(new String[]{});
    }

    @AfterEach
    public void cleanUp(){
        System.setOut(originalPrintStream);
    }

    @Test
    public void mainTest(){
        int constructors = Arrays.stream(Car.class.getDeclaredConstructors()).filter(c ->c.getParameterCount()==5).toList().size();

        assertEquals(1, constructors, "Je Car class moet 1 constructor met 5 parameters hebben, maar heeft nu " + constructors + " constructors die 5 parameters hebben");

        assertEquals(outputStream.toString(), "Deze Toyota Aygo is blauw" + System.lineSeparator() + "Deze Fiat 500 is groen" + System.lineSeparator() + "Deze Volvo CX90 is zwart" + System.lineSeparator());
    }


}
