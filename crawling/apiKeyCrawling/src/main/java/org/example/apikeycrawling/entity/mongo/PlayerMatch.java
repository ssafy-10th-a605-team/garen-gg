package org.example.apikeycrawling.entity.mongo;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "player_match")
public class PlayerMatch {

    private String matchId;
    private InfoDto info;
    private String rank;
    private String tier;

    @Setter
    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class InfoDto {
        private List<ParticipantDto> participants;
    }

    @Setter
    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ParticipantDto {
        private String championName;
        private String riotIdGameName;
        private String riotIdTagline;
        private Boolean win;
    }
}
