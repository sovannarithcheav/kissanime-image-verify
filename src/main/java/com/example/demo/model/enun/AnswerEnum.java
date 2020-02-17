package com.example.demo.model.enun;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum  AnswerEnum {

    A("alphabets/letter-a.png", "Apple",  "A"),
    B("alphabets/letter-b.png", "Bee", "B"),
    C("alphabets/letter-c.png", "Cat", "C"),
    D("alphabets/letter-d.png", "Dump", "D"),
    E("alphabets/letter-e.png", "Egg", "E"),
    F("alphabets/letter-f.png", "Fish", "F"),
    G("alphabets/letter-g.png", "Grove", "G"),
    H("alphabets/letter-h.png", "Hog", "H");
    //...

    public static HashMap<Integer, AnswerEnum> answerMap;

    static {
        answerMap = new HashMap<Integer, AnswerEnum>();
        answerMap.put(1, AnswerEnum.A);
        answerMap.put(2, AnswerEnum.B);
        answerMap.put(3, AnswerEnum.C);
        answerMap.put(4, AnswerEnum.D);
        answerMap.put(5, AnswerEnum.E);
        answerMap.put(6, AnswerEnum.F);
        answerMap.put(7, AnswerEnum.G);
        answerMap.put(8, AnswerEnum.H);
    }

    AnswerEnum(String path, String $for, String alpha) {
        this.alpha = alpha;
        this.$for = $for;
        this.path = path;
    }

    private String path;
    private String $for;
    private String alpha;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String get$for() {
        return $for;
    }

    public void set$for(String $for) {
        this.$for = $for;
    }

    public String getAlpha() {
        return alpha;
    }

    public void setAlpha(String alpha) {
        this.alpha = alpha;
    }

    @JsonCreator
    public static AnswerEnum forValue(@JsonProperty("path") String path,
                                       @JsonProperty("forr") String forr,
                                       @JsonProperty("alpha") String alpha) {
        for (AnswerEnum answerEnum : AnswerEnum.values()) {
            if (answerEnum.path.equals(path) && answerEnum.$for.equals(forr) && answerEnum.alpha.equals(alpha)) {
                return answerEnum;
            }
        }
        return null;
    }


}
