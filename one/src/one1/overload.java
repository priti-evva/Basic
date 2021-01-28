package one1;

       class TestOverloading1 {
	 
		static int add(int a,int b){return a+b;}  
		static int add(int a,int b,int c){return a+b+c;}  
		}  
		class overload{  
		public static void main(String[] args){  
		System.out.println(TestOverloading1.add(11,12));  
		System.out.println(TestOverloading1.add(11,16,13));  
		}}  


