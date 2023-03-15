package rs;

public class oops1 {
	static String name;
	static int roll;
	static String dept;
    static void set(String n,int r,String d) {
		oops1.name=n;
		oops1.roll=r;
		oops1.dept=d;
	}
	static void  get() {
		System.out.println("student name is "+oops1.name);
		System.out.println("student roll is "+oops1.roll);
		System.out.println("student dept is "+oops1.dept);
	}
	public static  void main(String[]args) {
		oops1.set("rehan",10,"CSE");
		oops1.get();
	}
	 
	

}
