import java.util.Scanner;
public class Main {

public static void main(String[] args) {
    
    // variables

    double double1;
    double double2;
    int PowerOf;
    String operation;
    String prob;
    String yes;
    


  

  //The Welcome Statement 
  System.out.println("");
  System.out.println("Hello! Welcome to Smart Calc ➕ ➖ ➗ ✖️");
  System.out.println("");
  System.out.println("Would you like Smart Calc to give info or solve a problem?");
  System.out.println("Type info or problem");


     Scanner problem = new Scanner (System.in);
     prob = problem.next();  
    
    


// Test 

 if (prob.equals("info"))
  {
    System.out.println("Smart Calc info:");
     System.out.println("");
     System.out.println("Smart Calc was designed by Alessandro Fernandez.");
     System.out.println("Smart Calc can do the following operations:");
     System.out.println("Addition = +");
     System.out.println("Subtraction = -");
     System.out.println("Multiplication = * or x");
     System.out.println("Division = / or ÷");     
     System.out.println("Square Root = rad, sqrt, and square_root");
     System.out.println("Square a number = squared");
     System.out.println("Square Numbers = to_the_power_of");
    System.out.println("Sin of a number = sin");
    System.out.println("Cos of a number = cos");
    System.out.println("Tan of a number = tan");
     
     System.out.println("");


     System.out.println("Would you like to solve a problem?");
     System.out.println("Please type yes or no");

     //Scanner for yes
   Scanner Yes = new Scanner (System.in);
   yes = Yes.next();

   if(yes.equals("yes"))
   {
     System.out.println("this test was executed");
   } else 
   {
     System.out.println("Thank you for using Smart Calc ➕ ➖ ➗ ✖️");
   }

  } 






 //Calculator 
     

if (prob.equals("problem")){


  
      Scanner input = new Scanner(System.in);

      System.out.println("Please Enter The First Number");
   double1 = input.nextDouble();

     Scanner op = new Scanner (System.in);
      System.out.println("Please Enter The Operation");
      operation = op.next();

     
//Basic Operations
   
if ((operation.equals("+"))||(operation.equals("-"))||(operation.equals("*"))||(operation.equals("/"))||(operation.equals("x"))||(operation.equals("÷"))){
      System.out.println("Please Enter The Second Number");
      
     double2 = input.nextDouble();

    //Does addition, subtraction, multiplication, and division

      if (operation.equals("+"))
     {
         
         Addition.addition(double1, double2);

      }
     else if (operation.equals("-"))
     {

         Subtraction.subtraction(double1, double2);

     }       
     else if ((operation.equals("*"))||(operation.equals("x")))
     {
      
          Multiplication.multiplication(double1, double2);
         
     }   
     else if ((operation.equals("/"))||(operation.equals("÷")))
     {

         Division.division(double1, double2);

     }
}

  
// Square Root, Squared, and to the power of 
if  ((operation.equals("rad"))||(operation.equals("sqrt"))||(operation.equals("squared"))||(operation.equals("square_root")))
{
     if ((operation.equals("rad"))||(operation.equals("sqrt"))||(operation.equals("square_root")))
     {
         SQRT.sqrt(double1);
     } 
     else if (operation.equals("squared"))
     {
       Squared.squared(double1);
     }
      
  }

//Sin Cos Tan
  if ((operation.equals("sin"))||(operation.equals("cos"))||(operation.equals("tan")))
  {
    if(operation.equals("sin"))
    {
      Sin.sin(double1);
    } else if (operation.equals("cos"))
    {
      Cos.cos(double1);
    } else if (operation.equals("tan"))
    {
      Tan.tan(double1);
        }
  }

  
   //To continue with answer
   System.out.println("");
   System.out.println("Would you like to continue?");
   System.out.println("Please type yes or no");

   //Scanner for yes
   Scanner Yes = new Scanner (System.in);
   yes = Yes.next();

   if(yes.equals("yes"))
   {
     Continue.contin(double ans, double double2);
   } else {
     System.out.println("Thank you for using Smart Calc ➕ ➖ ➗ ✖️");
   }


  




  } 



}
}

