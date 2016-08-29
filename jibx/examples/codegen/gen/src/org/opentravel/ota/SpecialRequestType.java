
package org.opentravel.ota;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/** 
 * SpecialRequests : SpecialRequest
 A collection of SpecialRequest objects. The collection of all special requests associated with any part of the reservation (the reservation in its entirety, one or more guests, or one or more room stays).  Which special requests belong to which part is determined by each object's SpecialRequestRPHs collection.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SpecialRequestType">
 *   &lt;xs:sequence>
 *     &lt;xs:element name="SpecialRequest" maxOccurs="unbounded">
 *       &lt;!-- Reference to inner class SpecialRequest -->
 *     &lt;/xs:element>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SpecialRequestType
{
    private List<SpecialRequest> specialRequestList = new ArrayList<SpecialRequest>();

    /** 
     * Get the list of 'SpecialRequest' element items.
     * 
     * @return list
     */
    public List<SpecialRequest> getSpecialRequestList() {
        return specialRequestList;
    }

    /** 
     * Set the list of 'SpecialRequest' element items.
     * 
     * @param list
     */
    public void setSpecialRequestList(List<SpecialRequest> list) {
        specialRequestList = list;
    }
    /** 
     * The SpecialRequest object indicates special requests for a particular guest, service or reservation.  Each of these may be independent of any that are tied to the profile (see Profile Synchronization standard).
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SpecialRequest" maxOccurs="unbounded">
     *   &lt;xs:complexType>
     *     &lt;xs:complexContent>
     *       &lt;xs:extension base="ns:ParagraphType">
     *         &lt;xs:attribute type="xs:string" use="optional" name="RequestCode"/>
     *         &lt;xs:attribute type="xs:string" use="optional" name="CodeContext"/>
     *         &lt;xs:attribute type="xs:integer" use="optional" name="NumberOfUnits"/>
     *       &lt;/xs:extension>
     *     &lt;/xs:complexContent>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class SpecialRequest extends ParagraphType
    {
        private String requestCode;
        private String codeContext;
        private BigInteger numberOfUnits;

        /** 
         * Get the 'RequestCode' attribute value. This identifies a special request for this reservation and is typically hotel-specific.
         * 
         * @return value
         */
        public String getRequestCode() {
            return requestCode;
        }

        /** 
         * Set the 'RequestCode' attribute value. This identifies a special request for this reservation and is typically hotel-specific.
         * 
         * @param requestCode
         */
        public void setRequestCode(String requestCode) {
            this.requestCode = requestCode;
        }

        /** 
         * Get the 'CodeContext' attribute value. Identifies the source authority for the RequestCode. 
         * 
         * @return value
         */
        public String getCodeContext() {
            return codeContext;
        }

        /** 
         * Set the 'CodeContext' attribute value. Identifies the source authority for the RequestCode. 
         * 
         * @param codeContext
         */
        public void setCodeContext(String codeContext) {
            this.codeContext = codeContext;
        }

        /** 
         * Get the 'NumberOfUnits' attribute value. Allows you to pass the number of units that the special request is for (e.g., if 4 rooms are booked you may want 3 with double/double beds and 1 with a king).  
         * 
         * @return value
         */
        public BigInteger getNumberOfUnits() {
            return numberOfUnits;
        }

        /** 
         * Set the 'NumberOfUnits' attribute value. Allows you to pass the number of units that the special request is for (e.g., if 4 rooms are booked you may want 3 with double/double beds and 1 with a king).  
         * 
         * @param numberOfUnits
         */
        public void setNumberOfUnits(BigInteger numberOfUnits) {
            this.numberOfUnits = numberOfUnits;
        }
    }
}
