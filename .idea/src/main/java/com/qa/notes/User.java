package com.qa.notes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column
    private String fname;

    @Column
    private String lname;

    @Column
    private Date DOB;

    public User() {
    super();
    }

    public User(String username, String password, String fname, String lname, Date DOB) {
        super();
        this.username = username;
        this.password = password;
        this.fname = fname;
        this.lname = lname;
        this.DOB = DOB;

    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }



}
