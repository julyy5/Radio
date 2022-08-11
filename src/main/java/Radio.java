public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }

        if (currentRadioStation > 9) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int prev() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
            return currentRadioStation;
        }

        return currentRadioStation = 9;
    }

    public int next() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
            return currentRadioStation;
        }
        return currentRadioStation = 0;

    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            currentVolume = 0;

        }
        if (currentVolume > 10) {
            currentVolume = 10;
        }

        this.currentVolume = currentVolume;
    }

    public int increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        return currentVolume;
    }

    public int reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        return currentVolume;
    }
}
