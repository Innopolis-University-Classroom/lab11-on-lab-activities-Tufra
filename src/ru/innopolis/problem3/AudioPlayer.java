package ru.innopolis.problem3;

public class AudioPlayer extends Device implements MP3Player {
    public AudioPlayer() {
    }

    @Override
    public void playMP3() {
        System.out.println("playing MP3");
    }
}
