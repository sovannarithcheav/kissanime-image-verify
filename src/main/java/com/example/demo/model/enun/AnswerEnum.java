package com.example.demo.model.enun;

public enum  AnswerEnum {

    A("alphabets/letter-a.png", "Apple",  "A"),
    B("alphabets/letter-b.png", "Bee", "B"),
    C("alphabets/letter-c.png", "Cat", "C"),
    D("alphabets/letter-d.png", "Dog", "D"),
    E("alphabets/letter-e.png", "Egg", "E"),
    F("alphabets/letter-f.png", "Fish", "F"),
    G("alphabets/letter-g.png", "Grove", "G"),
    H("alphabets/letter-h.png", "Hog", "H");
    //...

    AnswerEnum(String path, String forr, String alpha) {
        this.alpha = alpha;
        this.forr = forr;
        this.path = path;
    }

    private String path;
    private String forr;
    private String alpha;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getForr() {
        return forr;
    }

    public void setForr(String forr) {
        this.forr = forr;
    }

    public String getAlpha() {
        return alpha;
    }

    public void setAlpha(String alpha) {
        this.alpha = alpha;
    }
}
