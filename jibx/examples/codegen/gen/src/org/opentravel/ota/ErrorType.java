
package org.opentravel.ota;

/** 
 * Standard way to indicate that an error occurred during the processing of an OTA message
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ErrorType">
 *   &lt;xs:simpleContent>
 *     &lt;xs:extension base="ns:FreeTextType">
 *       &lt;xs:attribute type="xs:string" use="required" name="Type"/>
 *       &lt;xs:attributeGroup ref="ns:ErrorWarningAttributeGroup"/>
 *       &lt;xs:attribute type="xs:string" name="NodeList"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:simpleContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ErrorType
{
    private FreeTextType freeTextType;
    private String type;
    private ErrorWarningAttributeGroup errorWarningAttributeGroup;
    private String nodeList;

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
     * Get the 'Type' attribute value. The Error element MUST contain the Type attribute that uses a recommended set of values to indicate the error type. The validating XSD can expect to accept values that it has NOT been explicitly coded for and process them by using Type ="Unknown".  Refer to OTA Code List Error Warning Type (EWT).
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'Type' attribute value. The Error element MUST contain the Type attribute that uses a recommended set of values to indicate the error type. The validating XSD can expect to accept values that it has NOT been explicitly coded for and process them by using Type ="Unknown".  Refer to OTA Code List Error Warning Type (EWT).
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

    /** 
     * Get the 'NodeList' attribute value. An XPath expression that selects all the nodes whose data caused this error.  Further, this expression should have an 	additional contraint which contains the data of the node.  This will provide the offending data back to systems that cannot maintain the original message. 
     * 
     * @return value
     */
    public String getNodeList() {
        return nodeList;
    }

    /** 
     * Set the 'NodeList' attribute value. An XPath expression that selects all the nodes whose data caused this error.  Further, this expression should have an 	additional contraint which contains the data of the node.  This will provide the offending data back to systems that cannot maintain the original message. 
     * 
     * @param nodeList
     */
    public void setNodeList(String nodeList) {
        this.nodeList = nodeList;
    }
}
