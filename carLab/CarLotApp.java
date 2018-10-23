package carLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CarLotApp {
	
	//making a static variable outside main means it can be 
	//shared by all the methods
	
	private static List<Car> cars = new ArrayList<>();

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		
		cars.add(new Car("Nikolai", "Model S", 2017, 54999.90));
		cars.add(new Car("Fourd", " Escapade ", 2017, 31999.90));
		cars.add(new UsedCar("Hyonda", "Prior", 2015, 14795.50, 35987.6));
		cars.add(new UsedCar("GC", "Chirpus", 2013, 8500.00, 12345.0));

		boolean done = false;
		while (!done) {
			System.out.println("Select an option: (list, select, add, quit)");
			String option = scnr.nextLine();
			String userNum = scnr.nextLine();
			
			switch (option) {
			case "list":// calling the class below
				doListOption();
				break;
			case "add":
				doAddOption();
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

	private static void doAddOption() {
		for (int i = 0; i < cars.size(); i ++ ) {
	       Car userInput = null;
		
		} System.out.println("Add a Car");
		
	}

	private static void doListOption() {//showMenu
		for( int i = 0; i <cars.size(); i ++) {
			System.out.println( (i + 1) +" " + cars.get(i)); //(car,index)
		}
		System.out.println();
	}

	private static void doSelectOption() {
		for( int i = 0; i < cars.size(); i ++) {
			System.out.println((i +1) + " " + cars.get(i));
		}System.out.println();
		
	}

	}

