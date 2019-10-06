public class TriangleExercise {

	public static void main(String[] args) {

        /* Prints a message which tells the user "Introduce the length of
        each side of the triangle"
        */
		System.out.println("Introduce the length of each side of the triangle");
		
		// Reads the length of each side of the triangle
        Scanner sc = new Scanner(System.in);
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

		//  Prints a message which tells the user  "The triangle is:"
		System.out.println("The triangle is: ");
		
        /* If/Else Statement: Compares the lengths of each side
         * and tells the user what type of triangle it is.
		*/
        if(side1==side2 && side2==side3)
            System.out.println("Equilateral");

        else 
        	if ((side1==side2 && side2!=side3 ) || (side1!=side2 && side3==side1) || (side3==side2 && side3!=side1))
            System.out.println("Isosceles");

	        else 
	        	if(side1!=side2 && side2!=side3 && side3!=side1)
	            System.out.println("Scalene");
        
        sc.close();
    }
}