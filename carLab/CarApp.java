package carLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarApp {
	
	
	private static List<Car> carsList = new ArrayList<>();
	public static void main(String[] args) {
		
	Scanner scnr = new Scanner (System.in); 
	
	carsList.add(new Car("Nikolai", "Model S", 2017, 54999.90));	
	carsList.add(new Car ("Fourd", " Escapade ", 2017, 31999.90));
	carsList.add(new UsedCar("Hyonda", "Prior", 2015, 14795.50, 35987.6 ));
	carsList.add(new UsedCar("GC", "Chirpus", 2013, 8500.00, 12345.0));
	

	boolean done = false;
	while (!done) {
		System.out.println("Select an option: (list, select, add, quit)");
		String option = scnr.nextLine();
		switch (option) {
		case "list":// calling the class below
			doListOption();
			break;
		case "select":
			doSelectOption();
			break;
		case "quit":
			done = true;
			break;
		default:
			System.out.println("Invalid choice...");
			break;
		}
	}

}

private static void doListOption() {//showMenu
	for( int i = 0; i < carsList.size(); i ++) {
		System.out.println( (i + 1) +" " + carsList.get(i)); //(car,index)
	}
	System.out.println();
}

private static void doSelectOption() {
	
}



	
	}

