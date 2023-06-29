package org.example.thirdweek.repository;

import org.example.thirdweek.entity.THY;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface THYRepository extends CrudRepository<THY, Long> {
    THY save(THY thy);


    @Query("from THY thy where thy.isEmpty = true")
    List<THY> findTHYByIsEmptyIs();
    @Query("select t from THY t where t.id = ?1")
    THY findTHYById(long id);

    void delete(THY thy);

    /* List<THY> findAllByEmptyIsTrue();
*/

}
