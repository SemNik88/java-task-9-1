package ru.netology;

public class Radio {
    private int currentVolume; // поле сделано приватным
    private int currentStation; // поле сделано приватным
    private final int maxStation; // поле для хранения максимального номера станции

    // конструктор с параметром для задания количества станций
    public Radio(int maxStation) {
        this.maxStation = maxStation;
    }

    // конструктор без параметров для задания количества станций по умолчанию
    public Radio() {
        this(10); // вызываем конструктор с параметром и передаем 10
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation >= maxStation) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void next() {
        if (currentStation < maxStation - 1) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxStation - 1;
        }
    }
}