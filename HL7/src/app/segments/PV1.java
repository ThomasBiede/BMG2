package app.segments;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

import app.datatypes.XCN;

/**
 * Java representation of segment "PV1" from HL7 protocol. Visit <a href=
 * "http://hl7-definition.caristix.com:9010/Default.aspx?version=HL7+v2.5.1&segment=PV1">HL7
 * documentation</a> for more info.
 * 
 * @author Thomas Biedermann
 * @author Daniel Karner
 * @version 1.1
 * @since 2019-10-27
 */

public class PV1 
{
    private long setIDPV1;
    private String patientClass;
    private String assignedPatientLocation;
    private String admissionType;
    private String preadmitNumber;
    private String priorPatientLocation;
    private Set<XCN> attendingDoctor;
    private Set<XCN> referringDoctor;
    private Set<XCN> consultingDoctor;
    private String hospitalService;
    private String temporaryLocation;
    private String preadmitTestIndicator;
    private String readmissionIndicator;
    private String admitSource;
    private Set<String> ambulatoryStatus;
    private String vIPIndicator;
    private Set<XCN> admittingDoctor;
    private String patientType;
    private String visitNumber;
    private Set<String> financialClass;
    private String chargePriceIndicator;
    private String courtesyCode;
    private String creditRating;
    private Set<String> contractCode;
    private Set<LocalDate> contractEffectiveDate;
    private Set<Double> contractAmount;
    private Set<Double> contractPeriod;
    private String interestCode;
    private String transfertoBadDebtCode;
    private LocalDate transfertoBadDebtDate;
    private String badDebtAgencyCode;
    private double badDebtTransferAmount;
    private double badDebtRecoveryAmount;
    private String deleteAccountIndicator;
    private LocalDate deleteAccountDate;
    private String dischargeDisposition;
    private String dischargedtoLocation;
    private String dietType;
    private String servicingFacility;
    private String bedStatus;
    private String accountStatus;
    private String pendingLocation;
    private String priorTemporaryLocation;
    private LocalDateTime admitDateTime;
    private Set<LocalDateTime> dischargeDateTime;
    private double currentPatientBalance;
    private double totalCharges;
    private double totalAdjustments;
    private double totalPayments;
    private String alternateVisitID;
    private String visitIndicator;
    private Set<XCN> otherHealthcareProvider;

    /**
     * @param setIDPV1
     * @param patientClass
     * @param assignedPatientLocation
     * @param admissionType
     * @param preadmitNumber
     * @param priorPatientLocation
     * @param attendingDoctor
     * @param referringDoctor
     * @param consultingDoctor
     * @param hospitalService
     * @param temporaryLocation
     * @param preadmitTestIndicator
     * @param readmissionIndicator
     * @param admitSource
     * @param ambulatoryStatus
     * @param vIPIndicator
     * @param admittingDoctor
     * @param patientType
     * @param visitNumber
     * @param financialClass
     * @param chargePriceIndicator
     * @param courtesyCode
     * @param creditRating
     * @param contractCode
     * @param contractEffectiveDate
     * @param contractAmount
     * @param contractPeriod
     * @param interestCode
     * @param transfertoBadDebtCode
     * @param transfertoBadDebtDate
     * @param badDebtAgencyCode
     * @param badDebtTransferAmount
     * @param badDebtRecoveryAmount
     * @param deleteAccountIndicator
     * @param deleteAccountDate
     * @param dischargeDisposition
     * @param dischargedtoLocation
     * @param dietType
     * @param servicingFacility
     * @param bedStatus
     * @param accountStatus
     * @param pendingLocation
     * @param priorTemporaryLocation
     * @param admitDateTime
     * @param dischargeDateTime
     * @param currentPatientBalance
     * @param totalCharges
     * @param totalAdjustments
     * @param totalPayments
     * @param alternateVisitID
     * @param visitIndicator
     * @param otherHealthcareProvider
     */

    public PV1(
        long setIDPV1,  
        String patientClass, 
        String assignedPatientLocation, 
        String admissionType,
        String preadmitNumber, 
        String priorPatientLocation, 
        Set<XCN> attendingDoctor, 
        Set<XCN> referringDoctor,
        Set<XCN> consultingDoctor, 
        String hospitalService, 
        String temporaryLocation,
        String preadmitTestIndicator, 
        String readmissionIndicator, 
        String admitSource,
        Set<String> ambulatoryStatus, 
        String vIPIndicator, 
        Set<XCN> admittingDoctor, 
        String patientType,
        String visitNumber, 
        Set<String> financialClass, 
        String chargePriceIndicator, 
        String courtesyCode,
        String creditRating, 
        Set<String> contractCode, 
        Set<LocalDate> contractEffectiveDate,
        Set<Double> contractAmount, 
        Set<Double> contractPeriod, 
        String interestCode,
        String transfertoBadDebtCode, 
        LocalDate transfertoBadDebtDate, 
        String badDebtAgencyCode,
        double badDebtTransferAmount, 
        double badDebtRecoveryAmount, 
        String deleteAccountIndicator,
        LocalDate deleteAccountDate, 
        String dischargeDisposition, 
        String dischargedtoLocation,
        String dietType, 
        String servicingFacility, 
        String bedStatus, 
        String accountStatus,
        String pendingLocation, 
        String priorTemporaryLocation, 
        LocalDateTime admitDateTime,
        Set<LocalDateTime> dischargeDateTime, 
        double currentPatientBalance, 
        double totalCharges,
        double totalAdjustments, 
        double totalPayments, 
        String alternateVisitID, 
        String visitIndicator,
        Set<XCN> otherHealthcareProvider) 
        {
        this.setIDPV1 = setIDPV1;
        this.patientClass = patientClass;
        this.assignedPatientLocation = assignedPatientLocation;
        this.admissionType = admissionType;
        this.preadmitNumber = preadmitNumber;
        this.priorPatientLocation = priorPatientLocation;
        this.attendingDoctor = attendingDoctor;
        this.referringDoctor = referringDoctor;
        this.consultingDoctor = consultingDoctor;
        this.hospitalService = hospitalService;
        this.temporaryLocation = temporaryLocation;
        this.preadmitTestIndicator = preadmitTestIndicator;
        this.readmissionIndicator = readmissionIndicator;
        this.admitSource = admitSource;
        this.ambulatoryStatus = ambulatoryStatus;
        this.vIPIndicator = vIPIndicator;
        this.admittingDoctor = admittingDoctor;
        this.patientType = patientType;
        this.visitNumber = visitNumber;
        this.financialClass = financialClass;
        this.chargePriceIndicator = chargePriceIndicator;
        this.courtesyCode = courtesyCode;
        this.creditRating = creditRating;
        this.contractCode = contractCode;
        this.contractEffectiveDate = contractEffectiveDate;
        this.contractAmount = contractAmount;
        this.contractPeriod = contractPeriod;
        this.interestCode = interestCode;
        this.transfertoBadDebtCode = transfertoBadDebtCode;
        this.transfertoBadDebtDate = transfertoBadDebtDate;
        this.badDebtAgencyCode = badDebtAgencyCode;
        this.badDebtTransferAmount = badDebtTransferAmount;
        this.badDebtRecoveryAmount = badDebtRecoveryAmount;
        this.deleteAccountIndicator = deleteAccountIndicator;
        this.deleteAccountDate = deleteAccountDate;
        this.dischargeDisposition = dischargeDisposition;
        this.dischargedtoLocation = dischargedtoLocation;
        this.dietType = dietType;
        this.servicingFacility = servicingFacility;
        this.bedStatus = bedStatus;
        this.accountStatus = accountStatus;
        this.pendingLocation = pendingLocation;
        this.priorTemporaryLocation = priorTemporaryLocation;
        this.admitDateTime = admitDateTime;
        this.dischargeDateTime = dischargeDateTime;
        this.currentPatientBalance = currentPatientBalance;
        this.totalCharges = totalCharges;
        this.totalAdjustments = totalAdjustments;
        this.totalPayments = totalPayments;
        this.alternateVisitID = alternateVisitID;
        this.visitIndicator = visitIndicator;
        this.otherHealthcareProvider = otherHealthcareProvider;
    }
}