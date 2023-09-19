package tn.tym.esprit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import tn.tym.esprit.entities.Calendar;


@Repository
public interface CalendarBookingRepository extends JpaRepository<Calendar, Long> {

}