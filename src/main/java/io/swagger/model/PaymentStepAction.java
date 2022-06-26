package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets PaymentStepAction
 */
public enum PaymentStepAction {
  DISPLAYHOSTEDPAGE("DisplayHostedPage"),
    PAYMENTMETHODSELECTION("PaymentMethodSelection"),
    START("Start"),
    PROCESS("Process"),
    BACKGROUNDPROCESS("BackgroundProcess"),
    CAPTURE("Capture"),
    REFUND("Refund"),
    CANCEL("Cancel");

  private String value;

  PaymentStepAction(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PaymentStepAction fromValue(String text) {
    for (PaymentStepAction b : PaymentStepAction.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
