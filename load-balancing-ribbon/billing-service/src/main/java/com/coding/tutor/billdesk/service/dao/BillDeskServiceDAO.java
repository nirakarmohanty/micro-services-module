package com.coding.tutor.billdesk.service.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coding.tutor.billdesk.service.entity.BillDesk;
import com.coding.tutor.billdesk.service.repository.BillDeskServiceRepository;

@Component
public class BillDeskServiceDAO {

	@Autowired
	private BillDeskServiceRepository billDeskServiceRepo;

	public BillDesk saveBillDesk(BillDesk entity) {

		return billDeskServiceRepo.save(entity);
	}

	public BillDesk getBillDeskByID(long patientId) {

		return billDeskServiceRepo.findByPatientId(patientId);
	}

}
