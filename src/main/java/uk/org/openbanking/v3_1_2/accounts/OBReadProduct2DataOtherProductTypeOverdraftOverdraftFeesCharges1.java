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

import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Overdraft fees and charges details
 */
@ApiModel(description = "Overdraft fees and charges details")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-07-10T09:14:46.696896+02:00[Europe/Budapest]")
public class OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges1 {
    @JsonProperty("OverdraftFeeChargeCap")
    private List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap> overdraftFeeChargeCap = null;

    @JsonProperty("OverdraftFeeChargeDetail")
    private List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail> overdraftFeeChargeDetail = null;

    public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges1 overdraftFeeChargeCap(
            List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap> overdraftFeeChargeCap) {
        this.overdraftFeeChargeCap = overdraftFeeChargeCap;
        return this;
    }

    public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges1 addOverdraftFeeChargeCapItem(
            OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap overdraftFeeChargeCapItem) {
        if (this.overdraftFeeChargeCap == null) {
            this.overdraftFeeChargeCap = new ArrayList<>();
        }
        this.overdraftFeeChargeCap.add(overdraftFeeChargeCapItem);
        return this;
    }

    /**
     * Get overdraftFeeChargeCap
     *
     * @return overdraftFeeChargeCap
     **/
    @JsonProperty("OverdraftFeeChargeCap")
    @ApiModelProperty(value = "")
    public List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap> getOverdraftFeeChargeCap() {
        return overdraftFeeChargeCap;
    }

    public void setOverdraftFeeChargeCap(
            List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap> overdraftFeeChargeCap) {
        this.overdraftFeeChargeCap = overdraftFeeChargeCap;
    }

    public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges1 overdraftFeeChargeDetail(
            List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail> overdraftFeeChargeDetail) {
        this.overdraftFeeChargeDetail = overdraftFeeChargeDetail;
        return this;
    }

    public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges1 addOverdraftFeeChargeDetailItem(OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail overdraftFeeChargeDetailItem) {
        if (this.overdraftFeeChargeDetail == null) {
            this.overdraftFeeChargeDetail = new ArrayList<>();
        }
        this.overdraftFeeChargeDetail.add(overdraftFeeChargeDetailItem);
        return this;
    }

    /**
     * Get overdraftFeeChargeDetail
     *
     * @return overdraftFeeChargeDetail
     **/
    @JsonProperty("OverdraftFeeChargeDetail")
    @ApiModelProperty(value = "")
    @Size(min = 1)
    public List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail> getOverdraftFeeChargeDetail() {
        return overdraftFeeChargeDetail;
    }

    public void setOverdraftFeeChargeDetail(
            List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail> overdraftFeeChargeDetail) {
        this.overdraftFeeChargeDetail = overdraftFeeChargeDetail;
    }

    @Override
    public int hashCode() {
        return Objects.hash(overdraftFeeChargeCap, overdraftFeeChargeDetail);
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges1 obReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges1 = (OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges1) o;
        return Objects
                .equals(this.overdraftFeeChargeCap, obReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges1.overdraftFeeChargeCap) &&
                Objects.equals(this.overdraftFeeChargeDetail, obReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges1.overdraftFeeChargeDetail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges1 {\n");

        sb.append("    overdraftFeeChargeCap: ").append(toIndentedString(overdraftFeeChargeCap)).append("\n");
        sb.append("    overdraftFeeChargeDetail: ").append(toIndentedString(overdraftFeeChargeDetail)).append("\n");
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
