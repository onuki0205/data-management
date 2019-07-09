import java.util.Random;
class Dice{
  public static void main(String[] args){
    int a,b,c;
    Random random = new Random();
    a = random.nextInt(6);
    b = random.nextInt(6);
    c = a + b;
    System.out.println("Rolling the dice...");
    System.out.println("Dice 1 : " + a);
    System.out.println("Dice 2 : " + b);
    System.out.println("Total value: " + c);

  }
}
