package com.jimenezlav.developers.service;

import com.jimenezlav.developers.entity.ProgrammingLenguagesDeveloper;

import java.util.List;

public interface IProgrammingLenguagesDeveloperService {
    List<ProgrammingLenguagesDeveloper> findPopularLanguages();

}
