public class Split {
  public static void main(String args[]) {
    String ary = "My-Name-is-Khan";
    String[] subAry = ary.split("-", 5);
    for (String str : subAry) {
      System.out.println(str);
    }
  }
}