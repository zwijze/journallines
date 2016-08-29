
package org.opentravel.ota;

/** 
 * Code and optional string to describe a location point.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="LocationGroup">
 *   &lt;xs:attribute type="xs:string" use="optional" name="LocationCode"/>
 *   &lt;xs:attribute type="xs:string" default="IATA" name="CodeContext"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class LocationGroup
{
    private String locationCode;
    private String codeContext;

    /** 
     * Get the 'LocationCode' attribute value. Code used to identify a location.
     * 
     * @return value
     */
    public String getLocationCode() {
        return locationCode;
    }

    /** 
     * Set the 'LocationCode' attribute value. Code used to identify a location.
     * 
     * @param locationCode
     */
    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    /** 
     * Get the 'CodeContext' attribute value. Identifies the context of the identifying code (e.g., IATA, ARC, or internal code).
     * 
     * @return value
     */
    public String getCodeContext() {
        return codeContext;
    }

    /** 
     * Set the 'CodeContext' attribute value. Identifies the context of the identifying code (e.g., IATA, ARC, or internal code).
     * 
     * @param codeContext
     */
    public void setCodeContext(String codeContext) {
        this.codeContext = codeContext;
    }
}
