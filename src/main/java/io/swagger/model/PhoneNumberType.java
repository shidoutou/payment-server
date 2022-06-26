package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets PhoneNumberType
 */
public enum PhoneNumberType {
  UNKNOWN("Unknown"),
    MOBILE("Mobile"),
    FIXED("Fixed");

  private String value;

  PhoneNumberType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PhoneNumberType fromValue(String text) {
    for (PhoneNumberType b : PhoneNumberType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
