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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The group of tiers or bands for which debit interest can be applied.
 */
@ApiModel(description = "The group of tiers or bands for which debit interest can be applied.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-07-10T09:14:46.696896+02:00[Europe/Budapest]")
public class OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet {
    @JsonProperty("TierBandMethod")
    private TierBandMethodEnum                                                          tierBandMethod          = null;
    @JsonProperty("CalculationMethod")
    private OBInterestCalculationMethod1Code                                            calculationMethod       = null;
    @JsonProperty("LoanInterestTierBand")
    private List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand>    loanInterestTierBand    = null;
    @JsonProperty("LoanInterestFeesCharges")
    private List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges> loanInterestFeesCharges = null;
    @JsonProperty("Identification")
    private String                                                                      identification          = null;
    @JsonProperty("OtherCalculationMethod")
    private OBOtherCodeType10                                                           otherCalculationMethod  = null;
    @JsonProperty("Notes")
    private List<String>                                                                notes                   = null;

    public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet tierBandMethod(TierBandMethodEnum tierBandMethod) {
        this.tierBandMethod = tierBandMethod;
        return this;
    }

    /**
     * The methodology of how credit interest is charged. It can be:- 1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases. 2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance. 3. Whole The same interest rate is applied irrespective of the SME Loan balance
     *
     * @return tierBandMethod
     **/
    @JsonProperty("TierBandMethod")
    @ApiModelProperty(value = "The methodology of how credit interest is charged. It can be:- 1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases. 2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance. 3. Whole The same interest rate is applied irrespective of the SME Loan balance")
    public TierBandMethodEnum getTierBandMethod() {
        return tierBandMethod;
    }

    public void setTierBandMethod(TierBandMethodEnum tierBandMethod) {
        this.tierBandMethod = tierBandMethod;
    }

    public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet calculationMethod(
            OBInterestCalculationMethod1Code calculationMethod) {
        this.calculationMethod = calculationMethod;
        return this;
    }

    /**
     * Get calculationMethod
     *
     * @return calculationMethod
     **/
    @JsonProperty("CalculationMethod")
    @ApiModelProperty(value = "")
    public OBInterestCalculationMethod1Code getCalculationMethod() {
        return calculationMethod;
    }

    public void setCalculationMethod(OBInterestCalculationMethod1Code calculationMethod) {
        this.calculationMethod = calculationMethod;
    }

    public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet loanInterestTierBand(
            List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand> loanInterestTierBand) {
        this.loanInterestTierBand = loanInterestTierBand;
        return this;
    }

    public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet addLoanInterestTierBandItem(OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand loanInterestTierBandItem) {
        if (this.loanInterestTierBand == null) {
            this.loanInterestTierBand = new ArrayList<>();
        }
        this.loanInterestTierBand.add(loanInterestTierBandItem);
        return this;
    }

    /**
     * Get loanInterestTierBand
     *
     * @return loanInterestTierBand
     **/
    @JsonProperty("LoanInterestTierBand")
    @ApiModelProperty(value = "")
    @Size(min = 1)
    public List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand> getLoanInterestTierBand() {
        return loanInterestTierBand;
    }

    public void setLoanInterestTierBand(
            List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand> loanInterestTierBand) {
        this.loanInterestTierBand = loanInterestTierBand;
    }

    public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet loanInterestFeesCharges(
            List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges> loanInterestFeesCharges) {
        this.loanInterestFeesCharges = loanInterestFeesCharges;
        return this;
    }

    public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet addLoanInterestFeesChargesItem(OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges loanInterestFeesChargesItem) {
        if (this.loanInterestFeesCharges == null) {
            this.loanInterestFeesCharges = new ArrayList<>();
        }
        this.loanInterestFeesCharges.add(loanInterestFeesChargesItem);
        return this;
    }

    /**
     * Get loanInterestFeesCharges
     *
     * @return loanInterestFeesCharges
     **/
    @JsonProperty("LoanInterestFeesCharges")
    @ApiModelProperty(value = "")
    public List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges> getLoanInterestFeesCharges() {
        return loanInterestFeesCharges;
    }

    public void setLoanInterestFeesCharges(
            List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges> loanInterestFeesCharges) {
        this.loanInterestFeesCharges = loanInterestFeesCharges;
    }

    public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet identification(String identification) {
        this.identification = identification;
        return this;
    }

    /**
     * Loan interest tierbandset identification. Used by  loan providers for internal use purpose.
     *
     * @return identification
     **/
    @JsonProperty("Identification")
    @ApiModelProperty(value = "Loan interest tierbandset identification. Used by  loan providers for internal use purpose.")
    @Size(min = 1, max = 35)
    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet otherCalculationMethod(OBOtherCodeType10 otherCalculationMethod) {
        this.otherCalculationMethod = otherCalculationMethod;
        return this;
    }

    /**
     * Get otherCalculationMethod
     *
     * @return otherCalculationMethod
     **/
    @JsonProperty("OtherCalculationMethod")
    @ApiModelProperty(value = "")
    public OBOtherCodeType10 getOtherCalculationMethod() {
        return otherCalculationMethod;
    }

    public void setOtherCalculationMethod(OBOtherCodeType10 otherCalculationMethod) {
        this.otherCalculationMethod = otherCalculationMethod;
    }

    public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet notes(List<String> notes) {
        this.notes = notes;
        return this;
    }

    public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet addNotesItem(String notesItem) {
        if (this.notes == null) {
            this.notes = new ArrayList<>();
        }
        this.notes.add(notesItem);
        return this;
    }

    /**
     * Get notes
     *
     * @return notes
     **/
    @JsonProperty("Notes")
    @ApiModelProperty(value = "")
    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    @Override
    public int hashCode() {
        return Objects
                .hash(tierBandMethod, calculationMethod, loanInterestTierBand, loanInterestFeesCharges, identification, otherCalculationMethod, notes);
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet obReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet = (OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet) o;
        return Objects.equals(this.tierBandMethod, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet.tierBandMethod) &&
                Objects.equals(this.calculationMethod, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet.calculationMethod) &&
                Objects.equals(this.loanInterestTierBand, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet.loanInterestTierBand) &&
                Objects.equals(this.loanInterestFeesCharges, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet.loanInterestFeesCharges) &&
                Objects.equals(this.identification, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet.identification) &&
                Objects.equals(this.otherCalculationMethod, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet.otherCalculationMethod) &&
                Objects.equals(this.notes, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet.notes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet {\n");

        sb.append("    tierBandMethod: ").append(toIndentedString(tierBandMethod)).append("\n");
        sb.append("    calculationMethod: ").append(toIndentedString(calculationMethod)).append("\n");
        sb.append("    loanInterestTierBand: ").append(toIndentedString(loanInterestTierBand)).append("\n");
        sb.append("    loanInterestFeesCharges: ").append(toIndentedString(loanInterestFeesCharges)).append("\n");
        sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
        sb.append("    otherCalculationMethod: ").append(toIndentedString(otherCalculationMethod)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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
     * The methodology of how credit interest is charged. It can be:- 1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases. 2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance. 3. Whole The same interest rate is applied irrespective of the SME Loan balance
     */
    public enum TierBandMethodEnum {
        INBA("INBA"),

        INTI("INTI"),

        INWH("INWH");

        private String value;

        TierBandMethodEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static TierBandMethodEnum fromValue(String text) {
            for (TierBandMethodEnum b : TierBandMethodEnum.values()) {
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

