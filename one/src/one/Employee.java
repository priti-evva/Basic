package one;
import java.util.Scanner;

public class Employee {
	 
	 int empid;
	 String name;
	
	 private String[] technologies;
	 public String[] getTechnologies(){ return technologies; }
	 public String[] setTechnologies(String[] technologies){return this.technologies = technologies;}
	 
	 public void getInput() {
	 
	  Scanner in = new Scanner(System.in);
	  System.out.print("Enter the empid :: ");
	  empid = in.nextInt();
	  System.out.print("Enter the name :: ");
	  name = in.next();
	  System.out.print("Enter the technologies :: ");
	  
	  for (int i = 0; i < technologies.length; i++) {
		  System.out.print(technologies[i]);}
	 
	 }
	 
	 public void display() {
	  
	  System.out.println("Employee id = " + empid);
	  System.out.println("Employee name = " + name);
	 
	 }
	 
	 public static void main(String[] args) {
	 
	  Employee e[] = new Employee[3];
	  
	  for(int i=0; i<5; i++) {
	   
	   e[i] = new Employee();
	   e[i].getInput();
	  }
	  
	  System.out.println("**** Data Entered as below ****");
	  
	  for(int i=0; i<3; i++) {
	   
	   e[i].display();
	  }
	 }
}
	 