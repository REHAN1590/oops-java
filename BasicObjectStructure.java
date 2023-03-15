package rs;

public class BasicObjectStructure {
	String firstName;
	String lastName;
	int id;
	String dept;
	public BasicObjectStructure(String fn,String ln,int r,String d) {
		this.firstName=fn;
		this.lastName=ln;
		this.id=r;
		this.dept=d;
		
	}
	public String getfullname() {
		return this.firstName+this.lastName;
	}
	public int getroll() {
		return this.id;
	}
	public String getstream() {
		return this.dept;
	}
	public static void main(String []args) {
//1st object creation
	BasicObjectStructure ob1= new BasicObjectStructure("SYED ","REHAN",10,"CSE");
	System.out.println("full name is "+ob1.getfullname());
	System.out.println("roll number is "+ob1.getroll());
	System.out.println("stream is "+ob1.getstream());
	
	//2nd object creation
	BasicObjectStructure ob2=new BasicObjectStructure("BAPAN ","DE",12,"CSE");
	System.out.println("full name is "+ob2.getfullname());
	System.out.println("roll number is "+ob2.getroll());
	System.out.println("stream is "+ob2.getstream());
		
			// TODO Auto-generated method stub

		}
		

	

}

