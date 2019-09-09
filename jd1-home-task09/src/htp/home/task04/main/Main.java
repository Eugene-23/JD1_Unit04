package htp.home.task04.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * �����. ������ ����� ����� ��������� ������ � �����. ��������� ����������� ����������/������������� �����. 
 * ����������� ����� � ���������� ������. ���������� ����� ����� �� ������. ���������� ����� �� ���� ������, 
 * ������� ������������� � ������������� ������� ��������.
 */

public class Main {

	public static void main(String[] args) {
		
		List<Account> acc1 = new ArrayList<Account>();
		
		acc1.add(new Account(456753, 560));
		acc1.add(new Account(456768, -60));
		acc1.add(new Account(456725, 290));
		acc1.add(new Account(456732, 1250));
		acc1.add(new Account(456714, -170));
		acc1.add(new Account(456797, 397));
		acc1.add(new Account(456779, 678));
		
		Client client1 = new Client("Poroshin E.E", acc1);
		AccountLogic.setBlokAccount(client1, 456714);
		printClientAccounts(client1);
		
		System.out.println("��������������� �����:");
		List<Account> searchIsBlocked = AccountLogic.searchIsBlocked(client1);
		printAccounts(searchIsBlocked);
		
		System.out.println("����� �� ������ �����:");
		List<Account> searchById = AccountLogic.searchById(client1, 456732);
		printAccounts(searchById);
		
		int sumPos = AccountLogic.getPositiveSumAccounts(client1);
		System.out.println("� ������� " + client1.getName() + " ����� ���� ������, ������� ������������� ������ = " + sumPos);
		
		int sumNeg = AccountLogic.getNegativeSumAccounts(client1);
		System.out.println("� ������� " + client1.getName() + " ����� ���� ������, ������� ������������� ������ = " + sumNeg);
		
		System.out.println("���������� �� �������:");
		Collections.sort(acc1);
		printClientAccounts(client1);
		
	}
	
	
	public static void printClientAccounts(Client client) {
		for(Account ac : client.getAccounts()) {
			System.out.println("Client name: " + client.getName() + ", " + ac.toString());
		}
	}
	
	public static void printAccounts(List<Account> accounts) {
		for(Account ac : accounts) {			
			System.out.println(ac.toString());
		}
	}

}
