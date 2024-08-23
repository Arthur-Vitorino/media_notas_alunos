package main;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o nome do aluno: ");
		String nomeAluno = scanner.nextLine();
		
		System.out.print("Digite a nota 1: ");
		float nota1 = scanner.nextInt();
		System.out.print("Digite a nota 2: ");
		float nota2 = scanner.nextInt();
		System.out.print("Digite a nota 3: ");
		float nota3 = scanner.nextInt();
		
		float media = (nota1 + nota2 + nota3) / 3;
		
		System.out.printf("A media do Aluno "+nomeAluno+" foi de %.2f\n", media);
		scanner.close();
		
	}

}
