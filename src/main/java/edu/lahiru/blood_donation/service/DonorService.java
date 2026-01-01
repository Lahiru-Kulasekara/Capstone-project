package edu.lahiru.blood_donation.service;

import edu.lahiru.blood_donation.dto.request.DonorRequestDto;
import edu.lahiru.blood_donation.dto.response.DonorResponseDto;

public interface DonorService {
    DonorResponseDto register (DonorRequestDto donorRequestDto);

}
