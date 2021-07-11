package com.coding.tutor.frontdesk.servcie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coding.tutor.frontdesk.dao.FrontDeskDAO;
import com.coding.tutor.frontdesk.entity.FrontDesk;
import com.coding.tutor.frontdesk.proxy.BillingDeskServiceProxy;
import com.coding.tutor.frontdesk.proxy.bo.BillDeskBO;
import com.coding.tutor.frontdesk.proxy.bo.FrontDeskBO;

@Component
public class FrontDeskService {

	@Autowired
	private FrontDeskDAO dao;

	@Autowired
	private BillingDeskServiceProxy proxy;

	public FrontDeskBO saveFrontDeskData(FrontDesk frontDesk) {
		//Data
		FrontDesk frontDeskData = dao.saveFrontDeskData(frontDesk);
		// Bill DeskService call 
		BillDeskBO billDeskData = proxy.saveBillDesk(frontDesk.getId());
		
		FrontDeskBO frontDeskBO= new FrontDeskBO();
		frontDeskBO.setBillDeskBO(billDeskData);
		frontDeskBO.setFrontDesk(frontDeskData);
		
		return frontDeskBO;
	}

	public FrontDesk getFrontDesk(Long id) {

		return dao.getFrontDesk(id);
	}
}
