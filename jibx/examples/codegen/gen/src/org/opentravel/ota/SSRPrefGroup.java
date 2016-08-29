
package org.opentravel.ota;

/** 
 * Identifies preferences for special services required for air travel, using standard industry (SSR-OSI) code list.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SSR_PrefGroup">
 *   &lt;xs:attributeGroup ref="ns:PreferLevelGroup"/>
 *   &lt;xs:attribute type="xs:string" name="SSR_Code"/>
 * &lt;/xs:attributeGroup>
 * 
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PreferLevelGroup">
 *   &lt;xs:attribute type="ns:PreferLevelType" use="optional" default="Preferred" name="PreferLevel"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class SSRPrefGroup
{
    private PreferLevelType preferLevel;
    private String SSRCode;

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
     * Get the 'SSR_Code' attribute value. Code of the special service request to be used for this air travel situation. Refers to standard industry code list.
     * 
     * @return value
     */
    public String getSSRCode() {
        return SSRCode;
    }

    /** 
     * Set the 'SSR_Code' attribute value. Code of the special service request to be used for this air travel situation. Refers to standard industry code list.
     * 
     * @param SSRCode
     */
    public void setSSRCode(String SSRCode) {
        this.SSRCode = SSRCode;
    }
}
