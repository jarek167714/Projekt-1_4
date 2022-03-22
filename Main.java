import java.util.Scanner;
class Main {
  public static void main(String[] args) 
  {
    Scanner nazwa = new Scanner(System.in);
    int wybor;
    double a ,b;
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
            
          }
      }
  }
  
}