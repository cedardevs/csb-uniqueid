package ngdc.csb;

import java.util.UUID;

public class UniqueId {

  /**
   * Generate a UniqueID to Identify a specific ship's bathymetric data.
   * This consists of a <code>prefix</code> that identifies the organization, followed by a hyphen and UUID. Due to the
   * nature of UUIDs, it is expected that this method will return a different result every time it is used. The result
   * should be stored and used to identify a single ship/sonar combination, and typically will not change over the life
   * of the ship. This value is intended to be used to retrieve or identify data from a particular ship.
   * <p>
   * The result should have a format like<pre>
   *   MYORG-12345678-1234-1234-1234-123456789abc
   * </pre>
   *
   * @param prefix Short string to identify data from an organization, usually 5 uppercase letters.
   * @return String representing the UniqueID
   *
   * @see <a href="https://docs.google.com/document/d/142px-GiCxT1kVMZFMdvDpB-eCFI_gCqyUAGYruZIZOw/edit?usp=sharing">Unique ID Purpose</a>
   */
  public static String generate(String prefix) {
    StringBuilder uid_build = new StringBuilder(prefix);
    uid_build.append("-");
    uid_build.append(UUID.randomUUID());

    return uid_build.toString();
  }
}
