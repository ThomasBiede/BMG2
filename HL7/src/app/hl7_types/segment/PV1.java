package app.hl7_types.segment;

import java.time.LocalDate;
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
 *
 */
@XmlSerializeable
public class PV1 {
	@XmlField
	String setIDPV1;
	@XmlField
	String patientClass;
	@XmlField
	String assignedPatientLocation;
	@XmlField
	String admissionType;
	@XmlField
	String preadmitNumber;
	@XmlField
	String priorPatientLocation;
	@XmlField
	Set<XCN> attendingDoctor;
	@XmlField
	Set<XCN> referringDoctor;
	@XmlField
	Set<XCN> consultingDoctor;
	@XmlField
	String hospitalService;
	@XmlField
	String temporaryLocation;
	@XmlField
	String preadmitTestIndicator;
	@XmlField
	String readmissionIndicator;
	@XmlField
	String admitSource;
	@XmlField
	Set<String> ambulatoryStatus;
	@XmlField
	String vIPIndicator;
	@XmlField
	Set<XCN> admittingDoctor;
	@XmlField
	String patientType;
	@XmlField
	String visitNumber;
	@XmlField
	Set<String> financialClass;
	@XmlField
	String chargePriceIndicator;
	@XmlField
	String courtesyCode;
	@XmlField
	String creditRating;
	@XmlField
	Set<String> contractCode;
	@XmlField
	Set<LocalDate> contractEffectiveDate;
	@XmlField
	Set<Double> contractAmount;
	@XmlField
	Set<Double> contractPeriod;
	@XmlField
	String interestCode;
	@XmlField
	String transfertoBadDebtCode;
	@XmlField
	LocalDate transfertoBadDebtDate;
	@XmlField
	String badDebtAgencyCode;
	@XmlField
	double badDebtTransferAmount;
	@XmlField
	double badDebtRecoveryAmount;
	@XmlField
	String deleteAccountIndicator;
	@XmlField
	LocalDate deleteAccountDate;
	@XmlField
	String dischargeDisposition;
	@XmlField
	String dischargedtoLocation;
	@XmlField
	String dietType;
	@XmlField
	String servicingFacility;
	@XmlField
	String bedStatus;
	@XmlField
	String accountStatus;
	@XmlField
	String pendingLocation;
	@XmlField
	String priorTemporaryLocation;
	@XmlField
	LocalDateTime admitDateTime;
	@XmlField
	Set<LocalDateTime> dischargeDateTime;
	@XmlField
	double currentPatientBalance;
	@XmlField
	double totalCharges;
	@XmlField
	double totalAdjustments;
	@XmlField
	double totalPayments;
	@XmlField
	String alternateVisitID;
	@XmlField
	String visitIndicator;
	@XmlField
	Set<XCN> otherHealthcareProvider;

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
	public PV1(String setIDPV1, String patientClass, String assignedPatientLocation, String admissionType,
			String preadmitNumber, String priorPatientLocation, Set<XCN> attendingDoctor, Set<XCN> referringDoctor,
			Set<XCN> consultingDoctor, String hospitalService, String temporaryLocation, String preadmitTestIndicator,
			String readmissionIndicator, String admitSource, Set<String> ambulatoryStatus, String vIPIndicator,
			Set<XCN> admittingDoctor, String patientType, String visitNumber, Set<String> financialClass,
			String chargePriceIndicator, String courtesyCode, String creditRating, Set<String> contractCode,
			Set<LocalDate> contractEffectiveDate, Set<Double> contractAmount, Set<Double> contractPeriod,
			String interestCode, String transfertoBadDebtCode, LocalDate transfertoBadDebtDate,
			String badDebtAgencyCode, double badDebtTransferAmount, double badDebtRecoveryAmount,
			String deleteAccountIndicator, LocalDate deleteAccountDate, String dischargeDisposition,
			String dischargedtoLocation, String dietType, String servicingFacility, String bedStatus,
			String accountStatus, String pendingLocation, String priorTemporaryLocation, LocalDateTime admitDateTime,
			Set<LocalDateTime> dischargeDateTime, double currentPatientBalance, double totalCharges,
			double totalAdjustments, double totalPayments, String alternateVisitID, String visitIndicator,
			Set<XCN> otherHealthcareProvider) {
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

	/**
	 * @param HL7String
	 * @param encodingCharacters
	 */
	public PV1(String HL7String, EncodingCharacters encodingCharacters) {
		String[] tokens = Utils.tokenizeHL7(HL7String, encodingCharacters.getFieldSeperator(),
				encodingCharacters.getEscapeCharacter(), 52);
		this.setIDPV1 = tokens[0];
		this.patientClass = tokens[1];
		this.assignedPatientLocation = tokens[2];
		this.admissionType = tokens[3];
		this.preadmitNumber = tokens[4];
		this.priorPatientLocation = tokens[5];
		this.attendingDoctor = Utils
				.toSet(tokens[6], XCN.class, encodingCharacters.getFieldRepeatSeperator(), encodingCharacters).stream()
				.map(temp -> {
					return (XCN) temp;
				}).collect(Collectors.toSet());
		this.referringDoctor = Utils
				.toSet(tokens[7], XCN.class, encodingCharacters.getFieldRepeatSeperator(), encodingCharacters).stream()
				.map(temp -> {
					return (XCN) temp;
				}).collect(Collectors.toSet());
		this.consultingDoctor = Utils
				.toSet(tokens[8], XCN.class, encodingCharacters.getFieldRepeatSeperator(), encodingCharacters).stream()
				.map(temp -> {
					return (XCN) temp;
				}).collect(Collectors.toSet());
		this.hospitalService = tokens[9];
		this.temporaryLocation = tokens[10];
		this.preadmitTestIndicator = tokens[11];
		this.readmissionIndicator = tokens[12];
		this.admitSource = tokens[13];
		this.ambulatoryStatus = Utils.toSet(tokens[14], String.class, encodingCharacters.getFieldRepeatSeperator())
				.stream().map(String::valueOf).collect(Collectors.toSet());
		this.vIPIndicator = tokens[15];
		this.admittingDoctor = Utils
				.toSet(tokens[16], XCN.class, encodingCharacters.getFieldRepeatSeperator(), encodingCharacters).stream()
				.map(temp -> {
					return (XCN) temp;
				}).collect(Collectors.toSet());
		this.patientType = tokens[17];
		this.visitNumber = tokens[18];
		this.financialClass = Utils.toSet(tokens[19], String.class, encodingCharacters.getFieldRepeatSeperator())
				.stream().map(String::valueOf).collect(Collectors.toSet());
		this.chargePriceIndicator = tokens[20];
		this.courtesyCode = tokens[21];
		this.creditRating = tokens[22];
		this.contractCode = Utils.toSet(tokens[23], String.class, encodingCharacters.getFieldRepeatSeperator()).stream()
				.map(String::valueOf).collect(Collectors.toSet());
		this.contractEffectiveDate = Utils
				.toSet(tokens[24], LocalDate.class, encodingCharacters.getFieldRepeatSeperator()).stream().map(temp -> {
					return (LocalDate) temp;
				}).collect(Collectors.toSet());
		this.contractAmount = Utils.toSet(tokens[25], Double.class, encodingCharacters.getFieldRepeatSeperator())
				.stream().map(temp -> {
					return (double) temp;
				}).collect(Collectors.toSet());
		this.contractPeriod = Utils.toSet(tokens[26], Double.class, encodingCharacters.getFieldRepeatSeperator())
				.stream().map(temp -> {
					return (double) temp;
				}).collect(Collectors.toSet());
		this.interestCode = tokens[27];
		this.transfertoBadDebtCode = tokens[28];
		this.transfertoBadDebtDate = (LocalDate) Utils.toObject(tokens[29], LocalDate.class);
		this.badDebtAgencyCode = tokens[30];
		this.badDebtTransferAmount = (double) Utils.toObject(tokens[31], Double.class);
		this.badDebtRecoveryAmount = (double) Utils.toObject(tokens[32], Double.class);
		this.deleteAccountIndicator = tokens[33];
		this.deleteAccountDate = (LocalDate) Utils.toObject(tokens[34], LocalDate.class);
		this.dischargeDisposition = tokens[35];
		this.dischargedtoLocation = tokens[36];
		this.dietType = tokens[37];
		this.servicingFacility = tokens[38];
		this.bedStatus = tokens[39];
		this.accountStatus = tokens[40];
		this.pendingLocation = tokens[41];
		this.priorTemporaryLocation = tokens[42];
		this.admitDateTime = (LocalDateTime) Utils.toObject(tokens[43], LocalDateTime.class);
		this.dischargeDateTime = Utils
				.toSet(tokens[44], LocalDateTime.class, encodingCharacters.getFieldRepeatSeperator()).stream()
				.map(temp -> {
					return (LocalDateTime) temp;
				}).collect(Collectors.toSet());
		this.currentPatientBalance = (double) Utils.toObject(tokens[45], Double.class);
		this.totalCharges = (double) Utils.toObject(tokens[46], Double.class);
		this.totalAdjustments = (double) Utils.toObject(tokens[47], Double.class);
		this.totalPayments = (double) Utils.toObject(tokens[48], Double.class);
		this.alternateVisitID = tokens[49];
		this.visitIndicator = tokens[50];
		this.otherHealthcareProvider = Utils
				.toSet(tokens[51], XCN.class, encodingCharacters.getFieldRepeatSeperator(), encodingCharacters).stream()
				.map(temp -> {
					return (XCN) temp;
				}).collect(Collectors.toSet());
	}

	@Override
	public String toString() {
		// TODO: Auto-generated, replace with HL7parse
		return "PV1 [setIDPV1=" + setIDPV1 + ", patientClass=" + patientClass + ", assignedPatientLocation="
				+ assignedPatientLocation + ", admissionType=" + admissionType + ", preadmitNumber=" + preadmitNumber
				+ ", priorPatientLocation=" + priorPatientLocation + ", attendingDoctor=" + attendingDoctor
				+ ", referringDoctor=" + referringDoctor + ", consultingDoctor=" + consultingDoctor
				+ ", hospitalService=" + hospitalService + ", temporaryLocation=" + temporaryLocation
				+ ", preadmitTestIndicator=" + preadmitTestIndicator + ", readmissionIndicator=" + readmissionIndicator
				+ ", admitSource=" + admitSource + ", ambulatoryStatus=" + ambulatoryStatus + ", vIPIndicator="
				+ vIPIndicator + ", admittingDoctor=" + admittingDoctor + ", patientType=" + patientType
				+ ", visitNumber=" + visitNumber + ", financialClass=" + financialClass + ", chargePriceIndicator="
				+ chargePriceIndicator + ", courtesyCode=" + courtesyCode + ", creditRating=" + creditRating
				+ ", contractCode=" + contractCode + ", contractEffectiveDate=" + contractEffectiveDate
				+ ", contractAmount=" + contractAmount + ", contractPeriod=" + contractPeriod + ", interestCode="
				+ interestCode + ", transfertoBadDebtCode=" + transfertoBadDebtCode + ", transfertoBadDebtDate="
				+ transfertoBadDebtDate + ", badDebtAgencyCode=" + badDebtAgencyCode + ", badDebtTransferAmount="
				+ badDebtTransferAmount + ", badDebtRecoveryAmount=" + badDebtRecoveryAmount
				+ ", deleteAccountIndicator=" + deleteAccountIndicator + ", deleteAccountDate=" + deleteAccountDate
				+ ", dischargeDisposition=" + dischargeDisposition + ", dischargedtoLocation=" + dischargedtoLocation
				+ ", dietType=" + dietType + ", servicingFacility=" + servicingFacility + ", bedStatus=" + bedStatus
				+ ", accountStatus=" + accountStatus + ", pendingLocation=" + pendingLocation
				+ ", priorTemporaryLocation=" + priorTemporaryLocation + ", admitDateTime=" + admitDateTime
				+ ", dischargeDateTime=" + dischargeDateTime + ", currentPatientBalance=" + currentPatientBalance
				+ ", totalCharges=" + totalCharges + ", totalAdjustments=" + totalAdjustments + ", totalPayments="
				+ totalPayments + ", alternateVisitID=" + alternateVisitID + ", visitIndicator=" + visitIndicator
				+ ", otherHealthcareProvider=" + otherHealthcareProvider + "]";
	}
}