package edu.lahiru.blood_donation.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.time.LocalDate;
import java.util.UUID;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "donor")
public class DonorEntity {

    @Id
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
