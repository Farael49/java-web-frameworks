package com.lab.follower.auth;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("USER")
public class InfraUser {

    @PrimaryKey
    private String username;
    private String password;
}
