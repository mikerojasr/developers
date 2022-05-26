package com.jimenezlav.developers.entity;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Developer {

	@Id
	private Integer id;
	private String name;
	@ManyToMany
	@JoinTable(name = "programming_languages_developer",
	joinColumns = {@JoinColumn(name = "developer_id")}, 
	inverseJoinColumns = {@JoinColumn(name = "programming_language_id") })
	private Collection<ProgrammingLanguage> programmingLanguages;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Collection<ProgrammingLanguage> getProgrammingLanguages() {
		return programmingLanguages;
	}

	public void setProgrammingLanguages(Collection<ProgrammingLanguage> programmingLanguages) {
		this.programmingLanguages = programmingLanguages;
	}

}
