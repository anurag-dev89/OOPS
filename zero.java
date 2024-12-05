class  DivisionByZeroException  extends  Exception          
{ 
       public  DivisionByZeroException(String  message)  
     { 
         super(message); 
     } 
} 
 
public class zero  
{  
   public static void main(String[] args)  
    { 
       try  
      { 
            int numerator = 10; 
            int denominator = 0; 
             
           if (denominator == 0)  
         { 
             // If denominator is zero, throw the custom exception 
               throw new DivisionByZeroException("Division by zero is not allowed"); 
          } 
                 int result = numerator / denominator;  
              // This line won't execute due to the exception 
                 System.out.println("Result: " + result); 
       }  
      
     catch (DivisionByZeroException  e)  
     {  
           // Catch the custom exception and handle it 
           System.out.println("Custom Exception Caught: " +  e.getMessage()); 
     } 
     finally  
     { 
           // Finally block executes whether an exception occurs or not 
              System.out.println("Finally block executed"); 
      } 
 
    } 
}