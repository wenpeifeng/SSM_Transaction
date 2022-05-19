package com.ahead.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Users {
    private int userId;
    private String uName;
    private String uPass;
}
