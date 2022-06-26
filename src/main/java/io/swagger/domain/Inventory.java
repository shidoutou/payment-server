package io.swagger.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Inventory implements Serializable {
    private Integer inventoryId;

    private Short filmId;

    private Short storeId;

    private Date lastUpdate;


}
