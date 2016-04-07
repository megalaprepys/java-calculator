import java.util.Scanner;

public class StartCalculator {
	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		try {
			Calculator calc = new Calculator();
			String exit = "no";
			while (!exit.equals("yes")) {
				System.out.println("Write first number: ");
			    String first = scanner.next();
			    System.out.println("Write second number: ");
			    String second = scanner.next();
			    System.out.println("Write third number: ");
			    String third = scanner.next();
				calc.add(Double.valueOf(first), Double.valueOf(second), Double.valueOf(third));
				System.out.println("Result: " + calc.get());
				calc.remove();
				System.out.print("Exit? (yes/no): ");
				exit = scanner.next();
			}
		} finally {
			scanner.close();
		}
	}
}