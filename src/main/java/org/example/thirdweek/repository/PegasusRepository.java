package org.example.thirdweek.repository;

import org.example.thirdweek.entity.Pegasus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PegasusRepository extends CrudRepository<Pegasus, Long> {
}
