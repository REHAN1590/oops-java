package rs;

public class objBasic {
	int a;
	int b;
	String c;
	boolean d;
	float f;
	float i;
	
	objBasic(int x,int y,String z,boolean o,float p,float g){
		this.a=x;
		this.b=y;
		this.c=z;
		this.d=o;
		this.f=p;
		this.i=g;
		
	}
	
	public static void main(String[] args) {
		//only objectBasic is a custom datatype
		//objectBasic() is a constructor and here it is a deafult constructor
		objBasic obj;
		obj=new objBasic(10,20,"rehan",true,10,1000);
		System.out.println("a = "+obj.a);
		System.out.println("b = "+obj.b);
		System.out.println("c = "+obj.c);
		System.out.println("d = "+obj.d);
		System.out.println("f = "+obj.f);
		System.out.println("i = "+obj.i);
	}

}
