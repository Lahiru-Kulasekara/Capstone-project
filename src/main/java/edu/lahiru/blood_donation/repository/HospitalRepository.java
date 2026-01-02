package edu.lahiru.blood_donation.repository;

import edu.lahiru.blood_donation.entity.HospitalEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface HospitalRepository extends CrudRepository<HospitalEntity, UUID> {
}
