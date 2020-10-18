package aop.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

	public void addAccount(int x, int y) {
		System.out.println("Adding account..." + x + y);
	}
}
