package practice;

public class VariableDemo {
	int a=10;
	void print()
	{
		String msg="hello";
		System.out.println(msg);
	}
	static String message="hello students";
	
             
	public static void main(String[] args) {
		VariableDemo obj=new VariableDemo();
		System.out.println("the value of a is "+obj.a);
		obj.print();
		System.out.println(message);
	}

}
