package admin.gugan.DayThree;

public class exmethod {
	public void def() {
		System.out.println("Default");
	}

	public void pri() {
		System.out.println("private");
	}
	public void pro() {
		System.out.println("protected");
	}
	public void pub() {
		System.out.println("public");
	}
	
	
	
	
	public static void main(String args[]){
		
		exmethod f = new exmethod();
		
		f.pri();
		f.pro();	
		f.def();
		f.pub();
	}
}

