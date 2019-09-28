package com.dev.finalassessment;


import java.util.HashMap;
import java.util.HashSet;

public class PhoneImpl {
	
	HashSet<Phone> hs = new HashSet<Phone>();
	
	HashMap<String , Phone> hm = new HashMap<String, Phone>();
	
	public Phone createContact(String name,long number,String group) {
		Phone p = new Phone();
		p.setName(name);
		p.setNumber(number);
		p.setGroup(group);
		return p;
	}
	public Phone searchHere(String key) {
		return hm.get(key);
	}
	
	public void showContact() {
		for (Phone cont : hs) {
			System.out.println(cont);
		}
	}

	
	public void addContact(String key , Phone p) {
		hs.add(p);
		hm.put(key, p);
	}
	
	public void removeContact(Phone p) {
		hs.remove(p);
		showContact();
		
	}
}