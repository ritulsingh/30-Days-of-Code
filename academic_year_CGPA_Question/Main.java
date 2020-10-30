import java.util.Scanner;

class InvalidException extends Exception {
	InvalidException(String s) {
		super(s);
	}
}

class Main {
	static void validate(double cgpa) throws InvalidException {
		if (cgpa < 4.5)
			throw new InvalidException("Sorry, You cannot promote to the next academic year");
		else
			System.out.println("You promoted to the next academic year");

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of subjects");

		int n = sc.nextInt();

		double[] marks = new double[n];

		System.out.println("Enter marks");

		for (int i = 0; i < n; i++) {
			marks[i] = sc.nextInt();
		}

		double grade[] = new double[n];

		double cgpa, sum = 0;

		for (int i = 0; i < n; i++) {
			grade[i] = (marks[i] / 10);
		}

		for (int i = 0; i < n; i++) {
			sum += grade[i];
		}

		cgpa = sum / n;
		sc.close();

		try {
			validate(cgpa);
		} catch (Exception m) {
			System.out.println("Exception occured: " + m);
		}

		System.out.println("Succes");
	}

}