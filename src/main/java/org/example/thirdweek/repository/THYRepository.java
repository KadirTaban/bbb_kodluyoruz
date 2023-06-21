package org.example.thirdweek.repository;

import org.example.thirdweek.entity.THY;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface THYRepository extends JpaRepository<THY, Long> {
}
