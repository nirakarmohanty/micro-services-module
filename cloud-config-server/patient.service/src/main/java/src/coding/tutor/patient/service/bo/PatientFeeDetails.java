package src.coding.tutor.patient.service.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PatientFeeDetails {
	private int patientFee;
	private int tax;
	private String name;
	private String age;
	private String sex;

}
