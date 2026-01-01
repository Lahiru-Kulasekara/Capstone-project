package edu.lahiru.blood_donation.repository;

import edu.lahiru.blood_donation.entity.DonorEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface DonorRepository extends CrudRepository<DonorEntity, UUID> {
}
