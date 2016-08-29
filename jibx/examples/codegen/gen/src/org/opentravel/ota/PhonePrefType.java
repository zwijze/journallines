
package org.opentravel.ota;

/** 
 * Telephone number(s) to be used with this collection of preferences.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PhonePrefType">
 *   &lt;xs:sequence>
 *     &lt;xs:element name="Telephone">
 *       &lt;xs:complexType>
 *         &lt;xs:attributeGroup ref="ns:TelephoneInfoGroup"/>
 *       &lt;/xs:complexType>
 *     &lt;/xs:element>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PhonePrefType
{
    private TelephoneInfoGroup telephone;

    /** 
     * Get the 'TelephoneInfoGroup' attributeGroup value.
     * 
     * @return value
     */
    public TelephoneInfoGroup getTelephone() {
        return telephone;
    }

    /** 
     * Set the 'TelephoneInfoGroup' attributeGroup value.
     * 
     * @param telephone
     */
    public void setTelephone(TelephoneInfoGroup telephone) {
        this.telephone = telephone;
    }
}
