package com.binode.stagecoachhunter.auth;


import com.binode.stagecoachhunter.entity.Coordinate;
import com.binode.stagecoachhunter.entity.UserRole;
import lombok.*;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegisterRequest {

    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private Coordinate location;
    private UserRole role;


}
