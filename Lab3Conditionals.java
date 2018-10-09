package Lab3Conditionals;
import java.util.Scanner;
public class Lab3Conditionals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);
		String name;
		System.out.println("What is your name");
		name = scnr.next();
		
		int numchoice;
		System.out.println(name + " enter an Integer Between 1 and 100");
		numchoice = scnr.nextInt();
		
		
		if (numchoice < 1 || numchoice > 100) {
       	 System.out.println(name + " please keep your number between 1 and 100");
	     }
		else if (numchoice % 2 == 0 && numchoice >=2 && numchoice <=25) {
	         System.out.println("Even and less than 25");
	      }
		
		else if (numchoice % 2 == 0 && numchoice >=26 && numchoice <=60) {
	         System.out.println("Even");
	      }
		
		else if (numchoice % 2 == 0 && numchoice > 60) {
	         System.out.println(numchoice + " Even");
		}
		
		else if (numchoice % 2 == 1 && numchoice > 60) {
	         System.out.println(" Odd and over 60 ");
		}  
	     else if (numchoice % 2 == 1) {
		         System.out.println(numchoice + " Odd");
		          
		         }
	     
		}
	}


