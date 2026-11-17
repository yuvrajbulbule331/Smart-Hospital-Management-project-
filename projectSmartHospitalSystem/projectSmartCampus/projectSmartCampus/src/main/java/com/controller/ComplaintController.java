package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.model.Complaint;
import com.model.ComplaintStatus;
import com.service.ComplaintService;

@RestController
@RequestMapping("/complaints")
public class ComplaintController {

    @Autowired
    private ComplaintService service;

    @PostMapping
    public Complaint registerComplaint(@RequestBody Complaint complaint) {

        return service.registerComplaint(complaint);
    }

    @GetMapping
    public List<Complaint> getAllComplaints() {

        return service.getAllComplaints();
    }

    @GetMapping("/{id}")
    public Complaint getComplaint(@PathVariable Long id) {

        return service.getComplaintById(id);
    }

    @PutMapping("/{id}/status")
    public Complaint updateStatus(@PathVariable Long id,
                                  @RequestParam ComplaintStatus status) {

        return service.updateStatus(id, status);
    }
}