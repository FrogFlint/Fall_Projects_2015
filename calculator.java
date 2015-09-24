package Code;
import java.util.Scanner;

public class calculator {

	public static float firstNumber;
	public static float secondNumber;
	public static String operation;

	@SuppressWarnings("resource")
	public static void main(String[] args){


		Scanner in = new Scanner(System.in);

		//for (;;){
		System.out.println("Insert First Number");
		firstNumber = in.nextFloat();
		System.out.println("Insert Operation");
		operation = in.next();
		System.out.println("Insert Second Number");
		secondNumber = in.nextFloat();

		if (operation.equals("+") ){
			System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
		}
		else if (operation.equals("-") ){
			System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
		}
		else if (operation.equals("*") ){
			System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
		}
		else if (operation.equals("/") ){
			System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
		}
		else if (operation.equals("^") ){
			System.out.println(firstNumber + " ^ " + secondNumber + " = " + (Math.pow(firstNumber,secondNumber)));
		}
		else{
			System.out.println("Computing Error");
		}


	}
	//}
}
