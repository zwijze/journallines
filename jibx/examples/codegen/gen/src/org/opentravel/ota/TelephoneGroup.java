
package org.opentravel.ota;

/** 
 * Construct for holding a telephone number.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TelephoneGroup">
 *   &lt;xs:attributeGroup ref="ns:PrivacyGroup"/>
 *   &lt;xs:attributeGroup ref="ns:TelephoneAttributesGroup"/>
 *   &lt;xs:attributeGroup ref="ns:FormattedInd"/>
 * &lt;/xs:attributeGroup>
 * 
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FormattedInd">
 *   &lt;xs:attribute type="xs:boolean" use="optional" default="false" name="FormattedInd"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class TelephoneGroup
{
    private PrivacyGroup privacyGroup;
    private TelephoneAttributesGroup telephoneAttributesGroup;
    private Boolean formattedInd;

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
     * Get the 'TelephoneAttributesGroup' attributeGroup value.
     * 
     * @return value
     */
    public TelephoneAttributesGroup getTelephoneAttributesGroup() {
        return telephoneAttributesGroup;
    }

    /** 
     * Set the 'TelephoneAttributesGroup' attributeGroup value.
     * 
     * @param telephoneAttributesGroup
     */
    public void setTelephoneAttributesGroup(
            TelephoneAttributesGroup telephoneAttributesGroup) {
        this.telephoneAttributesGroup = telephoneAttributesGroup;
    }

    /** 
     * Get the 'FormattedInd' attribute value. Specifies if the associated data is formatted or not.  When true, then it is formatted; when false, then not formatted.
     * 
     * @return value
     */
    public Boolean getFormattedInd() {
        return formattedInd;
    }

    /** 
     * Set the 'FormattedInd' attribute value. Specifies if the associated data is formatted or not.  When true, then it is formatted; when false, then not formatted.
     * 
     * @param formattedInd
     */
    public void setFormattedInd(Boolean formattedInd) {
        this.formattedInd = formattedInd;
    }
}
