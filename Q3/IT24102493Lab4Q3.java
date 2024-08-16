import java.util.Scanner;

public class IT24102493Lab4Q3 {
   public static void main(String[] args){
      Scanner Scanner = new Scanner(System.in);
      System.out.println("Enter the number");
      int number=Scanner.nextInt();
      Scanner.close();
      String result=(number>0) ?"The number is positive.":
                    (number<0) ?"The number is negative.":
                    "The number is zero.";
System.out.println(result);

    }
}

