import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		String nome;
		char  opcao = 0;
		double hT , vH , somaHt = 0 , custoTotal = 0 ;
		int opcaoMenu ;
		
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
		
		}while(opcao == 'S' || opcao == 's');
		
		System.out.println("");
		System.out.println("MENU:");
		System.out.println("1 - Total de horas trabalhadas ");
		System.out.println("2 - Custo total");
		System.out.println("3 - Nome da pessoa que ganhou mais ");
		System.out.println("4 - Sair  ");
		System.out.println("Digite uma opção:  ");
		opcaoMenu=sc.nextInt();
		
		while (opcaoMenu !=4) {
			
			

			if (opcaoMenu ==1) {
				
				System.out.printf("Total de horas = %.1f%n", somaHt);
				
			}
			else if(opcaoMenu ==2) { 
				
				System.out.printf("Custo total = R$ %.1f%n",custoTotal);
			} 
			else if(opcaoMenu == 3){
				System.out.println("Pessoa que ganhou mais: "  );
			}
			else {
				System.out.println("FIM DO PROGRAMA! " );
			}
			
			System.out.println("");
			System.out.println("MENU:");
			System.out.println("1 - Total de horas trabalhadas ");
			System.out.println("2 - Custo total");
			System.out.println("3 - Nome da pessoa que ganhou mais");
			System.out.println("4 - Sair  ");
			System.out.println("Digite uma opção:  ");
			opcaoMenu=sc.nextInt();
		}
		
			
			
		
		
		sc.close();
		
		
	}

}
