package guimodule;

public class Airports implements Comparable<Airports>{
	String city;
	String country;
	String airportCode;
	
	
	public Airports(String c, String cou, String air) {
		this.city = c;
		this.country = cou;
		this.airportCode = air;
	}
	public String getCity() {
		return city;
	}
	public String getCountry() {
		return country;
	}
	public String getAirportCode() {
		return airportCode;
	}
	@Override
	public int compareTo(Airports o) {
//		System.out.println("this city : "+this.getCity());
//		System.out.println("that city : "+o.getCity());
		return (this.getCity()).compareTo(o.getCity());
		
	}
	
}
