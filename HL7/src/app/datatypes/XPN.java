package app.datatypes;

import java.time.LocalDate;

/**
 * XPN
 */
public class XPN {

    private String familyName;
    private String givenName;
    private String secondAndFurtherGivenNamesOrInitialsThereof;
    private String suffixegJrOrIii;
    private String prefixegDr;
    private String degreeegMd;
    private String nameTypeCode;
    private String nameRepresentationCode;
    private String nameContext;
    private Object nameValidityRange;
    private String nameAssemblyOrder;
    private LocalDate effectiveDate;
    private LocalDate expirationDate;
    private String professionalSuffix;

    /**
     * @param familyName
     * @param givenName
     * @param secondAndFurtherGivenNamesOrInitialsThereof
     * @param suffixegJrOrIii
     * @param prefixegDr
     * @param degreeegMd
     * @param nameTypeCode
     * @param nameRepresentationCode
     * @param nameContext
     * @param nameValidityRange
     * @param nameAssemblyOrder
     * @param effectiveDate
     * @param expirationDate
     * @param professionalSuffix
     */
    public XPN(String familyName, String givenName, String secondAndFurtherGivenNamesOrInitialsThereof,
            String suffixegJrOrIii, String prefixegDr, String degreeegMd, String nameTypeCode,
            String nameRepresentationCode, String nameContext, Object nameValidityRange,
            String nameAssemblyOrder, LocalDate effectiveDate, LocalDate expirationDate,
            String professionalSuffix) {

        this.familyName = familyName;
        this.givenName = givenName;
        this.secondAndFurtherGivenNamesOrInitialsThereof = secondAndFurtherGivenNamesOrInitialsThereof;
        this.suffixegJrOrIii = suffixegJrOrIii;
        this.prefixegDr = prefixegDr;
        this.degreeegMd = degreeegMd;
        this.nameTypeCode = nameTypeCode;
        this.nameRepresentationCode = nameRepresentationCode;
        this.nameContext = nameContext;
        this.nameValidityRange = nameValidityRange;
        this.nameAssemblyOrder = nameAssemblyOrder;
        this.effectiveDate = effectiveDate;
        this.expirationDate = expirationDate;
        this.professionalSuffix = professionalSuffix;
    }
}