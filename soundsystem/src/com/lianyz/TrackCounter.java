package com.lianyz;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Aspect
public class TrackCounter {

    private Map<Integer, Integer> trackCounts = new HashMap<Integer, Integer>();

    @Pointcut("execution(* com.lianyz.CompactDisc.playTrack(int)) && args(trackNumber) ")
    public void trackPlayed(int trackNumber) {}

    @Before("trackPlayed(trackNumber)")
    public void countTrack(int trackNumber) {
        int currentCount = getPlayCount(trackNumber);
        trackCounts.put(trackNumber, currentCount + 1);
    }

    public int getPlayCount(int trackNumber) {
        return trackCounts.containsKey(trackNumber) ?
                trackCounts.get(trackNumber) : 0;
    }
}