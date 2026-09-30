package chaii;

public class rightangle {

    void triangle() {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

    	rightangle tt = new rightangle();

        tt.triangle();
    }
}