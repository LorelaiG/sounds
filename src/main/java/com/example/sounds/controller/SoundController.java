package com.example.sounds.controller;

import com.example.sounds.demo.Sound;
import com.example.sounds.repository.SoundRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;


@RestController
class WebController {

    @Autowired
    private SoundRepository soundRepository;

    @GetMapping("/get/{id}")
    public Optional<Sound> getMethod(@PathVariable int id) {
        return soundRepository.findById(id);
    }

    @PostMapping("/post")
    public Sound postMethod(@RequestBody Sound customer) {
        return soundRepository.save(customer);
    }

    @PutMapping("/put}")
    public Sound putMethod(@RequestBody Sound customer) {
        // PUT processing

        return soundRepository.save(customer);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteMethod(@PathVariable int id) {
        soundRepository.deleteById(id);

    }

}