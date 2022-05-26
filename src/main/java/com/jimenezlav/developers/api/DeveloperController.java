package com.jimenezlav.developers.api;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jimenezlav.developers.domain.DeveloperDTO;
import com.jimenezlav.developers.service.IDeveloperService;

@RestController
public class DeveloperController {

	private final IDeveloperService developerService;

	public DeveloperController(IDeveloperService developerService) {
		super();
		this.developerService = developerService;
	}

	@GetMapping("/developers")
	Collection<DeveloperDTO> all() {
		return developerService.findAll();
	}

	@PostMapping("/developers")
	Collection<DeveloperDTO> allWhitPopularPL() {
		return developerService.findAllAndShowIfKnowPupularPrograminLanguage();
	}
}
