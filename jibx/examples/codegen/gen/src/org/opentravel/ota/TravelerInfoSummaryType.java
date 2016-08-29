
package org.opentravel.ota;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/** 
 * Specify passenger numbers and types
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TravelerInfoSummaryType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:integer" name="SeatsRequested" minOccurs="0" maxOccurs="99"/>
 *     &lt;xs:element type="ns:TravelerInformationType" name="AirTravelerAvail" minOccurs="0" maxOccurs="99"/>
 *     &lt;xs:element type="ns:PriceRequestInformationType" name="PriceRequestInformation" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TravelerInfoSummaryType
{
    private List<BigInteger> seatsRequestedList = new ArrayList<BigInteger>();
    private List<TravelerInformationType> airTravelerAvailList = new ArrayList<TravelerInformationType>();
    private PriceRequestInformationType priceRequestInformation;

    /** 
     * Get the list of 'SeatsRequested' element items.  Number of seats requested.
     * 
     * @return list
     */
    public List<BigInteger> getSeatsRequestedList() {
        return seatsRequestedList;
    }

    /** 
     * Set the list of 'SeatsRequested' element items.  Number of seats requested.
     * 
     * @param list
     */
    public void setSeatsRequestedList(List<BigInteger> list) {
        seatsRequestedList = list;
    }

    /** 
     * Get the list of 'AirTravelerAvail' element items.  Specifies passenger numbers and types.
     * 
     * @return list
     */
    public List<TravelerInformationType> getAirTravelerAvailList() {
        return airTravelerAvailList;
    }

    /** 
     * Set the list of 'AirTravelerAvail' element items.  Specifies passenger numbers and types.
     * 
     * @param list
     */
    public void setAirTravelerAvailList(List<TravelerInformationType> list) {
        airTravelerAvailList = list;
    }

    /** 
     * Get the 'PriceRequestInformation' element value.  Identifies pricing source, if negotiated fares are requested and if it is a reprice request.
     * 
     * @return value
     */
    public PriceRequestInformationType getPriceRequestInformation() {
        return priceRequestInformation;
    }

    /** 
     * Set the 'PriceRequestInformation' element value.  Identifies pricing source, if negotiated fares are requested and if it is a reprice request.
     * 
     * @param priceRequestInformation
     */
    public void setPriceRequestInformation(
            PriceRequestInformationType priceRequestInformation) {
        this.priceRequestInformation = priceRequestInformation;
    }
}
