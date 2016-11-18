import java.util.Scanner;
 
/**
 * @author q.ronnmark
 *Quenton Ronnmark
 *Mr. Hardman
 *Assignment 4 part 1
 *Nov. 9th 2016
 */
public class SpaceWeight {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Scanner userInput = new Scanner(System.in);
		
		double weight;
		double spaceWeight = 0;
		String celestialBody;
		
		System.out.print("What is your weight? ");
		weight = userInput.nextDouble();
		
		System.out.print("What Planet do you want to go to? ");
		celestialBody = userInput.next();
		
		if(celestialBody.equalsIgnoreCase("Mercury")){
			spaceWeight = weight * 0.38;
		}
	    
		if(celestialBody.equalsIgnoreCase("Venus")){
			spaceWeight = weight * 0.91;
		}
		
		if(celestialBody.equalsIgnoreCase("Earth")){
			spaceWeight = weight * 1;
		}
		
		if(celestialBody.equalsIgnoreCase("Moon")){
			spaceWeight = weight * 0.165;
		}
		
		if(celestialBody.equalsIgnoreCase("Mars")){
			spaceWeight = weight * 0.31;
		}
		
		if(celestialBody.equalsIgnoreCase("Jupiter")){
			spaceWeight = weight * 2.34;
		}
		
		if(celestialBody.equalsIgnoreCase("Saturn")){
			spaceWeight = weight * 1.06;
		}
		
		if(celestialBody.equalsIgnoreCase("Uranus")){
			spaceWeight = weight * 0.92;
		}
		
		if(celestialBody.equalsIgnoreCase("Neptune")){
			spaceWeight = weight * 1.19;
		}
		
		if(celestialBody.equalsIgnoreCase("Pluto")){
			spaceWeight = weight * 0.06;
		}
		
		System.out.println("Your weight is " + spaceWeight);
		
		
		
		 userInput.close();
	}

}
