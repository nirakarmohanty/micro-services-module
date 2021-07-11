package src.coding.tutor.doctor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import src.coding.tutor.doctor.service.bo.DoctorFeeDetails;
import src.coding.tutor.doctor.service.dao.DoctorServiceDAO;
import src.coding.tutor.doctor.service.entity.Doctor;

@Component
public class DoctorService {

	@Autowired
	private DoctorServiceDAO doctorDAO;
	@Value("${doctor.fee}")
	String doctorFee;

	@Value("${discount.fee}")
	private String discountFee;

	public Doctor insertDoctor(Doctor docter) {
		return doctorDAO.saveDoctor(docter);
	}

	public Doctor findDoctroById(long id) {
		return doctorDAO.getDoctor(id);
	}

	public List<Doctor> finAllDoctor() {

		return doctorDAO.getAllDoctor();
	}

	public DoctorFeeDetails getDoctorFeeDetails() {
		DoctorFeeDetails doctorFeeDetails = new DoctorFeeDetails();
		doctorFeeDetails.setDoctorFee(Integer.parseInt(doctorFee));
		doctorFeeDetails.setDiscountFee(Integer.parseInt(discountFee));
		return doctorFeeDetails;
	}

}
