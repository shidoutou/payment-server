package io.swagger.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class FilmCategoryKey implements Serializable {
    private Short filmId;
    private Short categoryId;
}
