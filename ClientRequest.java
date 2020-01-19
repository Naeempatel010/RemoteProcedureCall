import java.rmi.*;
import java.util.Scanner; 
public class ClientRequest 
{ 
    public static void main(String args[]) 
    { 
        Scanner s = new Scanner(System.in);
		System.out.println("Enter the first Number");
		String num1 = s.next();
		System.out.println("Enter the second Number");
		String num2 = s.next();
		
		String answer,value=num1 + "+" + num2;
		
        try
        { 
            // lookup method to find reference of remote object 
            Search access = 
                (Search)Naming.lookup("rmi://localhost:1900"+"/add"); 
            answer = access.query(value); 
            System.out.println("answer is " + answer); 
        } 
        catch(Exception ae) 
        { 
            System.out.println(ae); 
        } 
    } 
} 
