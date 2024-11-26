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
    verify(mockedPrintStream).println("three");
    verify(mockedPrintStream).println("two");
    verify(mockedPrintStream).println("one");
    verify(mockedPrintStream).println("boom!");
    verify(mockedPrintStream).println("Sjaak");
    verify(mockedPrintStream).println("Sjimmy");
    verify(mockedPrintStream).println("Sjonny");
    verify(mockedPrintStream).println("oneSjaak");
    verify(mockedPrintStream).println("twoSjimmy");
    verify(mockedPrintStream).println("threeSjonny");
  }
}
