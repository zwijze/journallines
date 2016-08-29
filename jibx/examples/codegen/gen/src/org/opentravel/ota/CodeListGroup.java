
package org.opentravel.ota;

import java.math.BigInteger;

/** 
 * Used to specify a code and its associated attributes; meaning is derived from actual use.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CodeListGroup">
 *   &lt;xs:attributeGroup ref="ns:CodeGroup"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="URI"/>
 *   &lt;xs:attributeGroup ref="ns:QuantityGroup"/>
 * &lt;/xs:attributeGroup>
 * 
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="QuantityGroup">
 *   &lt;xs:attribute type="xs:integer" use="optional" name="Quantity"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class CodeListGroup
{
    private CodeGroup codeGroup;
    private String URI;
    private BigInteger quantity;

    /** 
     * Get the 'CodeGroup' attributeGroup value. Used to specify a code and the context of the code.
     * 
     * @return value
     */
    public CodeGroup getCodeGroup() {
        return codeGroup;
    }

    /** 
     * Set the 'CodeGroup' attributeGroup value. Used to specify a code and the context of the code.
     * 
     * @param codeGroup
     */
    public void setCodeGroup(CodeGroup codeGroup) {
        this.codeGroup = codeGroup;
    }

    /** 
     * Get the 'URI' attribute value. Identifies the location of the code table
     * 
     * @return value
     */
    public String getURI() {
        return URI;
    }

    /** 
     * Set the 'URI' attribute value. Identifies the location of the code table
     * 
     * @param URI
     */
    public void setURI(String URI) {
        this.URI = URI;
    }

    /** 
     * Get the 'Quantity' attribute value. Used to define the quantity for an associated element or attribute.
     * 
     * @return value
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'Quantity' attribute value. Used to define the quantity for an associated element or attribute.
     * 
     * @param quantity
     */
    public void setQuantity(BigInteger quantity) {
        this.quantity = quantity;
    }
}
