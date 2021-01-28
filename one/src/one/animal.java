package one;

 class TestInheritence {
	  
		void eat(){System.out.println("eating...");}  
		}  
		class Dog extends TestInheritence{  
		void bark(){System.out.println("barking...");}  
		}  
		public class animal{  
		public static void main(String[] args){  
		Dog d=new Dog();  
		d.bark();  
		d.eat();  
		}}  


