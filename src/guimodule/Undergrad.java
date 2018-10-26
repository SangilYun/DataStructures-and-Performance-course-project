package guimodule;

public class Undergrad extends Student{

	public void method2() {
		 System.out.print("Undergrad 2  ");
	}
	public static void main(String[] args) {
		Person u = new Undergrad();
		u.method1();

	}

}
