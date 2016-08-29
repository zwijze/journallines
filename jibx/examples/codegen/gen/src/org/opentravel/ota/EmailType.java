
package org.opentravel.ota;

/** 
 * Electronic email addresses, in IETF specified format.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="EmailType">
 *   &lt;xs:simpleContent>
 *     &lt;xs:extension base="xs:string">
 *       &lt;xs:attributeGroup ref="ns:PrivacyGroup"/>
 *       &lt;xs:attributeGroup ref="ns:DefaultIndGroup"/>
 *       &lt;xs:attribute type="xs:string" use="optional" name="EmailType"/>
 *       &lt;xs:attribute type="xs:string" use="optional" name="RPH"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:simpleContent>
 * &lt;/xs:complexType>
 * 
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DefaultIndGroup">
 *   &lt;xs:attribute type="xs:boolean" use="optional" default="false" name="DefaultInd"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class EmailType
{
    private String string;
    private PrivacyGroup privacyGroup;
    private Boolean defaultInd;
    private String emailType;
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
     * Get the 'EmailType' attribute value. Defines the purpose of the e-mail address (e.g. personal, business, listserve). Refer to OTA Code List Email Address Type (EAT).
     * 
     * @return value
     */
    public String getEmailType() {
        return emailType;
    }

    /** 
     * Set the 'EmailType' attribute value. Defines the purpose of the e-mail address (e.g. personal, business, listserve). Refer to OTA Code List Email Address Type (EAT).
     * 
     * @param emailType
     */
    public void setEmailType(String emailType) {
        this.emailType = emailType;
    }

    /** 
     * Get the 'RPH' attribute value. Used elsewhere in the message to reference this specific email address.
     * 
     * @return value
     */
    public String getRPH() {
        return RPH;
    }

    /** 
     * Set the 'RPH' attribute value. Used elsewhere in the message to reference this specific email address.
     * 
     * @param RPH
     */
    public void setRPH(String RPH) {
        this.RPH = RPH;
    }
}
