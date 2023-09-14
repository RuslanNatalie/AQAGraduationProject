package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class Project {
    @SerializedName(value = "name")
    @JsonProperty("name")
    private String projectName;

    @SerializedName(value = "source")
    @JsonProperty("source")
    private String projectSource;
}