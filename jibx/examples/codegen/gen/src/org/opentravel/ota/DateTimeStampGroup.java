
package org.opentravel.ota;

import java.util.Date;

/** 
 * Creation date time, Creator Id, last modification date time and last Modifier Id.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DateTimeStampGroup">
 *   &lt;xs:attribute type="xs:dateTime" use="optional" name="CreateDateTime"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="CreatorID"/>
 *   &lt;xs:attribute type="xs:dateTime" use="optional" name="LastModifyDateTime"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="LastModifierID"/>
 *   &lt;xs:attribute type="xs:date" use="optional" name="PurgeDate"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class DateTimeStampGroup
{
    private Date createDateTime;
    private String creatorID;
    private Date lastModifyDateTime;
    private String lastModifierID;
    private java.sql.Date purgeDate;

    /** 
     * Get the 'CreateDateTime' attribute value. Time stamp of the creation.
     * 
     * @return value
     */
    public Date getCreateDateTime() {
        return createDateTime;
    }

    /** 
     * Set the 'CreateDateTime' attribute value. Time stamp of the creation.
     * 
     * @param createDateTime
     */
    public void setCreateDateTime(Date createDateTime) {
        this.createDateTime = createDateTime;
    }

    /** 
     * Get the 'CreatorID' attribute value. ID of creator. The creator could be a software system identifier or an identifier of an employee resposible for the creation.
     * 
     * @return value
     */
    public String getCreatorID() {
        return creatorID;
    }

    /** 
     * Set the 'CreatorID' attribute value. ID of creator. The creator could be a software system identifier or an identifier of an employee resposible for the creation.
     * 
     * @param creatorID
     */
    public void setCreatorID(String creatorID) {
        this.creatorID = creatorID;
    }

    /** 
     * Get the 'LastModifyDateTime' attribute value. Time stamp of last modification.
     * 
     * @return value
     */
    public Date getLastModifyDateTime() {
        return lastModifyDateTime;
    }

    /** 
     * Set the 'LastModifyDateTime' attribute value. Time stamp of last modification.
     * 
     * @param lastModifyDateTime
     */
    public void setLastModifyDateTime(Date lastModifyDateTime) {
        this.lastModifyDateTime = lastModifyDateTime;
    }

    /** 
     * Get the 'LastModifierID' attribute value. Identifies the last software system or person to modify a record.
     * 
     * @return value
     */
    public String getLastModifierID() {
        return lastModifierID;
    }

    /** 
     * Set the 'LastModifierID' attribute value. Identifies the last software system or person to modify a record.
     * 
     * @param lastModifierID
     */
    public void setLastModifierID(String lastModifierID) {
        this.lastModifierID = lastModifierID;
    }

    /** 
     * Get the 'PurgeDate' attribute value. Date an item will be purged from a database (e.g., from a live database to an archive).
     * 
     * @return value
     */
    public java.sql.Date getPurgeDate() {
        return purgeDate;
    }

    /** 
     * Set the 'PurgeDate' attribute value. Date an item will be purged from a database (e.g., from a live database to an archive).
     * 
     * @param purgeDate
     */
    public void setPurgeDate(java.sql.Date purgeDate) {
        this.purgeDate = purgeDate;
    }
}
