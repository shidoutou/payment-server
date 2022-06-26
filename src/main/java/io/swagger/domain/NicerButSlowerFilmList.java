package io.swagger.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NicerButSlowerFilmList implements Serializable {
    private Long fid;

    private String title;

    private String description;

    private String category;

    private BigDecimal price;

    private Short length;

    private String rating;

    private String actors;
}
