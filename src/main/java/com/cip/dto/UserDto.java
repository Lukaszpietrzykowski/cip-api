package com.cip.dto;

import com.cip.entity.UserEntity;
import com.cip.enums.RoleEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Klasa przechowująca DTO (Data Transfer Object) dla klasy {@link UserEntity}, służąca do operacji na użytkowniku.
 */
@AllArgsConstructor
@Builder
@Getter
@NoArgsConstructor
public class UserDto {
    /**
     * Zmienna typu long przechowująca id użytkownika.
     */
    private long id;
    /**
     * Zmienna typu String przechowująca adres mialowy użytkownika.
     */
    private String email;
    /**
     * Zmienna typu String przechowująca login użytkownika.
     */
    private String login;
    /**
     * Zmienna typu {@link RoleEnum} przechowująca role użytkownika.
     */
    private RoleEnum role;

    /**
     * Konwertuje obiekt klasy {@link UserEntity} na obiekt klasy {@link UserDto}.
     *
     * @param user zmienna przechowująca użytkownika typu {@link UserEntity} który chcemy przekonwertować.
     * @return zwraca przekonwertowanego użytkownika typu {@link UserDto}.
     */
    public static UserDto of(UserEntity user) {
        return UserDto.builder()
                .id(user.getId())
                .email(user.getEmail())
                .login(user.getLogin())
                .role(user.getRole())
                .build();
    }
}