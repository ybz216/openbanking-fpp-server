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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OBReadStandingOrder5Data
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-07-10T09:14:46.696896+02:00[Europe/Budapest]")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OBReadStandingOrder5Data {
    @JsonProperty("StandingOrder")
    private List<OBStandingOrder5> standingOrder = null;

    public OBReadStandingOrder5Data standingOrder(List<OBStandingOrder5> standingOrder) {
        this.standingOrder = standingOrder;
        return this;
    }

    public OBReadStandingOrder5Data addStandingOrderItem(OBStandingOrder5 standingOrderItem) {
        if (this.standingOrder == null) {
            this.standingOrder = new ArrayList<>();
        }
        this.standingOrder.add(standingOrderItem);
        return this;
    }

    /**
     * Get standingOrder
     *
     * @return standingOrder
     **/
    @JsonProperty("StandingOrder")
    @ApiModelProperty(value = "")
    public List<OBStandingOrder5> getStandingOrder() {
        return standingOrder;
    }

    public void setStandingOrder(List<OBStandingOrder5> standingOrder) {
        this.standingOrder = standingOrder;
    }

    @Override
    public int hashCode() {
        return Objects.hash(standingOrder);
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadStandingOrder5Data obReadStandingOrder5Data = (OBReadStandingOrder5Data) o;
        return Objects.equals(this.standingOrder, obReadStandingOrder5Data.standingOrder);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadStandingOrder5Data {\n");

        sb.append("    standingOrder: ").append(toIndentedString(standingOrder)).append("\n");
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

