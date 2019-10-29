package app.segments;

import java.time.LocalDateTime;

import app.datatypes.XCN;

/**
 * Java representation of segment "XCN" from HL7 protocol. Visit <a href=
 * "http://hl7-definition.caristix.com:9010/Default.aspx?version=HL7+v2.5.1&segment=XCN">HL7
 * documentation</a> for more info.
 * 
 * @author Thomas Biedermann
 * @author Daniel Karner
 * @version 1.1
 * @since 2019-10-27
 */

public class DG1 
{
    private long setIDDG1;
    private String diagnosisCodingMethod;
    private String diagnosisCodeDG1;
    private String diagnosisDescription;
    private LocalDateTime diagnosisDateTime;
    private String diagnosisType;
    private String majorDiagnosticCategory;
    private String diagnosticRelatedGroup;
    private String dRGApprovalIndicator;
    private String dRGGrouperReviewCode;
    private String outlierType;
    private double outlierDays;
    private long outlierCost;
    private String grouperVersionAndType;
    private String diagnosisPriority;
    private XCN diagnosingClinician;
    private String diagnosisClassification;
    private String confidentialIndicator;
    private LocalDateTime attestationDateTime;
    private String diagnosisIdentifier;
    private String diagnosisActionCode;

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

    public DG1( 
        long setIDDG1, 
        String diagnosisCodingMethod, 
        String diagnosisCodeDG1,
        String diagnosisDescription, 
        LocalDateTime diagnosisDateTime,  
        String diagnosisType,
        String majorDiagnosticCategory, 
        String diagnosticRelatedGroup, 
        String dRGApprovalIndicator,
        String dRGGrouperReviewCode, 
        String outlierType, 
        double outlierDays, 
        long outlierCost,
        String grouperVersionAndType, 
        String diagnosisPriority, 
        XCN diagnosingClinician,
        String diagnosisClassification, 
        String confidentialIndicator, 
        LocalDateTime attestationDateTime,
        String diagnosisIdentifier, 
        String diagnosisActionCode) 
        {

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
}