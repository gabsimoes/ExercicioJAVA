package recebaIdade;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int idadeG, idadeA, resultadoIdade;

		System.out.println("Digite sua idade: ");
		idadeG = sc.nextInt();
		
		System.out.println("Digite a idade da sua m�e: ");
		idadeA = sc.nextInt();
		
		resultadoIdade = (idadeA - idadeG);
		
		if (resultadoIdade > 30) {
			System.out.println("A diferen�a de idades � grande!");
		}
		else {
			System.out.println("A diferen�a de idades � pequena!");
		}
		
	}

}

//OUTRA MANEIRA:
/*package recebaIdade;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a idade do filho: ");
		
 		idadeFilho = Integer.parseInt(sc.nextLine());
 		
 		System.out.println("Digite a idade da m�e: ");
 		
 		idadeMae = Integer.parseInt(sc.nextLine());
 		//integer.parseInt converte o valor, pois o programa entende como string inicialmente
		
		int diferenca = idadeMae - idadeFilho;
		
		if (diferenca > 30) {
			System.out.println("A diferen�a de idades � grande!");
		}
		else {
			System.out.println("A diferen�a de idades � pequena!");
		}
		
	}

}*/


