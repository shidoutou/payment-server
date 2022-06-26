package io.swagger.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ActorInfo implements Serializable {
    private Long actorId;

    private String firstName;

    private String lastName;

    private String filmInfo;
}
