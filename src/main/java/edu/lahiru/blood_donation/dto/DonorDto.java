package edu.lahiru.blood_donation.dto;

import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Data
public class DonorDto {

    private UUID id;
    private String name;
    private Long nic;
    private String address;
    private String bloodType;
    private LocalDate dob;
    private String gender;
    private String contact ;
    private String eligibility; // eligible,not eligible donor cannot update
    private LocalDate lastDonationDate ;
}
