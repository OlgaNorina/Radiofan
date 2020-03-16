package ru.netology.domain;

import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadiofanTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/dataForNextRS.csv")
    void nextRadioStation(boolean on, int currentRadioStation, int expected) {
        Radiofan radiofan = new Radiofan();
        radiofan.setOn(on);
        radiofan.setCurrentRadioStation(currentRadioStation);
        radiofan.NextRadioStation();

        assertEquals(expected, radiofan.getCurrentRadioStation());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataForPrevRS.csv")
    void prevRadioStation(boolean on, int currentRadioStation, int expected) {
        Radiofan radiofan = new Radiofan();
        radiofan.setOn(on);
        radiofan.setCurrentRadioStation(currentRadioStation);
        radiofan.PrevRadioStation();

        assertEquals(expected, radiofan.getCurrentRadioStation());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataForInputRS.csv")
    void inputRadioStation(boolean on, int currentRadioStation, int expected) {
        Radiofan radiofan = new Radiofan();
        radiofan.setOn(on);
        radiofan.setCurrentRadioStation(currentRadioStation);

        assertEquals(expected, radiofan.getCurrentRadioStation());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataForIncSV.csv")
    void increaseSoundVolume(boolean on, int currentSoundVolume, int expected) {
        Radiofan radiofan = new Radiofan();
        radiofan.setOn(on);
        radiofan.setCurrentSoundVolume(currentSoundVolume);
        radiofan.IncreaseSoundVolume();

        assertEquals(expected, radiofan.getCurrentSoundVolume());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataForDecSV.csv")
    void decreaseSoundVolume(boolean on, int currentSoundVolume, int expected) {
        Radiofan radiofan = new Radiofan();
        radiofan.setOn(on);
        radiofan.setCurrentSoundVolume(currentSoundVolume);
        radiofan.DecreaseSoundVolume();

        assertEquals(expected, radiofan.getCurrentSoundVolume());
    }
}