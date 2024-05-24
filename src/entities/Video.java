package entities;

import interfaces.BrightnessChecker;
import interfaces.Player;
import interfaces.VolumeChecker;

public class Video extends Multimedia implements VolumeChecker, BrightnessChecker, Player {

    public Video(String title, int length, int volume, short brightness) {
        super(title, length, volume, brightness);
        super.play = false;
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
        StringBuilder esclPoints = new StringBuilder();
        esclPoints.append("!".repeat(Math.max(1, volume)));

        StringBuilder asterisks = new StringBuilder();
        asterisks.append("*".repeat(Math.max(1, brightness)));

        if (!play) {
            for (int i = 0; i < length; i++) {
                System.out.println(title + esclPoints + asterisks);
            }
            return play = true;
        } else {
            return play = false;
        }
    }

    @Override
    public String toString() {
        return "Video{" +
                "show=" + show +
                ", play=" + play +
                ", brightness=" + brightness +
                ", length=" + length +
                ", title='" + title + '\'' +
                ", volume=" + volume +
                '}';
    }
}
