package entities;

import interfaces.Player;
import interfaces.VolumeChecker;

public class Audio extends Multimedia implements VolumeChecker, Player {

    public Audio(String title, int length, int volume) {
        super(title, length, volume);
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
    public boolean play() {
        StringBuilder esclPoints = new StringBuilder();
        esclPoints.append("!".repeat(Math.max(1, volume)));

        if (!play) {
            for (int i = 0; i < length; i++) {
                System.out.println(title + esclPoints);
            }
            return play = true;

        } else {
            return play = false;
        }
    }

    @Override
    public String toString() {
        return "Audio{" +
                "show=" + show +
                ", play=" + play +
                ", volume=" + volume +
                ", title='" + title + '\'' +
                ", length=" + length +
                ", brightness=" + brightness +
                '}';
    }
}
