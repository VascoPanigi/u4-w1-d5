import entities.Audio;
import entities.Multimedia;
import entities.Picture;
import entities.Video;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Multimedia[] multimediaArray = new Multimedia[5];

        String title;
        short brightness;
        int volume;
        int length;

        checkpoint:
        for (int i = 0; i < 5; i++) {

            System.out.println("Choose which multimedia element to insert in the array-");
            System.out.println("Press 1 to create a video, 2 for audio, or 3 for a picture");
            int mediaSelected = Integer.parseInt(scanner.nextLine());

            switch (mediaSelected) {
                case 1:
                    System.out.println("Insert a title for your video");
                    title = scanner.nextLine();
                    System.out.println("Please specify the duration of your video in minutes:");
                    length = Integer.parseInt(scanner.nextLine());
                    System.out.println("Please specify a value for the volume of your video - you can adjust it later");
                    volume = Integer.parseInt(scanner.nextLine());
                    System.out.println("Insert a value for the brightness of your video - you can adjust it later");
                    brightness = Short.parseShort(scanner.nextLine());
                    multimediaArray[i] = new Video(title, length, volume, brightness);

                    System.out.println("The video has been successfully created! :D");
                    break;

                case 2:
                    System.out.println("Insert a title for your audio");
                    title = scanner.nextLine();
                    System.out.println("Please specify the duration of your audio in minutes:");
                    length = Integer.parseInt(scanner.nextLine());
                    System.out.println("Please specify a value for the volume of your audio - you can adjust it later");
                    volume = Integer.parseInt(scanner.nextLine());
                    System.out.println();
                    multimediaArray[i] = new Audio(title, length, volume);
                    System.out.println("The audio has been successfully created! :D");

                    break;

                case 3:
                    System.out.println("Insert a title for your image");
                    title = scanner.nextLine();
                    System.out.println("Insert a value for the brightness of your image - you can adjust it later");
                    brightness = Short.parseShort(scanner.nextLine());
                    multimediaArray[i] = new Picture(title, brightness);
                    System.out.println("The picture has been successfully created! :D");
                    break;
                default:
                    System.out.println("Command not valid, please try again.");
                    break checkpoint;
            }
        }

        System.out.println(Arrays.toString(multimediaArray));

        while (true) {
            System.out.println("Please select the multimedia file you wish to play. Choose a number between 1 and 5.");
            System.out.println("Choose 0 to exit.");
            int selection = Integer.parseInt(scanner.nextLine());
            if (selection == 0) {

                System.out.println("You exited the program. Adios :(");
                break;

            }
            Multimedia currentElement = multimediaArray[selection - 1];

            if (currentElement instanceof Picture) {
                ((Picture) currentElement).show();
            }
            if (currentElement instanceof Video) {
                ((Video) currentElement).play();
            }
            if (currentElement instanceof Audio) {
                ((Audio) currentElement).play();
            }


        }
    }

}