package application;

import java.util.Locale;
import java.util.Scanner;

public class Exception {
	public static int senha, senha1=1234, senha2=4321, senha3=3214, senha4=4213;
	public static int n2, n10=20, n20=20, n50=20;
	public static int x2, x10, x20, x50;
	public static int opcao, saque;
	public static int operacao;
	public static int encerrar;
	
public static void titular() {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	Movimentação mov = new Movimentação();
		
		System.out.println("Informe sua senha");
		senha=sc.nextInt();
	
	if(senha==1234||(senha==4321)||(senha==3214)||(senha==4213)){
		do {
			System.out.println("__________________________________");
			System.out.println("|  Qual operação deseja realizar?|");
			System.out.println("| [1] Verificar Saldo            |");
			System.out.println("| [2] Realizar Saque             |");
			System.out.println("| [3] Realizar Deposito          |");
			System.out.println("| [0] encerrar                   |");
			System.out.println("|________________________________|");
			operacao=sc.nextInt();
			
			switch(operacao){
				case 1: 		
					mov.Saldo();
				break;
				
				case 2:
					Movimentação.Saque();
				break;
				
				case 3:
					mov.Deposito();
				break;
				
				case 0:
					System.out.println("Operação encerrada");
				break;	
			
				default:
					System.out.println("Codigo informado errado digite novamente");
			}		
		}while(operacao!=0);
			Progam.main(null);

			sc.close();
		}else System.out.println("Senha invalida Voltando ao menu inicial"+"\r");		
		}
	}