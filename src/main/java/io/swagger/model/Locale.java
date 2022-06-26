package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets Locale
 */
public enum Locale {
  EL_GR("el_GR"),
    EN_US("en_US"),
    NL_NL("nl_NL"),
    EN_GB("en_GB"),
    ES_ES("es_ES");

  private String value;

  Locale(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static Locale fromValue(String text) {
    for (Locale b : Locale.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
