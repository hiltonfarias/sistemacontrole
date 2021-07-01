package com.hiltonfarias.sistemacontrole.service;

import com.hiltonfarias.sistemacontrole.model.WorkingDay;
import com.hiltonfarias.sistemacontrole.repository.DayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceDay {

    DayRepository dayRepository;

    @Autowired
    public ServiceDay(DayRepository dayRepository) {
        this.dayRepository = dayRepository;
    }

    public WorkingDay saveDay(WorkingDay workingDay) {
        return dayRepository.save(workingDay);
    }

    public List<WorkingDay> findAll() {
        return dayRepository.findAll();
    }

    public Optional<WorkingDay> findById(Long id) {
        return dayRepository.findById(id);
    }

    public WorkingDay updateDay(WorkingDay workingDay) {
        return dayRepository.save(workingDay);
    }

    public void deleteDay(Long id) {
        dayRepository.deleteById(id);
    }
}
