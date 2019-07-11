import java.util.*;
class Game{
  public static void main(String[] args){
    String name;
    int a,b,c;
    Random random = new Random();
    Scanner scan = new Scanner(System.in);
    System.out.println("What is your name?");
    name = scan.next();
    System.out.println("Hello, " + name + "!");
    a = random.nextInt(6);
    b = random.nextInt(6);
    c = a + b;
    System.out.println("Rolling the dice...");
    System.out.println("Dice 1 : " + a);
    System.out.println("Dice 2 : " + b);
    System.out.println("Total value: " + c);
    if(c >= 7) System.out.println(name +" won!");
    else System.out.println(name +" lost!");

  }
}
