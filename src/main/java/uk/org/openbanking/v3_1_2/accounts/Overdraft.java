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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Borrowing details
 */
@ApiModel(description = "Borrowing details")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-07-10T09:14:46.696896+02:00[Europe/Budapest]")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Overdraft {
    @JsonProperty("OverdraftTierBandSet")
    private List<OverdraftOverdraftTierBandSet> overdraftTierBandSet = null;

    @JsonProperty("Notes")
    private List<String> notes = null;

    public Overdraft overdraftTierBandSet(List<OverdraftOverdraftTierBandSet> overdraftTierBandSet) {
        this.overdraftTierBandSet = overdraftTierBandSet;
        return this;
    }

    public Overdraft addOverdraftTierBandSetItem(OverdraftOverdraftTierBandSet overdraftTierBandSetItem) {
        if (this.overdraftTierBandSet == null) {
            this.overdraftTierBandSet = new ArrayList<>();
        }
        this.overdraftTierBandSet.add(overdraftTierBandSetItem);
        return this;
    }

    /**
     * Tier band set details
     *
     * @return overdraftTierBandSet
     **/
    @JsonProperty("OverdraftTierBandSet")
    @ApiModelProperty(value = "Tier band set details")
    @Size(min = 1)
    public List<OverdraftOverdraftTierBandSet> getOverdraftTierBandSet() {
        return overdraftTierBandSet;
    }

    public void setOverdraftTierBandSet(List<OverdraftOverdraftTierBandSet> overdraftTierBandSet) {
        this.overdraftTierBandSet = overdraftTierBandSet;
    }

    public Overdraft notes(List<String> notes) {
        this.notes = notes;
        return this;
    }

    public Overdraft addNotesItem(String notesItem) {
        if (this.notes == null) {
            this.notes = new ArrayList<>();
        }
        this.notes.add(notesItem);
        return this;
    }

    /**
     * Associated Notes about the overdraft rates
     *
     * @return notes
     **/
    @JsonProperty("Notes")
    @ApiModelProperty(value = "Associated Notes about the overdraft rates")
    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(overdraftTierBandSet, notes);
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Overdraft overdraft = (Overdraft) o;
        return Objects.equals(this.overdraftTierBandSet, overdraft.overdraftTierBandSet) &&
                Objects.equals(this.notes, overdraft.notes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Overdraft {\n");

        sb.append("    overdraftTierBandSet: ").append(toIndentedString(overdraftTierBandSet)).append("\n");
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
}

