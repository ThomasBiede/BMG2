package app.hl7_types.message;

import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import app.hl7_parser.Hl7Field;
import app.hl7_parser.Hl7Serializeable;
import app.hl7_types.segment.*;
import app.parsing.EncodingCharacters;
import app.parsing.Utils;

/**
 * @author Thomas Biedermann
 * @author Daniel Karner
 */
@Hl7Serializeable(layer=0)
public class ADT_A01 {
    // Fields
    @Hl7Field
    MSH messageHeader;
    @Hl7Field
    Set<String> softwareSegment = new HashSet<>();
    @Hl7Field
    EVN eventType;
    @Hl7Field
    PID patientIdentification;
    @Hl7Field
    PD1 patientAdditionalDemographic;
    @Hl7Field
    Set<String> role = new HashSet<>();
    @Hl7Field
    Set<NK1> nextofKinAssociatedParties = new HashSet<>();
    @Hl7Field
    PV1 patientVisit;
    @Hl7Field
    String patientVisitAdditionalInformation;
    @Hl7Field
    Set<String> role1 = new HashSet<>();
    @Hl7Field
    Set<String> disability = new HashSet<>();
    @Hl7Field
    Set<String> observationResult = new HashSet<>();
    @Hl7Field
    Set<String> patientAllergyInformation = new HashSet<>();
    @Hl7Field
    Set<DG1> diagnosis = new HashSet<>();
    @Hl7Field
    String diagnosisRelatedGroup;
    // Procedures
    @Hl7Field
    String procedures;
    @Hl7Field
    Set<String> role2 = new HashSet<>();
    @Hl7Field
    Set<String> guarantor = new HashSet<>();
    // Insurance
    @Hl7Field
    String insurance;
    @Hl7Field
    String insuranceAdditionalInformation;
    @Hl7Field
    Set<String> insuranceAdditionalInformationCertification = new HashSet<>();
    @Hl7Field
    Set<String> role3 = new HashSet<>();
    @Hl7Field
    String accident;
    @Hl7Field
    String uB82;
    @Hl7Field
    String uB92Data;
    @Hl7Field
    String patientDeathandAutopsy;

    /**
     * @param messageHeader
     * @param softwareSegment
     * @param eventType
     * @param patientIdentification
     * @param patientAdditionalDemographic
     * @param role
     * @param nextofKinAssociatedParties
     * @param patientVisit
     * @param patientVisitAdditionalInformation
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
     */
    public ADT_A01(MSH messageHeader, Set<String> softwareSegment, EVN eventType, PID patientIdentification,
            PD1 patientAdditionalDemographic, Set<String> role, Set<NK1> nextofKinAssociatedParties,
            PV1 patientVisit, String patientVisitAdditionalInformation, Set<String> role1, Set<String> disability,
            Set<String> observationResult, Set<String> patientAllergyInformation, Set<DG1> diagnosis,
            String diagnosisRelatedGroup, String procedures, Set<String> role2, Set<String> guarantor, String insurance,
            String insuranceAdditionalInformation, Set<String> insuranceAdditionalInformationCertification,
            Set<String> role3, String accident, String uB82, String uB92Data, String patientDeathandAutopsy) {
        this.messageHeader = messageHeader;
        this.softwareSegment = softwareSegment;
        this.eventType = eventType;
        this.patientIdentification = patientIdentification;
        this.patientAdditionalDemographic = patientAdditionalDemographic;
        this.role = role;
        this.nextofKinAssociatedParties = nextofKinAssociatedParties;
        this.patientVisit = patientVisit;
        this.patientVisitAdditionalInformation = patientVisitAdditionalInformation;
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

    /**
     * @param HL7String
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws IllegalArgumentException
     * @throws InvocationTargetException
     * @throws NoSuchMethodException
     * @throws SecurityException
     */
    int line;
    public ADT_A01(String HL7String) throws InstantiationException, IllegalAccessException, IllegalArgumentException,
            InvocationTargetException, NoSuchMethodException, SecurityException {
        // Spaghoot
        if (!HL7String.matches("^MSH|[\\s\\S]+"))
            return;
        EncodingCharacters encodingCharacters = Utils.getEncodingCharacters(HL7String);
        String[] segmentStrings = HL7String.split("\n");
        line = 0;

        if (line >= segmentStrings.length)
            return;
        if ((this.messageHeader = (MSH) Utils.objectFromMessageLine(segmentStrings[line], "MSH")) != null)
            line++;
        if (line >= segmentStrings.length)
            return;
        this.softwareSegment = Utils.allSegmentsFromGroup(segmentStrings, line, "SFT").stream().map(String::valueOf)
                .collect(Collectors.toSet());
        line += this.softwareSegment.size();
        if (line >= segmentStrings.length)
            return;
        if ((this.eventType = (EVN) Utils.objectFromMessageLine(segmentStrings[line], "EVN")) != null)
            line++;
        if (line >= segmentStrings.length)
            return;
        if ((this.patientIdentification = (PID) Utils.objectFromMessageLine(segmentStrings[line], "PID")) != null)
            line++;
        if (line >= segmentStrings.length)
            return;
        if ((this.patientAdditionalDemographic = (PD1) Utils.objectFromMessageLine(segmentStrings[line], "PD1")) != null)
            line++;
        if (line >= segmentStrings.length)
            return;
        this.role = Utils.allSegmentsFromGroup(segmentStrings, line, "ROL").stream().map(String::valueOf)
                .collect(Collectors.toSet());
        line += this.role.size();
        if (line >= segmentStrings.length)
            return;
        this.nextofKinAssociatedParties = Utils.allSegmentsFromGroup(segmentStrings, line, "NK1").stream().map(temp -> {
            line++;
            return new NK1(segmentStrings[line-1], encodingCharacters);
        }).collect(Collectors.toSet());
        // line += this.nextofKinAssociatedParties.size();
        if (line >= segmentStrings.length)
            return;
        if ((this.patientVisit = (PV1) Utils.objectFromMessageLine(segmentStrings[line], "PV1")) != null)
            line++;
        if (line >= segmentStrings.length)
            return;
        if ((this.patientVisitAdditionalInformation = (String) Utils.objectFromMessageLine(segmentStrings[line],
                "PV2")) != null)
            line++;
        if (line >= segmentStrings.length)
            return;
        this.role1 = Utils.allSegmentsFromGroup(segmentStrings, line, "ROL").stream().map(String::valueOf)
                .collect(Collectors.toSet());
        line += this.role1.size();
        if (line >= segmentStrings.length)
            return;
        this.disability = Utils.allSegmentsFromGroup(segmentStrings, line, "DB1").stream().map(String::valueOf)
                .collect(Collectors.toSet());
        line += this.disability.size();
        if (line >= segmentStrings.length)
            return;
        this.observationResult = Utils.allSegmentsFromGroup(segmentStrings, line, "OBX").stream().map(String::valueOf)
                .collect(Collectors.toSet());
        line += this.observationResult.size();
        if (line >= segmentStrings.length)
            return;
        this.patientAllergyInformation = Utils.allSegmentsFromGroup(segmentStrings, line, "AL1").stream()
                .map(String::valueOf).collect(Collectors.toSet());
        line += this.patientAllergyInformation.size();
        if (line >= segmentStrings.length)
            return;
        this.diagnosis = Utils.allSegmentsFromGroup(segmentStrings, line, "DG1").stream().map(temp -> {
            line++;
            return new DG1(segmentStrings[line-1], encodingCharacters);
        }).collect(Collectors.toSet());
        // line += this.diagnosis.size();
        if (line >= segmentStrings.length)
            return;
        if ((this.diagnosisRelatedGroup = (String) Utils.objectFromMessageLine(segmentStrings[line], "DRG")) != null)
            line++;
        if (line >= segmentStrings.length)
            return;
        if ((this.procedures = (String) Utils.objectFromMessageLine(segmentStrings[line], "PR1")) != null)
            line++;
        if (line >= segmentStrings.length)
            return;
        this.role2 = Utils.allSegmentsFromGroup(segmentStrings, line, "ROL").stream().map(String::valueOf)
                .collect(Collectors.toSet());
        line += this.role2.size();

        if (line >= segmentStrings.length)
            return;
        this.guarantor = Utils.allSegmentsFromGroup(segmentStrings, line, "GT1").stream().map(String::valueOf)
                .collect(Collectors.toSet());
        line += this.guarantor.size();

        if (line >= segmentStrings.length)
            return;
        if ((this.insurance = (String) Utils.objectFromMessageLine(segmentStrings[line], "IN1")) != null)
            line++;

        if (line >= segmentStrings.length)
            return;
        if ((this.insuranceAdditionalInformation = (String) Utils.objectFromMessageLine(segmentStrings[line],
                "IN2")) != null)
            line++;

        if (line >= segmentStrings.length)
            return;
        this.insuranceAdditionalInformationCertification = Utils.allSegmentsFromGroup(segmentStrings, line, "IN3")
                .stream().map(String::valueOf).collect(Collectors.toSet());
        line += this.insuranceAdditionalInformationCertification.size();

        if (line >= segmentStrings.length)
            return;
        this.role3 = Utils.allSegmentsFromGroup(segmentStrings, line, "ROL").stream().map(String::valueOf)
                .collect(Collectors.toSet());
        line += this.role3.size();

        if (line >= segmentStrings.length)
            return;
        if ((this.accident = (String) Utils.objectFromMessageLine(segmentStrings[line], "ACC")) != null)
            line++;

        if (line >= segmentStrings.length)
            return;
        if ((this.uB82 = (String) Utils.objectFromMessageLine(segmentStrings[line], "UB1")) != null)
            line++;

        if (line >= segmentStrings.length)
            return;
        if ((this.uB92Data = (String) Utils.objectFromMessageLine(segmentStrings[line], "UB2")) != null)
            line++;

        if (line >= segmentStrings.length)
            return;
        if ((this.patientDeathandAutopsy = (String) Utils.objectFromMessageLine(segmentStrings[line], "PDA")) != null)
            line++;
    }

    @Override
    public String toString() {
        // TODO: Auto-generated, replace with HL7parse
        return "ADT_A01 [messageHeader=" + messageHeader + ", softwareSegment=" + softwareSegment + ", eventType="
                + eventType + ", patientIdentification=" + patientIdentification + ", patientAdditionalDemographic="
                + patientAdditionalDemographic + ", role=" + role + ", nextofKinAssociatedParties="
                + nextofKinAssociatedParties + ", patientVisit=" + patientVisit + ", patientVisitAdditionalInformation="
                + patientVisitAdditionalInformation + ", role1=" + role1 + ", disability=" + disability
                + ", observationResult=" + observationResult + ", patientAllergyInformation="
                + patientAllergyInformation + ", diagnosis=" + diagnosis + ", diagnosisRelatedGroup="
                + diagnosisRelatedGroup + ", procedures=" + procedures + ", role2=" + role2 + ", guarantor=" + guarantor
                + ", insurance=" + insurance + ", insuranceAdditionalInformation=" + insuranceAdditionalInformation
                + ", insuranceAdditionalInformationCertification=" + insuranceAdditionalInformationCertification
                + ", role3=" + role3 + ", accident=" + accident + ", uB82=" + uB82 + ", uB92Data=" + uB92Data
                + ", patientDeathandAutopsy=" + patientDeathandAutopsy + "]";
    }

    /**
     * @return the patientIdentification
     */
    public PID getPatientIdentification() {
        return patientIdentification;
    }

    /**
     * @return the accident
     */
    public String getAccident() {
        return accident;
    }

    /**
     * @return the diagnosis
     */
    public Set<DG1> getDiagnosis() {
        return diagnosis;
    }

    /**
     * @return the diagnosisRelatedGroup
     */
    public String getDiagnosisRelatedGroup() {
        return diagnosisRelatedGroup;
    }

    /**
     * @return the disability
     */
    public Set<String> getDisability() {
        return disability;
    }

    /**
     * @return the eventType
     */
    public EVN getEventType() {
        return eventType;
    }

    /**
     * @return the guarantor
     */
    public Set<String> getGuarantor() {
        return guarantor;
    }

    /**
     * @return the insurance
     */
    public String getInsurance() {
        return insurance;
    }

    /**
     * @return the insuranceAdditionalInformation
     */
    public String getInsuranceAdditionalInformation() {
        return insuranceAdditionalInformation;
    }

    /**
     * @return the insuranceAdditionalInformationCertification
     */
    public Set<String> getInsuranceAdditionalInformationCertification() {
        return insuranceAdditionalInformationCertification;
    }

    /**
     * @return the messageHeader
     */
    public MSH getMessageHeader() {
        return messageHeader;
    }

    /**
     * @return the nextofKinAssociatedParties
     */
    public Set<NK1> getNextofKinAssociatedParties() {
        return nextofKinAssociatedParties;
    }

    /**
     * @return the observationResult
     */
    public Set<String> getObservationResult() {
        return observationResult;
    }

    /**
     * @return the patientAdditionalDemographic
     */
    public PD1 getPatientAdditionalDemographic() {
        return patientAdditionalDemographic;
    }

    /**
     * @return the patientAllergyInformation
     */
    public Set<String> getPatientAllergyInformation() {
        return patientAllergyInformation;
    }

    /**
     * @return the patientDeathandAutopsy
     */
    public String getPatientDeathandAutopsy() {
        return patientDeathandAutopsy;
    }

    /**
     * @return the patientVisit
     */
    public PV1 getPatientVisit() {
        return patientVisit;
    }

    /**
     * @return the patientVisitAdditionalInformation
     */
    public String getPatientVisitAdditionalInformation() {
        return patientVisitAdditionalInformation;
    }

    /**
     * @return the procedures
     */
    public String getProcedures() {
        return procedures;
    }

    /**
     * @return the role
     */
    public Set<String> getRole() {
        return role;
    }

    /**
     * @return the role1
     */
    public Set<String> getRole1() {
        return role1;
    }

    /**
     * @return the role2
     */
    public Set<String> getRole2() {
        return role2;
    }

    /**
     * @return the role3
     */
    public Set<String> getRole3() {
        return role3;
    }

    /**
     * @return the softwareSegment
     */
    public Set<String> getSoftwareSegment() {
        return softwareSegment;
    }

    /**
     * @return the uB82
     */
    public String getuB82() {
        return uB82;
    }

    /**
     * @return the uB92Data
     */
    public String getuB92Data() {
        return uB92Data;
    }
}