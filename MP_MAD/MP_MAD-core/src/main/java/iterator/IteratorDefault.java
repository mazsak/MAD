package iterator;

import sources.Track;

import java.util.ArrayList;

public class IteratorDefault implements TrackIterator<Track> {
    private ArrayList<Track> tracks;
    private int indexOfTrackInPlaylist = -1;

    public IteratorDefault(ArrayList tracks) {
        this.tracks = tracks;
    }

    public ArrayList<Track> getTracks() {
        return tracks;
    }
    
    @Override
    public void setIndexOfTrackInPlaylist(int indexOfTrackInPlaylist) {
        this.indexOfTrackInPlaylist = indexOfTrackInPlaylist;
    }

    @Override
    public boolean hasNext() {
        return tracks.size() - 1 > indexOfTrackInPlaylist;
    }

    @Override
    public Track next() {
        indexOfTrackInPlaylist++;
        return (Track) tracks.get(indexOfTrackInPlaylist);
    }
}
