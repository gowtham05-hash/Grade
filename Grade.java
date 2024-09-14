import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int mark = input.nextInt();
		if(mark<=100 && mark >=96) {
			System.out.println("O Grade");
		}
		else if(mark<=95 && mark >=91) {
			System.out.println(" A Grade");
		}
		else if(mark<=90 && mark>=81) {
			System.out.println("B Grade");
		}
		else if(mark<=80 && mark>=70) {
			System.out.println("C Grade");
		}
		else if(mark<=70 && mark>=60) {
			System.out.println("D Grade");
		}
		else if(mark<=60 && mark>=50) {
			System.out.println("E Grade");
		}
		else {
			System.out.println("F Grade");
		}
	}

}