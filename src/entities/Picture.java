package entities;

import interfaces.BrightnessChecker;
import interfaces.Shower;

public class Picture extends Multimedia implements BrightnessChecker, Shower {


    public Picture(String title, short brightness) {
        super(title, brightness);
        super.show = false;
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
        StringBuilder asterisks = new StringBuilder();
        asterisks.append("*".repeat(Math.max(1, brightness)));

        if (!show) {

            System.out.println(title + asterisks);

            return show = true;
        } else {
            return show = false;
        }
    }

    @Override
    public String toString() {
        return "Picture{" +
                "show=" + show +
                ", brightness=" + brightness +
                ", play=" + play +
                ", volume=" + volume +
                ", length=" + length +
                ", title='" + title + '\'' +
                '}';
    }
}
