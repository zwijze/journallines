
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.List;

/** 
 * Identifies passenger(s) who will travel on the reservation.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TravelerInfoType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:AirTravelerType" name="AirTraveler" minOccurs="0" maxOccurs="99"/>
 *     &lt;xs:element type="ns:SpecialReqDetailsType" name="SpecialReqDetails" minOccurs="0" maxOccurs="unbounded"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TravelerInfoType
{
    private List<AirTravelerType> airTravelerList = new ArrayList<AirTravelerType>();
    private List<SpecialReqDetailsType> specialReqDetailList = new ArrayList<SpecialReqDetailsType>();

    /** 
     * Get the list of 'AirTraveler' element items.  Information about the person traveling.
     * 
     * @return list
     */
    public List<AirTravelerType> getAirTravelerList() {
        return airTravelerList;
    }

    /** 
     * Set the list of 'AirTraveler' element items.  Information about the person traveling.
     * 
     * @param list
     */
    public void setAirTravelerList(List<AirTravelerType> list) {
        airTravelerList = list;
    }

    /** 
     * Get the list of 'SpecialReqDetails' element items. Provides detailed information regarding any special needs, requests, or remarks associated with the traveler
     * 
     * @return list
     */
    public List<SpecialReqDetailsType> getSpecialReqDetailList() {
        return specialReqDetailList;
    }

    /** 
     * Set the list of 'SpecialReqDetails' element items. Provides detailed information regarding any special needs, requests, or remarks associated with the traveler
     * 
     * @param list
     */
    public void setSpecialReqDetailList(List<SpecialReqDetailsType> list) {
        specialReqDetailList = list;
    }
}
