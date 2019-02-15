package com.example.sounds.repository;

import com.example.sounds.demo.Sound;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SoundRepository extends CrudRepository<Sound, Integer>{

}