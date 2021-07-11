package src.coding.tutor.patient.service.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PathologyDetailsBO {
	
	private long id;
	private String name;
	private String address;
	private String testType;	
	
	private long patientId;
	private String patientName;
	private int patientAge;
	private String patientsex;
	
	
	

}
