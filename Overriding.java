package chaii;

class parents {
	void property() {
		System.out.println("property");
	}

	void marry() {
		System.out.println("family girl/boy");
	}
}

public class Overriding extends parents {
	void marry() {
		System.out.println("campus selection girl/boy");
	}

	public static void main(String[] args) {
		Overriding tt = new Overriding();
		tt.marry();
		tt.property();
	}
}