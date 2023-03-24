package application;

import java.util.Scanner;

public class Movimentação {
	Scanner sc = new Scanner(System.in);
	public double retirada;
	public static double saldo=200;
	public static double saque;
	public static double deposito;
	public static double x2=2.00, x10=10.00, x20=20.00, x50=50.00;
	public static int opcao, saque2, saque10, saque20, saque50, saldo2 = 1640;
	
	public static void Saque(){
		Scanner sc = new Scanner(System.in);
		
		do {
		System.out.println("______________________________");
		System.out.println("|  SAQUE                     |");
		System.out.println("| [1] Notas de R$2,00        |");
		System.out.println("| [2] Notas de R$10,00       |");
		System.out.println("| [3] Notas de R$20,00       |");
		System.out.println("| [4] Notas de R$50,00       |");
		System.out.println("| [0] Para encerrar o Saque  |");
		System.out.println("|____________________________|");
		opcao = sc.nextInt();
		
		switch(opcao){
		case 1:
			System.out.printf("Digite a quantiadade de notas a ser sacado " );
			saque2 = sc.nextInt();
			if(saque2<=20){
				System.out.println("Saque realizado com sucesso.Você retirou "+ "R$ "+saque2*x2 +" em notas de R$ 2,00");
			}else {
				System.out.printf("Saldo insuficiente");
			}
			break;
			
		case 2:
			System.out.printf("Digite a quantiadade de notas a ser sacado " );
			saque10 = sc.nextInt();
			if(saque10<=20){
				System.out.println("Saque realizado com sucesso.Você retirou "+ "R$ "+ saque10*x10 +" em notas de R$ 10,00");
			}else {
				System.out.printf("Saldo insuficiente");
			}
			break;
				
		case 3:
			System.out.printf("Digite a quantidade de notas a ser sacado " );
			saque20 = sc.nextInt();
			if(saque20<=20){
				System.out.println("Saque realizado com sucesso.Você retirou "+ "R$ "+ saque20*x20 +" em notas de R$ 20,00");
			}else {
				System.out.printf("Saldo insuficiente");
			}
			break;
				
		case 4:
			System.out.printf("Digite a quantidade de notas a ser sacado: " );
			saque50 = sc.nextInt();
			if(saque50<=20){
				System.out.println("Saque realizado com sucesso.Você retirou "+ "R$ "+ saque50*x50 +" em notas de R$ 50,00");
			}else {
				System.out.printf("Saldo insuficiente");
			}
			break;
		}
			}while(opcao!=0);
		System.out.println("Total Retirado Foi: "+"R$"+ ((saque2*x2)+(saque10*x10)+(saque20*x20)+(saque50*x50)) );
		System.out.println(" ");
	}
		
	public void Saldo(){
		saldo = saldo+deposito;
		System.out.println("Seu saldo é " + saldo );
		System.out.println(" ");
	}
	
	public void Deposito() {
		System.out.println("Informe o valor do Deposito:");
		deposito=sc.nextDouble();
		System.out.println("Deposito de "+deposito+ "Realizado com sucesso");
		System.out.println(" ");
	}
}