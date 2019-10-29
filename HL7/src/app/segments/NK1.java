package app.segments;

import java.time.LocalDate;
import java.time.LocalDateTime;

import app.datatypes.XAD;
import app.datatypes.XPN;
import app.datatypes.XTN;

/**
 * Java representation of segment "NK1" from HL7 protocol. Visit <a href=
 * "http://hl7-definition.caristix.com:9010/Default.aspx?version=HL7+v2.5.1&segment=NK1">HL7
 * documentation</a> for more info.
 * 
 * @author Thomas Biedermann
 * @author Daniel Karner
 * @version 1.1
 * @since 2019-10-27
 */

public class NK1 
{
    private long setIDNK1;
    private XPN nKName;
    private String relationship;
    private XAD address;
    private XTN phoneNumber;
    private XTN businessPhoneNumber;
    private String contactRole;
    private LocalDate startDate;
    private LocalDate endDate;
    private String nextofKinAssociatedPartiesJobTitle;
    private String nextofKinAssociatedPartiesJobCodeClass;
    private String nextofKinAssociatedPartiesEmployeeNumber;
    private String organizationNameNK1;
    private String maritalStatus;
    private String administrativeSex;
    private LocalDateTime dateTimeofBirth;
    private String livingDependency;
    private String ambulatoryStatus;
    private String citizenship;
    private String primaryLanguage;
    private String livingArrangement;
    private String publicityCode;
    private String protectionIndicator;
    private String studentIndicator;
    private String religion;
    private XPN mothersMaidenName;
    private String nationality;
    private String ethnicGroup;
    private String contactReason;
    private XPN contactPersonsName;
    private XTN contactPersonsTelephoneNumber;
    private XAD contactPersonsAddress;
    private String nextofKinAssociatedPartysIdentifiers;
    private String jobStatus;
    private String race;
    private String handicap;
    private String contactPersonSocialSecurityNumber;
    private String nextofKinBirthPlace;
    private String vIPIndicator;

    /**
     * @param setIDNK1
     * @param nKName
     * @param relationship
     * @param address
     * @param phoneNumber
     * @param businessPhoneNumber
     * @param contactRole
     * @param startDate
     * @param endDate
     * @param nextofKinAssociatedPartiesJobTitle
     * @param nextofKinAssociatedPartiesJobCodeClass
     * @param nextofKinAssociatedPartiesEmployeeNumber
     * @param organizationNameNK1
     * @param maritalStatus
     * @param administrativeSex
     * @param dateTimeofBirth
     * @param livingDependency
     * @param ambulatoryStatus
     * @param citizenship
     * @param primaryLanguage
     * @param livingArrangement
     * @param publicityCode
     * @param protectionIndicator
     * @param studentIndicator
     * @param religion
     * @param mothersMaidenName
     * @param nationality
     * @param ethnicGroup
     * @param contactReason
     * @param contactPersonsName
     * @param contactPersonsTelephoneNumber
     * @param contactPersonsAddress
     * @param nextofKinAssociatedPartysIdentifiers
     * @param jobStatus
     * @param race
     * @param handicap
     * @param contactPersonSocialSecurityNumber
     * @param nextofKinBirthPlace
     * @param vIPIndicator
     */

    public NK1( 
        long setIDNK1, 
        XPN nKName, 
        String relationship, 
        XAD address, 
        XTN phoneNumber,
        XTN businessPhoneNumber, 
        String contactRole, 
        LocalDate startDate, 
        LocalDate endDate,
        String nextofKinAssociatedPartiesJobTitle, 
        String nextofKinAssociatedPartiesJobCodeClass,
        String nextofKinAssociatedPartiesEmployeeNumber, 
        String organizationNameNK1,
        String maritalStatus, 
        String administrativeSex, 
        LocalDateTime dateTimeofBirth,
        String livingDependency, 
        String ambulatoryStatus, 
        String citizenship, 
        String primaryLanguage,
        String livingArrangement, 
        String publicityCode, 
        String protectionIndicator, 
        String studentIndicator,
        String religion, 
        XPN mothersMaidenName, 
        String nationality, 
        String ethnicGroup, 
        String contactReason,
        XPN contactPersonsName, 
        XTN contactPersonsTelephoneNumber, 
        XAD contactPersonsAddress,
        String nextofKinAssociatedPartysIdentifiers, 
        String jobStatus, 
        String race, 
        String handicap,
        String contactPersonSocialSecurityNumber, 
        String nextofKinBirthPlace, 
        String vIPIndicator) 
        {

        this.setIDNK1 = setIDNK1;
        this.nKName = nKName;
        this.relationship = relationship;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.businessPhoneNumber = businessPhoneNumber;
        this.contactRole = contactRole;
        this.startDate = startDate;
        this.endDate = endDate;
        this.nextofKinAssociatedPartiesJobTitle = nextofKinAssociatedPartiesJobTitle;
        this.nextofKinAssociatedPartiesJobCodeClass = nextofKinAssociatedPartiesJobCodeClass;
        this.nextofKinAssociatedPartiesEmployeeNumber = nextofKinAssociatedPartiesEmployeeNumber;
        this.organizationNameNK1 = organizationNameNK1;
        this.maritalStatus = maritalStatus;
        this.administrativeSex = administrativeSex;
        this.dateTimeofBirth = dateTimeofBirth;
        this.livingDependency = livingDependency;
        this.ambulatoryStatus = ambulatoryStatus;
        this.citizenship = citizenship;
        this.primaryLanguage = primaryLanguage;
        this.livingArrangement = livingArrangement;
        this.publicityCode = publicityCode;
        this.protectionIndicator = protectionIndicator;
        this.studentIndicator = studentIndicator;
        this.religion = religion;
        this.mothersMaidenName = mothersMaidenName;
        this.nationality = nationality;
        this.ethnicGroup = ethnicGroup;
        this.contactReason = contactReason;
        this.contactPersonsName = contactPersonsName;
        this.contactPersonsTelephoneNumber = contactPersonsTelephoneNumber;
        this.contactPersonsAddress = contactPersonsAddress;
        this.nextofKinAssociatedPartysIdentifiers = nextofKinAssociatedPartysIdentifiers;
        this.jobStatus = jobStatus;
        this.race = race;
        this.handicap = handicap;
        this.contactPersonSocialSecurityNumber = contactPersonSocialSecurityNumber;
        this.nextofKinBirthPlace = nextofKinBirthPlace;
        this.vIPIndicator = vIPIndicator;
    }
}