package com.example.wendrikycruz.TDD.repositories;

import com.example.wendrikycruz.TDD.model.BookingModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookingRepository extends JpaRepository<BookingModel, String> {
    Optional<BookingModel> findByReservationName(String name);
}
