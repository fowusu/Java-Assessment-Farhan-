package com.Qa.Java_Assesment;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.Normalizer.Form;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map; 

public class App{
	
	
	static float tlocationY = (float) Math.random(); 
	static float tlocationX = (float) Math.random(); 
	
	public static void main(String abc[]) {
		
		 game(); 
	}
	
	
	public static void game() {
	
		String str =new DecimalFormat("0.#").format(tlocationY);
		String str2 =new DecimalFormat("0.#").format(tlocationX);
		
		Float northPosition = 0f;
		Float southPosition = 0f;
		Float eastPosition = 0f ;
		Float westPosition = 0f;
		
		float yAxis = northPosition + southPosition; 
		float xAxis = eastPosition + westPosition; 
		
        Boolean treasure = true; 
        
        Scanner direction = new Scanner(System.in); 
     
        System.out.println("Grey foggy clouds float oppressively close to you,");
		System.out.println("reflected in the murky grey water which reaches up your shins.");
		System.out.println("Some black plants barely poke out of the shallow water.");
		System.out.println("Try \"north\",\"south\",\"east\",or \"west\"");
		System.out.println("You notice a small watch-like device in your left hand.");
		System.out.println("It has hands like a watch, but the hands don't seem to tell time."); 
	    System.out.println("treasure is here " + str +" "+ str2);

		do {
			String dr1 = (direction.nextLine());
			
		    if(dr1.equalsIgnoreCase("north")){
		    	yAxis = yAxis + 0.1F;
		    	
				
				System.out.println(yAxis);
				
	
			}
		    else if(dr1.equalsIgnoreCase("south")) {
				
				yAxis = yAxis-0.1F; 
				
			}
		    else if(dr1.equalsIgnoreCase("east") ) {
				
				xAxis = xAxis+0.1F; 
				
				System.out.println(xAxis);
				
			}
		    else if(dr1.equalsIgnoreCase("west")) {
				
				xAxis = xAxis-0.1F; 
			}
		    
		    landmarks(yAxis,xAxis);
			dial(yAxis,xAxis);
		   
		    if(yAxis == tlocationY && xAxis == tlocationX) {
		    	
		    	treasure = false; 
		    }
		    
		  }while(treasure);
		
		
		}
				
	public static void dial(float y, float x) {
		
		float ty = tlocationY - y;
		float tx = tlocationX - x; 
		
		String str = new DecimalFormat("0.#").format(ty);
		String str2 = new DecimalFormat("0.#").format(tx);
		
		
		System.out.println(str);
		

		 if(y < -0.3 || x < 0.6) {
		 if(y < -0.3 ) {
				System.out.println("The dial Reads: " + (-0.3 - y) + "m");
			 }
			 else if(x < 0.6 ) {
				System.out.println("The dial Reads: " + (0.6 - x) + "m");
				 }
			}
		 else if(y < 0.12 || x < -0.3) {
			   if(y < 0.12 ) {
				 System.out.println("The dial Reads: " + (0.12 - y) + "m");
				 }
			   else if(x < -0.3 ) {
				 System.out.println("The dial Reads: " + (-0.3 + x) + "m");
					 }
			}
		 else if(y < ty || x < ty) {
			   if(y < ty ) {
				 System.out.println(ty);
				 System.out.println("The dial Reads: " + str  + "m");
				 }
			   else if(x < tx ) {
				System.out.println("The dial Reads: " + str2  + "m");
					 }
			}
		
	}
	
	
	public static void landmarks(float y, float x) {
		
		
		Map<String, String> landmarks = new HashMap<String, String>(); 
		landmarks.put("treasure", "You see a box sitting on the plain.   Its filled with treasure! You win! The end.");
		landmarks.put("fountain", "you have a found a fountain"); 
		landmarks.put("mountain", "you have a found a tree"); 
		
		    if(y == -0.3 && x == 0.6) {
				System.out.println(landmarks.get("fountain")); 
			}
			if(y == 0.12 && x == -0.3) {
				landmarks.get("mountain"); 
			}
			if(y == tlocationY && x == tlocationX) {
				landmarks.get("treasure"); 
			}
			
			
	}
	
	 
	
}






