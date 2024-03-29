package com.cip.repository;

import com.cip.entity.HospitalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Interfejs HospitalRepository to interfejs pozwalający na zarządzanie danych w bazie danych
 * poprzez obiekt {@link HospitalEntity}
 * używa on wbudowanych funkcjonalności z {@link JpaRepository}
 *
 * @see org.springframework.data.jpa.repository.JpaRepository
 */
@Repository
public interface HospitalRepository extends JpaRepository<HospitalEntity, Long> {
}