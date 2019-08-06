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
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OBReadParty1DataParty
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-07-10T09:14:46.696896+02:00[Europe/Budapest]")
public class OBReadParty1DataParty {
    @JsonProperty("PartyNumber")
    private String partyNumber = null;

    @JsonProperty("PartyId")
    private String partyId = null;

    @JsonProperty("Address")
    private List<OBParty2Address> address = null;

    @JsonProperty("Phone")
    private String phone = null;

    @JsonProperty("Mobile")
    private String mobile = null;

    @JsonProperty("PartyType")
    private OBExternalPartyType1Code partyType = null;

    @JsonProperty("EmailAddress")
    private String emailAddress = null;

    @JsonProperty("Name")
    private String name = null;

    public OBReadParty1DataParty partyNumber(String partyNumber) {
        this.partyNumber = partyNumber;
        return this;
    }

    /**
     * Number assigned by an agent to identify its customer.
     *
     * @return partyNumber
     **/
    @JsonProperty("PartyNumber")
    @ApiModelProperty(value = "Number assigned by an agent to identify its customer.")
    @Size(min = 1, max = 35)
    public String getPartyNumber() {
        return partyNumber;
    }

    public void setPartyNumber(String partyNumber) {
        this.partyNumber = partyNumber;
    }

    public OBReadParty1DataParty partyId(String partyId) {
        this.partyId = partyId;
        return this;
    }

    /**
     * A unique and immutable identifier used to identify the customer resource. This identifier has no meaning to the account owner.
     *
     * @return partyId
     **/
    @JsonProperty("PartyId")
    @ApiModelProperty(value = "A unique and immutable identifier used to identify the customer resource. This identifier has no meaning to the account owner.")
    @Size(min = 1, max = 40)
    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public OBReadParty1DataParty address(List<OBParty2Address> address) {
        this.address = address;
        return this;
    }

    public OBReadParty1DataParty addAddressItem(OBParty2Address addressItem) {
        if (this.address == null) {
            this.address = new ArrayList<>();
        }
        this.address.add(addressItem);
        return this;
    }

    /**
     * Get address
     *
     * @return address
     **/
    @JsonProperty("Address")
    @ApiModelProperty(value = "")
    public List<OBParty2Address> getAddress() {
        return address;
    }

    public void setAddress(List<OBParty2Address> address) {
        this.address = address;
    }

    public OBReadParty1DataParty phone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Collection of information that identifies a phone number, as defined by telecom services.
     *
     * @return phone
     **/
    @JsonProperty("Phone")
    @ApiModelProperty(value = "Collection of information that identifies a phone number, as defined by telecom services.")
    @Pattern(regexp = "\\+[0-9]{1,3}-[0-9()+\\-]{1,30}")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public OBReadParty1DataParty mobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    /**
     * Collection of information that identifies a mobile phone number, as defined by telecom services.
     *
     * @return mobile
     **/
    @JsonProperty("Mobile")
    @ApiModelProperty(value = "Collection of information that identifies a mobile phone number, as defined by telecom services.")
    @Pattern(regexp = "\\+[0-9]{1,3}-[0-9()+\\-]{1,30}")
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public OBReadParty1DataParty partyType(OBExternalPartyType1Code partyType) {
        this.partyType = partyType;
        return this;
    }

    /**
     * Get partyType
     *
     * @return partyType
     **/
    @JsonProperty("PartyType")
    @ApiModelProperty(value = "")
    public OBExternalPartyType1Code getPartyType() {
        return partyType;
    }

    public void setPartyType(OBExternalPartyType1Code partyType) {
        this.partyType = partyType;
    }

    public OBReadParty1DataParty emailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    /**
     * Address for electronic mail (e-mail).
     *
     * @return emailAddress
     **/
    @JsonProperty("EmailAddress")
    @ApiModelProperty(value = "Address for electronic mail (e-mail).")
    @Size(min = 1, max = 256)
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public OBReadParty1DataParty name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name by which a party is known and which is usually used to identify that party.
     *
     * @return name
     **/
    @JsonProperty("Name")
    @ApiModelProperty(value = "Name by which a party is known and which is usually used to identify that party.")
    @Size(min = 1, max = 70)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(partyNumber, partyId, address, phone, mobile, partyType, emailAddress, name);
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadParty1DataParty obReadParty1DataParty = (OBReadParty1DataParty) o;
        return Objects.equals(this.partyNumber, obReadParty1DataParty.partyNumber) &&
                Objects.equals(this.partyId, obReadParty1DataParty.partyId) &&
                Objects.equals(this.address, obReadParty1DataParty.address) &&
                Objects.equals(this.phone, obReadParty1DataParty.phone) &&
                Objects.equals(this.mobile, obReadParty1DataParty.mobile) &&
                Objects.equals(this.partyType, obReadParty1DataParty.partyType) &&
                Objects.equals(this.emailAddress, obReadParty1DataParty.emailAddress) &&
                Objects.equals(this.name, obReadParty1DataParty.name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadParty1DataParty {\n");

        sb.append("    partyNumber: ").append(toIndentedString(partyNumber)).append("\n");
        sb.append("    partyId: ").append(toIndentedString(partyId)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
        sb.append("    partyType: ").append(toIndentedString(partyType)).append("\n");
        sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

