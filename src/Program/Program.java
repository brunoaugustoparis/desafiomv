package Program;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import DAO.DataSource;
import entities.Collaborator;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		Set<Collaborator> set = new HashSet<Collaborator>();
		
		DataSource ds = new DataSource ();
		
		String name;
		String cpf;
		String alimento;
		char x;
		
		do	{			
			System.out.print("Digite o CPF do colaborador: ");
			cpf = sc.next();			
			sc.nextLine();			
			
			System.out.print("Digite o que o colaborador irá levar para o café da manhã: ");		
			alimento = sc.nextLine();
			
			System.out.print("Digite o nome do colaborador: "); 
			name = sc.next();
			
			set.add(new Collaborator(name, cpf, alimento));
		
			System.out.println("Deseja cadastrar mais um colaborador? (S/N)");
			x = sc.next().charAt(0);
			
		} while (x != 'N');
		
		for (Collaborator c : set) {
			System.out.println(c);
		}
		
		ds.closeDataSource();
		
	}

}