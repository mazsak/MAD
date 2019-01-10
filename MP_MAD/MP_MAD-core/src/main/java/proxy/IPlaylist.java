package proxy;

import sources.Track;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Acerek
 */
public interface IPlaylist {
    public String getName();
    public void setName(String name);

    public ArrayList<Track> getTracks();
    public Track getTrack(int id);
    public void addTrack(Track track);
    public void removeTrack(Track track);
    public Iterator getIterator(int id); 
}
