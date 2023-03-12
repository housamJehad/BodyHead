package org.innsys.models.db;


import javax.persistence.*;

@Entity
@Table(name = "body")
public class Body {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "account_number")
    private String accountNumber;


    @OneToOne(cascade = CascadeType.ALL)
    private Headers headers;


    public Body setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Long getId() {
        return id;
    }

    public Body setHeaders(Headers headers) {
        this.headers = headers;
        return this;

    }

    public Headers getHeaders() {
        return headers;
    }
}
