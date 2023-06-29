package org.example.thirdweek.repository;

import org.example.thirdweek.entity.OnurAir;
import org.example.thirdweek.entity.Pegasus;
import org.example.thirdweek.entity.THY;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OnurAirRepository extends CrudRepository<OnurAir, Long> {
    @Query("from OnurAir onurair where onurair.isEmpty = true")
    List<OnurAir> FindIsEmpty();

    @Query("select t from OnurAir t where t.id = ?1")
    OnurAir findOnurAirById(long id);
}
