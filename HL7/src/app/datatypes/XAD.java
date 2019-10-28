package app.datatypes;

import java.time.LocalDate;

/**
 * Java representation of datatype "XAD" from HL7 protocol. Visit <a href=
 * "http://hl7-definition.caristix.com:9010/Default.aspx?version=HL7+v2.5.1&dataType=XAD">HL7
 * documentation</a> for more info.
 * 
 * @author Thomas Biedermann
 * @author Daniel Karner
 * @version 1.1
 * @since 2019-10-27
 */

public class XAD 
{
    private String streetAddress;
    private String otherDesignation;
    private String city;
    private String stateOrProvince;
    private String zipOrPostalCode;
    private String country;
    private String addressType;
    private String otherGeographicDesignation;
    private String countyParishCode;
    private String censusTract;
    private String addressRepresentationCode;
    private Object addressValidityRange;
    private LocalDate effectiveDate;
    private LocalDate expirationDate;

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
     * @return XAD instance
     */

    public XAD(
        String streetAddress, 
        String otherDesignation, 
        String city, 
        String stateOrProvince,
        String zipOrPostalCode, 
        String country, 
        String addressType, 
        String otherGeographicDesignation,
        String countyParishCode, 
        String censusTract, 
        String addressRepresentationCode, 
        Object addressValidityRange,
        LocalDate effectiveDate, 
        LocalDate expirationDate) 
        {

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
}