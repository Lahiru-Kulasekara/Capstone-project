package edu.lahiru.blood_donation.service;

import edu.lahiru.blood_donation.dto.HospitalDto;
import edu.lahiru.blood_donation.entity.HospitalEntity;
import org.springframework.http.ResponseEntity;

public interface HospitalService {

    ResponseEntity<HospitalDto>addHospital(HospitalDto hospitalDto);

}
