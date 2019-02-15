package com.example.sounds.service;

import com.example.sounds.demo.Sound;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.sounds.repository.SoundRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class SoundService {

    @Autowired
    private SoundRepository repos;


    public List<Sound> getSounds() {

        List<Sound> sounds = new ArrayList<>();

        repos.findAll().forEach(sounds::add);

        return sounds;
    }

    public Optional<Sound> getSound(String id) {
        System.out.println(id);
        return repos.findById(id);
    }

    public void addSound(Sound sound) {
        repos.save(sound);
    }

    public void updateSound(Sound sound) {
        repos.save(sound);
    }

    public void deleteSound(String id) {

        repos.deleteById(id);
    }
}

