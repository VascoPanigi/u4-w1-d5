import entities.Audio;

public class Main {
    public static void main(String[] args) {
        Audio audiozzo = new Audio("ao", 4, 0);
        System.out.println(audiozzo);
        audiozzo.volumeUp(3);
        System.out.println(audiozzo);

    }

}