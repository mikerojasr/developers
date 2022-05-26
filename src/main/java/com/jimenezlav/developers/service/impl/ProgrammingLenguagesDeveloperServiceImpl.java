package com.jimenezlav.developers.service.impl;

import com.jimenezlav.developers.entity.ProgrammingLanguage;
import com.jimenezlav.developers.entity.ProgrammingLenguagesDeveloper;
import com.jimenezlav.developers.repository.ProgrammingLenguagesDeveloperRepository;
import com.jimenezlav.developers.service.IProgrammingLenguagesDeveloperService;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class ProgrammingLenguagesDeveloperServiceImpl implements IProgrammingLenguagesDeveloperService {

    private final ProgrammingLenguagesDeveloperRepository programmingLenguagesDeveloperRepository;

    public ProgrammingLenguagesDeveloperServiceImpl(ProgrammingLenguagesDeveloperRepository programmingLenguagesDeveloperRepository) {
        super();
        this.programmingLenguagesDeveloperRepository = programmingLenguagesDeveloperRepository;
    }

    @Override
    public List<ProgrammingLenguagesDeveloper> findPopularLanguages() {
        return programmingLenguagesDeveloperRepository.findAll();
    }

    public Integer getMostPopularLanguage(){
        List <ProgrammingLenguagesDeveloper> programmingLenguagesDeveloper = findPopularLanguages();
        Integer mostPopular = 0;
        Integer temp = 0;
        ArrayList<Integer> ids = new ArrayList<Integer>();
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();

        for(ProgrammingLenguagesDeveloper programmingLenguagesDevelopers:programmingLenguagesDeveloper){
            ids.add(programmingLenguagesDevelopers.getProgrammingLanguageId());
        }

        for (Integer i : ids) {
            Integer j = hm.get(i);
            hm.put(i, (j == null) ? 1 : j + 1);
        }

        for (Map.Entry<Integer, Integer> val : hm.entrySet()) {
            Integer ele = val.getKey();
            Integer value = val.getValue();
            if(value>temp){
                mostPopular = ele;
            }
            temp = value;

            System.out.println("Elemento " + val.getKey() + " "
                    + "ocurrencias"
                    + ": " + val.getValue() + " veces");
        }
        System.out.println("mostPopular:"+mostPopular);
        return mostPopular;
    }
}
