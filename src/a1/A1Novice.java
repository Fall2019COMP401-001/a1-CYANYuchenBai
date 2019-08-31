package a1;

import java.util.Scanner;


public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		String[] firstname = new String [a];
		String[] lastname = new String [a];
		double[] total = new double[a];
		double[] number = new double[a];
		// Your code follows here.;
		for(int i=0;i < firstname.length; i++ ) {
			firstname[i] = scan.next();
			lastname[i] = scan.next();
			number[i] = scan.nextDouble();
			total[i] = 0;
			for(int j=0;j < number[i]; j++) {
				int quantity = scan.nextInt();
				String name = scan.next();
				double price = scan.nextDouble();
				total[i] += quantity * price;  
			}
		}
		for(int k=0;k < a; k++) {
			System.out.println(firstname[k].charAt(0)+ ". " + lastname[k]+ ": "+String.format("%.2f", total[k]));
		}
	}
}
