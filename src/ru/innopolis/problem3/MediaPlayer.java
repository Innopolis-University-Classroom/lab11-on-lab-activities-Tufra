package ru.innopolis.problem3;

public class MediaPlayer extends Device implements MP4Player {

    public MediaPlayer() {
    }

    @Override
    public void playMP4() {
        System.out.println("playing MP4");
    }
}
