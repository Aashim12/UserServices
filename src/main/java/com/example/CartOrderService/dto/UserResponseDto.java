package com.example.CartOrderService.dto;

import lombok.Data;

import java.util.List;

@Data
public class UserResponseDto {
    String profilePic;
    String name;
    String bio;
    String  visibilty;
    String userName;
    List<String> followers;
    String userId;
    List<String> following;
}
