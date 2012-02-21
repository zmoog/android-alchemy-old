package org.zmoog.alchemy.resources;

import java.util.List;

public class AccountList {

	@Override
	public String toString() {
		return "AccountResource [meta=" + meta + ", objects=" + objects + "]";
	}

	private Meta meta;

	private List<Account> objects;
	
	public Meta getMeta() {
		return meta;
	}

	public void setMeta(Meta meta) {
		this.meta = meta;
	}

	public List<Account> getObjects() {
		return objects;
	}

	public void setObjects(List<Account> objects) {
		this.objects = objects;
	}
	
	
}
