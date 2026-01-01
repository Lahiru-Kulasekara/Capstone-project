package edu.lahiru.blood_donation.controller;

import edu.lahiru.blood_donation.dto.request.DonorRequestDto;
import edu.lahiru.blood_donation.dto.response.DonorResponseDto;
import edu.lahiru.blood_donation.service.DonorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DonorController {
    private final DonorService donorService;
    @PostMapping("/api/v1/donor")
    public DonorResponseDto register(@RequestBody DonorRequestDto donorRequestDto){
        return donorService.register(donorRequestDto);

    }

}
