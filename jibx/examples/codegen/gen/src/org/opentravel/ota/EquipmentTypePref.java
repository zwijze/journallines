
package org.opentravel.ota;

/** 
 *  Indicates preferences for type of airplane.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="EquipmentTypePref">
 *   &lt;xs:simpleContent>
 *     &lt;xs:extension base="ns:EquipmentType">
 *       &lt;xs:attributeGroup ref="ns:PreferLevelGroup"/>
 *       &lt;xs:attribute type="xs:boolean" use="optional" name="WideBody"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:simpleContent>
 * &lt;/xs:complexType>
 * 
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PreferLevelGroup">
 *   &lt;xs:attribute type="ns:PreferLevelType" use="optional" default="Preferred" name="PreferLevel"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class EquipmentTypePref
{
    private EquipmentType equipmentType;
    private PreferLevelType preferLevel;
    private Boolean wideBody;

    /** 
     * Get the extension value.
     * 
     * @return value
     */
    public EquipmentType getEquipmentType() {
        return equipmentType;
    }

    /** 
     * Set the extension value.
     * 
     * @param equipmentType
     */
    public void setEquipmentType(EquipmentType equipmentType) {
        this.equipmentType = equipmentType;
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

    /** 
     * Get the 'WideBody' attribute value.  Indicates if an airplane with multiple aisles is preferred.
     * 
     * @return value
     */
    public Boolean getWideBody() {
        return wideBody;
    }

    /** 
     * Set the 'WideBody' attribute value.  Indicates if an airplane with multiple aisles is preferred.
     * 
     * @param wideBody
     */
    public void setWideBody(Boolean wideBody) {
        this.wideBody = wideBody;
    }
}
