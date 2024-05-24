package entities;

public abstract class Multimedia {
    protected String title;
    protected int length;
    protected int volume;
    protected int brightness;

    public Multimedia(String title, int length) {
        this.title = title;
        this.length = length;
    }


    public Multimedia(String title, int length, int volume) {
        this.title = title;
        this.length = length;
        this.volume = volume;
    }


    public Multimedia(String title, int length, int volume, int brightness) {
        this.title = title;
        this.length = length;
        this.volume = volume;
        this.brightness = brightness;
    }


}
