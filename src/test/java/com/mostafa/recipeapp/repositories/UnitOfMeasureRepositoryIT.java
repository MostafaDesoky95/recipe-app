package com.mostafa.recipeapp.repositories;

import com.mostafa.recipeapp.domain.UnitOfMeasure;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
@DataJpaTest
class UnitOfMeasureRepositoryIT {

    @Autowired
    UnitOfMeasureRepository unitOfMeasureRepository;

    @BeforeEach
    void setUp() {

    }

    @Test
    void findByDescription() {
        Optional<UnitOfMeasure> optionalUOM = unitOfMeasureRepository.findByDescription("Teaspoon");

        assertEquals("Teaspoon", optionalUOM.get().getDescription());
    }

    @Test
    void findByDescriptionCup() {
        Optional<UnitOfMeasure> optionalUOM = unitOfMeasureRepository.findByDescription("Cup");

        assertEquals("Cup", optionalUOM.get().getDescription());
    }
}