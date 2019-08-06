/*
 * This Source Code Form is subject to the terms of the Mozilla
 * Public License, v. 2.0. If a copy of the MPL was not distributed
 * with this file, You can obtain one at
 *
 * https://mozilla.org/MPL/2.0/.
 */

/*
 * Payment Initiation API
 * Swagger for Payment Initiation API Specification
 *
 * OpenAPI spec version: v3.1.2
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package uk.org.openbanking.v3_1_2.payments;

import com.fasterxml.jackson.annotation.*;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OBWriteInternationalScheduledResponse3Data
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-07-09T18:27:25.589536+02:00[Europe/Budapest]")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OBWriteInternationalScheduledResponse3Data {
    @JsonProperty("Status")
    private StatusEnum status = null;
    @JsonProperty("StatusUpdateDateTime")
    private String statusUpdateDateTime = null;
    @JsonProperty("CreationDateTime")
    private String creationDateTime = null;
    @JsonProperty("ExpectedExecutionDateTime")
    private String expectedExecutionDateTime = null;
    @JsonProperty("ExchangeRateInformation")
    private OBWriteInternationalScheduledResponse3DataExchangeRateInformation exchangeRateInformation = null;
    @JsonProperty("InternationalScheduledPaymentId")
    private String internationalScheduledPaymentId = null;
    @JsonProperty("Charges")
    private List<OBWriteDomesticStandingOrderResponse4DataCharges> charges = null;
    @JsonProperty("ConsentId")
    private String consentId = null;
    @JsonProperty("Initiation")
    private OBWriteInternationalScheduledResponse3DataInitiation initiation = null;
    @JsonProperty("ExpectedSettlementDateTime")
    private String expectedSettlementDateTime = null;
    @JsonProperty("MultiAuthorisation")
    private OBWriteDomesticStandingOrderResponse4DataMultiAuthorisation multiAuthorisation = null;

    public OBWriteInternationalScheduledResponse3Data status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Specifies the status of the payment order resource.
     *
     * @return status
     **/
    @JsonProperty("Status")
    @ApiModelProperty(value = "Specifies the status of the payment order resource.")
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public OBWriteInternationalScheduledResponse3Data statusUpdateDateTime(String statusUpdateDateTime) {
        this.statusUpdateDateTime = statusUpdateDateTime;
        return this;
    }

    /**
     * Date and time at which the resource status was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return statusUpdateDateTime
     **/
    @JsonProperty("StatusUpdateDateTime")
    @ApiModelProperty(value = "Date and time at which the resource status was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    public String getStatusUpdateDateTime() {
        return statusUpdateDateTime;
    }

    public void setStatusUpdateDateTime(String statusUpdateDateTime) {
        this.statusUpdateDateTime = statusUpdateDateTime;
    }

    public OBWriteInternationalScheduledResponse3Data creationDateTime(String creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    /**
     * Date and time at which the message was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return creationDateTime
     **/
    @JsonProperty("CreationDateTime")
    @ApiModelProperty(value = "Date and time at which the message was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    public String getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(String creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public OBWriteInternationalScheduledResponse3Data expectedExecutionDateTime(String expectedExecutionDateTime) {
        this.expectedExecutionDateTime = expectedExecutionDateTime;
        return this;
    }

    /**
     * Expected execution date and time for the payment resource.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return expectedExecutionDateTime
     **/
    @JsonProperty("ExpectedExecutionDateTime")
    @ApiModelProperty(value = "Expected execution date and time for the payment resource.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    public String getExpectedExecutionDateTime() {
        return expectedExecutionDateTime;
    }

    public void setExpectedExecutionDateTime(String expectedExecutionDateTime) {
        this.expectedExecutionDateTime = expectedExecutionDateTime;
    }

    public OBWriteInternationalScheduledResponse3Data exchangeRateInformation(OBWriteInternationalScheduledResponse3DataExchangeRateInformation exchangeRateInformation) {
        this.exchangeRateInformation = exchangeRateInformation;
        return this;
    }

    /**
     * Get exchangeRateInformation
     *
     * @return exchangeRateInformation
     **/
    @JsonProperty("ExchangeRateInformation")
    @ApiModelProperty(value = "")
    public OBWriteInternationalScheduledResponse3DataExchangeRateInformation getExchangeRateInformation() {
        return exchangeRateInformation;
    }

    public void setExchangeRateInformation(OBWriteInternationalScheduledResponse3DataExchangeRateInformation exchangeRateInformation) {
        this.exchangeRateInformation = exchangeRateInformation;
    }

    public OBWriteInternationalScheduledResponse3Data internationalScheduledPaymentId(String internationalScheduledPaymentId) {
        this.internationalScheduledPaymentId = internationalScheduledPaymentId;
        return this;
    }

    /**
     * OB: Unique identification as assigned by the ASPSP to uniquely identify the international scheduled payment resource.
     *
     * @return internationalScheduledPaymentId
     **/
    @JsonProperty("InternationalScheduledPaymentId")
    @ApiModelProperty(value = "OB: Unique identification as assigned by the ASPSP to uniquely identify the international scheduled payment resource.")
    @Size(min = 1, max = 40)
    public String getInternationalScheduledPaymentId() {
        return internationalScheduledPaymentId;
    }

    public void setInternationalScheduledPaymentId(String internationalScheduledPaymentId) {
        this.internationalScheduledPaymentId = internationalScheduledPaymentId;
    }

    public OBWriteInternationalScheduledResponse3Data charges(List<OBWriteDomesticStandingOrderResponse4DataCharges> charges) {
        this.charges = charges;
        return this;
    }

    public OBWriteInternationalScheduledResponse3Data addChargesItem(OBWriteDomesticStandingOrderResponse4DataCharges chargesItem) {
        if (this.charges == null) {
            this.charges = new ArrayList<>();
        }
        this.charges.add(chargesItem);
        return this;
    }

    /**
     * Get charges
     *
     * @return charges
     **/
    @JsonProperty("Charges")
    @ApiModelProperty(value = "")
    public List<OBWriteDomesticStandingOrderResponse4DataCharges> getCharges() {
        return charges;
    }

    public void setCharges(List<OBWriteDomesticStandingOrderResponse4DataCharges> charges) {
        this.charges = charges;
    }

    public OBWriteInternationalScheduledResponse3Data consentId(String consentId) {
        this.consentId = consentId;
        return this;
    }

    /**
     * OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource.
     *
     * @return consentId
     **/
    @JsonProperty("ConsentId")
    @ApiModelProperty(value = "OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource.")
    @Size(min = 1, max = 128)
    public String getConsentId() {
        return consentId;
    }

    public void setConsentId(String consentId) {
        this.consentId = consentId;
    }

    public OBWriteInternationalScheduledResponse3Data initiation(OBWriteInternationalScheduledResponse3DataInitiation initiation) {
        this.initiation = initiation;
        return this;
    }

    /**
     * Get initiation
     *
     * @return initiation
     **/
    @JsonProperty("Initiation")
    @ApiModelProperty(value = "")
    public OBWriteInternationalScheduledResponse3DataInitiation getInitiation() {
        return initiation;
    }

    public void setInitiation(OBWriteInternationalScheduledResponse3DataInitiation initiation) {
        this.initiation = initiation;
    }

    public OBWriteInternationalScheduledResponse3Data expectedSettlementDateTime(String expectedSettlementDateTime) {
        this.expectedSettlementDateTime = expectedSettlementDateTime;
        return this;
    }

    /**
     * Expected settlement date and time for the payment resource.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return expectedSettlementDateTime
     **/
    @JsonProperty("ExpectedSettlementDateTime")
    @ApiModelProperty(value = "Expected settlement date and time for the payment resource.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    public String getExpectedSettlementDateTime() {
        return expectedSettlementDateTime;
    }

    public void setExpectedSettlementDateTime(String expectedSettlementDateTime) {
        this.expectedSettlementDateTime = expectedSettlementDateTime;
    }

    public OBWriteInternationalScheduledResponse3Data multiAuthorisation(OBWriteDomesticStandingOrderResponse4DataMultiAuthorisation multiAuthorisation) {
        this.multiAuthorisation = multiAuthorisation;
        return this;
    }

    /**
     * Get multiAuthorisation
     *
     * @return multiAuthorisation
     **/
    @JsonProperty("MultiAuthorisation")
    @ApiModelProperty(value = "")
    public OBWriteDomesticStandingOrderResponse4DataMultiAuthorisation getMultiAuthorisation() {
        return multiAuthorisation;
    }

    public void setMultiAuthorisation(OBWriteDomesticStandingOrderResponse4DataMultiAuthorisation multiAuthorisation) {
        this.multiAuthorisation = multiAuthorisation;
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, statusUpdateDateTime, creationDateTime, expectedExecutionDateTime, exchangeRateInformation, internationalScheduledPaymentId, charges, consentId, initiation, expectedSettlementDateTime, multiAuthorisation);
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteInternationalScheduledResponse3Data obWriteInternationalScheduledResponse3Data = (OBWriteInternationalScheduledResponse3Data) o;
        return Objects.equals(this.status, obWriteInternationalScheduledResponse3Data.status) &&
                Objects.equals(this.statusUpdateDateTime, obWriteInternationalScheduledResponse3Data.statusUpdateDateTime) &&
                Objects.equals(this.creationDateTime, obWriteInternationalScheduledResponse3Data.creationDateTime) &&
                Objects.equals(this.expectedExecutionDateTime, obWriteInternationalScheduledResponse3Data.expectedExecutionDateTime) &&
                Objects.equals(this.exchangeRateInformation, obWriteInternationalScheduledResponse3Data.exchangeRateInformation) &&
                Objects.equals(this.internationalScheduledPaymentId, obWriteInternationalScheduledResponse3Data.internationalScheduledPaymentId) &&
                Objects.equals(this.charges, obWriteInternationalScheduledResponse3Data.charges) &&
                Objects.equals(this.consentId, obWriteInternationalScheduledResponse3Data.consentId) &&
                Objects.equals(this.initiation, obWriteInternationalScheduledResponse3Data.initiation) &&
                Objects.equals(this.expectedSettlementDateTime, obWriteInternationalScheduledResponse3Data.expectedSettlementDateTime) &&
                Objects.equals(this.multiAuthorisation, obWriteInternationalScheduledResponse3Data.multiAuthorisation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteInternationalScheduledResponse3Data {\n");

        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
        sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
        sb.append("    expectedExecutionDateTime: ").append(toIndentedString(expectedExecutionDateTime)).append("\n");
        sb.append("    exchangeRateInformation: ").append(toIndentedString(exchangeRateInformation)).append("\n");
        sb.append("    internationalScheduledPaymentId: ").append(toIndentedString(internationalScheduledPaymentId)).append("\n");
        sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
        sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
        sb.append("    initiation: ").append(toIndentedString(initiation)).append("\n");
        sb.append("    expectedSettlementDateTime: ").append(toIndentedString(expectedSettlementDateTime)).append("\n");
        sb.append("    multiAuthorisation: ").append(toIndentedString(multiAuthorisation)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    /**
     * Specifies the status of the payment order resource.
     */
    public enum StatusEnum {
        CANCELLED("Cancelled"),

        INITIATIONCOMPLETED("InitiationCompleted"),

        INITIATIONFAILED("InitiationFailed"),

        INITIATIONPENDING("InitiationPending");

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static StatusEnum fromValue(String text) {
            for (StatusEnum b : StatusEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }
    }
}

