package com.jimenezlav.developers.repository;

import com.jimenezlav.developers.entity.ProgrammingLenguagesDeveloper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgrammingLenguagesDeveloperRepository extends JpaRepository<ProgrammingLenguagesDeveloper, Integer> {
}
