import java.util.*;

public class ResultCustom {

  public static int getCGPA(int marks) {
    if (marks >= 85) {
      return 10;
    } else if (marks >= 75) {
      return 9;
    } else if (marks >= 65) {
      return 8;
    } else if (marks >= 55) {
      return 7;
    } else if (marks >= 45) {
      return 6;
    } else if (marks >= 35) {
      return 5;
    } else {
      return 4;
    }
  }

  public static void main() {
    Scanner usrInput = new Scanner(System.in);
    String name = usrInput.next();
    int rollNo = usrInput.nextInt();
    List<Integer> marks = new ArrayList<Integer>();
    List<Integer> cgpa = new ArrayList<Integer>();
    for (int i = 0; i < 5; i++) {
      marks.add(usrInput.nextInt());
      cgpa.add(getCGPA(marks.get(i)));
      System.out.println("Marks: " + marks.get(i));
      System.out.println("CGPA: " + cgpa.get(i));
    }
    usrInput.close();
  }
}