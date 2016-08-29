
package org.opentravel.ota;

/** 
 * Indicates preferences for seats or seat types.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SeatPrefGroup">
 *   &lt;xs:attributeGroup ref="ns:PreferLevelGroup"/>
 *   &lt;xs:attributeGroup ref="ns:SeatRequestAttributes"/>
 * &lt;/xs:attributeGroup>
 * 
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PreferLevelGroup">
 *   &lt;xs:attribute type="ns:PreferLevelType" use="optional" default="Preferred" name="PreferLevel"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class SeatPrefGroup
{
    private PreferLevelType preferLevel;
    private SeatRequestAttributes seatRequestAttributes;

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
     * Get the 'SeatRequestAttributes' attributeGroup value.
     * 
     * @return value
     */
    public SeatRequestAttributes getSeatRequestAttributes() {
        return seatRequestAttributes;
    }

    /** 
     * Set the 'SeatRequestAttributes' attributeGroup value.
     * 
     * @param seatRequestAttributes
     */
    public void setSeatRequestAttributes(
            SeatRequestAttributes seatRequestAttributes) {
        this.seatRequestAttributes = seatRequestAttributes;
    }
}
