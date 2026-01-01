package edu.lahiru.blood_donation.dto.request;

import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Data
public class DonorRequestDto {
    private UUID id;
    private String name;
    private Long nic;
    private String address;
    private String bloodType;
    private LocalDate dob;
    private String gender;
    private String contact ;
}
