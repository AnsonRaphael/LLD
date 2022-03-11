package com.nanos.snakeandladder.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// users are those having authentication or accounts within our org
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long userId;
    private String userName;
    private Account account;
}
