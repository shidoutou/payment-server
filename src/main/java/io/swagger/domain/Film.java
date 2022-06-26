package io.swagger.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Film implements Serializable {
    private Integer filmId;

    private String title;

    private String description;

    private Object releaseYear;

    private Short languageId;

    private Short rentalDuration;

    private BigDecimal rentalRate;

    private Short length;

    private BigDecimal replacementCost;

    private String rating;

    private Date lastUpdate;

    private Object specialFeatures;

    private Object fulltext;


}
