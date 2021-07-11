package src.coding.tutor.doctor.service.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DoctorFeeDetails {
	
	int doctorFee;
	int discountFee;
	String doctorName;
	int experience;

}
