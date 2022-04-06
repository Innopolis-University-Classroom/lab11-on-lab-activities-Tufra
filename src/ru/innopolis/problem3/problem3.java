package ru.innopolis.problem3;
// your solution here
//fix all the errors including package errors

public class problem3 {
    public static void main(String[] args) {
        PlayerDevice pd = new PlayerDevice();

        pd.playMP4(new MediaPlayer());

        pd.playMP4(new MP3ToMP4Adapter());
    }
}
