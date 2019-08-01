package ngdc.csb;

public class Application {

  /**
   * <h1>Example program to use the UniqueId.generate() method.</h1>
   * @param args are ignored
   */
  public static void main(String[] args) {
    String uniqueId = UniqueId.generate("MYORG"); // Organization prefix from NOAA NCEI
    System.out.println("Example of a Unique ID for data submissions:");
    System.out.println(uniqueId);
  }
}
