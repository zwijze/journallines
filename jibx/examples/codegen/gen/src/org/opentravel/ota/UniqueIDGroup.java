
package org.opentravel.ota;

/** 
 * Provides unique identification information.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="UniqueID_Group">
 *   &lt;xs:attribute type="xs:string" name="URL"/>
 *   &lt;xs:attribute type="xs:string" use="required" name="Type"/>
 *   &lt;xs:attribute type="xs:string" name="Instance"/>
 *   &lt;xs:attributeGroup ref="ns:ID_Group"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="ID_Context"/>
 * &lt;/xs:attributeGroup>
 * 
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ID_Group">
 *   &lt;xs:attribute type="xs:string" use="required" name="ID"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class UniqueIDGroup
{
    private String URL;
    private String type;
    private String instance;
    private String ID;
    private String IDContext;

    /** 
     * Get the 'URL' attribute value. URL that identifies the location associated with the record identified by the UniqueID.
     * 
     * @return value
     */
    public String getURL() {
        return URL;
    }

    /** 
     * Set the 'URL' attribute value. URL that identifies the location associated with the record identified by the UniqueID.
     * 
     * @param URL
     */
    public void setURL(String URL) {
        this.URL = URL;
    }

    /** 
     * Get the 'Type' attribute value. A reference to the type of object defined by the UniqueID element. Refer to OTA Code List Unique ID Type (UIT).
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'Type' attribute value. A reference to the type of object defined by the UniqueID element. Refer to OTA Code List Unique ID Type (UIT).
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
     * Get the 'Instance' attribute value. The identification of a record as it exists at a point in time. An instance is used in update messages where the sender must assure the server that the update sent refers to the most recent modification level of the object being updated.
     * 
     * @return value
     */
    public String getInstance() {
        return instance;
    }

    /** 
     * Set the 'Instance' attribute value. The identification of a record as it exists at a point in time. An instance is used in update messages where the sender must assure the server that the update sent refers to the most recent modification level of the object being updated.
     * 
     * @param instance
     */
    public void setInstance(String instance) {
        this.instance = instance;
    }

    /** 
     * Get the 'ID' attribute value. A unique identifying value assigned by the creating system.  The ID attribute may be used to reference a primary-key value within a database or in a particular implementation.
     * 
     * @return value
     */
    public String getID() {
        return ID;
    }

    /** 
     * Set the 'ID' attribute value. A unique identifying value assigned by the creating system.  The ID attribute may be used to reference a primary-key value within a database or in a particular implementation.
     * 
     * @param ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /** 
     * Get the 'ID_Context' attribute value. Used to identify the source of the identifier (e.g., IATA, ABTA).
     * 
     * @return value
     */
    public String getIDContext() {
        return IDContext;
    }

    /** 
     * Set the 'ID_Context' attribute value. Used to identify the source of the identifier (e.g., IATA, ABTA).
     * 
     * @param IDContext
     */
    public void setIDContext(String IDContext) {
        this.IDContext = IDContext;
    }
}
