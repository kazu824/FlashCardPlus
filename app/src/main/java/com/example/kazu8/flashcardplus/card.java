package com.example.kazu8.flashcardplus;

public class card {
    public int imageId;
    public String title;
    public String content;
    public int likenum = 0;

    public String meaning;

    public card(int imageId, String title, String content, int likenum, String meaning){
        this.imageId = imageId;
        this.title = title;
        this.content = content;
        this.likenum = likenum;
        this.meaning = meaning;
    }


}
