public class Calculate {
   public static void main(String[] arg) {
      System.out.println("Calculate...");
	  double first = Double.valueOf(arg[0]);
	  double second = Double.valueOf(arg[1]);
	  double third = Double.valueOf(arg[2]);
	  double summ = first + second + third;
	  System.out.println("Our summ is " + summ);
   }
}