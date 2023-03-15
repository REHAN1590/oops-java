package rs;

public class obj1 {
		public int sum(int x, int y) {
			return  x+y;
	}
		public int sum(int x,int y,int z) {
			return x+y+z;
		}
		
public static void main(String[]args) {
	obj1 rehan = new obj1();
	System.out.println(rehan.sum(20,15));
	System.out.println(rehan.sum(10,20,35));
}

	}



