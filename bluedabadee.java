import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
      Scanner poggers = new Scanner(System.in);
      System.out.println("enter what color you are 1 = blue 2 = green");
      int bluedabadee = poggers.nextInt();
      //System.out.println(bluedabadee): <- used to debug :\
      if (bluedabadee == 1) {
          System.out.println("IM BLUE DA BA DEE BA DIE IF I WAS GREEN I WOULD DIE");
      }
      else if (bluedabadee == 2) {
          System.out.println("wierd you should be dead");
      }
      else if (bluedabadee <= 3) {
          System.out.println("This code is brought to you by raid shadow legends");      }
    }
}