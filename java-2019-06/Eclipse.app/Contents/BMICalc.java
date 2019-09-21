package King_p2;

import java.util.Scanner;

public class BMICalc {
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Height in feet");
		double Feet = console.nextInt();
		System.out.print("Height in inches");
		double Height = console.nextDouble();
		Height = Feet*12 + Height;
		System.out.print("Weight in pounds");
		double Weight = console.nextDouble();
		double BMI =(Weight * 703 / Height / Height);
		System.out.printf("BMI = %.1f\n", BMI);
		if(BMI < 18.5){
			System.out.println("Underwieght");
		}
		else if(BMI < 25){
			System.out.println("Normal");
		}
		else if(BMI < 30){
			System.out.println("Overweight");
	}
		else {
			System.out.println("obese");
		}

}
}