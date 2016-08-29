
package org.opentravel.ota;

/** 
 * Type of ticket distribution to be used with this collection of preferences.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TicketDistribPrefType">
 *   &lt;xs:simpleContent>
 *     &lt;xs:extension base="xs:string">
 *       &lt;xs:attributeGroup ref="ns:PreferLevelGroup"/>
 *       &lt;xs:attribute type="xs:string" name="DistribType"/>
 *       &lt;xs:attribute type="xs:string" name="TicketTime"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:simpleContent>
 * &lt;/xs:complexType>
 * 
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PreferLevelGroup">
 *   &lt;xs:attribute type="ns:PreferLevelType" use="optional" default="Preferred" name="PreferLevel"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class TicketDistribPrefType
{
    private String string;
    private PreferLevelType preferLevel;
    private String distribType;
    private String ticketTime;

    /** 
     * Get the extension value.
     * 
     * @return value
     */
    public String getString() {
        return string;
    }

    /** 
     * Set the extension value.
     * 
     * @param string
     */
    public void setString(String string) {
        this.string = string;
    }

    /** 
     * Get the 'PreferLevel' attribute value. Used to indicate a level of preference for an associated item.
     * 
     * @return value
     */
    public PreferLevelType getPreferLevel() {
        return preferLevel;
    }

    /** 
     * Set the 'PreferLevel' attribute value. Used to indicate a level of preference for an associated item.
     * 
     * @param preferLevel
     */
    public void setPreferLevel(PreferLevelType preferLevel) {
        this.preferLevel = preferLevel;
    }

    /** 
     * Get the 'DistribType' attribute value. Ticket distribution method such as Fax, Email, Courier, Mail, Airport_Pickup, City_Office, Hotel_Desk,
    WillCall, etc. Refer to OTA Code List Distribution Type (DTB).
     * 
     * @return value
     */
    public String getDistribType() {
        return distribType;
    }

    /** 
     * Set the 'DistribType' attribute value. Ticket distribution method such as Fax, Email, Courier, Mail, Airport_Pickup, City_Office, Hotel_Desk,
    WillCall, etc. Refer to OTA Code List Distribution Type (DTB).
     * 
     * @param distribType
     */
    public void setDistribType(String distribType) {
        this.distribType = distribType;
    }

    /** 
     * Get the 'TicketTime' attribute value. Ticket turnaround time desired, amount of time requested to deliver tickets.
     * 
     * @return value
     */
    public String getTicketTime() {
        return ticketTime;
    }

    /** 
     * Set the 'TicketTime' attribute value. Ticket turnaround time desired, amount of time requested to deliver tickets.
     * 
     * @param ticketTime
     */
    public void setTicketTime(String ticketTime) {
        this.ticketTime = ticketTime;
    }
}
