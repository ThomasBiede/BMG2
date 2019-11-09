package app.hl7_types.segment;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.stream.Collectors;

import app.hl7_parser.Hl7Field;
import app.hl7_parser.Hl7Serializeable;
import app.hl7_types.datatype.*;
import app.parsing.EncodingCharacters;

import app.parsing.Utils;

/**
 * @author Thomas Biedermann
 * @author Daniel Karner
 */
@Hl7Serializeable
public class DG1 {
    @Hl7Field
    String setIDDG1;
    @Hl7Field
    String diagnosisCodingMethod;
    @Hl7Field
    String diagnosisCodeDG1;
    @Hl7Field
    String diagnosisDescription;
    @Hl7Field
    LocalDateTime diagnosisDateTime;
    @Hl7Field
    String diagnosisType;
    @Hl7Field
    String majorDiagnosticCategory;
    @Hl7Field
    String diagnosticRelatedGroup;
    @Hl7Field
    String dRGApprovalIndicator;
    @Hl7Field
    String dRGGrouperReviewCode;
    @Hl7Field
    String outlierType;
    @Hl7Field
    double outlierDays;
    @Hl7Field
    double outlierCost;
    @Hl7Field
    String grouperVersionAndType;
    @Hl7Field
    String diagnosisPriority;
    @Hl7Field
    Set<XCN> diagnosingClinician;
    @Hl7Field
    String diagnosisClassification;
    @Hl7Field
    String confidentialIndicator;
    @Hl7Field
    LocalDateTime attestationDateTime;
    @Hl7Field
    String diagnosisIdentifier;
    @Hl7Field
    String diagnosisActionCode;

    /**
     * @param setIDDG1
     * @param diagnosisCodingMethod
     * @param diagnosisCodeDG1
     * @param diagnosisDescription
     * @param diagnosisDateTime
     * @param diagnosisType
     * @param majorDiagnosticCategory
     * @param diagnosticRelatedGroup
     * @param dRGApprovalIndicator
     * @param dRGGrouperReviewCode
     * @param outlierType
     * @param outlierDays
     * @param outlierCost
     * @param grouperVersionAndType
     * @param diagnosisPriority
     * @param diagnosingClinician
     * @param diagnosisClassification
     * @param confidentialIndicator
     * @param attestationDateTime
     * @param diagnosisIdentifier
     * @param diagnosisActionCode
     */
    public DG1(String setIDDG1, String diagnosisCodingMethod, String diagnosisCodeDG1, String diagnosisDescription,
            LocalDateTime diagnosisDateTime, String diagnosisType, String majorDiagnosticCategory,
            String diagnosticRelatedGroup, String dRGApprovalIndicator, String dRGGrouperReviewCode, String outlierType,
            double outlierDays, double outlierCost, String grouperVersionAndType, String diagnosisPriority,
            Set<XCN> diagnosingClinician, String diagnosisClassification, String confidentialIndicator,
            LocalDateTime attestationDateTime, String diagnosisIdentifier, String diagnosisActionCode) {
        this.setIDDG1 = setIDDG1;
        this.diagnosisCodingMethod = diagnosisCodingMethod;
        this.diagnosisCodeDG1 = diagnosisCodeDG1;
        this.diagnosisDescription = diagnosisDescription;
        this.diagnosisDateTime = diagnosisDateTime;
        this.diagnosisType = diagnosisType;
        this.majorDiagnosticCategory = majorDiagnosticCategory;
        this.diagnosticRelatedGroup = diagnosticRelatedGroup;
        this.dRGApprovalIndicator = dRGApprovalIndicator;
        this.dRGGrouperReviewCode = dRGGrouperReviewCode;
        this.outlierType = outlierType;
        this.outlierDays = outlierDays;
        this.outlierCost = outlierCost;
        this.grouperVersionAndType = grouperVersionAndType;
        this.diagnosisPriority = diagnosisPriority;
        this.diagnosingClinician = diagnosingClinician;
        this.diagnosisClassification = diagnosisClassification;
        this.confidentialIndicator = confidentialIndicator;
        this.attestationDateTime = attestationDateTime;
        this.diagnosisIdentifier = diagnosisIdentifier;
        this.diagnosisActionCode = diagnosisActionCode;
    }

    /**
     * @param HL7String
     * @param encodingCharacters
     */
    public DG1(String HL7String, EncodingCharacters encodingCharacters) {
        String[] tokens = Utils.tokenizeHL7(HL7String, encodingCharacters.getFieldSeperator(),
                encodingCharacters.getEscapeCharacter(), 21);
        this.setIDDG1 = tokens[0];
        this.diagnosisCodingMethod = tokens[1];
        this.diagnosisCodeDG1 = tokens[2];
        this.diagnosisDescription = tokens[3];
        this.diagnosisDateTime = (LocalDateTime) Utils.toObject(tokens[4], LocalDateTime.class);
        this.diagnosisType = tokens[5];
        this.majorDiagnosticCategory = tokens[6];
        this.diagnosticRelatedGroup = tokens[7];
        this.dRGApprovalIndicator = tokens[8];
        this.dRGGrouperReviewCode = tokens[9];
        this.outlierType = tokens[10];
        this.outlierDays = (double) Utils.toObject(tokens[11], Double.class);
        this.outlierCost = (double) Utils.toObject(tokens[12], Double.class);
        this.grouperVersionAndType = tokens[13];
        this.diagnosisPriority = tokens[14];
        this.diagnosingClinician = Utils
                .toSet(tokens[15], XCN.class, encodingCharacters.getFieldRepeatSeperator(), encodingCharacters).stream()
                .map(temp -> {
                    return new XCN(tokens[15], encodingCharacters);
                }).collect(Collectors.toSet());
        this.diagnosisClassification = tokens[16];
        this.confidentialIndicator = tokens[17];
        this.attestationDateTime = (LocalDateTime) Utils.toObject(tokens[18], LocalDateTime.class);
        this.diagnosisIdentifier = tokens[19];
        this.diagnosisActionCode = tokens[20];
    }

    @Override
    public String toString() {
        // TODO: Auto-generated, replace with HL7parse
        return "DG1 [setIDDG1=" + setIDDG1 + ", diagnosisCodingMethod=" + diagnosisCodingMethod + ", diagnosisCodeDG1="
                + diagnosisCodeDG1 + ", diagnosisDescription=" + diagnosisDescription + ", diagnosisDateTime="
                + diagnosisDateTime + ", diagnosisType=" + diagnosisType + ", majorDiagnosticCategory="
                + majorDiagnosticCategory + ", diagnosticRelatedGroup=" + diagnosticRelatedGroup
                + ", dRGApprovalIndicator=" + dRGApprovalIndicator + ", dRGGrouperReviewCode=" + dRGGrouperReviewCode
                + ", outlierType=" + outlierType + ", outlierDays=" + outlierDays + ", outlierCost=" + outlierCost
                + ", grouperVersionAndType=" + grouperVersionAndType + ", diagnosisPriority=" + diagnosisPriority
                + ", diagnosingClinician=" + diagnosingClinician + ", diagnosisClassification="
                + diagnosisClassification + ", confidentialIndicator=" + confidentialIndicator
                + ", attestationDateTime=" + attestationDateTime + ", diagnosisIdentifier=" + diagnosisIdentifier
                + ", diagnosisActionCode=" + diagnosisActionCode + "]";
    }
}