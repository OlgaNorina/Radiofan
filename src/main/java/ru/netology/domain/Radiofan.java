package ru.netology.domain;

public class Radiofan {
    private String name;
    private int maxRadioStation = 10;
    private int minRadioStation = 0;
    private int currentRadioStation;
    private int maxSoundVolume = 100;
    private int minSoundVolume = 0;
    private int currentSoundVolume;
    private boolean on;

    public Radiofan(String name, int currentRadioStation, int currentSoundVolume, boolean on) {
        this.name = name;
        this.currentRadioStation = currentRadioStation;
        this.currentSoundVolume = currentSoundVolume;
        this.on = on;
    }

   public Radiofan(String name, int maxRadioStation, int currentRadioStation, int maxSoundVolume, int currentSoundVolume, boolean on) {
        this.name = name;
        this.maxRadioStation = maxRadioStation;
        this.currentRadioStation = currentRadioStation;
        this.maxSoundVolume = maxSoundVolume;
        this.currentSoundVolume = currentSoundVolume;
        this.on = on;
    }

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

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }
}

