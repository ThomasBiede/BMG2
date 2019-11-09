package app.hl7_types.segment;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.stream.Collectors;

import app.hl7_parser.XmlField;
import app.hl7_parser.XmlSerializeable;
import app.hl7_types.datatype.*;
import app.parsing.EncodingCharacters;

import app.parsing.Utils;

/**
 * @author Thomas Biedermann
 * @author Daniel Karner
 */
@XmlSerializeable
public class PID {
    @XmlField
    String setIDPID;
    @XmlField
    String patientID;
    @XmlField
    Set<String> patientIdentifierList;
    @XmlField
    Set<String> alternatePatientIDPID;
    @XmlField
    Set<XPN> patientName;
    @XmlField
    Set<XPN> mothersMaidenName;
    @XmlField
    LocalDateTime dateTimeofBirth;
    @XmlField
    String administrativeSex;
    @XmlField
    Set<XPN> patientAlias;
    @XmlField
    Set<String> race;
    @XmlField
    Set<XAD> patientAddress;
    @XmlField
    String countyCode;
    @XmlField
    Set<XTN> phoneNumberHome;
    @XmlField
    Set<XTN> phoneNumberBusiness;
    @XmlField
    String primaryLanguage;
    @XmlField
    String maritalStatus;
    @XmlField
    String religion;
    @XmlField
    String patientAccountNumber;
    @XmlField
    String sSNNumberPatient;
    @XmlField
    long driversLicenseNumberPatient;
    @XmlField
    Set<String> mothersIdentifier;
    @XmlField
    Set<String> ethnicGroup;
    @XmlField
    String birthPlace;
    @XmlField
    String multipleBirthIndicator;
    @XmlField
    double birthOrder;
    @XmlField
    Set<String> citizenship;
    @XmlField
    String veteransMilitaryStatus;
    @XmlField
    String nationality;
    @XmlField
    LocalDateTime patientDeathDateandTime;
    @XmlField
    String patientDeathIndicator;
    @XmlField
    String identityUnknownIndicator;
    @XmlField
    Set<String> identityReliabilityCode;
    @XmlField
    LocalDateTime lastUpdateDateTime;
    @XmlField
    String lastUpdateFacility;
    @XmlField
    String speciesCode;
    @XmlField
    String breedCode;
    @XmlField
    String strain;
    @XmlField
    String productionClassCode;
    @XmlField
    Set<String> tribalCitizenship;

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
    public PID(String setIDPID, String patientID, Set<String> patientIdentifierList, Set<String> alternatePatientIDPID,
            Set<XPN> patientName, Set<XPN> mothersMaidenName, LocalDateTime dateTimeofBirth, String administrativeSex,
            Set<XPN> patientAlias, Set<String> race, Set<XAD> patientAddress, String countyCode,
            Set<XTN> phoneNumberHome, Set<XTN> phoneNumberBusiness, String primaryLanguage, String maritalStatus,
            String religion, String patientAccountNumber, String sSNNumberPatient, long driversLicenseNumberPatient,
            Set<String> mothersIdentifier, Set<String> ethnicGroup, String birthPlace, String multipleBirthIndicator,
            double birthOrder, Set<String> citizenship, String veteransMilitaryStatus, String nationality,
            LocalDateTime patientDeathDateandTime, String patientDeathIndicator, String identityUnknownIndicator,
            Set<String> identityReliabilityCode, LocalDateTime lastUpdateDateTime, String lastUpdateFacility,
            String speciesCode, String breedCode, String strain, String productionClassCode,
            Set<String> tribalCitizenship) {
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

    /**
     * @param HL7String
     * @param encodingCharacters
     */
    public PID(String HL7String, EncodingCharacters encodingCharacters) {
        String[] tokens = Utils.tokenizeHL7(HL7String, encodingCharacters.getFieldSeperator(),
                encodingCharacters.getEscapeCharacter(), 39);
        this.setIDPID = tokens[0];
        this.patientID = tokens[1];
        this.patientIdentifierList = Utils.toSet(tokens[2], String.class, encodingCharacters.getFieldRepeatSeperator())
                .stream().map(String::valueOf).collect(Collectors.toSet());
        this.alternatePatientIDPID = Utils.toSet(tokens[3], String.class, encodingCharacters.getFieldRepeatSeperator())
                .stream().map(String::valueOf).collect(Collectors.toSet());
        this.patientName = Utils
                .toSet(tokens[4], XPN.class, encodingCharacters.getFieldRepeatSeperator(), encodingCharacters).stream()
                .map(temp -> {
                    return (XPN) temp;
                }).collect(Collectors.toSet());
        this.mothersMaidenName = Utils
                .toSet(tokens[5], XPN.class, encodingCharacters.getFieldRepeatSeperator(), encodingCharacters).stream()
                .map(temp -> {
                    return (XPN) temp;
                }).collect(Collectors.toSet());
        this.dateTimeofBirth = (LocalDateTime) Utils.toObject(tokens[6], LocalDateTime.class);
        this.administrativeSex = tokens[7];
        this.patientAlias = Utils
                .toSet(tokens[8], XPN.class, encodingCharacters.getFieldRepeatSeperator(), encodingCharacters).stream()
                .map(temp -> {
                    return (XPN) temp;
                }).collect(Collectors.toSet());
        this.race = Utils
                .toSet(tokens[9], String.class, encodingCharacters.getFieldRepeatSeperator(), encodingCharacters)
                .stream().map(String::valueOf).collect(Collectors.toSet());
        this.patientAddress = Utils
                .toSet(tokens[10], XAD.class, encodingCharacters.getFieldRepeatSeperator(), encodingCharacters).stream()
                .map(temp -> {
                    return (XAD) temp;
                }).collect(Collectors.toSet());
        this.countyCode = tokens[11];
        this.phoneNumberHome = Utils
                .toSet(tokens[12], XTN.class, encodingCharacters.getFieldRepeatSeperator(), encodingCharacters).stream()
                .map(temp -> {
                    return (XTN) temp;
                }).collect(Collectors.toSet());
        this.phoneNumberBusiness = Utils
                .toSet(tokens[13], XTN.class, encodingCharacters.getFieldRepeatSeperator(), encodingCharacters).stream()
                .map(temp -> {
                    return (XTN) temp;
                }).collect(Collectors.toSet());
        this.primaryLanguage = tokens[14];
        this.maritalStatus = tokens[15];
        this.religion = tokens[16];
        this.patientAccountNumber = tokens[17];
        this.sSNNumberPatient = tokens[18];
        this.driversLicenseNumberPatient = (long) Utils.toObject(tokens[19], Long.class);
        this.mothersIdentifier = Utils
                .toSet(tokens[20], String.class, encodingCharacters.getFieldRepeatSeperator(), encodingCharacters)
                .stream().map(String::valueOf).collect(Collectors.toSet());
        this.ethnicGroup = Utils
                .toSet(tokens[21], String.class, encodingCharacters.getFieldRepeatSeperator(), encodingCharacters)
                .stream().map(String::valueOf).collect(Collectors.toSet());
        this.birthPlace = tokens[22];
        this.multipleBirthIndicator = tokens[23];
        this.birthOrder = (double) Utils.toObject(tokens[24], Double.class);
        this.citizenship = Utils
                .toSet(tokens[25], String.class, encodingCharacters.getFieldRepeatSeperator(), encodingCharacters)
                .stream().map(String::valueOf).collect(Collectors.toSet());
        this.veteransMilitaryStatus = tokens[26];
        this.nationality = tokens[27];
        this.patientDeathDateandTime = (LocalDateTime) Utils.toObject(tokens[28], LocalDateTime.class);
        this.patientDeathIndicator = tokens[29];
        this.identityUnknownIndicator = tokens[30];
        this.identityReliabilityCode = Utils
                .toSet(tokens[31], String.class, encodingCharacters.getFieldRepeatSeperator(), encodingCharacters)
                .stream().map(String::valueOf).collect(Collectors.toSet());
        this.lastUpdateDateTime = (LocalDateTime) Utils.toObject(tokens[32], LocalDateTime.class);
        this.lastUpdateFacility = tokens[33];
        this.speciesCode = tokens[34];
        this.breedCode = tokens[35];
        this.strain = tokens[36];
        this.productionClassCode = tokens[37];
        this.tribalCitizenship = Utils
                .toSet(tokens[38], String.class, encodingCharacters.getFieldRepeatSeperator(), encodingCharacters)
                .stream().map(String::valueOf).collect(Collectors.toSet());
    }

    @Override
    public String toString() {
        // TODO: Auto-generated, replace with HL7parse
        return "PID [setIDPID=" + setIDPID + ", patientID=" + patientID + ", patientIdentifierList="
                + patientIdentifierList + ", alternatePatientIDPID=" + alternatePatientIDPID + ", patientName="
                + patientName + ", mothersMaidenName=" + mothersMaidenName + ", dateTimeofBirth=" + dateTimeofBirth
                + ", administrativeSex=" + administrativeSex + ", patientAlias=" + patientAlias + ", race=" + race
                + ", patientAddress=" + patientAddress + ", countyCode=" + countyCode + ", phoneNumberHome="
                + phoneNumberHome + ", phoneNumberBusiness=" + phoneNumberBusiness + ", primaryLanguage="
                + primaryLanguage + ", maritalStatus=" + maritalStatus + ", religion=" + religion
                + ", patientAccountNumber=" + patientAccountNumber + ", sSNNumberPatient=" + sSNNumberPatient
                + ", driversLicenseNumberPatient=" + driversLicenseNumberPatient + ", mothersIdentifier="
                + mothersIdentifier + ", ethnicGroup=" + ethnicGroup + ", birthPlace=" + birthPlace
                + ", multipleBirthIndicator=" + multipleBirthIndicator + ", birthOrder=" + birthOrder + ", citizenship="
                + citizenship + ", veteransMilitaryStatus=" + veteransMilitaryStatus + ", nationality=" + nationality
                + ", patientDeathDateandTime=" + patientDeathDateandTime + ", patientDeathIndicator="
                + patientDeathIndicator + ", identityUnknownIndicator=" + identityUnknownIndicator
                + ", identityReliabilityCode=" + identityReliabilityCode + ", lastUpdateDateTime=" + lastUpdateDateTime
                + ", lastUpdateFacility=" + lastUpdateFacility + ", speciesCode=" + speciesCode + ", breedCode="
                + breedCode + ", strain=" + strain + ", productionClassCode=" + productionClassCode
                + ", tribalCitizenship=" + tribalCitizenship + "]";
    }

    /**
     * @return the administrativeSex
     */
    public String getAdministrativeSex() {
        return administrativeSex;
    }

    /**
     * @return the alternatePatientIDPID
     */
    public Set<String> getAlternatePatientIDPID() {
        return alternatePatientIDPID;
    }

    /**
     * @return the birthOrder
     */
    public double getBirthOrder() {
        return birthOrder;
    }

    /**
     * @return the birthPlace
     */
    public String getBirthPlace() {
        return birthPlace;
    }

    /**
     * @return the breedCode
     */
    public String getBreedCode() {
        return breedCode;
    }

    /**
     * @return the citizenship
     */
    public Set<String> getCitizenship() {
        return citizenship;
    }

    /**
     * @return the countyCode
     */
    public String getCountyCode() {
        return countyCode;
    }

    /**
     * @return the dateTimeofBirth
     */
    public LocalDateTime getDateTimeofBirth() {
        return dateTimeofBirth;
    }

    /**
     * @return the driversLicenseNumberPatient
     */
    public long getDriversLicenseNumberPatient() {
        return driversLicenseNumberPatient;
    }

    /**
     * @return the ethnicGroup
     */
    public Set<String> getEthnicGroup() {
        return ethnicGroup;
    }

    /**
     * @return the identityReliabilityCode
     */
    public Set<String> getIdentityReliabilityCode() {
        return identityReliabilityCode;
    }

    /**
     * @return the identityUnknownIndicator
     */
    public String getIdentityUnknownIndicator() {
        return identityUnknownIndicator;
    }

    /**
     * @return the lastUpdateDateTime
     */
    public LocalDateTime getLastUpdateDateTime() {
        return lastUpdateDateTime;
    }

    /**
     * @return the lastUpdateFacility
     */
    public String getLastUpdateFacility() {
        return lastUpdateFacility;
    }

    /**
     * @return the maritalStatus
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * @return the mothersIdentifier
     */
    public Set<String> getMothersIdentifier() {
        return mothersIdentifier;
    }

    /**
     * @return the mothersMaidenName
     */
    public Set<XPN> getMothersMaidenName() {
        return mothersMaidenName;
    }

    /**
     * @return the multipleBirthIndicator
     */
    public String getMultipleBirthIndicator() {
        return multipleBirthIndicator;
    }

    /**
     * @return the nationality
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * @return the patientAccountNumber
     */
    public String getPatientAccountNumber() {
        return patientAccountNumber;
    }

    /**
     * @return the patientAddress
     */
    public Set<XAD> getPatientAddress() {
        return patientAddress;
    }

    /**
     * @return the patientAlias
     */
    public Set<XPN> getPatientAlias() {
        return patientAlias;
    }

    /**
     * @return the patientDeathDateandTime
     */
    public LocalDateTime getPatientDeathDateandTime() {
        return patientDeathDateandTime;
    }

    /**
     * @return the patientDeathIndicator
     */
    public String getPatientDeathIndicator() {
        return patientDeathIndicator;
    }

    /**
     * @return the patientID
     */
    public String getPatientID() {
        return patientID;
    }

    /**
     * @return the patientIdentifierList
     */
    public Set<String> getPatientIdentifierList() {
        return patientIdentifierList;
    }

    /**
     * @return the patientName
     */
    public Set<XPN> getPatientName() {
        return patientName;
    }

    /**
     * @return the phoneNumberBusiness
     */
    public Set<XTN> getPhoneNumberBusiness() {
        return phoneNumberBusiness;
    }

    /**
     * @return the phoneNumberHome
     */
    public Set<XTN> getPhoneNumberHome() {
        return phoneNumberHome;
    }

    /**
     * @return the primaryLanguage
     */
    public String getPrimaryLanguage() {
        return primaryLanguage;
    }

    /**
     * @return the productionClassCode
     */
    public String getProductionClassCode() {
        return productionClassCode;
    }

    /**
     * @return the race
     */
    public Set<String> getRace() {
        return race;
    }

    /**
     * @return the religion
     */
    public String getReligion() {
        return religion;
    }

    /**
     * @return the setIDPID
     */
    public String getSetIDPID() {
        return setIDPID;
    }

    /**
     * @return the speciesCode
     */
    public String getSpeciesCode() {
        return speciesCode;
    }

    /**
     * @return the strain
     */
    public String getStrain() {
        return strain;
    }

    /**
     * @return the tribalCitizenship
     */
    public Set<String> getTribalCitizenship() {
        return tribalCitizenship;
    }

    /**
     * @return the veteransMilitaryStatus
     */
    public String getVeteransMilitaryStatus() {
        return veteransMilitaryStatus;
    }

    /**
     * @return the sSNNumberPatient
     */
    public String getsSNNumberPatient() {
        return sSNNumberPatient;
    }
}