package com.jimenezlav.developers.service.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.jimenezlav.developers.entity.ProgrammingLanguage;
import org.springframework.stereotype.Service;

import com.jimenezlav.developers.domain.DeveloperDTO;
import com.jimenezlav.developers.entity.Developer;
import com.jimenezlav.developers.repository.DeveloperRepository;
import com.jimenezlav.developers.service.IDeveloperService;

@Service
public class DeveloperServiceImpl implements IDeveloperService {

	private final DeveloperRepository developerRepository;
	private final ProgrammingLenguagesDeveloperServiceImpl programmingLenguagesDeveloperServiceImpl;

	public DeveloperServiceImpl(DeveloperRepository developerRepository, ProgrammingLenguagesDeveloperServiceImpl programmingLenguagesDeveloperServiceImpl) {
		super();
		this.developerRepository = developerRepository;
		this.programmingLenguagesDeveloperServiceImpl = programmingLenguagesDeveloperServiceImpl;
	}

	@Override
	public Collection<DeveloperDTO> findAll() {
		
		
		return developerRepository.findAll().stream().map(new Function<Developer, DeveloperDTO>() {

			@Override
			public DeveloperDTO apply(Developer developer) {
				List<String> programmingLanguagesKnowAbout = developer.getProgrammingLanguages().stream()
						.map(pl -> new String(pl.getName())).collect(Collectors.toList());
				return new DeveloperDTO(developer.getName(), programmingLanguagesKnowAbout);
			}

		}).collect(Collectors.toList());
		
	}

	@Override
	public Collection<DeveloperDTO> findAllAndShowIfKnowPupularPrograminLanguage() {
		// TODO Obtener la lista de todos los desarrolladores existentes en la BD e
		// indicar si el desarrollador conoce o no el lenguaje de programacion mas
		// popular registrado en la BD.

		//Saber el id del lenguaje mas popular
		Integer mostPopular = programmingLenguagesDeveloperServiceImpl.getMostPopularLanguage();

		return developerRepository.findAll().stream().map(new Function<Developer, DeveloperDTO>() {

			@Override
			public DeveloperDTO apply(Developer developer) {
				Boolean knowPupularPrograminLanguage = false;

				for(ProgrammingLanguage pl : developer.getProgrammingLanguages()){
					if(pl.getId().equals(mostPopular))
						knowPupularPrograminLanguage = true;
				}
				return new DeveloperDTO(developer.getName(), knowPupularPrograminLanguage);
			}

		}).collect(Collectors.toList());
	}

}
