
package org.opentravel.ota;

/** 
 * Address(es) to be used with this collection of preferences.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AddressPrefType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:AddressInfoType" name="Address"/>
 *   &lt;/xs:sequence>
 *   &lt;xs:attributeGroup ref="ns:PrivacyGroup"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class AddressPrefType
{
    private AddressInfoType address;
    private PrivacyGroup privacyGroup;

    /** 
     * Get the 'Address' element value.
     * 
     * @return value
     */
    public AddressInfoType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value.
     * 
     * @param address
     */
    public void setAddress(AddressInfoType address) {
        this.address = address;
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
}
