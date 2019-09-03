import java.util.*;

public class Tokenizer {
  public static void main(String args[]) {
    StringTokenizer sampleText = new StringTokenizer("My name is Khan", " ");
    while (sampleText.hasMoreTokens())
      System.out.println(sampleText.nextToken());
  }
}