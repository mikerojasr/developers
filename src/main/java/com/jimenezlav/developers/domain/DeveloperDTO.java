package com.jimenezlav.developers.domain;

import java.util.Collection;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public class DeveloperDTO {

	private String developerName;
	private Collection<String> programmingLanguagesKnowAbout;
	private Boolean knowPupularPrograminLanguage;

	public DeveloperDTO(String developerName, Collection<String> programmingLanguagesKnowAbout) {
		super();
		this.developerName = developerName;
		this.programmingLanguagesKnowAbout = programmingLanguagesKnowAbout;
	}

	public DeveloperDTO(String developerName, Boolean knowPupularPrograminLanguage) {
		super();
		this.developerName = developerName;
		this.knowPupularPrograminLanguage = knowPupularPrograminLanguage;
	}

	public String getDeveloperName() {
		return developerName;
	}

	public Collection<String> getProgrammingLanguagesKnowAbout() {
		return programmingLanguagesKnowAbout;
	}

	public Boolean getKnowPupularPrograminLanguage() {
		return knowPupularPrograminLanguage;
	}

}
