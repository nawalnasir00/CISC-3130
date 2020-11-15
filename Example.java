import java.util.Scanner;

public class Example {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		char grade;

		System.out.println(
				"The practice problems are worth 44 points. The labs are worth 16 points. The midterms are worth 20 points. The final is worth 20 points.");
		System.out.println("Enter your total points for the practice problems: ");
		int yourProblems = input.nextInt();
		System.out.println("Enter your total points for the labs: ");
		int yourLabs = input.nextInt();
		System.out.println("Enter your total points for the midterms: ");
		int yourMidterms = input.nextInt();
		System.out.println("Enter your total points for the final: ");
		int yourFinal = input.nextInt();

		int yourPoints = yourProblems + yourLabs + yourMidterms + yourFinal;

		if (yourPoints >= 90) {
			grade = 'A';
		} else if (yourPoints >= 80 && yourPoints < 89) {
			grade = 'B';
		} else if (yourPoints >= 70 && yourPoints < 79) {
			grade = 'C';
		} else {
			grade = 'D';
		}

		System.out.println("You have " + yourPoints + " total points.");
		System.out.println("Your grade is a " + grade + ".");

	}
}
