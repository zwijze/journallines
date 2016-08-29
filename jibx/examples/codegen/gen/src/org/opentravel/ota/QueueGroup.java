
package org.opentravel.ota;

/** 
 * Information to identify a queue.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="QueueGroup">
 *   &lt;xs:attribute type="xs:string" use="optional" name="PseudoCityCode"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="QueueNumber"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="QueueCategory"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="SystemCode"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="QueueID"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class QueueGroup
{
    private String pseudoCityCode;
    private String queueNumber;
    private String queueCategory;
    private String systemCode;
    private String queueID;

    /** 
     * Get the 'PseudoCityCode' attribute value. The ATA/IATA airport/city code, office code, pseudo city code, etc. of the queue.
     * 
     * @return value
     */
    public String getPseudoCityCode() {
        return pseudoCityCode;
    }

    /** 
     * Set the 'PseudoCityCode' attribute value. The ATA/IATA airport/city code, office code, pseudo city code, etc. of the queue.
     * 
     * @param pseudoCityCode
     */
    public void setPseudoCityCode(String pseudoCityCode) {
        this.pseudoCityCode = pseudoCityCode;
    }

    /** 
     * Get the 'QueueNumber' attribute value. An identifier specifying the queue on which the booking file resides in the system.
     * 
     * @return value
     */
    public String getQueueNumber() {
        return queueNumber;
    }

    /** 
     * Set the 'QueueNumber' attribute value. An identifier specifying the queue on which the booking file resides in the system.
     * 
     * @param queueNumber
     */
    public void setQueueNumber(String queueNumber) {
        this.queueNumber = queueNumber;
    }

    /** 
     * Get the 'QueueCategory' attribute value. The category of the queue.
     * 
     * @return value
     */
    public String getQueueCategory() {
        return queueCategory;
    }

    /** 
     * Set the 'QueueCategory' attribute value. The category of the queue.
     * 
     * @param queueCategory
     */
    public void setQueueCategory(String queueCategory) {
        this.queueCategory = queueCategory;
    }

    /** 
     * Get the 'SystemCode' attribute value. Identifies the airline and/or system where the queue resides. If this is omitted, the airline and/or system code (AirlineVendorID) contained in the point of sale information should be used.
     * 
     * @return value
     */
    public String getSystemCode() {
        return systemCode;
    }

    /** 
     * Set the 'SystemCode' attribute value. Identifies the airline and/or system where the queue resides. If this is omitted, the airline and/or system code (AirlineVendorID) contained in the point of sale information should be used.
     * 
     * @param systemCode
     */
    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode;
    }

    /** 
     * Get the 'QueueID' attribute value. An additional identifier to determine the exact queue on which a reservation record should be placed
     * 
     * @return value
     */
    public String getQueueID() {
        return queueID;
    }

    /** 
     * Set the 'QueueID' attribute value. An additional identifier to determine the exact queue on which a reservation record should be placed
     * 
     * @param queueID
     */
    public void setQueueID(String queueID) {
        this.queueID = queueID;
    }
}
