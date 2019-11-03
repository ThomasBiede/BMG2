package app.hl7_types.datatype;

import app.annotations.XmlField;
import app.annotations.XmlSerializeable;
import app.parsing.EncodingCharacters;

import app.parsing.Utils;

/**
 * @author Thomas Biedermann
 * @author Daniel Karner
 */
@XmlSerializeable
public class XTN 
{
    @XmlField
    String telephoneNumber;
    @XmlField
    String telecommunicationUseCode;
    @XmlField
    String telecommunicationEquipmentType;
    @XmlField
    String emailAddress;
    @XmlField
    String countryCode;
    @XmlField
    String areaCityCode;
    @XmlField
    String localNumber;
    @XmlField
    String extension;
    @XmlField
    String anyText;
    @XmlField
    String extensionPrefix;
    @XmlField
    String speedDialCode;
    @XmlField
    String unformattedTelephoneNumber;

    /**
     * @param telephoneNumber
     * @param telecommunicationUseCode
     * @param telecommunicationEquipmentType
     * @param emailAddress
     * @param countryCode
     * @param areaCityCode
     * @param localNumber
     * @param extension
     * @param anyText
     * @param extensionPrefix
     * @param speedDialCode
     * @param unformattedTelephoneNumber
     */
    public XTN(
    		String telephoneNumber, 
    		String telecommunicationUseCode, 
    		String telecommunicationEquipmentType,
            String emailAddress, 
            String countryCode, 
            String areaCityCode, 
            String localNumber, 
            String extension,
            String anyText, 
            String extensionPrefix, 
            String speedDialCode, 
            String unformattedTelephoneNumber) 
    {
        this.telephoneNumber = telephoneNumber;
        this.telecommunicationUseCode = telecommunicationUseCode;
        this.telecommunicationEquipmentType = telecommunicationEquipmentType;
        this.emailAddress = emailAddress;
        this.countryCode = countryCode;
        this.areaCityCode = areaCityCode;
        this.localNumber = localNumber;
        this.extension = extension;
        this.anyText = anyText;
        this.extensionPrefix = extensionPrefix;
        this.speedDialCode = speedDialCode;
        this.unformattedTelephoneNumber = unformattedTelephoneNumber;
    }
    
    /**
     * @param HL7String
     * @param encodingCharacters
     */
    public XTN(String HL7String, EncodingCharacters encodingCharacters) 
    {
    	String[] tokens = Utils.tokenizeHL7(HL7String, encodingCharacters.getComponentSeperator(), encodingCharacters.getEscapeCharacter(), 12);
    	this.telephoneNumber = tokens[0];
        this.telecommunicationUseCode = tokens[1];
        this.telecommunicationEquipmentType = tokens[2];
        this.emailAddress = tokens[3];
        this.countryCode = tokens[4];
        this.areaCityCode = tokens[5];
        this.localNumber = tokens[6];
        this.extension = tokens[7];
        this.anyText = tokens[8];
        this.extensionPrefix = tokens[9];
        this.speedDialCode = tokens[10];
        this.unformattedTelephoneNumber = tokens[11];
    }

	@Override
	public String toString() 
	{
		// TODO: Auto-generated, replace with HL7parse
		return "XTN [telephoneNumber=" + telephoneNumber + ", telecommunicationUseCode=" + telecommunicationUseCode
				+ ", telecommunicationEquipmentType=" + telecommunicationEquipmentType + ", emailAddress="
				+ emailAddress + ", countryCode=" + countryCode + ", areaCityCode=" + areaCityCode + ", localNumber="
				+ localNumber + ", extension=" + extension + ", anyText=" + anyText + ", extensionPrefix="
				+ extensionPrefix + ", speedDialCode=" + speedDialCode + ", unformattedTelephoneNumber="
				+ unformattedTelephoneNumber + "]";
    }
    
    /**
     * @return the anyText
     */
    public String getAnyText() {
        return anyText;
    }/**
     * @return the areaCityCode
     */
    public String getAreaCityCode() {
        return areaCityCode;
    }/**
     * @return the countryCode
     */
    public String getCountryCode() {
        return countryCode;
    }/**
     * @return the emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }/**
     * @return the extension
     */
    public String getExtension() {
        return extension;
    }/**
     * @return the extensionPrefix
     */
    public String getExtensionPrefix() {
        return extensionPrefix;
    }/**
     * @return the localNumber
     */
    public String getLocalNumber() {
        return localNumber;
    }/**
     * @return the speedDialCode
     */
    public String getSpeedDialCode() {
        return speedDialCode;
    }/**
     * @return the telecommunicationEquipmentType
     */
    public String getTelecommunicationEquipmentType() {
        return telecommunicationEquipmentType;
    }/**
     * @return the telecommunicationUseCode
     */
    public String getTelecommunicationUseCode() {
        return telecommunicationUseCode;
    }/**
     * @return the telephoneNumber
     */
    public String getTelephoneNumber() {
        return telephoneNumber;
    }/**
     * @return the unformattedTelephoneNumber
     */
    public String getUnformattedTelephoneNumber() {
        return unformattedTelephoneNumber;
    }
}