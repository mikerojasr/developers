package com.jimenezlav.developers.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "programming_languages_developer")
public class ProgrammingLenguagesDeveloper {

    @Id
    @Column(name = "developer_id")
    private Integer developerId;

    @Column(name = "programming_language_id")
    private Integer programmingLanguageId;

    public Integer getDeveloperId() {
        return developerId;
    }

    public void setDeveloperId(Integer developerId) {
        this.developerId = developerId;
    }

    public Integer getProgrammingLanguageId() {
        return programmingLanguageId;
    }

    public void setProgrammingLanguageId(Integer programmingLanguageId) {
        this.programmingLanguageId = programmingLanguageId;
    }
}
