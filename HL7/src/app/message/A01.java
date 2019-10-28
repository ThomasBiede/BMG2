package app.message;

import java.util.Set;

import app.segments.DG1;
import app.segments.EVN;
import app.segments.MSH;
import app.segments.NK1;
import app.segments.PID;
import app.segments.PV1;

/**
 * Java representation of trigger event "ADT_A01" from HL7 protocol. Visit <a href=
 * "http://hl7-definition.caristix.com:9010/Default.aspx?version=HL7+v2.5.1&triggerEvent=ADT_A01">HL7
 * documentation</a> for more info.
 * 
 * @author Thomas Biedermann
 * @author Daniel Karner
 * @version 1.1
 * @since 2019-10-27
 */

public class A01 
{
    // Fields
    private MSH messageHeader;
    private Object softwareSegment;
    private EVN eventType;
    private PID patientIdentification;
    private Object patientAdditionalDemographic;
    private Object role;
    private Set<NK1> nextofKinAssociatedParties;
    private PV1 patientVisit;
    private Object patientVisit1;
    private Object role1;
    private Object disability;
    private Object observationResult;
    private Object patientAllergyInformation;
    private Set<DG1> diagnosis;
    private Object diagnosisRelatedGroup;
    // Procedures
    private Object procedures;
    private Object role2;
    private Object guarantor;
    // Insurance
    private Object insurance;
    private Object insuranceAdditionalInformation;
    private Object insuranceAdditionalInformationCertification;
    private Object role3;
    private Object accident;
    private Object uB82;
    private Object uB92Data;
    private Object patientDeathandAutopsy;

    /**
    * @param messageHeader
    * @param softwareSegment
    * @param eventType
    * @param patientIdentification
    * @param patientAdditionalDemographic
    * @param role
    * @param nextofKinAssociatedParties
    * @param patientVisit
    * @param patientVisit1
    * @param role1
    * @param disability
    * @param observationResult
    * @param patientAllergyInformation
    * @param diagnosis
    * @param diagnosisRelatedGroup
    * @param procedures
    * @param role2
    * @param guarantor
    * @param insurance
    * @param insuranceAdditionalInformation
    * @param insuranceAdditionalInformationCertification
    * @param role3
    * @param accident
    * @param uB82
    * @param uB92Data
    * @param patientDeathandAutopsy
    * @return A01 instance
    */

    public A01(
        MSH messageHeader, 
        Object softwareSegment, 
        EVN eventType, 
        PID patientIdentification,
        Object patientAdditionalDemographic, 
        Object role, 
        Set<NK1> nextofKinAssociatedParties, 
        PV1 patientVisit,
        Object patientVisit1, 
        Object role1, 
        Object disability, 
        Object observationResult,
        Object patientAllergyInformation, 
        Set<DG1> diagnosis, 
        Object diagnosisRelatedGroup, 
        Object procedures,
        Object role2, 
        Object guarantor, 
        Object insurance, 
        Object insuranceAdditionalInformation,
        Object insuranceAdditionalInformationCertification, 
        Object role3, 
        Object accident, 
        Object uB82,
        Object uB92Data, 
        Object patientDeathandAutopsy) 
        {
        this.messageHeader = messageHeader;
        this.softwareSegment = softwareSegment;
        this.eventType = eventType;
        this.patientIdentification = patientIdentification;
        this.patientAdditionalDemographic = patientAdditionalDemographic;
        this.role = role;
        this.nextofKinAssociatedParties = nextofKinAssociatedParties;
        this.patientVisit = patientVisit;
        this.patientVisit1 = patientVisit1;
        this.role1 = role1;
        this.disability = disability;
        this.observationResult = observationResult;
        this.patientAllergyInformation = patientAllergyInformation;
        this.diagnosis = diagnosis;
        this.diagnosisRelatedGroup = diagnosisRelatedGroup;
        this.procedures = procedures;
        this.role2 = role2;
        this.guarantor = guarantor;
        this.insurance = insurance;
        this.insuranceAdditionalInformation = insuranceAdditionalInformation;
        this.insuranceAdditionalInformationCertification = insuranceAdditionalInformationCertification;
        this.role3 = role3;
        this.accident = accident;
        this.uB82 = uB82;
        this.uB92Data = uB92Data;
        this.patientDeathandAutopsy = patientDeathandAutopsy;
    }
}