package app.datatypes;

/**
 * XTN
 */
public class XTN {

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
     */
    public XTN(String telephoneNumber, String telecommunicationUseCode, String telecommunicationEquipmentType,
            String emailAddress, double countryCode, double areaCityCode, double localNumber, double extension,
            String anyText, String extensionPrefix, String speedDialCode, String unformattedTelephoneNumber) {

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