package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ComplaintRepository;
import com.model.Complaint;
import com.model.ComplaintStatus;



@Service
public class ComplaintService {

    @Autowired
    private ComplaintRepository complaintRepository;

    public Complaint registerComplaint(Complaint complaint) {

        complaint.setStatus(ComplaintStatus.PENDING);

        return complaintRepository.save(complaint);
    }

    public List<Complaint> getAllComplaints() {

        return complaintRepository.findAll();
    }

    public Complaint getComplaintById(Long id) {

        return complaintRepository.findById(id).orElseThrow();
    }

    public Complaint updateStatus(Long id, ComplaintStatus status) {

        Complaint complaint = complaintRepository.findById(id).orElseThrow();

        complaint.setStatus(status);

        return complaintRepository.save(complaint);
    }
}