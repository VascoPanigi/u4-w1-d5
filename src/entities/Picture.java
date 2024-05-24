package entities;

import interfaces.BrightnessChecker;
import interfaces.Shower;

public class Picture extends Multimedia implements BrightnessChecker, Shower {


    public Picture(String title, int brightness) {
        super(title, brightness);
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
    public boolean show() {
        return !show;
    }
}
