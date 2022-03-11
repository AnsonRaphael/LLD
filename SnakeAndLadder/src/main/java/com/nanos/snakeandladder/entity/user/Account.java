package com.nanos.snakeandladder.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Account {
    private String firstName;
    private String lastName;
    private Address address;
    private String email;
    private String password;
    private AccountStatus accountStatus;
    private Date createdDate;
    private Date updatedDate;

    // builder pattern
    // constructor with builder class
    public Account (AccountBuilder builder){
        this.firstName=builder.firstName;
        this.lastName=builder.lastName;
        this.email=builder.email;
        this.address=builder.address;
        this.password=builder.password;
        this.accountStatus=builder.accountStatus;
        this.createdDate=builder.createdDate;
        this.updatedDate=builder.updatedDate;
    }


    @Data
    public static class AccountBuilder{
        private String firstName;
        private String lastName;
        private String email;
        private Address address;
        private String password;
        private AccountStatus accountStatus;
        private Date createdDate;
        private Date updatedDate;

        private AccountBuilder(){};
        public static AccountBuilder getInstance(){
            return new AccountBuilder();
        }
        public Account build(){
            return new Account(this);
        }
    }
}
