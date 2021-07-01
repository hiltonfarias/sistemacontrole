package com.hiltonfarias.sistemacontrole.repository;

import com.hiltonfarias.sistemacontrole.model.WorkingDay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DayRepository extends JpaRepository<WorkingDay, Long> {
}
