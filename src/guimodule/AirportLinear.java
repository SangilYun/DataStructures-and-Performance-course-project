package guimodule;

public class AirportLinear {

	public static void main(String[] args) {
//		Airports[] arr = {new Airports("Montreal","Canada","YMX"),
//				new Airports("Lagos","Nigeria","LOS"),
//				new Airports("Essesn","Germany","ESS"),
//				new Airports("Chicago","USA","ORD"),
//				new Airports("Beijing","China","PEK"),
//				new Airports("Sydney","Australia","SYD"),
//				new Airports("Quito","Ecuador","UIO"),
//				new Airports("Agra","India","AGR")};
	
//		organized by city name in alphabetical order
		Airports[] arr = {
				new Airports("Agra","India","AGR"),
				new Airports("Beijing","China","PEK"),
				new Airports("Chicago","USA","ORD"),
				new Airports("Essesn","Germany","ESS"),
				new Airports("Lagos","Nigeria","LOS"),
				new Airports("Montreal","Canada","YMX"),
				new Airports("Quito","Ecuador","UIO"),
				new Airports("Sydney","Australia","SYD"),
				};
		
		
		//we can use while too
		for(int i=0; i<arr.length; i++) {
			if(arr[i].getCity().equals("Beijing")) {
				System.out.println("index : " + i);
			}
		}
		

	}
}
