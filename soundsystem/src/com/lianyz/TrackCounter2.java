package com.lianyz;

import java.util.HashMap;
import java.util.Map;

public class TrackCounter2 {
    private Map<Integer, Integer> trackCounts = new HashMap<Integer, Integer>();

    public void trackPlayed(int trackNumber) {}

    public void countTrack(int trackNumber) {
        int currentCount = getPlayCount(trackNumber);
        trackCounts.put(trackNumber, currentCount + 1);
    }

    public int getPlayCount(int trackNumber) {
        return trackCounts.containsKey(trackNumber) ?
                trackCounts.get(trackNumber) : 0;
    }

    @Override
    public String toString() {
        String result = "";
        for(Map.Entry<Integer, Integer> entry : trackCounts.entrySet()) {
            String trackInfo = "Track " + entry.getKey() + " played " + entry.getValue() + " times\n";
            result += trackInfo;
        }
        return result;
    }
}
