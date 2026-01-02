package edu.lahiru.blood_donation.service.impl;

import edu.lahiru.blood_donation.dto.HospitalDto;
import edu.lahiru.blood_donation.entity.HospitalEntity;
import edu.lahiru.blood_donation.repository.HospitalRepository;
import edu.lahiru.blood_donation.service.HospitalService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HospitalServiceImpl implements HospitalService {

    private final HospitalRepository hospitalRepository;

    public static HospitalDto converHospitalEntityToHospitalDto(HospitalEntity hospitalEntity){
        return HospitalDto.builder()
                .id(hospitalEntity.getId())
                .email(hospitalEntity.getEmail())
                .address(hospitalEntity.getAddress())
                .name(hospitalEntity.getName())
                .contactNo(hospitalEntity.getContactNo())
                .build();
    }

    @Override
    public ResponseEntity<HospitalDto> addHospital(HospitalDto hospitalDto) {
        HospitalEntity hospitalEntity = new HospitalEntity();
        hospitalEntity.setId(hospitalDto.getId());
        hospitalEntity.setName(hospitalDto.getName());
        hospitalEntity.setEmail(hospitalDto.getEmail());
        hospitalEntity.setContactNo(hospitalDto.getContactNo());
        hospitalEntity.setAddress(hospitalDto.getAddress());



        return ResponseEntity.ok(
                converHospitalEntityToHospitalDto(hospitalRepository.save(hospitalEntity))
        );
    }
}
