package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

import ru.netology.domain.Film;
import ru.netology.repository.PosterRepository;

public class PosterManagerTest {

    PosterRepository repo = Mockito.mock(PosterRepository.class);
    PosterManager manager = new PosterManager(repo);

    PosterRepository repo1 = new PosterRepository();
    PosterManager manager2 = new PosterManager(repo1, 5);

    Film film1 = new Film(1, "Film1");
    Film film2 = new Film(2, "Film2");
    Film film3 = new Film(3, "Film3");
    Film film4 = new Film(4, "Film4");
    Film film5 = new Film(5, "Film5");
    Film film6 = new Film(6, "Film6");

    @Test
    void getAllMockTest() {
        Film[] films = {film1, film2, film3};

        doReturn(films).when(repo).findAll();

        Film[] expected = {film1, film2, film3};
        Film[] actual = manager.getAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void getLastMockTest() {
        Film[] films = {film1, film2, film3};

        doReturn(films).when(repo).findAll();

        Film[] expected = {film3, film2, film1};
        Film[] actual = manager.getLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void getLast1MockTest() {
        Film[] films = {film1, film2, film3};

        doReturn(films).when(repo).findAll();

        Film[] expected = {film3};
        Film[] actual = manager.getLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void getLastTest() {
        manager2.add(film1);
        manager2.add(film2);
        manager2.add(film3);
        manager2.add(film4);
        manager2.add(film5);
        manager2.add(film6);

        Film[] expected = {film6, film5, film4, film3, film2};
        Film[] actual = manager2.getLast();

        Assertions.assertArrayEquals(expected, actual);
    }


}
