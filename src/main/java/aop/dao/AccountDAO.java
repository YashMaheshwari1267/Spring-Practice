package aop.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

	public void addAccount(int x, int y) {
		System.out.println("Adding account..." + x + y);
	}
	
	public List<Account> findAccounts(boolean tripWire) {
		
		if(tripWire) {
			throw new RuntimeException("Runtime execption..!!");
		}
		
		List<Account> myAccounts = new ArrayList<Account>();
		
		Account temp1= new Account("John","silver");
		Account temp2= new Account("Stephane","gold");
		Account temp3= new Account("Shane","platinum");
		
		myAccounts.add(temp1);
		myAccounts.add(temp2);
		myAccounts.add(temp3);
		
		return myAccounts;
	}
}
