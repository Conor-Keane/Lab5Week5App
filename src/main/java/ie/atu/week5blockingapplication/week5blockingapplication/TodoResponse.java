package ie.atu.week5blockingapplication.week5blockingapplication;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TodoResponse {
    @JsonProperty("userId")
    private int userId;

    @JsonProperty("id")
    private int id;

    @JsonProperty("title")
    private int title;

}
