
package org.opentravel.ota;

/** 
 * Information about a telephone number, including the actual number and its usage
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TelephoneInfoGroup">
 *   &lt;xs:attributeGroup ref="ns:TelephoneGroup"/>
 *   &lt;xs:attributeGroup ref="ns:DefaultIndGroup"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="RPH"/>
 * &lt;/xs:attributeGroup>
 * 
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DefaultIndGroup">
 *   &lt;xs:attribute type="xs:boolean" use="optional" default="false" name="DefaultInd"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class TelephoneInfoGroup
{
    private TelephoneGroup telephoneGroup;
    private Boolean defaultInd;
    private String RPH;

    /** 
     * Get the 'TelephoneGroup' attributeGroup value.
     * 
     * @return value
     */
    public TelephoneGroup getTelephoneGroup() {
        return telephoneGroup;
    }

    /** 
     * Set the 'TelephoneGroup' attributeGroup value.
     * 
     * @param telephoneGroup
     */
    public void setTelephoneGroup(TelephoneGroup telephoneGroup) {
        this.telephoneGroup = telephoneGroup;
    }

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
     * Get the 'RPH' attribute value. Used elsewhere in the message to reference a specific telephone number (including faxes).
     * 
     * @return value
     */
    public String getRPH() {
        return RPH;
    }

    /** 
     * Set the 'RPH' attribute value. Used elsewhere in the message to reference a specific telephone number (including faxes).
     * 
     * @param RPH
     */
    public void setRPH(String RPH) {
        this.RPH = RPH;
    }
}
