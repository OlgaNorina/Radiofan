package ru.netology.domain;

import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadiofanTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/dataForNextRS.csv")
    void nextRadioStation(boolean on, int currentRadioStation, int expected) {
        Radiofan radiofan = new Radiofan("nextRS",10,0,currentRadioStation,
                100,0,0,on);
        radiofan.nextRadioStation();
        assertEquals(expected, radiofan.getCurrentRadioStation());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataForPrevRS.csv")
    void prevRadioStation(boolean on, int currentRadioStation, int expected) {
        Radiofan radiofan = new Radiofan("prevRS",10,0,currentRadioStation,
                100,0,0,on);
        radiofan.prevRadioStation();

        assertEquals(expected, radiofan.getCurrentRadioStation());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataForInputRS.csv")
    void inputRadioStation(boolean on, int currentRadioStation, int expected) {
        Radiofan radiofan = new Radiofan("inputRS",10,0,currentRadioStation,
                100,0,0,on);
        radiofan.setCurrentRadioStation(currentRadioStation);

        assertEquals(expected, radiofan.getCurrentRadioStation());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataForIncSV.csv")
    void increaseSoundVolume(boolean on, int currentSoundVolume, int expected) {
        Radiofan radiofan = new Radiofan("incRS",10,0,0,
                100,0,currentSoundVolume,on);
        radiofan.increaseSoundVolume();

        assertEquals(expected, radiofan.getCurrentSoundVolume());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataForDecSV.csv")
    void decreaseSoundVolume(boolean on, int currentSoundVolume, int expected) {
        Radiofan radiofan = new Radiofan("dectRS",10,0,0,
                100,-10,currentSoundVolume,on);
        radiofan.decreaseSoundVolume();

        assertEquals(expected, radiofan.getCurrentSoundVolume());
    }
}