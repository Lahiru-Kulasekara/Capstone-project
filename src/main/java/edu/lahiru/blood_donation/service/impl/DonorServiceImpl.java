package edu.lahiru.blood_donation.service.impl;

import edu.lahiru.blood_donation.dto.request.DonorRequestDto;
import edu.lahiru.blood_donation.dto.response.DonorResponseDto;
import edu.lahiru.blood_donation.entity.DonorEntity;
import edu.lahiru.blood_donation.repository.DonorRepository;
import edu.lahiru.blood_donation.service.DonorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DonorServiceImpl implements DonorService {
    private final DonorRepository donorRepository;




    @Override
    public DonorResponseDto register(DonorRequestDto donorRequestDto) {
        DonorEntity donorEntity = new DonorEntity();
        donorEntity.setId(donorRequestDto.getId());
        donorEntity.setName(donorRequestDto.getName());
        donorEntity.setDob(donorRequestDto.getDob());
        donorEntity.setContact(donorRequestDto.getContact());
        donorEntity.setAddress(donorRequestDto.getAddress());
        donorEntity.setGender(donorRequestDto.getGender());
        donorEntity.setBloodType(donorRequestDto.getBloodType());
        donorEntity.setNic(donorRequestDto.getNic());
        donorEntity.setEligibility("Pending");

        DonorEntity save = donorRepository.save(donorEntity);


        DonorResponseDto donorResponseDto = new DonorResponseDto();
        donorResponseDto.setId(save.getId());
        donorResponseDto.setName(save.getName());
        donorResponseDto.setDob(save.getDob());
        donorResponseDto.setContact(save.getContact());
        donorResponseDto.setAddress(save.getAddress());
        donorResponseDto.setGender(save.getGender());
        donorResponseDto.setBloodType(save.getBloodType());
        donorResponseDto.setNic(save.getNic());
        donorResponseDto.setEligibility(save.getEligibility());
        donorResponseDto.setLastDonationDate(save.getLastDonationDate());




        return donorResponseDto;

    }

}
