package admin.gugan.project;

public class DayOne {
	    public static void main(String[] args) {
	        // Arithmetic Operators
	        int a = 10;
	        int b = 5;

	        System.out.println("Arithmetic Operators:");
	        System.out.println("a + b = " + (a + b)); 
	        System.out.println("a - b = " + (a - b));
	        System.out.println("a * b = " + (a * b)); 
	        System.out.println("a / b = " + (a / b)); 
	        System.out.println("a % b = " + (a % b)); 

	        // Relational Operators
	        System.out.println("\nRelational Operators:");
	        System.out.println("a == b = " + (a == b)); 
	        System.out.println("a != b = " + (a != b)); 
	        System.out.println("a > b = " + (a > b));  
	        System.out.println("a < b = " + (a < b));  
	        System.out.println("a >= b = " + (a >= b)); 
	        System.out.println("a <= b = " + (a <= b)); 

	        // Logical Operators
	        boolean x = true;
	        boolean y = false;

	        System.out.println("\nLogical Operators:");
	        System.out.println("x && y = " + (x && y)); 
	        System.out.println("x || y = " + (x || y)); 
	        System.out.println("!x = " + !x);           

	        // Assignment Operators
	        int c = 7;
	        c += 3;  
	        System.out.println("\nAssignment Operators:");
	        System.out.println("c after c += 3: " + c); 

	        // Increment and Decrement Operators
	        int d = 5;
	        System.out.println("\nIncrement and Decrement Operators:");
	        System.out.println("d++ = " + d++);
	        System.out.println("++d = " + ++d); 
	        System.out.println("d-- = " + d--); 
	        System.out.println("--d = " + --d); 
	    }
	}