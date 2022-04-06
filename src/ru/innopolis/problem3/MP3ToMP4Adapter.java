package ru.innopolis.problem3;

public class MP3ToMP4Adapter extends AudioPlayer implements MP4Player {

    @Override
    public void playMP4() {
        super.playMP3();
    }
}
