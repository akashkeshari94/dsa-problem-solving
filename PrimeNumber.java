package problemsolving;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		int num=2;
		if(input<2) {
			System.out.println("Number less than 2 and 2 is the smallest Prime");
			System.exit(0);
		}else {
		while(num<input) {
			if(input%num!=0) {
				num++;
			}else {
				System.out.println("Number is not Prime");
				System.exit(0);
			}
		}
		System.out.println("Number is Prime");
		
		}
		
		sc.close();

	}

}
