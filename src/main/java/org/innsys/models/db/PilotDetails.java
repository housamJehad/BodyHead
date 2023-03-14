package org.innsys.models.db;

import javax.persistence.*;

@Entity
@Table(name = "pilot_details")
public class PilotDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;

    private String eligibility;

    public void setCode(String code) {
        this.code = code;
    }

    public void setEligibility(String eligibility) {
        this.eligibility = eligibility;
    }

    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getEligibility() {
        return eligibility;
    }


}
