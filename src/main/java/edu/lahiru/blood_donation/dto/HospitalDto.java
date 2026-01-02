package edu.lahiru.blood_donation.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HospitalDto {
    private UUID id;
    private String name;
    private String address;
    private String contactNo;
    private String email;


}
