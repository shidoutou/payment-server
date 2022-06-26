package io.swagger.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
public class FilmActor extends FilmActorKey implements Serializable {
    private Date lastUpdate;
}
