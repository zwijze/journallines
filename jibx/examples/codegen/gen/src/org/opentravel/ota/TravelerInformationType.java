
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.List;

/** 
 * Specify passenger numbers and types
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TravelerInformationType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:PassengerTypeQuantityType" name="PassengerTypeQuantity" maxOccurs="10"/>
 *     &lt;xs:element type="ns:AirTravelerType" name="AirTraveler" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TravelerInformationType
{
    private List<PassengerTypeQuantityType> passengerTypeQuantityList = new ArrayList<PassengerTypeQuantityType>();
    private AirTravelerType airTraveler;

    /** 
     * Get the list of 'PassengerTypeQuantity' element items. Specify number of passengers using Passenger Type Codes
     * 
     * @return list
     */
    public List<PassengerTypeQuantityType> getPassengerTypeQuantityList() {
        return passengerTypeQuantityList;
    }

    /** 
     * Set the list of 'PassengerTypeQuantity' element items. Specify number of passengers using Passenger Type Codes
     * 
     * @param list
     */
    public void setPassengerTypeQuantityList(
            List<PassengerTypeQuantityType> list) {
        passengerTypeQuantityList = list;
    }

    /** 
     * Get the 'AirTraveler' element value. Information profiling the person traveling
    			Gender - the gender of the customer, if needed
    			BirthDate - Date of Birth
    			Currency - the preferred currency in which monetary amounts should be returned.
    	
     * 
     * @return value
     */
    public AirTravelerType getAirTraveler() {
        return airTraveler;
    }

    /** 
     * Set the 'AirTraveler' element value. Information profiling the person traveling
    			Gender - the gender of the customer, if needed
    			BirthDate - Date of Birth
    			Currency - the preferred currency in which monetary amounts should be returned.
    	
     * 
     * @param airTraveler
     */
    public void setAirTraveler(AirTravelerType airTraveler) {
        this.airTraveler = airTraveler;
    }
}
