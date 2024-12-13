package com.dw.secondapp.service;

import com.dw.secondapp.repository.ByeRepository;
import com.dw.secondapp.repository.ByeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import  org.springframework.stereotype.Service;

@Service
public class ByeService {
    @Autowired
    ByeRepository helloRepository;

    public String hello() {
        return helloRepository.hello();
    }
}
