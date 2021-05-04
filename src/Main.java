import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i, menornumero,maiornumero;
		
		System.out.println("informe o menor nnumero");
		menornumero=sc.nextInt();
		
		System.out.println("informe o maior numero");
		maiornumero=sc.nextInt();
		
		for(i=menornumero;i<=maiornumero;i++) {
			System.out.println(i);
		}
		
		
		sc.close();
	}

}
