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
public class Payment implements Serializable {
    private Integer paymentId;

    private Short customerId;

    private Short staffId;

    private Integer rentalId;

    private BigDecimal amount;

    private Date paymentDate;


}
