package com.coding.tutor.frontdesk.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "FRONT_DESK")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FrontDesk {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String patientname;
	private String deasese;
	private int billAmount;

}
