import java.util.Scanner;
public class Tic-Tac-Toe {
	public static String a = "-";
	public static String b = "-";
	public static String c = "-";
	public static String d = "-";
	public static String e = "-";
	public static String f = "-";
	public static String g = "-";
	public static String h = "-";
	public static String i = "-";
	public static String input;
	public static String turn = "X";
	public static int selected;
	public static boolean keepGoing = false;
	public static String newGame;
	public static boolean toggleTurn = true;
	public static void main(String args[]){
		@SuppressWarnings("resource")
		Scanner look = new Scanner(System.in);
		for(;;){
			
			System.out.println();
			keepGoing = true;
			for(;keepGoing == true;){
				//toggleTurn = true;
				selected = look.nextInt();
				if (selected == 1 && a == "-"){
					a = (turn);
				}
				else if (selected == 2 && b == "-"){
					b = (turn);
				}
				else if (selected == 3 && c == "-"){
					c = (turn);
				}
				else if (selected == 4 && d == "-"){
					d = (turn);
				}
				else if (selected == 5 && e == "-"){
					e = (turn);
				}
				else if (selected == 6 && f == "-"){
					f = (turn);
				}
				else if (selected == 7 && g == "-"){
					g = (turn);
				}
				else if (selected == 8 && h == "-"){
					h = (turn);
				}
				else if (selected == 9 && i == "-"){
					i = (turn);
				}
				else{
					System.out.println("Invalid Operation. Go again");
					toggleTurn = false;

				}
				if (toggleTurn = true){
					System.out.print("");
					System.out.print("");
					System.out.print("\n  " + a + " " + b + " " +  c + "\n  " + d + " " + e + " " +  f + "\n  " + g + " " + h + " " +  i + "\n");
					

					if (a.equals(d) && a.equals(g) && a != "-"){
						keepGoing = false;
						System.out.println(a + " wins!");
					}
					if (b.equals(e) && b.equals(h) && b != "-"){
						keepGoing = false;
						System.out.println(b + " wins!");
					}
					if (c.equals(f) && c.equals(i) && c != "-"){
						keepGoing = false;
						System.out.println(c + " wins!");
					}
					if (a.equals(b) && a.equals(c) && a != "-"){
						keepGoing = false;
						System.out.println(a + " wins!");
					}
					if (d.equals(e) && d.equals(f) && d != "-"){
						keepGoing = false;
						System.out.println(d + " wins!");
					}
					if (g.equals(h) && g.equals(i) && g != "-"){
						keepGoing = false;
						System.out.println(g + " wins!");
					}
					if (a.equals(e) && a.equals(i) && a != "-"){
						keepGoing = false;
						System.out.println(a + " wins!");
					}
					if (g.equals(e) && g.equals(c) && g != "-"){
						keepGoing = false;
						System.out.println(g + " wins!");
					}


					if (turn == "X" && toggleTurn == true){
						turn = "O";
					}
					else if(turn == "O" && toggleTurn == true){
						turn = "X";
					}
				}
			}
		}
	}
}
