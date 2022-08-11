public class Radio {
    private int numberOfRadioStation = 10;
    private int currentRadioStation;
    private int currentVolume;

    public Radio (int numberOfRadioStation){
        this.numberOfRadioStation = numberOfRadioStation - 1;

    }

    public Radio (){

    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            currentRadioStation = 0;
        }

        if (currentRadioStation > numberOfRadioStation ) {
            currentRadioStation = numberOfRadioStation;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int prev() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            return numberOfRadioStation;
        }
        return currentRadioStation;
    }



    public int next() {
        if (currentRadioStation < numberOfRadioStation) {
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
        if (currentVolume > 100) {
            currentVolume = 100;
        }

        this.currentVolume = currentVolume;
    }

    public int increaseVolume() {
        if (currentVolume < 100) {
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
