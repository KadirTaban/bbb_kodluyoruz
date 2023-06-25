package org.example.thirdweek.repository;

import org.example.secondWeek.entity.PEGASUS;
import org.example.thirdweek.entity.Pegasus;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;
@Component

public interface PegasusRepository extends CrudRepository<Pegasus, Long> {

    Pegasus save(Pegasus pegasus);

    @Query("from Pegasus pegasus where pegasus.isEmpty = true")
    List<Pegasus> FindIsEmpty();
    @Query("select t from Pegasus t where t.id = ?1")
    Pegasus FindEmptyId(long id);
}
