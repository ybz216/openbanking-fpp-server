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

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * An array of detail error codes, and messages, and URLs to documentation to help remediation.
 */
@ApiModel(description = "An array of detail error codes, and messages, and URLs to documentation to help remediation.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-07-10T09:14:46.696896+02:00[Europe/Budapest]")
public class OBErrorResponse1 {
    @JsonProperty("Code")
    private String code = null;

    @JsonProperty("Id")
    private String id = null;

    @JsonProperty("Message")
    private String message = null;

    @JsonProperty("Errors")
    private List<OBError1> errors = new ArrayList<>();

    public OBErrorResponse1 code(String code) {
        this.code = code;
        return this;
    }

    /**
     * High level textual error code, to help categorize the errors.
     *
     * @return code
     **/
    @JsonProperty("Code")
    @ApiModelProperty(required = true, value = "High level textual error code, to help categorize the errors.")
    @NotNull
    @Size(min = 1, max = 40)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public OBErrorResponse1 id(String id) {
        this.id = id;
        return this;
    }

    /**
     * A unique reference for the error instance, for audit purposes, in case of unknown/unclassified errors.
     *
     * @return id
     **/
    @JsonProperty("Id")
    @ApiModelProperty(value = "A unique reference for the error instance, for audit purposes, in case of unknown/unclassified errors.")
    @Size(min = 1, max = 40)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public OBErrorResponse1 message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Brief Error message, e.g., &#39;There is something wrong with the request parameters provided&#39;
     *
     * @return message
     **/
    @JsonProperty("Message")
    @ApiModelProperty(required = true, value = "Brief Error message, e.g., 'There is something wrong with the request parameters provided'")
    @NotNull
    @Size(min = 1, max = 500)
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public OBErrorResponse1 errors(List<OBError1> errors) {
        this.errors = errors;
        return this;
    }

    public OBErrorResponse1 addErrorsItem(OBError1 errorsItem) {
        this.errors.add(errorsItem);
        return this;
    }

    /**
     * Get errors
     *
     * @return errors
     **/
    @JsonProperty("Errors")
    @ApiModelProperty(required = true, value = "")
    @NotNull
    @Size(min = 1)
    public List<OBError1> getErrors() {
        return errors;
    }

    public void setErrors(List<OBError1> errors) {
        this.errors = errors;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBErrorResponse1 obErrorResponse1 = (OBErrorResponse1) o;
        return Objects.equals(this.code, obErrorResponse1.code) &&
                Objects.equals(this.id, obErrorResponse1.id) &&
                Objects.equals(this.message, obErrorResponse1.message) &&
                Objects.equals(this.errors, obErrorResponse1.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, id, message, errors);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBErrorResponse1 {\n");

        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
}

