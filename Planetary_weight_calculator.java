import java.util.Scanner;
public class Planetary_weight_calculator {
	public static float weight;
	public static boolean withSpaceSuit;
	public static String planet;
	public static String suit;
	public static float gravity;
	public static float output;
	public static boolean go;

	public static void main(String args[]){
		Scanner look = new Scanner(System.in);

		System.out.println("How much do you weigh? (In kg)\n");
		weight = look.nextFloat();
		
		System.out.println("\nWhere are you going?\n");
		go = true;
		for(;go == true;){
			planet = look.next();
			if(planet.equals("Earth") || planet.equals("Mars") || planet.equals("Jupiter") || planet.equals("nowhere")){
				go = false;
			}
			else{
				System.out.println("\nPlanet not recognised. Try again.\n");
				go = true;
			}
		}
		go = true;
		System.out.println("\nAre you wearing a space suit?\n");
		for(;go == true;){
			
			suit = look.next();
			
			
			if( suit.equals("yes") ){withSpaceSuit = true; go = false;}
			else if( suit.equals("no") ){withSpaceSuit = false; go = false;}
			else{System.out.println("\nDid you really just mess up a yes\\no question? Try again.\n"); go = true;}
		
		}


		if (planet == "Mars"){
			gravity = 0.38f;
		}
		else if (planet == "Earth"){
			gravity = 1f;
		}
		else if (planet == "Jupiter"){
			gravity = 2.4f;
		}

		
		output = weight;
		if (withSpaceSuit == true){
			output += 21;
		}
		output *= gravity;
		if (planet == "nowhere"){
			System.out.println("\nObviously, in the middle of nowhere, there is no gravity and you would weigh nothing (with or without your space suit). your mass however, will still be " + weight + " kg, no matter where you are");
		}
		else if (withSpaceSuit == true){
			System.out.println("\nYou and your space suit would weigh " + output + "kg on " + planet + "");
		}
		else{
			System.out.println("\nYou would weigh " + output + "kg on " + planet);
		}

	}
}
