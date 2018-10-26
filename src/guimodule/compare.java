package guimodule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class compare {


	public static void main(String[] args) {
		

		Airports[] arr = {new Airports("Montreal","Canada","YMX"),
		new Airports("Lagos","Nigeria","LOS"),
		new Airports("Essesn","Germany","ESS"),
		new Airports("Chicago","USA","ORD"),
		new Airports("Beijing","China","PEK"),
		new Airports("Sydney","Australia","SYD"),
		new Airports("Quito","Ecuador","UIO"),
		new Airports("Agra","India","AGR")};

		ArrayList<Airports> arr1 = new ArrayList<Airports>(Arrays.asList(new Airports("Montreal","Canada","YMX"),
		new Airports("Lagos","Nigeria","LOS"),
		new Airports("Essesn","Germany","ESS"),
		new Airports("Chicago","USA","ORD"),
		new Airports("Beijing","China","PEK"),
		new Airports("Sydney","Australia","SYD"),
		new Airports("Quito","Ecuador","UIO"),
		new Airports("Agra","India","AGR")));

		Collections.sort(arr1);
		System.out.println(arr1.get(0).getCity());
//		System.out.println(arr[0].compareTo(arr[2]));
//		System.out.println(arr[1].compareTo(arr[2]));

	}

	

}
