package PractiseMore;

public class JavaMethods {
//create a non-static method with return a value
	public int add(){
		int a=10, b=20;
		int res= a+b;
				return res;
	}
	//create a non-static with returns nothing
	public void add2(){
		int a=21, b=22;
		System.out.println(a+b);
	}
	//create a static method with return a value
	public static int sub(){
		int x=60, y=50;
		int z=x-y;
		return z;
	}
	//create a static method with returns nothing
	public static void  sub2(){
		int x=100, y=50;
		System.out.println(x-y);
	}
	
	public static void main(String [] args){
		//Create object
		JavaMethods obj= new JavaMethods();
		
		//calling non-static methods
		obj.add2();
		int res= obj.add();
		System.out.println(res);
		
		//calling static methods
	JavaMethods obj1= new JavaMethods();
	obj1.sub2();
	
	int z= obj1.sub();
	System.out.println(z);
		
		
	}
}
