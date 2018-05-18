package com.kat.bachaat.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tbl_authority")
public class Authority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "authority_id")
    private Long id;
    @Column(name = "authority_name")
    private String name;
    @ManyToMany(mappedBy = "authorityList", fetch = FetchType.LAZY)
    private List<User> userList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}