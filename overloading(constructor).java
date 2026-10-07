package citnc;
//constructor without parameter 
 class overloading{
	
		void add(String s)
		{
			System.out.println("1st");
		}
		void add(int a, int b)
		{
			System.out.println("11");
		}
		public static void main (String[]args) {
		overloading tt=new overloading();
		tt.add(1,2);
		tt.add("vdhvcghdc");
		}
}
