package com.hiltonfarias.sistemacontrole.controller;

import com.hiltonfarias.sistemacontrole.model.WorkingDay;
import com.hiltonfarias.sistemacontrole.service.ServiceDay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/jornada")
public class ControllerWorkday {

    ServiceDay serviceDay;

    @Autowired
    public ControllerWorkday(ServiceDay serviceDay) {
        this.serviceDay = serviceDay;
    }

    @PostMapping
    public WorkingDay createDay(@RequestBody WorkingDay workingDay) {
        return serviceDay.saveDay(workingDay);
    }

    @GetMapping
    public List<WorkingDay> getDayList() {
        return serviceDay.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<WorkingDay> getDayById(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(serviceDay.findById(id).orElseThrow(()->new NoSuchElementException("Jornada não encontrada.")));
    }

    @PutMapping
    public WorkingDay updateDayById(@RequestBody WorkingDay workingDay) throws Exception {
        return serviceDay.updateDay(workingDay);
    }

    @DeleteMapping("/{id}")
    public void deleteDayById(@PathVariable("id") Long id){
        serviceDay.deleteDay(id);
    }
}
