package data.vos;

import java.util.List;

public class playlistVO
{
    private int playlistId;
    private String title;
    private String image;
    private int TotalTalks;
    private String Description;
    private List<tedtalkVO> playlist;

    public int getPlaylistId() {
        return playlistId;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public int getTotalTalks() {
        return TotalTalks;
    }

    public String getDescription() {
        return Description;
    }

    public List<tedtalkVO> getPlaylist() {
        return playlist;
    }
}
