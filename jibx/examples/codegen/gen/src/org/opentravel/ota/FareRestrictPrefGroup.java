
package org.opentravel.ota;

/** 
 * Identifies preferences for airfare restrictions acceptable or not acceptable for a given travel situation.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FareRestrictPrefGroup">
 *   &lt;xs:attributeGroup ref="ns:PreferLevelGroup"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="FareRestriction"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="Date"/>
 * &lt;/xs:attributeGroup>
 * 
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PreferLevelGroup">
 *   &lt;xs:attribute type="ns:PreferLevelType" use="optional" default="Preferred" name="PreferLevel"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class FareRestrictPrefGroup
{
    private PreferLevelType preferLevel;
    private String fareRestriction;
    private String date;

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
     * Get the 'FareRestriction' attribute value. Refer to OTA Code List Fare Restriction (FAR).
    	
     * 
     * @return value
     */
    public String getFareRestriction() {
        return fareRestriction;
    }

    /** 
     * Set the 'FareRestriction' attribute value. Refer to OTA Code List Fare Restriction (FAR).
    	
     * 
     * @param fareRestriction
     */
    public void setFareRestriction(String fareRestriction) {
        this.fareRestriction = fareRestriction;
    }

    /** 
     * Get the 'Date' attribute value. A date that is associated to the fare restriction.

     * 
     * @return value
     */
    public String getDate() {
        return date;
    }

    /** 
     * Set the 'Date' attribute value. A date that is associated to the fare restriction.

     * 
     * @param date
     */
    public void setDate(String date) {
        this.date = date;
    }
}
