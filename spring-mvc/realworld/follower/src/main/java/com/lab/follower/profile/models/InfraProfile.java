package com.lab.follower.profile.models;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("PROFILE")
public class InfraProfile {
    @PrimaryKey
    private String username;
    private String bio;
    private String image;
}
