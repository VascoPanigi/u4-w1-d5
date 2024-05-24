package entities;

public abstract class Multimedia {
    protected String title;
    protected int length;
    protected int volume;
    protected short brightness;
    protected boolean play;
    protected boolean show;

    public Multimedia(String title, int length) {
        this.title = title;
        this.length = length;

    }

    public Multimedia(String title, short brightness) {
        this.title = title;
        this.brightness = brightness;
        this.show = false;
    }


    public Multimedia(String title, int length, int volume) {
        this.title = title;
        this.length = length;
        this.volume = volume;
        this.play = false;
    }


    public Multimedia(String title, int length, int volume, short brightness) {
        this.title = title;
        this.length = length;
        this.volume = volume;
        this.brightness = brightness;
        this.play = false;
    }


}
