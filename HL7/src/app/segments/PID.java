package app.segments;

import java.time.LocalDateTime;
import java.util.Set;

import app.datatypes.XAD;
import app.datatypes.XPN;
import app.datatypes.XTN;

/**
 * Java representation of segment "PID" from HL7 protocol. Visit <a href=
 * "http://hl7-definition.caristix.com:9010/Default.aspx?version=HL7+v2.5.1&segment=PID">HL7
 * documentation</a> for more info.
 * 
 * @author Thomas Biedermann
 * @author Daniel Karner
 * @version 1.1
 * @since 2019-10-27
 */

public class PID extends Segments
{
    private long setIDPID;
    private String patientID;
    private Set<String> patientIdentifierList;
    private Set<String> alternatePatientIDPID;
    private Set<XPN> patientName;
    private Set<XPN> mothersMaidenName;
    private LocalDateTime dateTimeofBirth;
    private String administrativeSex;
    private Set<XPN> patientAlias;
    private Set<String> race;
    private Set<XAD> patientAddress;
    private String countyCode;
    private Set<XTN> phoneNumberHome;
    private Set<XTN> phoneNumberBusiness;
    private String primaryLanguage;
    private String maritalStatus;
    private String religion;
    private String patientAccountNumber;
    private String sSNNumberPatient;
    private long driversLicenseNumberPatient;
    private Set<String> mothersIdentifier;
    private Set<String> ethnicGroup;
    private String birthPlace;
    private String multipleBirthIndicator;
    private double birthOrder;
    private Set<String> citizenship;
    private String veteransMilitaryStatus;
    private String nationality;
    private LocalDateTime patientDeathDateandTime;
    private String patientDeathIndicator;
    private String identityUnknownIndicator;
    private Set<String> identityReliabilityCode;
    private LocalDateTime lastUpdateDateTime;
    private String lastUpdateFacility;
    private String speciesCode;
    private String breedCode;
    private String strain;
    private String productionClassCode;
    private Set<String> tribalCitizenship;

    /**
     * @param setIDPID
     * @param patientID
     * @param patientIdentifierList
     * @param alternatePatientIDPID
     * @param patientName
     * @param mothersMaidenName
     * @param dateTimeofBirth
     * @param administrativeSex
     * @param patientAlias
     * @param race
     * @param patientAddress
     * @param countyCode
     * @param phoneNumberHome
     * @param phoneNumberBusiness
     * @param primaryLanguage
     * @param maritalStatus
     * @param religion
     * @param patientAccountNumber
     * @param sSNNumberPatient
     * @param driversLicenseNumberPatient
     * @param mothersIdentifier
     * @param ethnicGroup
     * @param birthPlace
     * @param multipleBirthIndicator
     * @param birthOrder
     * @param citizenship
     * @param veteransMilitaryStatus
     * @param nationality
     * @param patientDeathDateandTime
     * @param patientDeathIndicator
     * @param identityUnknownIndicator
     * @param identityReliabilityCode
     * @param lastUpdateDateTime
     * @param lastUpdateFacility
     * @param speciesCode
     * @param breedCode
     * @param strain
     * @param productionClassCode
     * @param tribalCitizenship
     */

    public PID(
        long setIDPID, 
        String patientID,  
        Set<String> patientIdentifierList,
        Set<String> alternatePatientIDPID,  
        Set<XPN> patientName, 
        Set<XPN> mothersMaidenName,
        LocalDateTime dateTimeofBirth, 
        String administrativeSex, 
        Set<XPN> patientAlias, 
        Set<String> race,
        Set<XAD> patientAddress, 
        String countyCode, 
        Set<XTN> phoneNumberHome,
        Set<XTN> phoneNumberBusiness, 
        String primaryLanguage, 
        String maritalStatus, 
        String religion,
        String patientAccountNumber, 
        String sSNNumberPatient, 
        long driversLicenseNumberPatient,
        Set<String> mothersIdentifier, 
        Set<String> ethnicGroup, 
        String birthPlace,
        String multipleBirthIndicator, 
        double birthOrder, 
        Set<String> citizenship,
        String veteransMilitaryStatus, 
        String nationality, 
        LocalDateTime patientDeathDateandTime,
        String patientDeathIndicator, 
        String identityUnknownIndicator, 
        Set<String> identityReliabilityCode,
        LocalDateTime lastUpdateDateTime, 
        String lastUpdateFacility, 
        String speciesCode, 
        String breedCode,
        String strain, 
        String productionClassCode, 
        Set<String> tribalCitizenship) 
        {

        this.setIDPID = setIDPID;
        this.patientID = patientID;
        this.patientIdentifierList = patientIdentifierList;
        this.alternatePatientIDPID = alternatePatientIDPID;
        this.patientName = patientName;
        this.mothersMaidenName = mothersMaidenName;
        this.dateTimeofBirth = dateTimeofBirth;
        this.administrativeSex = administrativeSex;
        this.patientAlias = patientAlias;
        this.race = race;
        this.patientAddress = patientAddress;
        this.countyCode = countyCode;
        this.phoneNumberHome = phoneNumberHome;
        this.phoneNumberBusiness = phoneNumberBusiness;
        this.primaryLanguage = primaryLanguage;
        this.maritalStatus = maritalStatus;
        this.religion = religion;
        this.patientAccountNumber = patientAccountNumber;
        this.sSNNumberPatient = sSNNumberPatient;
        this.driversLicenseNumberPatient = driversLicenseNumberPatient;
        this.mothersIdentifier = mothersIdentifier;
        this.ethnicGroup = ethnicGroup;
        this.birthPlace = birthPlace;
        this.multipleBirthIndicator = multipleBirthIndicator;
        this.birthOrder = birthOrder;
        this.citizenship = citizenship;
        this.veteransMilitaryStatus = veteransMilitaryStatus;
        this.nationality = nationality;
        this.patientDeathDateandTime = patientDeathDateandTime;
        this.patientDeathIndicator = patientDeathIndicator;
        this.identityUnknownIndicator = identityUnknownIndicator;
        this.identityReliabilityCode = identityReliabilityCode;
        this.lastUpdateDateTime = lastUpdateDateTime;
        this.lastUpdateFacility = lastUpdateFacility;
        this.speciesCode = speciesCode;
        this.breedCode = breedCode;
        this.strain = strain;
        this.productionClassCode = productionClassCode;
        this.tribalCitizenship = tribalCitizenship;
    }
}