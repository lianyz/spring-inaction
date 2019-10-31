package com.lianyz;

import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {

    private CompactDisc compactDisc;

    public CDPlayer(CompactDisc cd) {
        this.compactDisc = cd;
    }

//    public void setCompactDisc(CompactDisc compactDisc) {
//        this.compactDisc = compactDisc;
//    }

    @Override
    public void play() {

        compactDisc.playTrack(0);
        compactDisc.playTrack(1);
        compactDisc.playTrack(2);
        compactDisc.playTrack(3);

        compactDisc.play();
    }

    @Override
    public void playTrack(int trackNumber) {
        compactDisc.playTrack(trackNumber);
    }
}
