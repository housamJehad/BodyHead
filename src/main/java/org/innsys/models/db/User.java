package org.innsys.models.db;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String userId;
    private String accountNumber;

    @OneToOne(cascade = CascadeType.ALL)
    private PilotDetails pilotDetails;


    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", referencedColumnName = "userId")
    private List<UserFunction> functions;


    public User setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }

    public User setPilotDetails(PilotDetails pilotDetails) {
        this.pilotDetails = pilotDetails;
        return this;
    }

    public User setFunctions(List<UserFunction> functions) {
        this.functions = functions;
        return this;
    }


    public String getUserId() {
        return userId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public PilotDetails getPilotDetails() {
        return pilotDetails;
    }

    public List<UserFunction> getFunctions() {
        return functions;
    }

    public User build() {
        return this;
    }

}
