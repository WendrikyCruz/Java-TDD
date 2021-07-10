package com.example.wendrikycruz.TDD.service;

import com.example.wendrikycruz.TDD.model.BookingModel;
import com.example.wendrikycruz.TDD.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Period;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

@Service
public class BookingService {

    @Autowired
    BookingRepository bookingRepository;

    public int daysCalculatorWithDatabase(String name) {
        Optional<BookingModel> bookingModelOptional = this.bookingRepository.findByReservationName(name);
        return Period.between(bookingModelOptional.get().getCheckIn(), bookingModelOptional.get().getCheckOut()).getDays();
    }
}
