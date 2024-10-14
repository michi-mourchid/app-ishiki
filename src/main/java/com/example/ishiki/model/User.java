package com.example.ishiki.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name="users")
@NoArgsConstructor
@Getter
public class User {
    @Id
    @GeneratedValue
    private long id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String role;
    private String subscriptionType;
    private Date createdAt = new Date();

    public User(long id, String username, String password, String firstName, String lastName, String email, String subscriptionType, Date createdAt, String role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.role = role;
        this.subscriptionType = subscriptionType;
        this.createdAt = createdAt;
    }

    public User(Builder builder){
        this.id = builder.id;
        this.username = builder.username;
        this.password = builder.password;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.subscriptionType = builder.subscriptionType;
        this.createdAt = builder.createdAt;
        this.role = builder.role;
    }


    public static final class Builder {
        private long id;
        private String username;
        private String password;
        private String firstName;
        private String lastName;
        private String email;
        private String subscriptionType;
        private Date createdAt;
        private String role;

        public Builder() {
        }

        public static Builder anUser() {
            return new Builder();
        }

        public Builder id(long id) {
            this.id = id;
            return this;
        }

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder subscriptionType(String subscriptionType) {
            this.subscriptionType = subscriptionType;
            return this;
        }

        public Builder createdAt(Date createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder role(String role) {
            this.role = role;
            return this;
        }

        public User build() {
            return new User(id, username, password, firstName, lastName, email, subscriptionType, createdAt, role);
        }
    }
}
