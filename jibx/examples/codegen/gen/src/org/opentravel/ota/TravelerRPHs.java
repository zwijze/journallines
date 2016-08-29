
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.List;

/** 
 * A container to relate individual travelers to an inventory or chargeable item.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TravelerRPHs">
 *   &lt;xs:sequence>
 *     &lt;xs:element name="TravelerRPH" maxOccurs="99">
 *       &lt;!-- Reference to inner class TravelerRPH -->
 *     &lt;/xs:element>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TravelerRPHs
{
    private List<TravelerRPH> travelerRPHList = new ArrayList<TravelerRPH>();

    /** 
     * Get the list of 'TravelerRPH' element items.
     * 
     * @return list
     */
    public List<TravelerRPH> getTravelerRPHList() {
        return travelerRPHList;
    }

    /** 
     * Set the list of 'TravelerRPH' element items.
     * 
     * @param list
     */
    public void setTravelerRPHList(List<TravelerRPH> list) {
        travelerRPHList = list;
    }
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TravelerRPH" maxOccurs="99">
     *   &lt;xs:complexType>
     *     &lt;xs:attribute type="xs:string" use="required" name="RPH"/>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class TravelerRPH
    {
        private String RPH;

        /** 
         * Get the 'RPH' attribute value.
         * 
         * @return value
         */
        public String getRPH() {
            return RPH;
        }

        /** 
         * Set the 'RPH' attribute value.
         * 
         * @param RPH
         */
        public void setRPH(String RPH) {
            this.RPH = RPH;
        }
    }
}
