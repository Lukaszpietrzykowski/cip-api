package com.cip.dto;

import com.cip.entity.AddressEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

/**
 * Klasa przechowująca DTO (Data Transfer Object) dla klasy {@link AddressEntity}, służąca do operacji na adresie.
 */
@AllArgsConstructor
@Getter
@Builder
public class AddressDto {
    /**
     * Zmienna typu long przechowująca id adresu.
     */
    private long id;
    /**
     * Zmienna typu String przechowująca nazwę miasta.
     */
    private String city;
    /**
     * Zmienna typu String przechowująca nazwę ulicy.
     */
    private String street;
    /**
     * Zmienna typu String przechowująca numer budynku.
     */
    private String streetNumber;
    /**
     * Zmienna typu String przechowująca kod pocztowy.
     */
    private String postalCode;
    /**
     * Zmienna typu String przechowująca nazwę kraju.
     */
    private String country;

    /**
     * Konwertuje obiekt klasy {@link AddressEntity} na obiekt klasy {@link AddressDto}.
     *
     * @param address zmienna przechowujący adres typu {@link AddressEntity} który chcemy przekonwertować.
     * @return zwraca przekonwertowany adres typu {@link AddressDto}.
     */
    public static AddressDto of(AddressEntity address) {
        return AddressDto.builder()
                .id(address.getId())
                .city(address.getCity())
                .street(address.getStreet())
                .streetNumber(address.getStreetNumber())
                .postalCode(address.getPostalCode())
                .country(address.getCountry())
                .build();
    }
}