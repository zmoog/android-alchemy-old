package org.zmoog.alchemy.service;

import org.zmoog.alchemy.resources.AccountList;

import com.googlecode.androidannotations.annotations.rest.Accept;
import com.googlecode.androidannotations.annotations.rest.Get;
import com.googlecode.androidannotations.annotations.rest.Rest;
import com.googlecode.androidannotations.api.rest.MediaType;

@Rest("http://service.org/api/v1")
public interface Service {

	@Get("/account/?username={username}&api_key={api_key}")
	@Accept(MediaType.APPLICATION_JSON)
	AccountList getAccounts(String username, String api_key);
}
