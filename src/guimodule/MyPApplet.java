package guimodule;

import processing.core.PApplet;
import processing.core.PImage;

public class MyPApplet extends PApplet{
	PImage img;
	
	public void setup() {
		size(400,400);
		background(255);
		img = loadImage("http://cseweb.ucsd.edu/~minnes/palmTrees.jpg","jpg");
		img.resize(0, height);
		image(img,0,0);
	}
	
	public void draw() {
		//Add drawing code for MyPApplet
		int[] color = sunColorSec(second()); //built in method second()
		fill(color[0], color[1], color[2]);
		ellipse(width/4, height/5, width/4, height/5);
	}
	
	public int[] sunColorSec(float seconds) {
		int[] rgb = new int[3];
		//Scale the brightness of the yellow based on the seconds. 30seconds
		//is black. 0seconds is bright yellow
		float diffFrom30 = Math.abs(30-seconds);
		float ratio = diffFrom30/30;
		rgb[0]= (int)(255*ratio);
		rgb[1]= (int)(255*ratio);
		rgb[2]= 0;
		
		return rgb;
		
	}
}
