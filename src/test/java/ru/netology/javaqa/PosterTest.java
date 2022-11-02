package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PosterTest {

    Poster poster = new Poster();

    String film1 = "Film1";
    String film2 = "Film2";
    String film3 = "Film3";

    String film4 = "Film4";
    String film5 = "Film5";
    String film6 = "Film6";
    String film7 = "Film7";
    String film8 = "Film8";
    String film9 = "Film9";
    String film10 = "Film10";
    String film11 = "Film11";


    @Test
    void findAllZeroTest() {
        String[] expected = {};
        String[] actual = poster.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void findAllTest() {
        poster.save(film1);
        poster.save(film2);
        poster.save(film3);
        poster.save(film4);
        poster.save(film5);
        poster.save(film6);
        poster.save(film7);
        poster.save(film8);
        poster.save(film9);
        poster.save(film10);
        poster.save(film11);

        String[] expected = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10, film11};
        String[] actual = poster.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    void findLastWithoutParametersTest() {
        poster.save(film1);
        poster.save(film2);
        poster.save(film3);
        poster.save(film4);
        poster.save(film5);
        poster.save(film6);
        poster.save(film7);
        poster.save(film8);
        poster.save(film9);
        poster.save(film10);
        poster.save(film11);

        String[] expected = {film11, film10, film9, film8, film7, film6, film5, film4, film3, film2};
        String[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void findLastSixWithoutParametersTest() {
        poster.save(film1);
        poster.save(film2);
        poster.save(film3);
        poster.save(film4);
        poster.save(film5);
        poster.save(film6);


        String[] expected = {film6, film5, film4, film3, film2, film1};
        String[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void findLastSZeroWithoutParametersTest() {

        String[] expected = {};
        String[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void findLastFiveParametersTest() {
        Poster poster1 = new Poster(5);
        poster1.save(film1);
        poster1.save(film2);
        poster1.save(film3);
        poster1.save(film4);
        poster1.save(film5);
        poster1.save(film6);
        poster1.save(film7);
        poster1.save(film8);
        poster1.save(film9);
        poster1.save(film10);
        poster1.save(film11);

        String[] expected = {film11, film10, film9, film8, film7};
        String[] actual = poster1.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void findLastZeroParametersTest() {
        Poster poster1 = new Poster(0);
        poster1.save(film1);
        poster1.save(film2);
        poster1.save(film3);
        poster1.save(film4);
        poster1.save(film5);
        poster1.save(film6);
        poster1.save(film7);
        poster1.save(film8);
        poster1.save(film9);
        poster1.save(film10);
        poster1.save(film11);

        String[] expected = {};
        String[] actual = poster1.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void findLastTwelveParametersTest() {
        Poster poster1 = new Poster(12);
        poster1.save(film1);
        poster1.save(film2);
        poster1.save(film3);
        poster1.save(film4);
        poster1.save(film5);
        poster1.save(film6);
        poster1.save(film7);
        poster1.save(film8);
        poster1.save(film9);
        poster1.save(film10);
        poster1.save(film11);

        String[] expected = {film11, film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};
        String[] actual = poster1.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    void findLastElevenParametersTest() {
        Poster poster1 = new Poster(11);
        poster1.save(film1);
        poster1.save(film2);
        poster1.save(film3);
        poster1.save(film4);
        poster1.save(film5);
        poster1.save(film6);
        poster1.save(film7);
        poster1.save(film8);
        poster1.save(film9);
        poster1.save(film10);
        poster1.save(film11);

        String[] expected = {film11, film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};
        String[] actual = poster1.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}
