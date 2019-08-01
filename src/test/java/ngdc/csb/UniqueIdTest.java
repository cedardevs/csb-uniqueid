package ngdc.csb;

import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueIdTest {

  @Test
  public void generate() {
    String testingPrefix = "TEST1";
    String result = UniqueId.generate(testingPrefix);

    assertTrue(result.startsWith(testingPrefix + "-"));
    String expectedRegex = testingPrefix + "-[0-9a-fA-F]{8}(-[0-9a-fA-F]{4}){3}-[0-9a-fA-F]{12}";
    assertTrue(result.matches(expectedRegex));
  }
}