import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test

    public void actualStation() {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(18);
        int expected = 18;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void actualStationMore() {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(20);
        int expected = 19;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void actualStationLess() {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(-2);
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

    public void actualVolumeMore100() {
        Radio volume = new Radio();
        volume.setCurrentVolume(101);
        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }


    @Test

    public void nextStation() {
        Radio nextStation = new Radio(38);
        nextStation.setCurrentRadioStation(30);
        int expected = 31;
        int actual = nextStation.next();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void nextStationMore() {
        Radio nextStation = new Radio(25);
        nextStation.setCurrentRadioStation(24);
        int expected = 0;
        int actual = nextStation.next();
        Assertions.assertEquals(expected, actual);
    }


    @Test

    public void prevStation() {
        Radio prevStation = new Radio(39);
        prevStation.setCurrentRadioStation(17);
        int expected = 16;
        int actual = prevStation.prev();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void prevStationLess0() {
        Radio prevStation = new Radio(15);
        prevStation.setCurrentRadioStation(0);
        int expected = 14;
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

    public void increaseVolumeMore100() {
        Radio incrVolume = new Radio();
        incrVolume.setCurrentVolume(101);
        int expected = 100;
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
