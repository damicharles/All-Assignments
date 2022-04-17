import java.util.Scanner;

	public class DiameterCircumferenceAndAreaOfCircle {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Enter the radius of a circle: ");
			int radius = scanner.nextInt();
			scanner.close();

			System.out.printf("Diameter is %d%n", radius * 2);
			System.out.printf("Circumference is %f%n", 2 * Math.PI * radius);
			System.out.printf("Area is %f%n", Math.PI * (radius * radius));
	}

}