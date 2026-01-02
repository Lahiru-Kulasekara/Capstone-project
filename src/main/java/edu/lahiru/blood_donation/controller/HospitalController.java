package edu.lahiru.blood_donation.controller;

import edu.lahiru.blood_donation.dto.HospitalDto;
import edu.lahiru.blood_donation.service.HospitalService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequiredArgsConstructor
public class HospitalController {

    private final HospitalService hospitalService;

    public ResponseEntity<HospitalDto>addHospital(@RequestBody HospitalDto hospitalDto){
        return hospitalService.addHospital(hospitalDto);
    }


}
