
package org.opentravel.ota;

/** 
 * Indicates a preference for an item that is referred to using a Reference Place Holder (RPH).   Often an object is stored in a collection of similar objects, and a preference for use of one these objects is to be made known.  This complex type can be used to specify the preference level, and to provide the indicator to the object in the collection.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RPH_PrefGroup">
 *   &lt;xs:attributeGroup ref="ns:PreferLevelGroup"/>
 *   &lt;xs:attribute type="xs:string" name="RPH"/>
 * &lt;/xs:attributeGroup>
 * 
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PreferLevelGroup">
 *   &lt;xs:attribute type="ns:PreferLevelType" use="optional" default="Preferred" name="PreferLevel"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class RPHPrefGroup
{
    private PreferLevelType preferLevel;
    private String RPH;

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
     * Get the 'RPH' attribute value.
     * 
     * @return value
     */
    public String getRPH() {
        return RPH;
    }

    /** 
     * Set the 'RPH' attribute value.
     * 
     * @param RPH
     */
    public void setRPH(String RPH) {
        this.RPH = RPH;
    }
}
