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

import com.fasterxml.jackson.annotation.*;
import io.swagger.annotations.ApiModelProperty;
import uk.org.openbanking.v3_1_2.commons.Account;

import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OBReadConsentResponse1Data
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-07-10T09:14:46.696896+02:00[Europe/Budapest]")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OBReadConsentResponse1Data {
    @JsonProperty("Status")
    private StatusEnum            status                  = null;
    @JsonProperty("StatusUpdateDateTime")
    private String                statusUpdateDateTime    = null;
    @JsonProperty("CreationDateTime")
    private String                creationDateTime        = null;
    @JsonProperty("TransactionToDateTime")
    private String                transactionToDateTime   = null;
    @JsonProperty("ExpirationDateTime")
    private String                expirationDateTime      = null;
    @JsonProperty("Permissions")
    private List<PermissionsEnum> permissions             = null;
    @JsonProperty("ConsentId")
    private String                consentId               = null;
    @JsonProperty("TransactionFromDateTime")
    private String                transactionFromDateTime = null;
    @JsonProperty("Account")
    private List<Account>         accounts;
    @JsonProperty("Action")
    private String                action;

    public OBReadConsentResponse1Data status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Specifies the status of consent resource in code form.
     *
     * @return status
     **/
    @JsonProperty("Status")
    @ApiModelProperty(value = "Specifies the status of consent resource in code form.")
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public OBReadConsentResponse1Data statusUpdateDateTime(String statusUpdateDateTime) {
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

    public OBReadConsentResponse1Data creationDateTime(String creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    /**
     * Date and time at which the resource was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return creationDateTime
     **/
    @JsonProperty("CreationDateTime")
    @ApiModelProperty(value = "Date and time at which the resource was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    public String getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(String creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public OBReadConsentResponse1Data transactionToDateTime(String transactionToDateTime) {
        this.transactionToDateTime = transactionToDateTime;
        return this;
    }

    /**
     * Specified end date and time for the transaction query period. If this is not populated, the end date will be open ended, and data will be returned to the latest available transaction.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return transactionToDateTime
     **/
    @JsonProperty("TransactionToDateTime")
    @ApiModelProperty(value = "Specified end date and time for the transaction query period. If this is not populated, the end date will be open ended, and data will be returned to the latest available transaction.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    public String getTransactionToDateTime() {
        return transactionToDateTime;
    }

    public void setTransactionToDateTime(String transactionToDateTime) {
        this.transactionToDateTime = transactionToDateTime;
    }

    public OBReadConsentResponse1Data expirationDateTime(String expirationDateTime) {
        this.expirationDateTime = expirationDateTime;
        return this;
    }

    /**
     * Specified date and time the permissions will expire. If this is not populated, the permissions will be open ended.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return expirationDateTime
     **/
    @JsonProperty("ExpirationDateTime")
    @ApiModelProperty(value = "Specified date and time the permissions will expire. If this is not populated, the permissions will be open ended.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    public String getExpirationDateTime() {
        return expirationDateTime;
    }

    public void setExpirationDateTime(String expirationDateTime) {
        this.expirationDateTime = expirationDateTime;
    }

    public OBReadConsentResponse1Data permissions(List<PermissionsEnum> permissions) {
        this.permissions = permissions;
        return this;
    }

    public OBReadConsentResponse1Data addPermissionsItem(PermissionsEnum permissionsItem) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        this.permissions.add(permissionsItem);
        return this;
    }

    /**
     * Get permissions
     *
     * @return permissions
     **/
    @JsonProperty("Permissions")
    @ApiModelProperty(value = "")
    @Size(min = 1)
    public List<PermissionsEnum> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<PermissionsEnum> permissions) {
        this.permissions = permissions;
    }

    public OBReadConsentResponse1Data consentId(String consentId) {
        this.consentId = consentId;
        return this;
    }

    /**
     * Unique identification as assigned to identify the account access consent resource.
     *
     * @return consentId
     **/
    @JsonProperty("ConsentId")
    @ApiModelProperty(value = "Unique identification as assigned to identify the account access consent resource.")
    @Size(min = 1, max = 128)
    public String getConsentId() {
        return consentId;
    }

    public void setConsentId(String consentId) {
        this.consentId = consentId;
    }

    public OBReadConsentResponse1Data transactionFromDateTime(String transactionFromDateTime) {
        this.transactionFromDateTime = transactionFromDateTime;
        return this;
    }

    /**
     * Specified start date and time for the transaction query period. If this is not populated, the start date will be open ended, and data will be returned from the earliest available transaction.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return transactionFromDateTime
     **/
    @JsonProperty("TransactionFromDateTime")
    @ApiModelProperty(value = "Specified start date and time for the transaction query period. If this is not populated, the start date will be open ended, and data will be returned from the earliest available transaction.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    public String getTransactionFromDateTime() {
        return transactionFromDateTime;
    }

    public void setTransactionFromDateTime(String transactionFromDateTime) {
        this.transactionFromDateTime = transactionFromDateTime;
    }

    @Override
    public int hashCode() {
        return Objects
                .hash(status, statusUpdateDateTime, creationDateTime, transactionToDateTime, expirationDateTime, permissions, consentId, transactionFromDateTime);
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadConsentResponse1Data obReadConsentResponse1Data = (OBReadConsentResponse1Data) o;
        return Objects.equals(this.status, obReadConsentResponse1Data.status) &&
                Objects.equals(this.statusUpdateDateTime, obReadConsentResponse1Data.statusUpdateDateTime) &&
                Objects.equals(this.creationDateTime, obReadConsentResponse1Data.creationDateTime) &&
                Objects.equals(this.transactionToDateTime, obReadConsentResponse1Data.transactionToDateTime) &&
                Objects.equals(this.expirationDateTime, obReadConsentResponse1Data.expirationDateTime) &&
                Objects.equals(this.permissions, obReadConsentResponse1Data.permissions) &&
                Objects.equals(this.consentId, obReadConsentResponse1Data.consentId) &&
                Objects.equals(this.transactionFromDateTime, obReadConsentResponse1Data.transactionFromDateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadConsentResponse1Data {\n");

        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
        sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
        sb.append("    transactionToDateTime: ").append(toIndentedString(transactionToDateTime)).append("\n");
        sb.append("    expirationDateTime: ").append(toIndentedString(expirationDateTime)).append("\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
        sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
        sb.append("    transactionFromDateTime: ").append(toIndentedString(transactionFromDateTime)).append("\n");
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

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(final List<Account> accounts) {
        this.accounts = accounts;
    }

    public String getAction() {
        return action;
    }

    public void setAction(final String action) {
        this.action = action;
    }

    /**
     * Specifies the status of consent resource in code form.
     */
    public enum StatusEnum {
        AUTHORISED("Authorised"),

        AWAITINGAUTHORISATION("AwaitingAuthorisation"),

        REJECTED("Rejected"),

        REVOKED("Revoked");

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

    /**
     * Specifies the Open Banking account access data types. This is a list of the data clusters being consented by the PSU, and requested for authorisation with the ASPSP.
     */
    public enum PermissionsEnum {
        READACCOUNTSBASIC("ReadAccountsBasic"),

        READACCOUNTSDETAIL("ReadAccountsDetail"),

        READBALANCES("ReadBalances"),

        READBENEFICIARIESBASIC("ReadBeneficiariesBasic"),

        READBENEFICIARIESDETAIL("ReadBeneficiariesDetail"),

        READDIRECTDEBITS("ReadDirectDebits"),

        READOFFERS("ReadOffers"),

        READPAN("ReadPAN"),

        READPARTY("ReadParty"),

        READPARTYPSU("ReadPartyPSU"),

        READPRODUCTS("ReadProducts"),

        READSCHEDULEDPAYMENTSBASIC("ReadScheduledPaymentsBasic"),

        READSCHEDULEDPAYMENTSDETAIL("ReadScheduledPaymentsDetail"),

        READSTANDINGORDERSBASIC("ReadStandingOrdersBasic"),

        READSTANDINGORDERSDETAIL("ReadStandingOrdersDetail"),

        READSTATEMENTSBASIC("ReadStatementsBasic"),

        READSTATEMENTSDETAIL("ReadStatementsDetail"),

        READTRANSACTIONSBASIC("ReadTransactionsBasic"),

        READTRANSACTIONSCREDITS("ReadTransactionsCredits"),

        READTRANSACTIONSDEBITS("ReadTransactionsDebits"),

        READTRANSACTIONSDETAIL("ReadTransactionsDetail");

        private String value;

        PermissionsEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static PermissionsEnum fromValue(String text) {
            for (PermissionsEnum b : PermissionsEnum.values()) {
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

