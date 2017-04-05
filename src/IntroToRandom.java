import java.util.Random;

//1. Run the program.  What number appears?

//2. Make the number random.

//3. Limit the random number between 0 and 100

//4. Limit the random number between 25 and 75.  (highest value - lowest value) + lowest value

//5. Limit the random number between -222 and 88

public class IntroToRandom {
	public static void main(String[] args) {
		//Create an object of the Random class here
     for (int i = 0; i < 50; i++) {
		
	
		Random matin = new Random();
		int v = matin.nextInt(310)-222;
		
		System.out.println(v);}
	}
}
