import java.util.Scanner;
class Greet{
  public static void main(String[] args){
    String name;
    Scanner scan = new Scanner(System.in);
    System.out.println("What is your name?");
    name = scan.next();
    System.out.println("Hello, " + name + "!");
  }
}
