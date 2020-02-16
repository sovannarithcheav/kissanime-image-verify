package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ReqObject {

    @JsonProperty("uuid")
    private String uuid;
    @JsonProperty("ans_uuid")
    private String ansUuid;
}
