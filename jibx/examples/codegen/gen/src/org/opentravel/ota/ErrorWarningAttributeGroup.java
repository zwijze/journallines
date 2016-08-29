
package org.opentravel.ota;

/** 
 * Used to identify an application error by either text, code, or by an online description and also to give the status, tag, and/or identification of the record that may have caused the error.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ErrorWarningAttributeGroup">
 *   &lt;xs:attribute type="xs:string" use="optional" name="ShortText"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="Code"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="DocURL"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="Status"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="Tag"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="RecordID"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class ErrorWarningAttributeGroup
{
    private String shortText;
    private String code;
    private String docURL;
    private String status;
    private String tag;
    private String recordID;

    /** 
     * Get the 'ShortText' attribute value.
     * 
     * @return value
     */
    public String getShortText() {
        return shortText;
    }

    /** 
     * Set the 'ShortText' attribute value.
     * 
     * @param shortText
     */
    public void setShortText(String shortText) {
        this.shortText = shortText;
    }

    /** 
     * Get the 'Code' attribute value. If present, this refers to a table of coded values exchanged between applications to identify errors or warnings. Refer to OTA Code List Error Codes (ERR).
     * 
     * @return value
     */
    public String getCode() {
        return code;
    }

    /** 
     * Set the 'Code' attribute value. If present, this refers to a table of coded values exchanged between applications to identify errors or warnings. Refer to OTA Code List Error Codes (ERR).
     * 
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /** 
     * Get the 'DocURL' attribute value. If present, this URL refers to an online description of the error that occurred.
     * 
     * @return value
     */
    public String getDocURL() {
        return docURL;
    }

    /** 
     * Set the 'DocURL' attribute value. If present, this URL refers to an online description of the error that occurred.
     * 
     * @param docURL
     */
    public void setDocURL(String docURL) {
        this.docURL = docURL;
    }

    /** 
     * Get the 'Status' attribute value. If present, recommended values are those enumerated in the OTA_ErrorRS, (NotProcessed | Incomplete | Complete | Unknown) however, the data type is designated as string data, recognizing that trading partners may identify additional status conditions not included in the enumeration.
     * 
     * @return value
     */
    public String getStatus() {
        return status;
    }

    /** 
     * Set the 'Status' attribute value. If present, recommended values are those enumerated in the OTA_ErrorRS, (NotProcessed | Incomplete | Complete | Unknown) however, the data type is designated as string data, recognizing that trading partners may identify additional status conditions not included in the enumeration.
     * 
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** 
     * Get the 'Tag' attribute value. If present, this attribute may identify an unknown or misspelled tag that caused an error in processing. It is recommended that the Tag attribute use XPath notation to identify the location of a tag in the event that more than one tag of the same name is present in the document. Alternatively, the tag name alone can be used to identify missing data [Type=ReqFieldMissing].
     * 
     * @return value
     */
    public String getTag() {
        return tag;
    }

    /** 
     * Set the 'Tag' attribute value. If present, this attribute may identify an unknown or misspelled tag that caused an error in processing. It is recommended that the Tag attribute use XPath notation to identify the location of a tag in the event that more than one tag of the same name is present in the document. Alternatively, the tag name alone can be used to identify missing data [Type=ReqFieldMissing].
     * 
     * @param tag
     */
    public void setTag(String tag) {
        this.tag = tag;
    }

    /** 
     * Get the 'RecordID' attribute value. If present, this attribute allows for batch processing and the identification of the record that failed amongst a group of records. This value may contain a concatenation of a unique failed transaction ID with specific record(s) associated with that transaction.
     * 
     * @return value
     */
    public String getRecordID() {
        return recordID;
    }

    /** 
     * Set the 'RecordID' attribute value. If present, this attribute allows for batch processing and the identification of the record that failed amongst a group of records. This value may contain a concatenation of a unique failed transaction ID with specific record(s) associated with that transaction.
     * 
     * @param recordID
     */
    public void setRecordID(String recordID) {
        this.recordID = recordID;
    }
}
