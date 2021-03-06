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
public class Store implements Serializable {
    private Integer storeId;

    private Short managerStaffId;

    private Short addressId;

    private Date lastUpdate;


}
