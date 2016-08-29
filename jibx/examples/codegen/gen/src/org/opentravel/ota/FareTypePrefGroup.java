
package org.opentravel.ota;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FareTypePrefGroup">
 *   &lt;xs:attribute type="xs:string" use="required" name="FareType"/>
 *   &lt;xs:attribute type="ns:PreferLevelType" use="optional" name="PreferLevel"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class FareTypePrefGroup
{
    private String fareType;
    private PreferLevelType preferLevel;

    /** 
     * Get the 'FareType' attribute value. The type of fare required (e.g. unrestricted, excursion). Refer to the Fare Qualifier OTA Code list (FAQ).
     * 
     * @return value
     */
    public String getFareType() {
        return fareType;
    }

    /** 
     * Set the 'FareType' attribute value. The type of fare required (e.g. unrestricted, excursion). Refer to the Fare Qualifier OTA Code list (FAQ).
     * 
     * @param fareType
     */
    public void setFareType(String fareType) {
        this.fareType = fareType;
    }

    /** 
     * Get the 'PreferLevel' attribute value.
     * 
     * @return value
     */
    public PreferLevelType getPreferLevel() {
        return preferLevel;
    }

    /** 
     * Set the 'PreferLevel' attribute value.
     * 
     * @param preferLevel
     */
    public void setPreferLevel(PreferLevelType preferLevel) {
        this.preferLevel = preferLevel;
    }
}
