package ru.netology;

public class Radio {
    private int currentVolume; // поле сделано приватным
    private int currentStation; // поле сделано приватным
    private final int stationCount; // поле для хранения количества станций

    // конструктор с параметром для задания количества станций
    public Radio(int stationCount) {
        this.stationCount = stationCount;
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
        if (newCurrentStation >= stationCount) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++; // увеличиваем громкость на 1
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--; // уменьшаем громкость на 1
        }
    }

    public void next() {
        if (currentStation < stationCount - 1) {
            currentStation++; // переключаемся на следующую станцию
        } else {
            currentStation = 0; // возвращаемся к первой станции
        }
    }

    public void prev() {
        if (currentStation > 0) {
            currentStation--; // переключаемся на предыдущую станцию
        } else {
            currentStation = stationCount - 1; // переходим к последней станции
        }
    }
}
