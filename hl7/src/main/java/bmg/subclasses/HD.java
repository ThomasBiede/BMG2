package main.java.bmg.subclasses;

/**
 * Hierachy Designator (HD)
 */
public class HD {

    private String namespaceId;
    private String universalId;
    private String universalIdType;
    
    /**
     * Constructor for the HD class
     * 
     * @param namespaceId
     * @param universalId
     * @param universalIdType
     */
    public HD(String namespaceId, String universalId, String universalIdType) {
        super();
        this.namespaceId     = namespaceId;
        this.universalId     = universalId;
        this.universalIdType = universalIdType;
    }

    /**
     * @param namespaceId the namespaceId to set
     */
    public void setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
    }

    /**
     * @return the namespaceId
     */
    public String getNamespaceId() {
        return namespaceId;
    }

    /**
     * @param universalId the universalId to set
     */
    public void setUniversalId(String universalId) {
        this.universalId = universalId;
    }

    /**
     * @return the universalId
     */
    public String getUniversalId() {
        return universalId;
    }

    /**
     * @param universalIdType the universalIdType to set
     */
    public void setUniversalIdType(String universalIdType) {
        this.universalIdType = universalIdType;
    }

    /**
     * @return the universalIdType
     */
    public String getUniversalIdType() {
        return universalIdType;
    }
}