package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets RecurrenceType
 */
public enum RecurrenceType {
  SUBSCRIPTION("Subscription"),
    INSTALMENT("Instalment"),
    UNSCHEDULED("Unscheduled"),
    CUSTOMERINITIATED("CustomerInitiated");

  private String value;

  RecurrenceType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static RecurrenceType fromValue(String text) {
    for (RecurrenceType b : RecurrenceType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
