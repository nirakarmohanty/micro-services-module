package com.coding.tutor.billdesk.service;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coding.tutor.billdesk.service.dao.BillDeskServiceDAO;
import com.coding.tutor.billdesk.service.entity.BillDesk;

@Component
public class BillDeskService {

	@Autowired
	private BillDeskServiceDAO billDeskSvcDao;
	

	public BillDesk saveBillDesk(long patientId) {
		// Actual payment call , 
		BillDesk billDesk= new BillDesk();
		billDesk.setPatientId(patientId);
		billDesk.setStatus(Boolean.TRUE);
		billDesk.setStatusCode(RandomStringUtils.random(8, true, true));
		
		return billDeskSvcDao.saveBillDesk(billDesk);
	}


	public BillDesk getBillDeskByID(long patientId) {
		return billDeskSvcDao.getBillDeskByID(patientId);
	}
}
