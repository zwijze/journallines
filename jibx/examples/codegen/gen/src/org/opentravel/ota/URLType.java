
package org.opentravel.ota;

/** 
 * Web site address, in IETF specified format.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="URL_Type">
 *   &lt;xs:simpleContent>
 *     &lt;xs:extension base="xs:string">
 *       &lt;xs:attributeGroup ref="ns:PrivacyGroup"/>
 *       &lt;xs:attribute type="xs:string" use="optional" name="Type"/>
 *       &lt;xs:attributeGroup ref="ns:DefaultIndGroup"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:simpleContent>
 * &lt;/xs:complexType>
 * 
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DefaultIndGroup">
 *   &lt;xs:attribute type="xs:boolean" use="optional" default="false" name="DefaultInd"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class URLType
{
    private String string;
    private PrivacyGroup privacyGroup;
    private String type;
    private Boolean defaultInd;

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
     * Get the 'Type' attribute value. Defines the purpose of the URL address, such as personal, business, public, etc.
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'Type' attribute value. Defines the purpose of the URL address, such as personal, business, public, etc.
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
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
}
