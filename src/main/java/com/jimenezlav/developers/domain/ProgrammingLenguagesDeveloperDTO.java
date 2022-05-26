package com.jimenezlav.developers.domain;

import javax.persistence.Column;

public class ProgrammingLenguagesDeveloperDTO {
    private Integer developerId;
    private Integer programmingLanguageId;

    public ProgrammingLenguagesDeveloperDTO(Integer developerId, Integer programmingLanguageId) {
        this.developerId = developerId;
        this.programmingLanguageId = programmingLanguageId;
    }

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
