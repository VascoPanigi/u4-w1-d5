package entities;

import interfaces.VolumeChecker;

public class Audio extends Multimedia implements VolumeChecker {


    public Audio(String title, int length, int volume) {
        super(title, length, volume);
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
    public String toString() {
        return "Audio{" +
                "volume=" + volume +
                ", length=" + length +
                ", title='" + title + '\'' +
                '}';
    }
}
