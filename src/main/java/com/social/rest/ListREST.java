package com.social.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.social.domain.Lists;
import com.social.rest.business.ListsBusiness;

@RestController
public class ListREST {

	@Autowired
	private ListsBusiness listBusiness;
	
	@GetMapping(value="/get-lists")
	public Lists getAllLists(){
		return listBusiness.getAllListProfile();
	}
	
}