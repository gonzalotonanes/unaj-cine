package com.cine.database.jparepositories;

import com.cine.database.entities.FunctionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.Date;
import java.util.List;


public interface FunctionJpaRepository extends JpaRepository<FunctionEntity, Integer> {

   List<FunctionEntity> findByIdMovie(int id);

    List<FunctionEntity> findByDateAndIdTheaterOrderByHourAsc(Date date, int idTheater);

    @Query("SELECT COUNT(f) FROM FunctionEntity f WHERE f.idTheater=?1 ")
    int countAvailability(int idTheater);
}
