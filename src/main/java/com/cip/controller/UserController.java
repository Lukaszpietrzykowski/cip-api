package com.cip.controller;

import com.cip.creators.UserCreator;
import com.cip.dto.UserDto;
import com.cip.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Klasa UserController to klasa zawierająca funkcjonalności wykorzystywane
 * w tworzeniu REST API umożliwijąca wszelkie operacje związane z użytkownikem serwisu.
 */
@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class UserController {

    /**
     * Przechowuję obiekt typu {@link UserService}.
     */
    private final UserService userService;

    /**
     * Zwraca listę wszystkich dostępnych użytkowników typu {@link UserDto}.
     *
     * @return zwraca listę wszystkich użytkowników.
     */
    @GetMapping("/all")
    public List<UserDto> getUsers() {
        return userService.getUsers();
    }

    /**
     * Zwraca użytkownika typu {@link UserDto} na podstawie adres id.
     *
     * @param id użytkownika.
     * @return zwraca znalezionego użytkownika typu {@link UserDto}.
     */
    @GetMapping("/{id}")
    public UserDto getUser(@PathVariable long id) {
        return userService.getUser(id);
    }

    /**
     * Zwraca użytkownika typu {@link UserDto} na podstawie podanego loginu.
     *
     * @param login użytkownika.
     * @return zwraca znalezionego użytkownika typu {@link UserDto}.
     */
    @GetMapping("/details")
    public UserDto getUserByUsername(@RequestParam String login) {
        return userService.getUserByUsername(login);
    }

    /**
     * Tworzy użytkownika.
     *
     * @param user obiekt typu {@link UserCreator} przechowujący użytkownika.
     * @return zwraca dodanego użytkownika typu {@link UserDto}.
     */
    @PostMapping("/add")
    public UserDto createUser(@RequestBody UserCreator user) {
        return userService.createUser(user);
    }

    /**
     * Edytuje użytkownika o podanym id.
     *
     * @param id   użytkownika.
     * @param user obiekt typu {@link UserCreator} przechowujący użytkownika.
     * @return zwraca zedytowanego użytkownika typu {@link UserDto}.
     */
    @PutMapping("/update/{id}")
    public UserDto updateUser(@PathVariable long id, @RequestBody UserCreator user) {
        return userService.updateUser(id, user);
    }

    /**
     * Usuwa użytkownika na podstawie podanego id.
     *
     * @param id użytkownika.
     */
    @DeleteMapping("/delete/{id}")
    public void deleteAddress(@PathVariable long id) {
        userService.deleteUser(id);
    }
}