package javaprogram;

/*class Parent{
	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	
}

class Demo extends Parent{
	public static void main(String[]args) {
		Demo bb =new Demo();
		bb.setA(3);
		int ss=bb.getA();
		System.out.println(ss);
		
		
	}

}
*/
interface abc{
	void m1();
}
class Demo implements abc{
	public void m1() {
		System.out.println("hvvhjg");
	}
	public static void main(String[]args) {
		Demo bb=new Demo();
		bb.m1();
	}
}
