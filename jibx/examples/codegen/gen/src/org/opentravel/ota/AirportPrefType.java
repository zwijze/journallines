
package org.opentravel.ota;

/** 
 * Departure airport preferences, using IATA airport codes.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AirportPrefType">
 *   &lt;xs:simpleContent>
 *     &lt;xs:extension base="ns:LocationType">
 *       &lt;xs:attributeGroup ref="ns:PreferLevelGroup"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:simpleContent>
 * &lt;/xs:complexType>
 * 
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PreferLevelGroup">
 *   &lt;xs:attribute type="ns:PreferLevelType" use="optional" default="Preferred" name="PreferLevel"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class AirportPrefType
{
    private LocationType locationType;
    private PreferLevelType preferLevel;

    /** 
     * Get the extension value.
     * 
     * @return value
     */
    public LocationType getLocationType() {
        return locationType;
    }

    /** 
     * Set the extension value.
     * 
     * @param locationType
     */
    public void setLocationType(LocationType locationType) {
        this.locationType = locationType;
    }

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
}
