import java.util.Scanner;

public class CheckPrimeNoRange{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first number ");
	 int b = sc.nextInt();
	System.out.println("Enter Last number ");
	 int c = sc.nextInt();
		for (int a=b; a<=c; a++){
			boolean  t=false;
				for(int i=2; i<a/2; i++){
					if(a%i==0){
			        t=true;
					}
			}
			if (t==false){
			System.out.println(a);
			}
			}
			}
}
