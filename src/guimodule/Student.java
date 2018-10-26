package guimodule;

public class Student extends Person{
	public void method1() {
		System.out.print("Student 1  ");
		super.method1();
		method2();
	}
	
	public void method2() {
		System.out.println("Student 2  ");
	}
	

}
