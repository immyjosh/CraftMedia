package com.ijp.app.craftmedia.Model.VideoModel;

public class VideoRandomModel {
    public String ID;
    public String Description;
    public String Image_link;
    public String hd_video_link;
    public String video_link;
    public String Category;
    private String size_SD;
    private String size_HD;

    public VideoRandomModel() {
    }

    public VideoRandomModel(String ID, String description, String image_link, String hd_video_link, String video_link, String category, String size_SD, String size_HD) {
        this.ID = ID;
        Description = description;
        Image_link = image_link;
        this.hd_video_link = hd_video_link;
        this.video_link = video_link;
        Category = category;
        this.size_SD = size_SD;
        this.size_HD = size_HD;
    }

    public String getSize_SD() {
        return size_SD;
    }

    public void setSize_SD(String size_SD) {
        this.size_SD = size_SD;
    }

    public String getSize_HD() {
        return size_HD;
    }

    public void setSize_HD(String size_HD) {
        this.size_HD = size_HD;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getImage_link() {
        return Image_link;
    }

    public void setImage_link(String image_link) {
        Image_link = image_link;
    }

    public String getHd_video_link() {
        return hd_video_link;
    }

    public void setHd_video_link(String hd_video_link) {
        this.hd_video_link = hd_video_link;
    }

    public String getVideo_link() {
        return video_link;
    }

    public void setVideo_link(String video_link) {
        this.video_link = video_link;
    }
}
