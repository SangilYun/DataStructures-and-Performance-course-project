package guimodule;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.data.Feature;
import de.fhpotsdam.unfolding.data.GeoJSONReader;
import de.fhpotsdam.unfolding.marker.Marker;
import de.fhpotsdam.unfolding.providers.Microsoft.HybridProvider;
import de.fhpotsdam.unfolding.utils.MapUtils;
import processing.core.PApplet;

public class LIfeExpectancy extends PApplet{

	UnfoldingMap map;
	Map<String,Float> lifeExpByCountry;
	List<Feature> countries;
	List<Marker> countryMarkers;
	
	public void setup() {
		size(800,600,OPENGL);
		map = new UnfoldingMap(this, 50, 50, 700, 500, new HybridProvider());
		MapUtils.createDefaultEventDispatcher(this,map); // enable interactivity with mouse event
		
		lifeExpByCountry = loadLifeExpectancyFromCSV("/Users/yunsangil/Documents/computing/JAVA/UCSDUnfoldingMaps/data/countries.geo.json");
		countries = GeoJSONReader.loadData(this, "countries.geo.json");//Parses a GeoJSON String and creates features for them.
		countryMarkers = MapUtils.createSimpleMarkers(countries); //Creates Unfolding's simple markers from features.
		map.addMarkers(countryMarkers);							// (without the need to create a MarkerFactory)

	}
	
	private Map<String, Float> loadLifeExpectancyFromCSV(String fileName){
		
		Map<String, Float> lifeExpMap = new HashMap<String,Float>();
		String[] rows = loadStrings(fileName); //read file
		for(String row : rows) {
			String[] columns = row.split(",");
			if (columns.length == 6 && !columns[5].equals("..")) {
				lifeExpMap.put(columns[4], Float.parseFloat(columns[5]));
			}
		}
		return lifeExpMap;
	}
	
	
	public void draw() {
		map.draw();
	}
	
	private void shadeCountries() {
		for (Marker marker : countryMarkers) {
			// Find data for country of the current marker
			String countryId = marker.getId();
			if (lifeExpByCountry.containsKey(countryId)) {
				float lifeExp = lifeExpByCountry.get(countryId);
				// Encode value as brightness (values range: 40-90)
				int colorLevel = (int) map(lifeExp, 40, 90, 10, 255);
				marker.setColor(color(255-colorLevel, 100, colorLevel));
			}
			else {
				marker.setColor(color(150,150,150));
			}
		}
	}
}
