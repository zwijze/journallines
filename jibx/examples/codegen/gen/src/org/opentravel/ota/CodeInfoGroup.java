
package org.opentravel.ota;

/** 
 * This is intended to be used in conjunction with an attribute that uses an OTA code list. It is used  to provide additional information about the code being referenced. May be used to give further detail on the code or to remove an obsolete item.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CodeInfoGroup">
 *   &lt;xs:attribute type="xs:string" use="optional" name="CodeDetail"/>
 *   &lt;xs:attributeGroup ref="ns:RemovalGroup"/>
 * &lt;/xs:attributeGroup>
 * 
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RemovalGroup">
 *   &lt;xs:attribute type="xs:boolean" use="optional" default="false" name="Removal"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class CodeInfoGroup
{
    private String codeDetail;
    private Boolean removal;

    /** 
     * Get the 'CodeDetail' attribute value. May be used to give further detail on the code. 
     * 
     * @return value
     */
    public String getCodeDetail() {
        return codeDetail;
    }

    /** 
     * Set the 'CodeDetail' attribute value. May be used to give further detail on the code. 
     * 
     * @param codeDetail
     */
    public void setCodeDetail(String codeDetail) {
        this.codeDetail = codeDetail;
    }

    /** 
     * Get the 'Removal' attribute value. If true, this item is obsolete and should be removed from the receiving system.
     * 
     * @return value
     */
    public Boolean getRemoval() {
        return removal;
    }

    /** 
     * Set the 'Removal' attribute value. If true, this item is obsolete and should be removed from the receiving system.
     * 
     * @param removal
     */
    public void setRemoval(Boolean removal) {
        this.removal = removal;
    }
}
