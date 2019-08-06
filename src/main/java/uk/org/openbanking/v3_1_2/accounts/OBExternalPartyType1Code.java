/*
 * Account and Transaction API Specification
 * Swagger for Account and Transaction API Specification
 *
 * OpenAPI spec version: v3.1.2
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package uk.org.openbanking.v3_1_2.accounts;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Party type, in a coded form.
 */
public enum OBExternalPartyType1Code {

    DELEGATE("Delegate"),

    JOINT("Joint"),

    SOLE("Sole");

    private String value;

    OBExternalPartyType1Code(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static OBExternalPartyType1Code fromValue(String text) {
        for (OBExternalPartyType1Code b : OBExternalPartyType1Code.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

