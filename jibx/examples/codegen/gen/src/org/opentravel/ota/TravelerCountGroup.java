
package org.opentravel.ota;

import java.math.BigInteger;

/** 
 * Defines information on the number of travelers of a specific type (e.g.  a driver type can be either one of a defined set, Adult, YoungDriver, YoungerDriver, or it may be a code that is acceptable to both Trading Partners).
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TravelerCountGroup">
 *   &lt;xs:attribute type="xs:integer" use="optional" name="Age"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="Code"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="CodeContext"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="URI"/>
 *   &lt;xs:attributeGroup ref="ns:QuantityGroup"/>
 * &lt;/xs:attributeGroup>
 * 
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="QuantityGroup">
 *   &lt;xs:attribute type="xs:integer" use="optional" name="Quantity"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class TravelerCountGroup
{
    private BigInteger age;
    private String code;
    private String codeContext;
    private String URI;
    private BigInteger quantity;

    /** 
     * Get the 'Age' attribute value. This is used to specify age in years.
     * 
     * @return value
     */
    public BigInteger getAge() {
        return age;
    }

    /** 
     * Set the 'Age' attribute value. This is used to specify age in years.
     * 
     * @param age
     */
    public void setAge(BigInteger age) {
        this.age = age;
    }

    /** 
     * Get the 'Code' attribute value. Refer to OTA Code List Age Qualifying Code (AQC) or use StringLength1to8 with CodeContext to use a non-OTA code.
    			
     * 
     * @return value
     */
    public String getCode() {
        return code;
    }

    /** 
     * Set the 'Code' attribute value. Refer to OTA Code List Age Qualifying Code (AQC) or use StringLength1to8 with CodeContext to use a non-OTA code.
    			
     * 
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /** 
     * Get the 'CodeContext' attribute value. Identifies the source authority for the code. 
     * 
     * @return value
     */
    public String getCodeContext() {
        return codeContext;
    }

    /** 
     * Set the 'CodeContext' attribute value. Identifies the source authority for the code. 
     * 
     * @param codeContext
     */
    public void setCodeContext(String codeContext) {
        this.codeContext = codeContext;
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
