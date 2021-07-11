package com.coding.tutor.frontdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coding.tutor.frontdesk.entity.FrontDesk;

@Repository
public interface FrontDeskRepository extends JpaRepository<FrontDesk, Long>{

}
