package one;

public class p2 {
	  
		int id;  
		String name; 
		p2(int i,String n){
		
		id=i;
		name=n;
		}
		
		  
		void display(){System.out.println(id+" "+name);} 
		  
		public static void main(String args[]) {  
		
		p2 s1=new p2(4,"jay");
		p2 s2=new p2(5,"june");
		
		  
		s1.display();  
		s2.display();  
		
		} 
}
		  
		

	


