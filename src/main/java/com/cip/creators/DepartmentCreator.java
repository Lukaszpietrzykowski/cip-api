package com.cip.creators;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Klasa przechowująca DTO (Data Transfer Object) dla klasy {@link com.cip.entity.DepartmentEntity}, służąca do tworzenia oddziału.
 */
@AllArgsConstructor
@Getter
public class DepartmentCreator {
    /**
     * Zmienna typu String przechowująca nazwę oddziału.
     */
    private String name;
    /**
     * Zmienna typu long przechowująca id szpitala.
     */
    private long hospitalId;
    /**
     * Zmienna typu long przechowująca liczbę wszystkich łóżek w oddziale.
     */
    private long availableBeds;
}