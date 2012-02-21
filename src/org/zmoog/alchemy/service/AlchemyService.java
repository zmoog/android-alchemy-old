package org.zmoog.alchemy.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.client.RestTemplate;
import org.zmoog.alchemy.resources.Account;
import org.zmoog.alchemy.resources.AccountList;

/**
 * @author zmoog
 *
 */
public class AlchemyService {

	public List<Account> listAccounts() {
		
		List<Account> l = new ArrayList<Account>();
		
		RestTemplate t = new RestTemplate();
		Map<String, String> vars = new HashMap<String, String>();
		vars.put("username", "username");
		vars.put("api_key", "secret"); // FIXME: remove this *before* commit
		String url = "http://service.org/api/v1/account/?format=json&username={username}&api_key={api_key}";
		
		
		AccountList accounts = t.getForObject(url, AccountList.class, vars);
		
		for (Account account : accounts.getObjects()) {
			l.add(account);
		}
		
		return l;
		
	}
	
	public List<Account> listAccountsFake() {
		
		List<Account> l = new ArrayList<Account>();
		
		Account a = new Account();
		a.setName("Hardware & Gadgets");
		l.add(a);
		
		return l;
	}
}
