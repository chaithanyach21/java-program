package chaii;

public class oppsiterightangle {
	    public static void triangle() {

	        int n = 5;
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print("  ");
	            }
	            for (int j = 1; j <= i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	    }
	    public static void main(String[] args) {
	    	oppsiterightangle  tt = new oppsiterightangle();
	        tt.triangle();
	    }
	}
