package htp.home.task04.main;

import java.util.ArrayList;
import java.util.List;

public class AccountLogic {

	
	public static void setBlokAccount(Client client, int id) {
		for (Account ac : client.getAccounts()) {
			if (ac.getId() == id) {
				ac.setBlocked(true);
			}
		}
	}

	
	public static void unBlokAccount(Client client, int id) {
		for (Account ac : client.getAccounts()) {
			if (ac.getId() == id) {
				ac.setBlocked(false);
			}
		}
	}
	
	
	public static List<Account> searchIsBlocked(Client client) {
		List<Account> searchIsBlocked = new ArrayList<Account>();
		
		for (Account ac : client.getAccounts()) {
			if (ac.isBlocked()) {
				searchIsBlocked.add(ac);
			}
		}
		return searchIsBlocked;
	}
	
	
	public static List<Account> searchById(Client client, int id) {
		List<Account> searchById = new ArrayList<Account>();
		
		for (Account ac : client.getAccounts()) {
			if (ac.getId() == id) {
				searchById.add(ac);
			}
		}
		return searchById;
	}
	

	public static int getSumClientsAccounts(Client client) {
		int sum = 0;
		
		for (Account ac : client.getAccounts()) {
			sum += ac.getBalance();
		}
		return sum;
	}
	
	
	public static int getPositiveSumAccounts(Client client) {
		int sum = 0;
		
		for (Account ac : client.getAccounts()) {
			if(ac.getBalance() > 0) {
				sum += ac.getBalance();
			}			
		}
		return sum;
	}
	
	
	public static int getNegativeSumAccounts(Client client) {
		int sum = 0;
		
		for (Account ac : client.getAccounts()) {
			if(ac.getBalance() < 0) {
				sum += ac.getBalance();
			}			
		}
		return sum;
	}
	
}
