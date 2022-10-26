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

    Film film1 = new Film(1, "Film1");
    Film film2 = new Film(2, "Film2");
    Film film3 = new Film(3, "Film3");

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
        Film[] actual = manager.getLast(1);

        Assertions.assertArrayEquals(expected, actual);
    }


}
