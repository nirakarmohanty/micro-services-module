package com.coding.tutor.frontdesk.proxy.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BillDeskBO {
	
	private long id;
	private long patientId;
	boolean status;
	String statusCode;
	

}
