package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets PaymentStatus
 */
public enum PaymentStatus {
  PENDING("Pending"),
    RESERVED("Reserved"),
    COMMISSIONED("Commissioned"),
    PAID("Paid"),
    VERIFIED("Verified"),
    CANCELLED("Cancelled"),
    FAILED("Failed"),
    REJECTED("Rejected"),
    EXPIRED("Expired"),
    BLOCKED("Blocked"),
    DECLINED("Declined");

  private String value;

  PaymentStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PaymentStatus fromValue(String text) {
    for (PaymentStatus b : PaymentStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
