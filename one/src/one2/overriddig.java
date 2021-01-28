package one2;

 class bike2 {  
		   
		  void run(){System.out.println("Vehicle is running");}  
		}  
		 
		class overriding extends bike2{  
  
		  void run(){System.out.println("Bike is running safely");}  
		  
		  public static void main(String args[]){  
		  overriding obj = new overriding();
		  obj.run();//calling method  
		  }  
		}  



