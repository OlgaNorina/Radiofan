package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radiofan {
    private String name;
    private int maxRadioStation = 10;
    private int minRadioStation;
    private int currentRadioStation;
    private int maxSoundVolume = 100;
    private int minSoundVolume;
    private int currentSoundVolume;
    private boolean on;

    public void nextRadioStation() {
        if (!on) {
            return;
        }
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation++;
        } else {
            currentRadioStation = minRadioStation;
        }
    }

    public void prevRadioStation() {
        if (!on) {
            return;
        }
        if (currentRadioStation > minRadioStation) {
            currentRadioStation--;
        } else {
            currentRadioStation = maxRadioStation;
        }
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (!on) {
            return;
        }
        if (currentRadioStation > maxRadioStation) {
            this.currentRadioStation = maxRadioStation;
            return;
        }
        if (currentRadioStation < minRadioStation) {
            this.currentRadioStation = minRadioStation;
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void increaseSoundVolume() {
        if (!on) {
            return;
        }
        if (currentSoundVolume < maxSoundVolume) {
            currentSoundVolume++;
        }
    }

    public void decreaseSoundVolume() {
        if (!on) {
            return;
        }
        if (currentSoundVolume > minSoundVolume) {
            currentSoundVolume--;
        }
    }
}

