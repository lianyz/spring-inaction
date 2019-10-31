package com.lianyz;

import org.springframework.aop.framework.AopContext;

import java.util.List;

public class BlankDisc implements CompactDisc {

    private String title;
    private String artist;
    private List<String> tracks;


    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
        for(int trackNumber =0; trackNumber < tracks.size(); ++trackNumber) {
            // todo 此处不会出发切面通知？
//          // AOP方法嵌套调用失效
//            this.playTrack(trackNumber);
            ((BlankDisc) AopContext.currentProxy()).playTrack(trackNumber);
        }
    }

    @Override
    public void playTrack(int trackNumber) {
        System.out.println("-PlayTrack:" + tracks.get(trackNumber));
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }
}
