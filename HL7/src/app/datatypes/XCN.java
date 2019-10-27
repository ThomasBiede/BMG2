package app.datatypes;

import java.time.LocalDate;

/**
 * XCN
 */
public class XCN {

    private String idNumber;
    private String familyName;
    private String givenName;
    private String secondAndFurtherGivenNamesOrInitialsThereof;
    private String suffixegJrOrIii;
    private String prefixegDr;
    private String degreeegMd;
    private String sourceTable;
    private String assigningAuthority;
    private String nameTypeCode;
    private String identifierCheckDigit;
    private String checkDigitScheme;
    private String identifierTypeCode;
    private String assigningFacility;
    private String nameRepresentationCode;
    private String nameContext;
    private Object nameValidityRange;
    private String nameAssemblyOrder;
    private LocalDate effectiveDate;
    private LocalDate expirationDate;
    private String professionalSuffix;
    private String assigningJurisdiction;
    private String assigningAgencyOrDepartment;

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
    public XCN(String idNumber, String familyName, String givenName,
            String secondAndFurtherGivenNamesOrInitialsThereof, String suffixegJrOrIii,
            String prefixegDr, String degreeegMd, String sourceTable, String assigningAuthority,
            String nameTypeCode, String identifierCheckDigit, String checkDigitScheme,
            String identifierTypeCode, String assigningFacility, String nameRepresentationCode,
            String nameContext, Object nameValidityRange, String nameAssemblyOrder, LocalDate effectiveDate,
            LocalDate expirationDate, String professionalSuffix, String assigningJurisdiction,
            String assigningAgencyOrDepartment) {

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
}