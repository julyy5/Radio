import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test

    public void actualStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(3);
        int expected = 3;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void actualStationLess0() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void actualStationMore9() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void actualVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(8);
        int expected = 8;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void actualVolumeLess0() {
        Radio volume = new Radio();
        volume.setCurrentVolume(-1);
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void actualVolumeMore10() {
        Radio volume = new Radio();
        volume.setCurrentVolume(11);
        int expected = 10;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }


    @Test

    public void nextStation() {
        Radio nextStation = new Radio();
        nextStation.setCurrentRadioStation(8);
        int expected = 9;
        int actual = nextStation.next();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void nextStationMore9() {
        Radio nextStation = new Radio();
        nextStation.setCurrentRadioStation(9);
        int expected = 0;
        int actual = nextStation.next();

        Assertions.assertEquals(expected, actual);
    }


    @Test

    public void prevStation() {
        Radio prevStation = new Radio();
        prevStation.setCurrentRadioStation(7);
        int expected = 6;
        int actual = prevStation.prev();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void prevStationLess0() {
        Radio prevStation = new Radio();
        prevStation.setCurrentRadioStation(0);
        int expected = 9;
        int actual = prevStation.prev();

        Assertions.assertEquals(expected, actual);
    }


    @Test

    public void increaseVolume() {
        Radio incrVolume = new Radio();
        incrVolume.setCurrentVolume(8);
        int expected = 9;
        int actual = incrVolume.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void increaseVolumeMore10() {
        Radio incrVolume = new Radio();
        incrVolume.setCurrentVolume(11);
        int expected = 10;
        int actual = incrVolume.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void reduceVolume() {
        Radio redVolume = new Radio();
        redVolume.setCurrentVolume(5);
        int expected = 4;
        int actual = redVolume.reduceVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceVolumeLess0() {
        Radio redVolume = new Radio();
        redVolume.setCurrentVolume(-1);
        int expected = 0;
        int actual = redVolume.reduceVolume();

        Assertions.assertEquals(expected, actual);
    }

}
