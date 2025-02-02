package com.binode.stagecoachhunter.dtos;


import com.binode.stagecoachhunter.entity.Coordinate;
import com.binode.stagecoachhunter.entity.UserRole;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder


public class UserDto {
    private int id;
    private String firstname;
    private String lastname;
    private String email;
    private int locationId;
    private UserRole role;
}
