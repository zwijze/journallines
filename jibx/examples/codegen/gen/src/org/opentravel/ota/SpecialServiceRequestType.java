
package org.opentravel.ota;

import java.math.BigInteger;

/** 
 * SSR's for this booking request e.g.,. meals
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SpecialServiceRequestType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:CompanyNameType" name="Airline" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="Text" minOccurs="0"/>
 *   &lt;/xs:sequence>
 *   &lt;xs:attribute type="xs:string" use="required" name="SSRCode"/>
 *   &lt;xs:attribute type="xs:integer" use="optional" name="ServiceQuantity"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="Status"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SpecialServiceRequestType
{
    private CompanyNameType airline;
    private String text;
    private String SSRCode;
    private BigInteger serviceQuantity;
    private String status;

    /** 
     * Get the 'Airline' element value. Specify airline to request availability for.
     * 
     * @return value
     */
    public CompanyNameType getAirline() {
        return airline;
    }

    /** 
     * Set the 'Airline' element value. Specify airline to request availability for.
     * 
     * @param airline
     */
    public void setAirline(CompanyNameType airline) {
        this.airline = airline;
    }

    /** 
     * Get the 'Text' element value. Text associated with remark
     * 
     * @return value
     */
    public String getText() {
        return text;
    }

    /** 
     * Set the 'Text' element value. Text associated with remark
     * 
     * @param text
     */
    public void setText(String text) {
        this.text = text;
    }

    /** 
     * Get the 'SSRCode' attribute value. The four alpha position industry code identifying a particular type of special service request.
     * 
     * @return value
     */
    public String getSSRCode() {
        return SSRCode;
    }

    /** 
     * Set the 'SSRCode' attribute value. The four alpha position industry code identifying a particular type of special service request.
     * 
     * @param SSRCode
     */
    public void setSSRCode(String SSRCode) {
        this.SSRCode = SSRCode;
    }

    /** 
     * Get the 'ServiceQuantity' attribute value. Used to specify the number of special services.
     * 
     * @return value
     */
    public BigInteger getServiceQuantity() {
        return serviceQuantity;
    }

    /** 
     * Set the 'ServiceQuantity' attribute value. Used to specify the number of special services.
     * 
     * @param serviceQuantity
     */
    public void setServiceQuantity(BigInteger serviceQuantity) {
        this.serviceQuantity = serviceQuantity;
    }

    /** 
     * Get the 'Status' attribute value. Code providing status information for this special service request. Refer to OTA Code List 'Status' (STS).
     * 
     * @return value
     */
    public String getStatus() {
        return status;
    }

    /** 
     * Set the 'Status' attribute value. Code providing status information for this special service request. Refer to OTA Code List 'Status' (STS).
     * 
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }
}
