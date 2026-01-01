package edu.lahiru.blood_donation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "hospital")
public class HospitalEntity {
    @Id
    private UUID id;
    private String name;
    private String address;
    private String contactNo;
    private String email;

}
