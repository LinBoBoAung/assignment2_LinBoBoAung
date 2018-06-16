package data.vos;

import java.util.List;

public class tedtalkVO
{
    private int talkId;
    private String title;
    private List<speakerVO> speaker;
    private String image;
    private int durationsec;
    private String description;
    private List<tagVO> tag;

    public String getImage() {
        return image;
    }

    public int getDurationsec() {
        return durationsec;
    }

    public String getDescription() {
        return description;
    }




    public int getTalkId() {
        return talkId;
    }

    public String getTitle() {
        return title;
    }

    public List<speakerVO> getSpeaker() {
        return speaker;
    }
}
