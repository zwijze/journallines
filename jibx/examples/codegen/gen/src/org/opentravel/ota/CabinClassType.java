
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.List;

/** 
 * Describes the Cabin details in a seat map
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CabinClassType">
 *   &lt;xs:sequence>
 *     &lt;xs:element name="AirRows" minOccurs="0">
 *       &lt;!-- Reference to inner class AirRows -->
 *     &lt;/xs:element>
 *   &lt;/xs:sequence>
 *   &lt;xs:attribute type="ns:CabinType" use="required" name="CabinType"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="Name"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CabinClassType
{
    private AirRows airRows;
    private CabinType cabinType;
    private String name;

    /** 
     * Get the 'AirRows' element value.
     * 
     * @return value
     */
    public AirRows getAirRows() {
        return airRows;
    }

    /** 
     * Set the 'AirRows' element value.
     * 
     * @param airRows
     */
    public void setAirRows(AirRows airRows) {
        this.airRows = airRows;
    }

    /** 
     * Get the 'CabinType' attribute value. Cabin class for which the seat map details is being given. Could be first, business or economy.
     * 
     * @return value
     */
    public CabinType getCabinType() {
        return cabinType;
    }

    /** 
     * Set the 'CabinType' attribute value. Cabin class for which the seat map details is being given. Could be first, business or economy.
     * 
     * @param cabinType
     */
    public void setCabinType(CabinType cabinType) {
        this.cabinType = cabinType;
    }

    /** 
     * Get the 'Name' attribute value. Name that a particular airline/ CRS may give to the  cabin class
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' attribute value. Name that a particular airline/ CRS may give to the  cabin class
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    /** 
     * Collection of Air Rows
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AirRows" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:sequence>
     *       &lt;xs:element type="ns:RowDetailsType" name="AirRow" maxOccurs="999"/>
     *     &lt;/xs:sequence>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class AirRows
    {
        private List<RowDetailsType> airRowList = new ArrayList<RowDetailsType>();

        /** 
         * Get the list of 'AirRow' element items. Row in a Cabin class of a flight
         * 
         * @return list
         */
        public List<RowDetailsType> getAirRowList() {
            return airRowList;
        }

        /** 
         * Set the list of 'AirRow' element items. Row in a Cabin class of a flight
         * 
         * @param list
         */
        public void setAirRowList(List<RowDetailsType> list) {
            airRowList = list;
        }
    }
}
