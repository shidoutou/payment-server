package io.swagger.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
public class FilmCategory extends FilmCategoryKey implements Serializable {
    private Date lastUpdate;
}
