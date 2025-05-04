package revise;

class rabbit{
	 void show
	 () {
		 System.out.println("class A");
	 }
}

class mouse extends rabbit{
	void show() {
		System.out.println("class B");
	}
	void display() {
		
	}
}
public class reviseClass  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		rabbit r = new mouse();
		r.show();
		
	}

}
