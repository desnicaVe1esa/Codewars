package kyu_7.what_a_classy_song.java;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Song {
    private String title;
    private String artist;
    private Set<String> listeners = new HashSet<>();

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int howMany(List<String> listeners) {
        Set<String> listenersSet = listeners.stream().map(String::toLowerCase).collect(Collectors.toSet());
        int result = 0;
        if (this.listeners.size() != 0) {
            for (String listener : listenersSet) {
                if (!this.listeners.contains(listener)) {
                    result++;
                }
            }
        } else {
            this.listeners.addAll(listenersSet);
            return listenersSet.size();
        }
        this.listeners.addAll(listenersSet);
        return result;
    }
}
