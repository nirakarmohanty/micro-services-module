package com.coding.tutor.billdesk.service.entity;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BillDesk {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private long patientId;
	boolean status;
	String statusCode;

}
