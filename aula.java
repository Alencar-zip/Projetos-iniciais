package aula;
import java.util.Scanner;
public class aula {
	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("===========calculadora de teste============");
		System.out.println("Operações comuns (1) ou médias? (2)");
		int operacao = sc.nextInt();
		
		if (operacao == 1) {

		System.out.println("insira um numero: ");
		float numA = sc.nextFloat();
		System.out.println("segundo numero: ");
		float numB = sc.nextFloat();
		System.out.println("Operação");
		System.out.println("1 = Soma ; 2 = subtração; 3 = multiplicação; 4 = divisão");
		int op = sc.nextInt();
		float soma = numA + numB;
		float sub = numA - numB;
		float mult = numA * numB;
		float div = numA / numB;
		
		if (op==1){
			System.out.println("Resultado: "+ soma);
			sc.close();
			
		}
		else if (op==2){
			System.out.println("Resultado: "+ sub);
			sc.close();
		
		} else if (op==3){
			System.out.println("Resultado: "+ mult);
			sc.close();
		
		} else if (op==4){
			System.out.println("Resultado: "+ div);
			sc.close();
		
		}
		}
		else if (operacao == 2) {
			System.out.println("Médias");
			
			System.out.println("Insira o primeiro número: ");
			float numA = sc.nextFloat();
			System.out.println("Insiro o segundo número: ");
			float numB = sc.nextFloat();
			
			System.out.println("média normal (A) ou com pesos? (B): ");
		    String tipo= sc.next().toUpperCase();
			
			if (tipo.equals("A")) {
				System.out.println(numA + numB / 2);
			}
			else if (tipo.equals("B")) {
				System.out.println("Primeiro peso: ");
				float pesoA = sc.nextFloat();
				System.out.println("Segundo peso: ");
				float pesoB = sc.nextFloat();
				System.out.println(numA * pesoA + numB * pesoB / 2);
		}}
		
	}
}

