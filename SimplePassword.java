import java.util.Scanner;
public class SimplePassword {
	private static String password = "your password here";
	public static String input;
	public static boolean isDone = false;
	public static int fails = 0;
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Password");
		for(;isDone == false;){
			input = in.nextLine();
			if (password.equals(input)){
				System.out.println("Password Correct");
				isDone = true;
			}
			else{
				fails += 1;
				if(fails == 1){
					System.out.println("Password Incorrect. Try Again");
					System.out.println("2 Chances Remaining");
				}
				else if(fails == 3){
					System.out.println("Password Incorrect. System Locking");
					System.out.println("-=+=- -=+=- -=+=- -=+=- -=+=-");
					System.out.println("System Locked");
					isDone = true;
				}
				else{
					System.out.println("Password Incorrect. Try Again");
					System.out.println("1 Chance Remaining");
				}


			}

		}
	}
}
