package application;
import java.util.Locale;
import java.util.Scanner;


public class Progam {
	public static int login;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
       do {
        System.out.println("________________________________________________________");
        System.out.println("|  LOGIN                                               |");
        System.out.println("| Desejar Realizar login como ADM ou Titular da conta? |");
        System.out.println("| [1] ADM                                              |");
        System.out.println("| [2] Titular da Conta                                 |");
        System.out.println("| [0] Encerrar                                         |");
        System.out.println("|______________________________________________________|");
        System.out.println(" ");
        login=sc.nextInt();
        
        if(login==1) {
        	add.Administra(args);
        	
        }
        if(login==2) {
        	Titular.consulta(args);
        }
       }while(login!=0);
       }
}