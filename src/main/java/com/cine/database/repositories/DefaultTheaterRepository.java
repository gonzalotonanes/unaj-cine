package com.cine.database.repositories;

import com.cine.database.entities.TheaterEntity;
import com.cine.database.jparepositories.TheaterJpaRepository;
import com.cine.domain.theater.Theater;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class DefaultTheaterRepository {

    @Autowired
    TheaterJpaRepository theaterJpaRepository;

    public Theater findById(int id){
        return theaterJpaRepository.findById(id).map(this::toTheater).get();
    }

    public List<Theater> findAll(){
        return  theaterJpaRepository.findAll().stream().map(this::toTheater).collect(Collectors.toList());
    }

    private Theater toTheater(TheaterEntity entity){
        Theater theater= new Theater();
        theater.setCapacity(entity.getCapacity());
        theater.setId(entity.getId());

        return theater;
    }
}
