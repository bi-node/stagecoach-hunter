package com.binode.stagecoachhunter.auth;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class ChangePasswordRequest {
    private String oldPassword;
    private String newPassword;

}
