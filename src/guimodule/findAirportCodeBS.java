package guimodule;

public class findAirportCodeBS {
	
	public static String findAirportcodeBS(String toFind, Airports[] arr) {
		int low = 0;
		int high = arr.length;
		int mid;
		while(low<=high) {
			//when low and high is super big, it can cause overflow.
//			mid = (low+high)/2;
			// better way to do that :
			mid = low+((high-low)/2);
			int compare = toFind.compareTo(arr[mid].getCity());
		
			if(compare <0) {
				high = mid-1;
			}
			else if(compare >0) {
				low = mid+1;
			}
			else {
				return arr[mid].getAirportCode();
			}
		}
		return null;
	}

	public static void main(String[] args) {
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

		System.out.println(findAirportcodeBS("Beijing", arr));
	}

}
