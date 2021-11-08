package com.cine.database.repositories;

import com.cine.database.entities.FunctionEntity;
import com.cine.database.entities.MovieEntity;
import com.cine.database.entities.TheaterEntity;
import com.cine.database.jparepositories.FunctionJpaRepository;
import com.cine.domain.function.Function;
import com.cine.domain.movie.Movie;
import com.cine.domain.theater.Theater;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class DefaultFunctionRepository {

    FunctionJpaRepository functionJpaRepository;

    public DefaultFunctionRepository(FunctionJpaRepository functionJpaRepository) {
        this.functionJpaRepository = functionJpaRepository;
    }

    public List<Function> findFunctionByIdMovie(int id){
        return functionJpaRepository.findByIdMovie(id).stream().map(this::toFunction).collect(Collectors.toList());
    }

    public Function save(Function function){
        return toFunction(functionJpaRepository.save(toEntity(function)));
    }


    public Function findById(int id){
        return toFunction(functionJpaRepository.findById(id).get());
    }

    public List<Function> getAll(){
        return  functionJpaRepository.findAll().stream().map(this::toFunction).collect(Collectors.toList());
    }

    public List<Function> findByDateAndIdTheater(Date date, int idTheater){

        return  functionJpaRepository.findByDateAndIdTheaterOrderByHourAsc(date,idTheater).stream().map(this::toFunction).collect(Collectors.toList());
    }

    private FunctionEntity toEntity(Function function){
        FunctionEntity entity= new FunctionEntity();
        entity.setDate(function.getDate());
        entity.setIdMovie(function.getIdMovie());
        entity.setIdTheater(function.getIdTheater());
        entity.setHour(function.getHour());
        return  entity;
    }

    private Function toFunction(FunctionEntity entity){
        Function function= new Function();
        function.setId(entity.getId());
        function.setDate(entity.getDate());
        function.setHour(entity.getHour());
        function.setIdTheater(entity.getIdTheater());
        function.setIdMovie(entity.getIdMovie());
        return  function;
    }
}