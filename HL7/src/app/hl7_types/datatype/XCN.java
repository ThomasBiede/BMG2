package app.hl7_types.datatype;

import java.time.LocalDate;

import app.hl7_parser.Hl7Field;
import app.hl7_parser.Hl7Serializeable;
import app.parsing.EncodingCharacters;
import app.parsing.Utils;

/**
 * @author Thomas Biedermann
 * @author Daniel Karner
 */
@Hl7Serializeable
public class XCN 
{
    @Hl7Field
    String idNumber;
    @Hl7Field
    String familyName;
    @Hl7Field
    String givenName;
    @Hl7Field
    String secondAndFurtherGivenNamesOrInitialsThereof;
    @Hl7Field
    String suffixegJrOrIii;
    @Hl7Field
    String prefixegDr;
    @Hl7Field
    String degreeegMd;
    @Hl7Field
    String sourceTable;
    @Hl7Field
    String assigningAuthority;
    @Hl7Field
    String nameTypeCode;
    @Hl7Field
    String identifierCheckDigit;
    @Hl7Field
    String checkDigitScheme;
    @Hl7Field
    String identifierTypeCode;
    @Hl7Field
    String assigningFacility;
    @Hl7Field
    String nameRepresentationCode;
    @Hl7Field
    String nameContext;
    @Hl7Field
    String nameValidityRange;
    @Hl7Field
    String nameAssemblyOrder;
    @Hl7Field
    LocalDate effectiveDate;
    @Hl7Field
    LocalDate expirationDate;
    @Hl7Field
    String professionalSuffix;
    @Hl7Field
    String assigningJurisdiction;
    @Hl7Field
    String assigningAgencyOrDepartment;

    /**
     * @param idNumber
     * @param familyName
     * @param givenName
     * @param secondAndFurtherGivenNamesOrInitialsThereof
     * @param suffixegJrOrIii
     * @param prefixegDr
     * @param degreeegMd
     * @param sourceTable
     * @param assigningAuthority
     * @param nameTypeCode
     * @param identifierCheckDigit
     * @param checkDigitScheme
     * @param identifierTypeCode
     * @param assigningFacility
     * @param nameRepresentationCode
     * @param nameContext
     * @param nameValidityRange
     * @param nameAssemblyOrder
     * @param effectiveDate
     * @param expirationDate
     * @param professionalSuffix
     * @param assigningJurisdiction
     * @param assigningAgencyOrDepartment
     */
    public XCN(
    		String idNumber, 
    		String familyName, 
    		String givenName,
            String secondAndFurtherGivenNamesOrInitialsThereof, 
            String suffixegJrOrIii,
            String prefixegDr, 
            String degreeegMd, 
            String sourceTable, 
            String assigningAuthority,
            String nameTypeCode, 
            String identifierCheckDigit, 
            String checkDigitScheme,
            String identifierTypeCode, 
            String assigningFacility, 
            String nameRepresentationCode,
            String nameContext, 
            String nameValidityRange, 
            String nameAssemblyOrder, 
            LocalDate effectiveDate,
            LocalDate expirationDate, 
            String professionalSuffix, 
            String assigningJurisdiction,
            String assigningAgencyOrDepartment) 
    {
        this.idNumber = idNumber;
        this.familyName = familyName;
        this.givenName = givenName;
        this.secondAndFurtherGivenNamesOrInitialsThereof = secondAndFurtherGivenNamesOrInitialsThereof;
        this.suffixegJrOrIii = suffixegJrOrIii;
        this.prefixegDr = prefixegDr;
        this.degreeegMd = degreeegMd;
        this.sourceTable = sourceTable;
        this.assigningAuthority = assigningAuthority;
        this.nameTypeCode = nameTypeCode;
        this.identifierCheckDigit = identifierCheckDigit;
        this.checkDigitScheme = checkDigitScheme;
        this.identifierTypeCode = identifierTypeCode;
        this.assigningFacility = assigningFacility;
        this.nameRepresentationCode = nameRepresentationCode;
        this.nameContext = nameContext;
        this.nameValidityRange = nameValidityRange;
        this.nameAssemblyOrder = nameAssemblyOrder;
        this.effectiveDate = effectiveDate;
        this.expirationDate = expirationDate;
        this.professionalSuffix = professionalSuffix;
        this.assigningJurisdiction = assigningJurisdiction;
        this.assigningAgencyOrDepartment = assigningAgencyOrDepartment;
    }
    
    /**
     * @param HL7String
     * @param encodingCharacters
     */
    public XCN(String HL7String, EncodingCharacters encodingCharacters) 
    {
    	String[] tokens = Utils.tokenizeHL7(HL7String, encodingCharacters.getComponentSeperator(), encodingCharacters.getEscapeCharacter(), 23);
    	this.idNumber = tokens[0];
    	this.familyName = tokens[1];
    	this.givenName = tokens[2];
    	this.secondAndFurtherGivenNamesOrInitialsThereof = tokens[3];
    	this.suffixegJrOrIii = tokens[4];
    	this.prefixegDr = tokens[5];
    	this.degreeegMd = tokens[6];
    	this.sourceTable = tokens[7];
    	this.assigningAuthority = tokens[8];
    	this.nameTypeCode = tokens[9];
    	this.identifierCheckDigit = tokens[10];
    	this.checkDigitScheme = tokens[11];
    	this.identifierTypeCode = tokens[12];
    	this.assigningFacility = tokens[13];
    	this.nameRepresentationCode = tokens[14];
    	this.nameContext = tokens[15];
    	this.nameValidityRange = tokens[16];
    	this.nameAssemblyOrder = tokens[17];
    	this.effectiveDate = (LocalDate)Utils.toObject(tokens[18], LocalDate.class);
    	this.expirationDate= (LocalDate)Utils.toObject(tokens[19], LocalDate.class);
    	this.professionalSuffix = tokens[20];
    	this.assigningJurisdiction = tokens[21];
    	this.assigningAgencyOrDepartment = tokens[22];
    }

	@Override
	public String toString() 
	{
		// TODO: Auto-generated, replace with HL7parse
		return "XCN [idNumber=" + idNumber + ", familyName=" + familyName + ", givenName=" + givenName
				+ ", secondAndFurtherGivenNamesOrInitialsThereof=" + secondAndFurtherGivenNamesOrInitialsThereof
				+ ", suffixegJrOrIii=" + suffixegJrOrIii + ", prefixegDr=" + prefixegDr + ", degreeegMd=" + degreeegMd
				+ ", sourceTable=" + sourceTable + ", assigningAuthority=" + assigningAuthority + ", nameTypeCode="
				+ nameTypeCode + ", identifierCheckDigit=" + identifierCheckDigit + ", checkDigitScheme="
				+ checkDigitScheme + ", identifierTypeCode=" + identifierTypeCode + ", assigningFacility="
				+ assigningFacility + ", nameRepresentationCode=" + nameRepresentationCode + ", nameContext="
				+ nameContext + ", nameValidityRange=" + nameValidityRange + ", nameAssemblyOrder=" + nameAssemblyOrder
				+ ", effectiveDate=" + effectiveDate + ", expirationDate=" + expirationDate + ", professionalSuffix="
				+ professionalSuffix + ", assigningJurisdiction=" + assigningJurisdiction
				+ ", assigningAgencyOrDepartment=" + assigningAgencyOrDepartment + "]";
    }
    /**
     * @return the assigningAgencyOrDepartment
     */
    public String getAssigningAgencyOrDepartment() {
        return assigningAgencyOrDepartment;
    }/**
     * @return the assigningAuthority
     */
    public String getAssigningAuthority() {
        return assigningAuthority;
    }/**
     * @return the assigningFacility
     */
    public String getAssigningFacility() {
        return assigningFacility;
    }/**
     * @return the assigningJurisdiction
     */
    public String getAssigningJurisdiction() {
        return assigningJurisdiction;
    }/**
     * @return the checkDigitScheme
     */
    public String getCheckDigitScheme() {
        return checkDigitScheme;
    }/**
     * @return the degreeegMd
     */
    public String getDegreeegMd() {
        return degreeegMd;
    }/**
     * @return the effectiveDate
     */
    public LocalDate getEffectiveDate() {
        return effectiveDate;
    }/**
     * @return the expirationDate
     */
    public LocalDate getExpirationDate() {
        return expirationDate;
    }/**
     * @return the familyName
     */
    public String getFamilyName() {
        return familyName;
    }/**
     * @return the givenName
     */
    public String getGivenName() {
        return givenName;
    }/**
     * @return the idNumber
     */
    public String getIdNumber() {
        return idNumber;
    }/**
     * @return the identifierCheckDigit
     */
    public String getIdentifierCheckDigit() {
        return identifierCheckDigit;
    }/**
     * @return the identifierTypeCode
     */
    public String getIdentifierTypeCode() {
        return identifierTypeCode;
    }/**
     * @return the nameAssemblyOrder
     */
    public String getNameAssemblyOrder() {
        return nameAssemblyOrder;
    }/**
     * @return the nameContext
     */
    public String getNameContext() {
        return nameContext;
    }/**
     * @return the nameRepresentationCode
     */
    public String getNameRepresentationCode() {
        return nameRepresentationCode;
    }/**
     * @return the nameTypeCode
     */
    public String getNameTypeCode() {
        return nameTypeCode;
    }/**
     * @return the nameValidityRange
     */
    public String getNameValidityRange() {
        return nameValidityRange;
    }/**
     * @return the prefixegDr
     */
    public String getPrefixegDr() {
        return prefixegDr;
    }/**
     * @return the professionalSuffix
     */
    public String getProfessionalSuffix() {
        return professionalSuffix;
    }/**
     * @return the secondAndFurtherGivenNamesOrInitialsThereof
     */
    public String getSecondAndFurtherGivenNamesOrInitialsThereof() {
        return secondAndFurtherGivenNamesOrInitialsThereof;
    }/**
     * @return the sourceTable
     */
    public String getSourceTable() {
        return sourceTable;
    }/**
     * @return the suffixegJrOrIii
     */
    public String getSuffixegJrOrIii() {
        return suffixegJrOrIii;
    }
}