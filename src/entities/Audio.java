package entities;

import interfaces.Player;
import interfaces.VolumeChecker;

public class Audio extends Multimedia implements VolumeChecker, Player {

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
    public boolean play() {
        return !play;
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
