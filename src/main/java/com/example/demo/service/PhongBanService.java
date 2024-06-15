package com.example.demo.service;

import com.example.demo.model.PhongBan;
import com.example.demo.repository.PhongBanRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class PhongBanService {
    private final PhongBanRepository phongBanRepository;

    public List<PhongBan> getAllPhongban(){
        return phongBanRepository.findAll();
    }

}
