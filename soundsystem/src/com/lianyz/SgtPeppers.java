package com.lianyz;

import org.springframework.stereotype.Component;

@Component("lonelyHeartsClub")
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public void play() {
        System.out.println("Playing " + title + "by " + artist);
    }

    @Override
    public void playTrack(int trackNumber) {
        System.out.println("playing track " + trackNumber + "of " + title + "by " + artist);
    }
}
