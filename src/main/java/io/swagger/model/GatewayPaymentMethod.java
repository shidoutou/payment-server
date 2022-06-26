package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets GatewayPaymentMethod
 */
public enum GatewayPaymentMethod {
  IDEAL("Ideal"),
    PAYPAL("PayPal"),
    VISACREDITCARD("VisaCreditCard"),
    MASTERCREDITCARD("MasterCreditcard"),
    SUMITOMODEBITCARD("SumitomoDebitCard"),
    MITSUBISHIDEBITCARD("MitsubishiDebitcard"),
    CARD("Card"),
    BANCONTACT("Bancontact"),
    SEPABANKTRANSFER("SepaBanktransfer"),
    KLARNAPAYLATER("KlarnaPayLater"),
    KLARNASLICEIT("KlarnaSliceIt"),
    KLARNAPAYNOW("KlarnaPayNow"),
    AFTERPAY("AfterPay"),
    DIRECTDEBIT("DirectDebit");

  private String value;

  GatewayPaymentMethod(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static GatewayPaymentMethod fromValue(String text) {
    for (GatewayPaymentMethod b : GatewayPaymentMethod.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
