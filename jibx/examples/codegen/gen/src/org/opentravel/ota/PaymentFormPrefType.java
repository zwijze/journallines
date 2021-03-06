
package org.opentravel.ota;

/** 
 * Form(s) of payment to be used with this collection of preferences.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PaymentFormPrefType">
 *   &lt;xs:simpleContent>
 *     &lt;xs:extension base="xs:string">
 *       &lt;xs:attributeGroup ref="ns:PreferLevelGroup"/>
 *       &lt;xs:attribute type="xs:string" name="RPH"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:simpleContent>
 * &lt;/xs:complexType>
 * 
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PreferLevelGroup">
 *   &lt;xs:attribute type="ns:PreferLevelType" use="optional" default="Preferred" name="PreferLevel"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class PaymentFormPrefType
{
    private String string;
    private PreferLevelType preferLevel;
    private String RPH;

    /** 
     * Get the extension value.
     * 
     * @return value
     */
    public String getString() {
        return string;
    }

    /** 
     * Set the extension value.
     * 
     * @param string
     */
    public void setString(String string) {
        this.string = string;
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
