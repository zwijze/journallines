
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.List;

/** 
 * 
 A container for flight segments.

 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="OriginDestinationOptionType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:BookFlightSegmentType" name="FlightSegment" maxOccurs="8"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class OriginDestinationOptionType
{
    private List<BookFlightSegmentType> flightSegmentList = new ArrayList<BookFlightSegmentType>();

    /** 
     * Get the list of 'FlightSegment' element items. 
    		A container for necessary data to describe one or more legs of a single flight number.
    		
     * 
     * @return list
     */
    public List<BookFlightSegmentType> getFlightSegmentList() {
        return flightSegmentList;
    }

    /** 
     * Set the list of 'FlightSegment' element items. 
    		A container for necessary data to describe one or more legs of a single flight number.
    		
     * 
     * @param list
     */
    public void setFlightSegmentList(List<BookFlightSegmentType> list) {
        flightSegmentList = list;
    }
}
