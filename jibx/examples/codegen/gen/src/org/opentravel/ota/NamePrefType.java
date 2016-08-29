
package org.opentravel.ota;

/** 
 * PersonName to be used with this collection of preferences.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="NamePrefType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:UniqueID_Type" name="UniqueID"/>
 *     &lt;xs:element type="ns:PersonNameType" name="PersonName"/>
 *   &lt;/xs:sequence>
 *   &lt;xs:attributeGroup ref="ns:PreferLevelGroup"/>
 * &lt;/xs:complexType>
 * 
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PreferLevelGroup">
 *   &lt;xs:attribute type="ns:PreferLevelType" use="optional" default="Preferred" name="PreferLevel"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class NamePrefType
{
    private UniqueIDType uniqueID;
    private PersonNameType personName;
    private PreferLevelType preferLevel;

    /** 
     * Get the 'UniqueID' element value.
     * 
     * @return value
     */
    public UniqueIDType getUniqueID() {
        return uniqueID;
    }

    /** 
     * Set the 'UniqueID' element value.
     * 
     * @param uniqueID
     */
    public void setUniqueID(UniqueIDType uniqueID) {
        this.uniqueID = uniqueID;
    }

    /** 
     * Get the 'PersonName' element value.
     * 
     * @return value
     */
    public PersonNameType getPersonName() {
        return personName;
    }

    /** 
     * Set the 'PersonName' element value.
     * 
     * @param personName
     */
    public void setPersonName(PersonNameType personName) {
        this.personName = personName;
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
