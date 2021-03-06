package command;

import player.PlaylistManager;
import proxy.IPlaylist;

public class CommandCreatePlaylist implements Command {

    private IPlaylist playlist;
    private final String name;

    public CommandCreatePlaylist(String name) {
        this.name = name;
    }

    @Override
    public void undo() {
        this.playlist = PlaylistManager.getInstance().getPlaylist(0);
        PlaylistManager.getInstance().removePlaylist(0);
    }

    @Override
    public void redo() {
        PlaylistManager.getInstance().getPlaylists().add(playlist);
    }
}
