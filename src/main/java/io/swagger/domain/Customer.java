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
public class Customer implements Serializable {
    private Integer customerId;

    private Short storeId;

    private String firstName;

    private String lastName;

    private String email;

    private Short addressId;

    private Boolean activebool;

    private Date createDate;

    private Date lastUpdate;

    private Integer active;


}
