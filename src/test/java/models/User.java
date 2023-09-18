package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import lombok.*;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
    private String name;

    @EqualsAndHashCode.Exclude
    private int page;

//    private String timezone;
//    private String password;
//
//    @SerializedName(value = "date_format")
//    @JsonProperty("is_active")
//    private String dateFormat;
//
//    @SerializedName(value = "time_format")
//    @JsonProperty("is_admin")
//    @EqualsAndHashCode.Exclude
//    private String timeFormat;
//
//    @SerializedName(value = "role_id")
//    @JsonProperty("role_id")
//    private int roleId;
//
//    private String role;
//
//    @EqualsAndHashCode.Exclude
//    private String email_notifications;
}