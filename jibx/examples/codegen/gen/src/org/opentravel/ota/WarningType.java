
package org.opentravel.ota;

/** 
 * Standard way to indicate successful processing of an OTA message, but one in which warnings are generated
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="WarningType">
 *   &lt;xs:simpleContent>
 *     &lt;xs:extension base="ns:FreeTextType">
 *       &lt;xs:attribute type="xs:string" use="required" name="Type"/>
 *       &lt;xs:attributeGroup ref="ns:ErrorWarningAttributeGroup"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:simpleContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class WarningType
{
    private FreeTextType freeTextType;
    private String type;
    private ErrorWarningAttributeGroup errorWarningAttributeGroup;

    /** 
     * Get the extension value.
     * 
     * @return value
     */
    public FreeTextType getFreeTextType() {
        return freeTextType;
    }

    /** 
     * Set the extension value.
     * 
     * @param freeTextType
     */
    public void setFreeTextType(FreeTextType freeTextType) {
        this.freeTextType = freeTextType;
    }

    /** 
     * Get the 'Type' attribute value. The Warning element MUST contain the Type attribute that uses a recommended set of values to indicate the warning type. The validating XSD can expect to accept values that it has NOT been explicitly coded for and process them by using Type ="Unknown".  Refer to OTA Code List Error Warning Type (EWT).
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'Type' attribute value. The Warning element MUST contain the Type attribute that uses a recommended set of values to indicate the warning type. The validating XSD can expect to accept values that it has NOT been explicitly coded for and process them by using Type ="Unknown".  Refer to OTA Code List Error Warning Type (EWT).
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
     * Get the 'ErrorWarningAttributeGroup' attributeGroup value.
     * 
     * @return value
     */
    public ErrorWarningAttributeGroup getErrorWarningAttributeGroup() {
        return errorWarningAttributeGroup;
    }

    /** 
     * Set the 'ErrorWarningAttributeGroup' attributeGroup value.
     * 
     * @param errorWarningAttributeGroup
     */
    public void setErrorWarningAttributeGroup(
            ErrorWarningAttributeGroup errorWarningAttributeGroup) {
        this.errorWarningAttributeGroup = errorWarningAttributeGroup;
    }
}
