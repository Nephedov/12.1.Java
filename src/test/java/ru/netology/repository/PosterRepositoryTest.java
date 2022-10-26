package ru.netology.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.PosterManager;
import ru.netology.domain.Film;

public class PosterRepositoryTest {
    PosterRepository repo = new PosterRepository();
    PosterManager manager = new PosterManager(repo);

    Film film1 = new Film(1, "Film1");
    Film film2 = new Film(2, "Film2");
    Film film3 = new Film(3, "Film3");


    @Test
    void addTest() {
        manager.add(film1);
        manager.add(film2);

        Film[] expected = {film1, film2};
        Film[] actual = manager.getAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void getLastTest() {
        manager.add(film1);
        manager.add(film2);

        Film[] expected = {film2, film1};
        Film[] actual = manager.getLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void findByIdNullTest() {
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);

        Film expected = null;
        Film actual = repo.findById(4);

        Assertions.assertEquals(expected, actual);


    }

    @Test
    void findByIdTest() {
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);

        Film expected = film2;
        Film actual = repo.findById(2);

        Assertions.assertEquals(expected, actual);


    }

    @Test
    void removeByIdTest() {
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.removeById(film2.getId());

        Film[] expected = {film1, film3};
        Film[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);


    }


    @Test
    void removeAllTest() {
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.removeAll();

        Film[] expected = {};
        Film[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);


    }
}
