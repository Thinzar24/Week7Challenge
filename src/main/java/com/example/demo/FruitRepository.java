package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FruitRepository extends CrudRepository <Fruit, Long> {
    List<Fruit> findByAvailableDay(String search);
}
