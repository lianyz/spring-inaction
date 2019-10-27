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
        compactDisc.play();
    }
}
