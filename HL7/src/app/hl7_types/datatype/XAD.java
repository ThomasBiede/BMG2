package app.hl7_types.datatype;

import java.time.LocalDate;

import app.hl7_parser.XmlField;
import app.hl7_parser.XmlSerializeable;
import app.parsing.EncodingCharacters;
import app.parsing.Utils;

/**
 * @author Thomas Biedermann
 * @author Daniel Karner
 *
 */
@XmlSerializeable
public class XAD {
    @XmlField
    String streetAddress;
    @XmlField
    String otherDesignation;
    @XmlField
    String city;
    @XmlField
    String stateOrProvince;
    @XmlField
    String zipOrPostalCode;
    @XmlField
    String country;
    @XmlField
    String addressType;
    @XmlField
    String otherGeographicDesignation;
    @XmlField
    String countyParishCode;
    @XmlField
    String censusTract;
    @XmlField
    String addressRepresentationCode;
    @XmlField
    Object addressValidityRange;
    @XmlField
    LocalDate effectiveDate;
    @XmlField
    LocalDate expirationDate;

    /**
     * @param streetAddress
     * @param otherDesignation
     * @param city
     * @param stateOrProvince
     * @param zipOrPostalCode
     * @param country
     * @param addressType
     * @param otherGeographicDesignation
     * @param countyParishCode
     * @param censusTract
     * @param addressRepresentationCode
     * @param addressValidityRange
     * @param effectiveDate
     * @param expirationDate
     */
    public XAD(String streetAddress, String otherDesignation, String city, String stateOrProvince,
            String zipOrPostalCode, String country, String addressType, String otherGeographicDesignation,
            String countyParishCode, String censusTract, String addressRepresentationCode, Object addressValidityRange,
            LocalDate effectiveDate, LocalDate expirationDate) {

        this.streetAddress = streetAddress;
        this.otherDesignation = otherDesignation;
        this.city = city;
        this.stateOrProvince = stateOrProvince;
        this.zipOrPostalCode = zipOrPostalCode;
        this.country = country;
        this.addressType = addressType;
        this.otherGeographicDesignation = otherGeographicDesignation;
        this.countyParishCode = countyParishCode;
        this.censusTract = censusTract;
        this.addressRepresentationCode = addressRepresentationCode;
        this.addressValidityRange = addressValidityRange;
        this.effectiveDate = effectiveDate;
        this.expirationDate = expirationDate;
    }

    /**
     * @param HL7String
     * @param encodingCharacters
     */
    public XAD(String HL7String, EncodingCharacters encodingCharacters) {
        String[] tokens = Utils.tokenizeHL7(HL7String, encodingCharacters.getComponentSeperator(),
                encodingCharacters.getEscapeCharacter(), 14);
        this.streetAddress = tokens[0];
        this.otherDesignation = tokens[1];
        this.city = tokens[2];
        this.stateOrProvince = tokens[3];
        this.zipOrPostalCode = tokens[4];
        this.country = tokens[5];
        this.addressType = tokens[6];
        this.otherGeographicDesignation = tokens[7];
        this.countyParishCode = tokens[8];
        this.censusTract = tokens[9];
        this.addressRepresentationCode = tokens[10];
        this.addressValidityRange = tokens[11];
        this.effectiveDate = (LocalDate) Utils.toObject(tokens[12], LocalDate.class);
        this.expirationDate = (LocalDate) Utils.toObject(tokens[13], LocalDate.class);
    }

    @Override
    public String toString() {
        // TODO: Auto-generated, replace with HL7parse
        return "XAD [streetAddress=" + streetAddress + ", otherDesignation=" + otherDesignation + ", city=" + city
                + ", stateOrProvince=" + stateOrProvince + ", zipOrPostalCode=" + zipOrPostalCode + ", country="
                + country + ", addressType=" + addressType + ", otherGeographicDesignation="
                + otherGeographicDesignation + ", countyParishCode=" + countyParishCode + ", censusTract=" + censusTract
                + ", addressRepresentationCode=" + addressRepresentationCode + ", addressValidityRange="
                + addressValidityRange + ", effectiveDate=" + effectiveDate + ", expirationDate=" + expirationDate
                + "]";
    }

    /**
     * @return the addressRepresentationCode
     */
    public String getAddressRepresentationCode() {
        return addressRepresentationCode;
    }

    /**
     * @return the addressType
     */
    public String getAddressType() {
        return addressType;
    }

    /**
     * @return the addressValidityRange
     */
    public Object getAddressValidityRange() {
        return addressValidityRange;
    }

    /**
     * @return the censusTract
     */
    public String getCensusTract() {
        return censusTract;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @return the countyParishCode
     */
    public String getCountyParishCode() {
        return countyParishCode;
    }

    /**
     * @return the effectiveDate
     */
    public LocalDate getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * @return the expirationDate
     */
    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    /**
     * @return the otherDesignation
     */
    public String getOtherDesignation() {
        return otherDesignation;
    }

    /**
     * @return the otherGeographicDesignation
     */
    public String getOtherGeographicDesignation() {
        return otherGeographicDesignation;
    }

    /**
     * @return the stateOrProvince
     */
    public String getStateOrProvince() {
        return stateOrProvince;
    }

    /**
     * @return the streetAddress
     */
    public String getStreetAddress() {
        return streetAddress;
    }

    /**
     * @return the zipOrPostalCode
     */
    public String getZipOrPostalCode() {
        return zipOrPostalCode;
    }
}