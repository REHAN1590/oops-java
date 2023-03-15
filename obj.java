package rs;


public class obj{
	String bapan;
	String rehan;
	int room;
	String rrbs;
	public obj(String b,String r,int g,String c){
		this.bapan=b;
		this.rehan=r;
		this.room=g;
		this.rrbs=c;
	}
	public String getfulld(){
		return this.bapan+this.rehan;
	}
	public int getnumber(){
		return this.room;
	}
	public String getcompany(){
		return this.rrbs;
	}
	public static void main(String[] args){
		//object 1 creation
		obj slice= new obj("GORIB","CHELE",144,"COMPANY");
		System.out.println("ey chele 2 ti "+slice.getfulld());
		System.out.println("room number is "+slice.getnumber());
		System.out.println("company name is "+slice.getcompany());
		//object 2 creation 
		obj credit= new obj("BISAL","GORIB",107,"STARTUP");
		System.out.println("ERA TO "+credit.getfulld());
		System.out.println(" colleger room number "+credit.getnumber());
		System.out.println("new "+ credit.getcompany());
		
	}
	
}