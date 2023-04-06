package com.example.baithuchanh2.service;

import com.example.baithuchanh2.model.Smartphone;

import java.util.Optional;

public interface ISmartphoneService {
    Iterable<Smartphone> findAll();
    Optional<Smartphone> findById(Long id);
    Smartphone save(Smartphone smartphone);
    void deleteSmartphone(Long id);
}
