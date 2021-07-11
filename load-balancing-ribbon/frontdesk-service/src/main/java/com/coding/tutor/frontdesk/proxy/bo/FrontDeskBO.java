package com.coding.tutor.frontdesk.proxy.bo;

import com.coding.tutor.frontdesk.entity.FrontDesk;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FrontDeskBO {
	private FrontDesk frontDesk;
	private BillDeskBO billDeskBO;
}
