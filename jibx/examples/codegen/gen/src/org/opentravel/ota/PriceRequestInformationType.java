
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.List;

/** 
 * Identify pricing source, if negotiated fares are requested and if it is a reprice request.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PriceRequestInformationType">
 *   &lt;xs:sequence>
 *     &lt;xs:element name="NegotiatedFareCode" minOccurs="0" maxOccurs="unbounded">
 *       &lt;!-- Reference to inner class NegotiatedFareCode -->
 *     &lt;/xs:element>
 *   &lt;/xs:sequence>
 *   &lt;xs:attributeGroup ref="ns:PriceRequestAttributes"/>
 *   &lt;xs:attribute type="ns:CabinType" use="optional" name="CabinType"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PriceRequestInformationType
{
    private List<NegotiatedFareCode> negotiatedFareCodeList = new ArrayList<NegotiatedFareCode>();
    private PriceRequestAttributes priceRequestAttributes;
    private CabinType cabinType;

    /** 
     * Get the list of 'NegotiatedFareCode' element items.
     * 
     * @return list
     */
    public List<NegotiatedFareCode> getNegotiatedFareCodeList() {
        return negotiatedFareCodeList;
    }

    /** 
     * Set the list of 'NegotiatedFareCode' element items.
     * 
     * @param list
     */
    public void setNegotiatedFareCodeList(List<NegotiatedFareCode> list) {
        negotiatedFareCodeList = list;
    }

    /** 
     * Get the 'PriceRequestAttributes' attributeGroup value.  Used to describe a price request.
     * 
     * @return value
     */
    public PriceRequestAttributes getPriceRequestAttributes() {
        return priceRequestAttributes;
    }

    /** 
     * Set the 'PriceRequestAttributes' attributeGroup value.  Used to describe a price request.
     * 
     * @param priceRequestAttributes
     */
    public void setPriceRequestAttributes(
            PriceRequestAttributes priceRequestAttributes) {
        this.priceRequestAttributes = priceRequestAttributes;
    }

    /** 
     * Get the 'CabinType' attribute value. Identifies the type of cabin (i.e., first, business, economy) requested.
     * 
     * @return value
     */
    public CabinType getCabinType() {
        return cabinType;
    }

    /** 
     * Set the 'CabinType' attribute value. Identifies the type of cabin (i.e., first, business, economy) requested.
     * 
     * @param cabinType
     */
    public void setCabinType(CabinType cabinType) {
        this.cabinType = cabinType;
    }
    /** 
     *  Contains negotiated fare code information.
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="NegotiatedFareCode" minOccurs="0" maxOccurs="unbounded">
     *   &lt;xs:complexType>
     *     &lt;xs:simpleContent>
     *       &lt;xs:extension base="xs:string">
     *         &lt;xs:attributeGroup ref="ns:CodeListAirGroup"/>
     *       &lt;/xs:extension>
     *     &lt;/xs:simpleContent>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class NegotiatedFareCode
    {
        private String string;
        private CodeListAirGroup codeListAirGroup;

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
         * Get the 'CodeListAirGroup' attributeGroup value.  Contains code information for a negotiated fare.
         * 
         * @return value
         */
        public CodeListAirGroup getCodeListAirGroup() {
            return codeListAirGroup;
        }

        /** 
         * Set the 'CodeListAirGroup' attributeGroup value.  Contains code information for a negotiated fare.
         * 
         * @param codeListAirGroup
         */
        public void setCodeListAirGroup(CodeListAirGroup codeListAirGroup) {
            this.codeListAirGroup = codeListAirGroup;
        }
    }
}
