package com.example.sounds.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sound {

    @Id
    private int id;
  private   String path;
   private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sound{" +
                "id=" + id +
                ", path='" + path + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}
