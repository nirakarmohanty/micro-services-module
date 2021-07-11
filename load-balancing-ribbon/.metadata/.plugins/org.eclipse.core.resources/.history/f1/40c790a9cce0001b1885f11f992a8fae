package com.coding.tutor.frontdesk.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coding.tutor.frontdesk.entity.FrontDesk;
import com.coding.tutor.frontdesk.repository.FrontDeskRepository;

@Component
public class FrontDeskDAO {

	@Autowired
	private FrontDeskRepository repository;

	public FrontDesk saveFrontDeskData(FrontDesk entity) {
		return repository.save(entity);
	}

	public FrontDesk getFrontDesk(Long id) {

		return repository.findById(id).get();
	}

}
