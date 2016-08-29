
package org.opentravel.ota;

/** 
 *  Indicates preferences for choice of airline cabin.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CabinPrefGroup">
 *   &lt;xs:attributeGroup ref="ns:PreferLevelGroup"/>
 *   &lt;xs:attribute type="ns:CabinType" name="Cabin"/>
 * &lt;/xs:attributeGroup>
 * 
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PreferLevelGroup">
 *   &lt;xs:attribute type="ns:PreferLevelType" use="optional" default="Preferred" name="PreferLevel"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class CabinPrefGroup
{
    private PreferLevelType preferLevel;
    private CabinType cabin;

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
     * Get the 'Cabin' attribute value.  Indicates preferred airline cabin.
     * 
     * @return value
     */
    public CabinType getCabin() {
        return cabin;
    }

    /** 
     * Set the 'Cabin' attribute value.  Indicates preferred airline cabin.
     * 
     * @param cabin
     */
    public void setCabin(CabinType cabin) {
        this.cabin = cabin;
    }
}
