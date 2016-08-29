
package org.opentravel.ota;

/** 
 * Information about an address that identifies a location for a specific purposes.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AddressInfoType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:AddressType">
 *       &lt;xs:attributeGroup ref="ns:DefaultIndGroup"/>
 *       &lt;xs:attribute type="xs:string" use="optional" name="UseType"/>
 *       &lt;xs:attribute type="xs:string" use="optional" name="RPH"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * 
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DefaultIndGroup">
 *   &lt;xs:attribute type="xs:boolean" use="optional" default="false" name="DefaultInd"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class AddressInfoType extends AddressType
{
    private Boolean defaultInd;
    private String useType;
    private String RPH;

    /** 
     * Get the 'DefaultInd' attribute value. Indicates that the receiving system should assume the default value if the user specifies no overriding value or action.
     * 
     * @return value
     */
    public Boolean getDefaultInd() {
        return defaultInd;
    }

    /** 
     * Set the 'DefaultInd' attribute value. Indicates that the receiving system should assume the default value if the user specifies no overriding value or action.
     * 
     * @param defaultInd
     */
    public void setDefaultInd(Boolean defaultInd) {
        this.defaultInd = defaultInd;
    }

    /** 
     * Get the 'UseType' attribute value. Describes the use of the address (e.g. mailing, delivery, billing, etc.). Refer to OTA Code List Address Use Type (AUT).
     * 
     * @return value
     */
    public String getUseType() {
        return useType;
    }

    /** 
     * Set the 'UseType' attribute value. Describes the use of the address (e.g. mailing, delivery, billing, etc.). Refer to OTA Code List Address Use Type (AUT).
     * 
     * @param useType
     */
    public void setUseType(String useType) {
        this.useType = useType;
    }

    /** 
     * Get the 'RPH' attribute value. Used elsewhere in the message to reference this specific address.
     * 
     * @return value
     */
    public String getRPH() {
        return RPH;
    }

    /** 
     * Set the 'RPH' attribute value. Used elsewhere in the message to reference this specific address.
     * 
     * @param RPH
     */
    public void setRPH(String RPH) {
        this.RPH = RPH;
    }
}
