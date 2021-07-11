package com.coding.tutor.billdesk.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coding.tutor.billdesk.service.entity.BillDesk;

@Repository
public interface BillDeskServiceRepository extends JpaRepository<BillDesk, Long>{
	
	BillDesk findByPatientId(long id);
}
