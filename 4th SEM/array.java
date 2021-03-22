import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int[] a = new int[5];
		Scanner input=new Scanner (System.in);
		for(int i=0;i<5;i++){
			System.out.println("Enter a["+i+"] : ");
			a[i] = input.nextInt();
		}
		System.out.print("\n[");
		for(int i=0; i<5;i++){
			System.out.print(a[i]+",");
		}
		System.out.println("\b]");
	}
}