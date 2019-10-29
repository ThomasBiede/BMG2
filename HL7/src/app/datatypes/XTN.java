package app.datatypes;

/**
 * Java representation of datatype "XTN" from HL7 protocol. Visit <a href=
 * "http://hl7-definition.caristix.com:9010/Default.aspx?version=HL7+v2.5.1&dataType=XTN">HL7
 * documentation</a> for more info.
 * 
 * @author Thomas Biedermann
 * @author Daniel Karner
 * @version 1.1
 * @since 2019-10-27
 */

public class XTN 
{
    private String telephoneNumber;
    private String telecommunicationUseCode;
    private String telecommunicationEquipmentType;
    private String emailAddress;
    private double countryCode;
    private double areaCityCode;
    private double localNumber;
    private double extension;
    private String anyText;
    private String extensionPrefix;
    private String speedDialCode;
    private String unformattedTelephoneNumber;

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
     * @return XTN instance
     */

    public XTN(
        String telephoneNumber, 
        String telecommunicationUseCode, 
        String telecommunicationEquipmentType,
        String emailAddress, 
        double countryCode, 
        double areaCityCode, 
        double localNumber, 
        double extension,
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
}