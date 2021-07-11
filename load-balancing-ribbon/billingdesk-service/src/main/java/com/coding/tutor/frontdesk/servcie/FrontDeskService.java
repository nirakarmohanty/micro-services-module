package com.coding.tutor.frontdesk.servcie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coding.tutor.frontdesk.dao.FrontDeskDAO;
import com.coding.tutor.frontdesk.entity.FrontDesk;

@Component
public class FrontDeskService {

	@Autowired
	private FrontDeskDAO dao;
	
	public FrontDesk saveFrontDeskData(FrontDesk frontDesk) {
	
		return dao.saveFrontDeskData(frontDesk);
	}

	public FrontDesk getFrontDesk(Long id) {
		
		return dao.getFrontDesk(id);
	}
}
