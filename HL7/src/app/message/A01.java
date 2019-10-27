package app.message;

import java.util.Set;

import app.segments.DG1;
import app.segments.EVN;
import app.segments.MSH;
import app.segments.NK1;
import app.segments.PID;
import app.segments.PV1;

/**
 * A01
 */
public class A01 {

    /**
     * * Fields
     */
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

    /**
     * *Procedures
     */
    private Object procedures;
    private Object role2;
    private Object guarantor;

    /**
     * *Insurance
     */
    private Object insurance;
    private Object insuranceAdditionalInformation;
    private Object insuranceAdditionalInformationCertification;
    private Object role3;
    private Object accident;
    private Object uB82;
    private Object uB92Data;
    private Object patientDeathandAutopsy;

    public A01(MSH messageHeader, Object softwareSegment, EVN eventType, PID patientIdentification,
            Object patientAdditionalDemographic, Object role, Set<NK1> nextofKinAssociatedParties, PV1 patientVisit,
            Object patientVisit1, Object role1, Object disability, Object observationResult,
            Object patientAllergyInformation, Set<DG1> diagnosis, Object diagnosisRelatedGroup, Object procedures,
            Object role2, Object guarantor, Object insurance, Object insuranceAdditionalInformation,
            Object insuranceAdditionalInformationCertification, Object role3, Object accident, Object uB82,
            Object uB92Data, Object patientDeathandAutopsy) {
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