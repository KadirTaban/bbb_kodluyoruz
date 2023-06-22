package org.example.thirdweek.repository;

import org.example.thirdweek.entity.THY;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface THYRepository extends CrudRepository<THY, Long> {
    THY save(THY thy);

    List<THY> findAllByEmptyIsTrue();


}
