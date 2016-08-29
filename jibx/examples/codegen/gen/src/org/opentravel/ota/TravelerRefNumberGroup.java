
package org.opentravel.ota;

/** 
 * A reference place holder used as a pointer to link back to the traveler.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TravelerRefNumberGroup">
 *   &lt;xs:attribute type="xs:string" name="RPH"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="SurnameRefNumber"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class TravelerRefNumberGroup
{
    private String RPH;
    private String surnameRefNumber;

    /** 
     * Get the 'RPH' attribute value. A unique reference for the traveler.
     * 
     * @return value
     */
    public String getRPH() {
        return RPH;
    }

    /** 
     * Set the 'RPH' attribute value. A unique reference for the traveler.
     * 
     * @param RPH
     */
    public void setRPH(String RPH) {
        this.RPH = RPH;
    }

    /** 
     * Get the 'SurnameRefNumber' attribute value. Used to identify and associate travelers with the same surname. 
     * 
     * @return value
     */
    public String getSurnameRefNumber() {
        return surnameRefNumber;
    }

    /** 
     * Set the 'SurnameRefNumber' attribute value. Used to identify and associate travelers with the same surname. 
     * 
     * @param surnameRefNumber
     */
    public void setSurnameRefNumber(String surnameRefNumber) {
        this.surnameRefNumber = surnameRefNumber;
    }
}
