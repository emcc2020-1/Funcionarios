import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		String nome;
		char  opcao = 0;
		double hT , vH ;
		
		do {
		System.out.printf("Digite o nome do Funcionário : ");
		nome = sc.nextLine();
		System.out.println();
		
				
		System.out.printf(" Digite as horas trabalhadas pelo funcionário: ");
			hT = sc.nextDouble();
			System.out.println();
		while ( hT <= 0) {
			System.out.printf("hora trabalhada informada é invalida.Tente novamente:  " );
			hT = sc.nextDouble();
			System.out.println();
			}
		
		System.out.printf(" Digite o valor por cada hora trabalhada: ");
		vH = sc.nextDouble();
		System.out.println();
		while ( vH <= 0) {
			System.out.printf("Altura informada é invalida.Tente novamente:  " );
			vH = sc.nextDouble();
			System.out.println();
			}
		
		System.out.printf(" Digitar outro atleta (S/N)? ");
		opcao = sc.next().charAt(0);
		System.out.println();
		sc.nextLine();		
		
		}while(opcao == 'S');
		
		
		
		
		sc.close();
		
		
	}

}
