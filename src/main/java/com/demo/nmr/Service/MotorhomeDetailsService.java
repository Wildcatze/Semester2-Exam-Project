package com.demo.nmr.Service;

import com.demo.nmr.Model.Motorhome;
import com.demo.nmr.Model.MotorhomeDetails;
import com.demo.nmr.Repository.MotorhomeDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MotorhomeDetailsService {
    @Autowired
    MotorhomeDetailsRepo motorhomeDetailsRepo;

    public List<MotorhomeDetails> fetchAll(){
        return motorhomeDetailsRepo.fetchAll();
    }

    public MotorhomeDetails addMotorhomeDetails(MotorhomeDetails m){
        return motorhomeDetailsRepo.addMotorhomeDetails(m);
    }

    public MotorhomeDetails findMotorhomeDetailsById(int motorhome_detail_id){
        return motorhomeDetailsRepo.findMotorhomeDetailsById(motorhome_detail_id);
    }

    public Boolean deleteMotorhomeDetailsById(int motorhome_detail_id){
        return motorhomeDetailsRepo.deleteMotorhomeDetailsById(motorhome_detail_id);
    }

    public MotorhomeDetails updateMotorhomeDetailsById(int motorhome_detail_id, MotorhomeDetails m){
        return motorhomeDetailsRepo.updateMotorhomeDetailsById(motorhome_detail_id, m);
    }
}