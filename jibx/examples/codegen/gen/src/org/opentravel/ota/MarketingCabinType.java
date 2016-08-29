
package org.opentravel.ota;

/** 
 *  Marketing name for the First, Business or Economy cabin.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MarketingCabinType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:CabinAvailabilityType">
 *       &lt;xs:attribute type="xs:string" use="optional" name="Name"/>
 *       &lt;xs:attribute type="xs:string" use="required" name="RPH"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class MarketingCabinType extends CabinAvailabilityType
{
    private String name;
    private String RPH;

    /** 
     * Get the 'Name' attribute value.  The marketing name of the cabin that is specific to the supplier.
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' attribute value.  The marketing name of the cabin that is specific to the supplier.
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'RPH' attribute value. The reference place holder to link the marketing cabin information and the RBD.
     * 
     * @return value
     */
    public String getRPH() {
        return RPH;
    }

    /** 
     * Set the 'RPH' attribute value. The reference place holder to link the marketing cabin information and the RBD.
     * 
     * @param RPH
     */
    public void setRPH(String RPH) {
        this.RPH = RPH;
    }
}
