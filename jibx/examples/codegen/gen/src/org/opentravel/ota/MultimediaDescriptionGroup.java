
package org.opentravel.ota;

/** 
 * Generic information about a multimedia item.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MultimediaDescriptionGroup">
 *   &lt;xs:attribute type="xs:string" use="optional" name="ContentID"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="Title"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="Author"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="CopyrightNotice"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="CopyrightOwner"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="CopyrightStart"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="CopyrightEnd"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="EffectiveStart"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="EffectiveEnd"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="ApplicableStart"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="ApplicableEnd"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="RecordID"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="SourceID"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class MultimediaDescriptionGroup
{
    private String contentID;
    private String title;
    private String author;
    private String copyrightNotice;
    private String copyrightOwner;
    private String copyrightStart;
    private String copyrightEnd;
    private String effectiveStart;
    private String effectiveEnd;
    private String applicableStart;
    private String applicableEnd;
    private String recordID;
    private String sourceID;

    /** 
     * Get the 'ContentID' attribute value. The content ID of a file attachment with the prefix 'cid:'. The value of this can be used to retrieve the corresponding attachment by the receiving system.
     * 
     * @return value
     */
    public String getContentID() {
        return contentID;
    }

    /** 
     * Set the 'ContentID' attribute value. The content ID of a file attachment with the prefix 'cid:'. The value of this can be used to retrieve the corresponding attachment by the receiving system.
     * 
     * @param contentID
     */
    public void setContentID(String contentID) {
        this.contentID = contentID;
    }

    /** 
     * Get the 'Title' attribute value. The title of the multimedia object.
     * 
     * @return value
     */
    public String getTitle() {
        return title;
    }

    /** 
     * Set the 'Title' attribute value. The title of the multimedia object.
     * 
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /** 
     * Get the 'Author' attribute value. The author of the multimedia object.
     * 
     * @return value
     */
    public String getAuthor() {
        return author;
    }

    /** 
     * Set the 'Author' attribute value. The author of the multimedia object.
     * 
     * @param author
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /** 
     * Get the 'CopyrightNotice' attribute value. A copyright notice for the multimedia object.
     * 
     * @return value
     */
    public String getCopyrightNotice() {
        return copyrightNotice;
    }

    /** 
     * Set the 'CopyrightNotice' attribute value. A copyright notice for the multimedia object.
     * 
     * @param copyrightNotice
     */
    public void setCopyrightNotice(String copyrightNotice) {
        this.copyrightNotice = copyrightNotice;
    }

    /** 
     * Get the 'CopyrightOwner' attribute value. Owner of the copyright for the multimedia content.
     * 
     * @return value
     */
    public String getCopyrightOwner() {
        return copyrightOwner;
    }

    /** 
     * Set the 'CopyrightOwner' attribute value. Owner of the copyright for the multimedia content.
     * 
     * @param copyrightOwner
     */
    public void setCopyrightOwner(String copyrightOwner) {
        this.copyrightOwner = copyrightOwner;
    }

    /** 
     * Get the 'CopyrightStart' attribute value. The start date for which the multimedia content rights are claimed.
     * 
     * @return value
     */
    public String getCopyrightStart() {
        return copyrightStart;
    }

    /** 
     * Set the 'CopyrightStart' attribute value. The start date for which the multimedia content rights are claimed.
     * 
     * @param copyrightStart
     */
    public void setCopyrightStart(String copyrightStart) {
        this.copyrightStart = copyrightStart;
    }

    /** 
     * Get the 'CopyrightEnd' attribute value. The end date for which the multimedia content rights are claimed.
     * 
     * @return value
     */
    public String getCopyrightEnd() {
        return copyrightEnd;
    }

    /** 
     * Set the 'CopyrightEnd' attribute value. The end date for which the multimedia content rights are claimed.
     * 
     * @param copyrightEnd
     */
    public void setCopyrightEnd(String copyrightEnd) {
        this.copyrightEnd = copyrightEnd;
    }

    /** 
     * Get the 'EffectiveStart' attribute value. The start date for which the content is considered valid.
     * 
     * @return value
     */
    public String getEffectiveStart() {
        return effectiveStart;
    }

    /** 
     * Set the 'EffectiveStart' attribute value. The start date for which the content is considered valid.
     * 
     * @param effectiveStart
     */
    public void setEffectiveStart(String effectiveStart) {
        this.effectiveStart = effectiveStart;
    }

    /** 
     * Get the 'EffectiveEnd' attribute value. The end date for which the content is considered valid.
     * 
     * @return value
     */
    public String getEffectiveEnd() {
        return effectiveEnd;
    }

    /** 
     * Set the 'EffectiveEnd' attribute value. The end date for which the content is considered valid.
     * 
     * @param effectiveEnd
     */
    public void setEffectiveEnd(String effectiveEnd) {
        this.effectiveEnd = effectiveEnd;
    }

    /** 
     * Get the 'ApplicableStart' attribute value. Start month and day or date for which the multimedia content is relevent (e.g. the start of a season or the start of an event). When a year is not used (i.e. only the month and day) it signifies a recurring event.
     * 
     * @return value
     */
    public String getApplicableStart() {
        return applicableStart;
    }

    /** 
     * Set the 'ApplicableStart' attribute value. Start month and day or date for which the multimedia content is relevent (e.g. the start of a season or the start of an event). When a year is not used (i.e. only the month and day) it signifies a recurring event.
     * 
     * @param applicableStart
     */
    public void setApplicableStart(String applicableStart) {
        this.applicableStart = applicableStart;
    }

    /** 
     * Get the 'ApplicableEnd' attribute value. End month and day or date for which the multimedia content is relevent (e.g. the end of a season or the start of an event). When a year is not used (i.e. only the month and day) it signifies a recurring event.
     * 
     * @return value
     */
    public String getApplicableEnd() {
        return applicableEnd;
    }

    /** 
     * Set the 'ApplicableEnd' attribute value. End month and day or date for which the multimedia content is relevent (e.g. the end of a season or the start of an event). When a year is not used (i.e. only the month and day) it signifies a recurring event.
     * 
     * @param applicableEnd
     */
    public void setApplicableEnd(String applicableEnd) {
        this.applicableEnd = applicableEnd;
    }

    /** 
     * Get the 'RecordID' attribute value. Uniquely identifies this file in the message.
     * 
     * @return value
     */
    public String getRecordID() {
        return recordID;
    }

    /** 
     * Set the 'RecordID' attribute value. Uniquely identifies this file in the message.
     * 
     * @param recordID
     */
    public void setRecordID(String recordID) {
        this.recordID = recordID;
    }

    /** 
     * Get the 'SourceID' attribute value. Unique identifier for the source of the multimedia object (e.g., the original image file).
     * 
     * @return value
     */
    public String getSourceID() {
        return sourceID;
    }

    /** 
     * Set the 'SourceID' attribute value. Unique identifier for the source of the multimedia object (e.g., the original image file).
     * 
     * @param sourceID
     */
    public void setSourceID(String sourceID) {
        this.sourceID = sourceID;
    }
}
