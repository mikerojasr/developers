package com.jimenezlav.developers.service;

import java.util.Collection;

import com.jimenezlav.developers.domain.DeveloperDTO;

public interface IDeveloperService {
	Collection<DeveloperDTO> findAll();

	Collection<DeveloperDTO> findAllAndShowIfKnowPupularPrograminLanguage();

}
