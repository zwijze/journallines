
package org.opentravel.ota;

/** 
 * Attribute collection providing private fare profile.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="NegotiatedFareAttributes">
 *   &lt;xs:attribute type="xs:boolean" use="optional" default="false" name="NegotiatedFare"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="NegotiatedFareCode"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class NegotiatedFareAttributes
{
    private Boolean negotiatedFare;
    private String negotiatedFareCode;

    /** 
     * Get the 'NegotiatedFare' attribute value. 
    	Indicator to show if this is a private fare.
    	
     * 
     * @return value
     */
    public Boolean getNegotiatedFare() {
        return negotiatedFare;
    }

    /** 
     * Set the 'NegotiatedFare' attribute value. 
    	Indicator to show if this is a private fare.
    	
     * 
     * @param negotiatedFare
     */
    public void setNegotiatedFare(Boolean negotiatedFare) {
        this.negotiatedFare = negotiatedFare;
    }

    /** 
     * Get the 'NegotiatedFareCode' attribute value. 
    	Code used to identify the private fare.
    	
     * 
     * @return value
     */
    public String getNegotiatedFareCode() {
        return negotiatedFareCode;
    }

    /** 
     * Set the 'NegotiatedFareCode' attribute value. 
    	Code used to identify the private fare.
    	
     * 
     * @param negotiatedFareCode
     */
    public void setNegotiatedFareCode(String negotiatedFareCode) {
        this.negotiatedFareCode = negotiatedFareCode;
    }
}
