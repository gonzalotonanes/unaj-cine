package com.cine.database.jparepositories;

import com.cine.database.entities.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface MovieJpaRepository extends JpaRepository<MovieEntity, Integer> {
}
