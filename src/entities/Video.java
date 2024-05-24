package entities;

import interfaces.BrightnessChecker;
import interfaces.Player;
import interfaces.VolumeChecker;

public class Video extends Multimedia implements VolumeChecker, BrightnessChecker, Player {

    public Video(String title, int length, int volume, short brightness) {
        super(title, length, volume, brightness);
    }


    @Override
    public int volumeDown(int value) {
        return volume -= value;
    }

    @Override
    public int volumeUp(int value) {
        return volume += value;
    }

    @Override
    public short brightnessDown(short value) {
        return brightness -= value;
    }


    @Override
    public short brightnessUp(short value) {
        return brightness += value;
    }

    @Override
    public boolean play() {
        return !play;
    }

    @Override
    public String toString() {
        return "Video{" +
                "brightness=" + brightness +
                ", volume=" + volume +
                ", length=" + length +
                ", title='" + title + '\'' +
                '}';
    }
}
