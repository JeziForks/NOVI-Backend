import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.io.PrintStream;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void test() {
        PrintStream mockedPrintStream = mock(PrintStream.class);
        System.setOut(mockedPrintStream);
        Main.main(new String[]{});
        verify(mockedPrintStream, atLeastOnce()).println("Dit is een voorbeeld");
        verify(mockedPrintStream).println("hello world");
        verify(mockedPrintStream).println(true);
        verify(mockedPrintStream).println(4);
        verify(mockedPrintStream).println(-8);
        verify(mockedPrintStream).println(6.5f);
        verify(mockedPrintStream).println(-2.3d);
    }

    @Test
    public void testBonus() {
        PrintStream mockedPrintStream = mock(PrintStream.class);
        System.setOut(mockedPrintStream);
        Main.main(new String[]{});
        verify(mockedPrintStream).println("Dit is een voorbeeld");
        verify(mockedPrintStream).println("hello world");
        verify(mockedPrintStream).println(true);
        verify(mockedPrintStream).println(4);
        verify(mockedPrintStream).println(-8);
        verify(mockedPrintStream).println(6.5f);
        verify(mockedPrintStream).println(-2.3d);
        verify(mockedPrintStream).println("Dit is een aangepast voorbeeld");
    }
}
