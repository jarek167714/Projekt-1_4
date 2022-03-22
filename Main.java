import java.util.Scanner;
import java.lang.Math.*;
class Main {
  public static void main(String[] args) 
  {
    Scanner nazwa = new Scanner(System.in);
    int wybor;
    double a ,b;
    double a = nazwa.nextdouble();
    System.out.println("Co chcesz policzyć? \n1. Potęga \n2. Suma pierwiastków \n3. Max \n4. Dzielenie");
    wybor = nazwa.nextInt();

    switch(wybor)
      {
        case 1:
          {
            System.out.println("Liczba do potęgi: \n Podaj a i b");
            a = nazwa.nextDouble();
            b = nazwa.nextDouble();
            double power = Math.pow(a ,b);
            System.out.println("a ^ b = "+power);
            break;
          }
        case 2:
          {
            System.out.println("suma pierwiastków: \n Podaj a i b");
            double z = Math.sqrt();
            double x = Math.sqrt();
            double c = z + x;
            System.out.println(c);
          }
        case 3:
          {
            System.out.println("Max: \n Podaj a i b");
            
            
          }
        case 4:
          {
            System.out.println("Dzielenie: \n Podaj a i b");
            a = nazwa.nextDouble();
            b = nazwa.nextDouble();
            if ( b == 0)
            {
            System.out.println("dzielenie przez 0");
            }
            else
            {
            double iloraz = a/b;
            System.out.println("a / b = "+iloraz);
            break;
            }
          }  
  }
  
    }
}