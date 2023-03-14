package org.innsys.models.db;


import javax.persistence.*;

@Entity
@Table(name = "body")
public class Body {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    @OneToOne(cascade = CascadeType.ALL)
    private Headers headers;


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
