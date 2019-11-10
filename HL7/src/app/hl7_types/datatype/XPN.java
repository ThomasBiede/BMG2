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
@Hl7Serializeable(layer = 2)
public class XPN {

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
    String nameTypeCode;
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
            String nameRepresentationCode, String nameContext, String nameValidityRange, String nameAssemblyOrder,
            LocalDate effectiveDate, LocalDate expirationDate, String professionalSuffix) {
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

    /**
     * @param HL7String
     * @param encodingCharacters
     */
    public XPN(String HL7String, EncodingCharacters encodingCharacters) {
        String[] tokens = Utils.tokenizeHL7(HL7String, encodingCharacters.getComponentSeperator(),
                encodingCharacters.getEscapeCharacter(), 14);
        this.familyName = tokens[0];
        this.givenName = tokens[1];
        this.secondAndFurtherGivenNamesOrInitialsThereof = tokens[2];
        this.suffixegJrOrIii = tokens[3];
        this.prefixegDr = tokens[4];
        this.degreeegMd = tokens[5];
        this.nameTypeCode = tokens[6];
        this.nameRepresentationCode = tokens[7];
        this.nameContext = tokens[8];
        this.nameValidityRange = tokens[9];
        this.nameAssemblyOrder = tokens[10];
        this.effectiveDate = (LocalDate) Utils.toObject(tokens[11], LocalDate.class);
        this.expirationDate = (LocalDate) Utils.toObject(tokens[12], LocalDate.class);
        this.professionalSuffix = tokens[13];
    }

    @Override
    public String toString() {
        // TODO: Auto-generated, replace with HL7parse
        return "XPN [familyName=" + familyName + ", givenName=" + givenName
                + ", secondAndFurtherGivenNamesOrInitialsThereof=" + secondAndFurtherGivenNamesOrInitialsThereof
                + ", suffixegJrOrIii=" + suffixegJrOrIii + ", prefixegDr=" + prefixegDr + ", degreeegMd=" + degreeegMd
                + ", nameTypeCode=" + nameTypeCode + ", nameRepresentationCode=" + nameRepresentationCode
                + ", nameContext=" + nameContext + ", nameValidityRange=" + nameValidityRange + ", nameAssemblyOrder="
                + nameAssemblyOrder + ", effectiveDate=" + effectiveDate + ", expirationDate=" + expirationDate
                + ", professionalSuffix=" + professionalSuffix + "]";
    }

    /**
     * @return the degreeegMd
     */
    public String getDegreeegMd() {
        return degreeegMd;
    }

    /**
     * @return the effectiveDate
     */
    public LocalDate getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * @return the expirationDate
     */
    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    /**
     * @return the familyName
     */
    public String getFamilyName() {
        return familyName;
    }

    /**
     * @return the givenName
     */
    public String getGivenName() {
        return givenName;
    }

    /**
     * @return the nameAssemblyOrder
     */
    public String getNameAssemblyOrder() {
        return nameAssemblyOrder;
    }

    /**
     * @return the nameContext
     */
    public String getNameContext() {
        return nameContext;
    }

    /**
     * @return the nameRepresentationCode
     */
    public String getNameRepresentationCode() {
        return nameRepresentationCode;
    }

    /**
     * @return the nameTypeCode
     */
    public String getNameTypeCode() {
        return nameTypeCode;
    }

    /**
     * @return the nameValidityRange
     */
    public String getNameValidityRange() {
        return nameValidityRange;
    }

    /**
     * @return the prefixegDr
     */
    public String getPrefixegDr() {
        return prefixegDr;
    }

    /**
     * @return the professionalSuffix
     */
    public String getProfessionalSuffix() {
        return professionalSuffix;
    }

    /**
     * @return the secondAndFurtherGivenNamesOrInitialsThereof
     */
    public String getSecondAndFurtherGivenNamesOrInitialsThereof() {
        return secondAndFurtherGivenNamesOrInitialsThereof;
    }

    /**
     * @return the suffixegJrOrIii
     */
    public String getSuffixegJrOrIii() {
        return suffixegJrOrIii;
    }
}