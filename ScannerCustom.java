import java.util.*;

public class ScannerCustom {
  public static void main(String[] args) {
    Scanner usrInput = new Scanner(System.in);
    // usrInput.close();
    Integer intCount = 0, stringCount = 0, doubleCount = 0, booleanCount = 0;
    while (usrInput.hasNext()) {
      intCount += 1;
      if (usrInput.hasNextBoolean()) {
        booleanCount += 1;
      }

      if (usrInput.hasNextDouble()) {
        doubleCount += 1;
      }

      if (usrInput.hasNext()) {
        stringCount += 1;
      }

      usrInput.close();
      System.out.println(
          "Integer: " + intCount + " String: " + stringCount + " Boolean: " + booleanCount + " Double: " + doubleCount);
    }

  }
}