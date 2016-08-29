
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.List;

/** 
 * Provides blackout date information.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="BlackoutDateType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:DateTimeSpanType" name="BlackoutDate" maxOccurs="unbounded"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class BlackoutDateType
{
    private List<DateTimeSpanType> blackoutDateList = new ArrayList<DateTimeSpanType>();

    /** 
     * Get the list of 'BlackoutDate' element items. Indicates black-out dates for the travel product/service.
     * 
     * @return list
     */
    public List<DateTimeSpanType> getBlackoutDateList() {
        return blackoutDateList;
    }

    /** 
     * Set the list of 'BlackoutDate' element items. Indicates black-out dates for the travel product/service.
     * 
     * @param list
     */
    public void setBlackoutDateList(List<DateTimeSpanType> list) {
        blackoutDateList = list;
    }
}
