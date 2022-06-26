package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets PaymentMethod
 */
public enum PaymentMethod {
  IDEAL("Ideal"),
    PAYPAL("PayPal"),
    CARD("Card"),
    BANCONTACT("Bancontact"),
    SEPABANKTRANSFER("SepaBanktransfer"),
    KLARNAPAYLATER("KlarnaPayLater"),
    KLARNASLICEIT("KlarnaSliceIt"),
    KLARNAPAYNOW("KlarnaPayNow"),
    AFTERPAY("AfterPay"),
    DIRECTDEBIT("DirectDebit");

  private String value;

  PaymentMethod(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PaymentMethod fromValue(String text) {
    for (PaymentMethod b : PaymentMethod.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
