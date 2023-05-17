//package com.sg.foundations.basics.methods;
import java.util.Random;
import java.lang.Math;

public class BarelyControlledChaos {

    public static void main(String[] args) {

        String color = getColor(); // call color method here
        String animal = getAnimal(); // call animal method again here
        String colorAgain = getColor(); // call color method again here
        long weight = getNumber(5, 200); // call number method,
            // with a range between 5 - 200
        long distance = getNumber(10, 20); // call number method,
            // with a range between 10 - 20
        long number = getNumber(10000, 20000); // call number method,
            // with a range between 10000 - 20000
        long time = getNumber(2, 6); // call number method,
            // with a range between 2 - 6            

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
            + weight + "lb " + " miniature " + animal
            + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
            + number + " " + colorAgain + " poppies for nearly "
            + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
            + "let me tell you!");
    }

    public static String getColor() {
    	Random rng = new Random();
    	
    	String[] colors = new String[] { "Blue", "Pink", "Red", "Purple", "Black", "Orange", "Yellow" };
    	int randomIndex = rng.nextInt( colors.length );
    	
    	return colors[randomIndex];
	}
    
    public static String getAnimal() {
    	Random rng = new Random();
    	
    	String[] animals = new String[] { "Shark", "Cat", "Tiger", "Monkey", "Puma", "Dog", "Bear" };
    	int randomIndex = rng.nextInt( animals.length );
    	
    	return animals[randomIndex];
	}
    
    public static long getNumber(int num1, int num2) {
    	Random rng = new Random();
    	
    	if (num1 > num2) {
    		int aux = num1;
    		num1 = num2;
    		num2 = aux;
    	}
    		
    	double aux = rng.nextDouble();
    	long randomNumber = Math.round(aux * (num2-num1) + num1);
    	
    	return randomNumber;
	}

}






