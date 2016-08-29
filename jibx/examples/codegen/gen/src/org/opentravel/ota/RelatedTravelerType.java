
package org.opentravel.ota;

/** 
 * Other traveler profiles associated with an specific individual.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RelatedTravelerType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:UniqueID_Type" name="UniqueID" minOccurs="0"/>
 *     &lt;xs:element type="ns:PersonNameType" name="PersonName" minOccurs="0"/>
 *   &lt;/xs:sequence>
 *   &lt;xs:attributeGroup ref="ns:PrivacyGroup"/>
 *   &lt;xs:attribute type="xs:string" name="Relation"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class RelatedTravelerType
{
    private UniqueIDType uniqueID;
    private PersonNameType personName;
    private PrivacyGroup privacyGroup;
    private String relation;

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
     * Get the 'PrivacyGroup' attributeGroup value.
     * 
     * @return value
     */
    public PrivacyGroup getPrivacyGroup() {
        return privacyGroup;
    }

    /** 
     * Set the 'PrivacyGroup' attributeGroup value.
     * 
     * @param privacyGroup
     */
    public void setPrivacyGroup(PrivacyGroup privacyGroup) {
        this.privacyGroup = privacyGroup;
    }

    /** 
     * Get the 'Relation' attribute value. Indicates the type of relationship with the person in the profile, such as Spouse, Child, Family, Business Associate, Interest Group, Medical, Security, Other, etc.
     * 
     * @return value
     */
    public String getRelation() {
        return relation;
    }

    /** 
     * Set the 'Relation' attribute value. Indicates the type of relationship with the person in the profile, such as Spouse, Child, Family, Business Associate, Interest Group, Medical, Security, Other, etc.
     * 
     * @param relation
     */
    public void setRelation(String relation) {
        this.relation = relation;
    }
}
