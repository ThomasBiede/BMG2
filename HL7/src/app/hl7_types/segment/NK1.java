package app.hl7_types.segment;

import java.time.LocalDate;
import java.time.LocalDateTime;

import app.hl7_parser.Hl7Field;
import app.hl7_parser.Hl7Serializeable;
import app.hl7_types.datatype.*;
import app.parsing.EncodingCharacters;

import app.parsing.Utils;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Thomas Biedermann
 * @author Daniel Karner
 */
@Hl7Serializeable(layer = 1)
public class NK1 {
	@Hl7Field
	String setIDNK1;
	@Hl7Field
	Set<XPN> nKName;
	@Hl7Field
	String relationship;
	@Hl7Field
	Set<XAD> address;
	@Hl7Field
	Set<XTN> phoneNumber;
	@Hl7Field
	Set<XTN> businessPhoneNumber;
	@Hl7Field
	String contactRole;
	@Hl7Field
	LocalDate startDate;
	@Hl7Field
	LocalDate endDate;
	@Hl7Field
	String nextofKinAssociatedPartiesJobTitle;
	@Hl7Field
	String nextofKinAssociatedPartiesJobCodeClass;
	@Hl7Field
	String nextofKinAssociatedPartiesEmployeeNumber;
	@Hl7Field
	Set<String> organizationNameNK1;
	@Hl7Field
	String maritalStatus;
	@Hl7Field
	String administrativeSex;
	@Hl7Field
	LocalDateTime dateTimeofBirth;
	@Hl7Field
	Set<String> livingDependency;
	@Hl7Field
	Set<String> ambulatoryStatus;
	@Hl7Field
	Set<String> citizenship;
	@Hl7Field
	String primaryLanguage;
	@Hl7Field
	String livingArrangement;
	@Hl7Field
	String publicityCode;
	@Hl7Field
	String protectionIndicator;
	@Hl7Field
	String studentIndicator;
	@Hl7Field
	String religion;
	@Hl7Field
	Set<XPN> mothersMaidenName;
	@Hl7Field
	String nationality;
	@Hl7Field
	Set<String> ethnicGroup;
	@Hl7Field
	Set<String> contactReason;
	@Hl7Field
	Set<XPN> contactPersonsName;
	@Hl7Field
	Set<XTN> contactPersonsTelephoneNumber;
	@Hl7Field
	Set<XAD> contactPersonsAddress;
	@Hl7Field
	Set<String> nextofKinAssociatedPartysIdentifiers;
	@Hl7Field
	String jobStatus;
	@Hl7Field
	Set<String> race;
	@Hl7Field
	String handicap;
	@Hl7Field
	String contactPersonSocialSecurityNumber;
	@Hl7Field
	String nextofKinBirthPlace;
	@Hl7Field
	String vIPIndicator;
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
	public NK1(String setIDNK1, Set<XPN> nKName, String relationship, Set<XAD> address, Set<XTN> phoneNumber,
			Set<XTN> businessPhoneNumber, String contactRole, LocalDate startDate, LocalDate endDate,
			String nextofKinAssociatedPartiesJobTitle, String nextofKinAssociatedPartiesJobCodeClass,
			String nextofKinAssociatedPartiesEmployeeNumber, Set<String> organizationNameNK1, String maritalStatus,
			String administrativeSex, LocalDateTime dateTimeofBirth, Set<String> livingDependency,
			Set<String> ambulatoryStatus, Set<String> citizenship, String primaryLanguage, String livingArrangement,
			String publicityCode, String protectionIndicator, String studentIndicator, String religion,
			Set<XPN> mothersMaidenName, String nationality, Set<String> ethnicGroup, Set<String> contactReason,
			Set<XPN> contactPersonsName, Set<XTN> contactPersonsTelephoneNumber, Set<XAD> contactPersonsAddress,
			Set<String> nextofKinAssociatedPartysIdentifiers, String jobStatus, Set<String> race, String handicap,
			String contactPersonSocialSecurityNumber, String nextofKinBirthPlace, String vIPIndicator) {
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

	/**
	 * @param HL7String
	 * @param encodingCharacters
	 */
	public NK1(String HL7String, EncodingCharacters encodingCharacters) {
		String[] tokens = Utils.tokenizeHL7(HL7String, encodingCharacters.getFieldSeperator(),
				encodingCharacters.getEscapeCharacter(), 39);
		this.setIDNK1 = tokens[0];
		this.nKName = Utils
				.toSet(tokens[1], XPN.class, encodingCharacters.getFieldRepeatSeperator(), encodingCharacters).stream()
				.map(temp -> {
					return new XPN(tokens[1], encodingCharacters);
				}).collect(Collectors.toSet());
		this.relationship = tokens[2];
		this.address = Utils
				.toSet(tokens[3], XAD.class, encodingCharacters.getFieldRepeatSeperator(), encodingCharacters).stream()
				.map(temp -> {
					return new XAD(tokens[3], encodingCharacters);
				}).collect(Collectors.toSet());
		this.phoneNumber = Utils
				.toSet(tokens[4], XTN.class, encodingCharacters.getFieldRepeatSeperator(), encodingCharacters).stream()
				.map(temp -> {
					return new XTN(tokens[4], encodingCharacters);
				}).collect(Collectors.toSet());
		this.businessPhoneNumber = Utils
				.toSet(tokens[5], XTN.class, encodingCharacters.getFieldRepeatSeperator(), encodingCharacters).stream()
				.map(temp -> {
					return new XTN(tokens[5], encodingCharacters);
				}).collect(Collectors.toSet());
		this.contactRole = tokens[6];
		this.startDate = (LocalDate) Utils.toObject(tokens[7], LocalDate.class);
		this.endDate = (LocalDate) Utils.toObject(tokens[8], LocalDate.class);
		this.nextofKinAssociatedPartiesJobTitle = tokens[9];
		this.nextofKinAssociatedPartiesJobCodeClass = tokens[10];
		this.nextofKinAssociatedPartiesEmployeeNumber = tokens[11];
		this.organizationNameNK1 = Utils
				.toSet(tokens[12], String.class, encodingCharacters.getFieldRepeatSeperator(), encodingCharacters)
				.stream().map(String::valueOf).collect(Collectors.toSet());
		this.maritalStatus = tokens[13];
		this.administrativeSex = tokens[14];
		this.dateTimeofBirth = (LocalDateTime) Utils.toObject(tokens[15], LocalDateTime.class);
		this.livingDependency = Utils
				.toSet(tokens[16], String.class, encodingCharacters.getFieldRepeatSeperator(), encodingCharacters)
				.stream().map(String::valueOf).collect(Collectors.toSet());
		this.ambulatoryStatus = Utils
				.toSet(tokens[17], String.class, encodingCharacters.getFieldRepeatSeperator(), encodingCharacters)
				.stream().map(String::valueOf).collect(Collectors.toSet());
		this.citizenship = Utils
				.toSet(tokens[18], String.class, encodingCharacters.getFieldRepeatSeperator(), encodingCharacters)
				.stream().map(String::valueOf).collect(Collectors.toSet());
		this.primaryLanguage = tokens[19];
		this.livingArrangement = tokens[20];
		this.publicityCode = tokens[21];
		this.protectionIndicator = tokens[22];
		this.studentIndicator = tokens[23];
		this.religion = tokens[24];
		this.mothersMaidenName = Utils
				.toSet(tokens[25], XPN.class, encodingCharacters.getFieldRepeatSeperator(), encodingCharacters).stream()
				.map(temp -> {
					return new XPN(tokens[25], encodingCharacters);
				}).collect(Collectors.toSet());
		this.nationality = tokens[26];
		this.ethnicGroup = Utils
				.toSet(tokens[27], String.class, encodingCharacters.getFieldRepeatSeperator(), encodingCharacters)
				.stream().map(String::valueOf).collect(Collectors.toSet());
		this.contactReason = Utils
				.toSet(tokens[28], String.class, encodingCharacters.getFieldRepeatSeperator(), encodingCharacters)
				.stream().map(String::valueOf).collect(Collectors.toSet());
		this.contactPersonsName = Utils
				.toSet(tokens[29], XPN.class, encodingCharacters.getFieldRepeatSeperator(), encodingCharacters).stream()
				.map(temp -> {
					return new XPN(tokens[29], encodingCharacters);
				}).collect(Collectors.toSet());
		this.contactPersonsTelephoneNumber = Utils
				.toSet(tokens[30], XTN.class, encodingCharacters.getFieldRepeatSeperator(), encodingCharacters).stream()
				.map(temp -> {
					return new XTN(tokens[30], encodingCharacters);
				}).collect(Collectors.toSet());
		this.contactPersonsAddress = Utils
				.toSet(tokens[31], XAD.class, encodingCharacters.getFieldRepeatSeperator(), encodingCharacters).stream()
				.map(temp -> {
					return new XAD(tokens[31], encodingCharacters);
				}).collect(Collectors.toSet());
		this.nextofKinAssociatedPartysIdentifiers = Utils
				.toSet(tokens[32], String.class, encodingCharacters.getFieldRepeatSeperator(), encodingCharacters)
				.stream().map(String::valueOf).collect(Collectors.toSet());
		this.jobStatus = tokens[33];
		this.race = Utils
				.toSet(tokens[34], String.class, encodingCharacters.getFieldRepeatSeperator(), encodingCharacters)
				.stream().map(String::valueOf).collect(Collectors.toSet());
		this.handicap = tokens[35];
		this.contactPersonSocialSecurityNumber = tokens[36];
		this.nextofKinBirthPlace = tokens[37];
		this.vIPIndicator = tokens[38];
	}

	@Override
	public String toString() {
		// TODO: Auto-generated, replace with HL7parse
		return "NK1 [setIDNK1=" + setIDNK1 + ", nKName=" + nKName + ", relationship=" + relationship + ", address="
				+ address + ", phoneNumber=" + phoneNumber + ", businessPhoneNumber=" + businessPhoneNumber
				+ ", contactRole=" + contactRole + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", nextofKinAssociatedPartiesJobTitle=" + nextofKinAssociatedPartiesJobTitle
				+ ", nextofKinAssociatedPartiesJobCodeClass=" + nextofKinAssociatedPartiesJobCodeClass
				+ ", nextofKinAssociatedPartiesEmployeeNumber=" + nextofKinAssociatedPartiesEmployeeNumber
				+ ", organizationNameNK1=" + organizationNameNK1 + ", maritalStatus=" + maritalStatus
				+ ", administrativeSex=" + administrativeSex + ", dateTimeofBirth=" + dateTimeofBirth
				+ ", livingDependency=" + livingDependency + ", ambulatoryStatus=" + ambulatoryStatus + ", citizenship="
				+ citizenship + ", primaryLanguage=" + primaryLanguage + ", livingArrangement=" + livingArrangement
				+ ", publicityCode=" + publicityCode + ", protectionIndicator=" + protectionIndicator
				+ ", studentIndicator=" + studentIndicator + ", religion=" + religion + ", mothersMaidenName="
				+ mothersMaidenName + ", nationality=" + nationality + ", ethnicGroup=" + ethnicGroup
				+ ", contactReason=" + contactReason + ", contactPersonsName=" + contactPersonsName
				+ ", contactPersonsTelephoneNumber=" + contactPersonsTelephoneNumber + ", contactPersonsAddress="
				+ contactPersonsAddress + ", nextofKinAssociatedPartysIdentifiers="
				+ nextofKinAssociatedPartysIdentifiers + ", jobStatus=" + jobStatus + ", race=" + race + ", handicap="
				+ handicap + ", contactPersonSocialSecurityNumber=" + contactPersonSocialSecurityNumber
				+ ", nextofKinBirthPlace=" + nextofKinBirthPlace + ", vIPIndicator=" + vIPIndicator + "]";
	}
}