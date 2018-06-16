package data.vos;

import java.util.List;

public class talkVO
{
    private String talkId;
    private String title;
    private speakerVO speaker;
    private String images;
    private String duration;
    private String description;
    private List<tagVO> tags;

    public String getTalkId() {
        return talkId;
    }

    public String getTitle() {
        return title;
    }

    public speakerVO getSpeaker() {
        return speaker;
    }

    public String getImages() {
        return images;
    }

    public String getDuration() {
        return duration;
    }

    public String getDescription() {
        return description;
    }

    public List<tagVO> getTags() {
        return tags;
    }
}
