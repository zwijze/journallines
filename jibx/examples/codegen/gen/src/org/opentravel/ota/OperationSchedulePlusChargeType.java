
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.List;

/** 
 * This allows a charge to be associated with operating times (e.g. a golf tee time may be more expensive during peak hours v. off peak hours).
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="OperationSchedulePlusChargeType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:OperationScheduleType">
 *       &lt;xs:sequence>
 *         &lt;xs:element type="ns:FeeType" name="Charge" minOccurs="0" maxOccurs="5"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class OperationSchedulePlusChargeType extends OperationScheduleType
{
    private List<FeeType> chargeList = new ArrayList<FeeType>();

    /** 
     * Get the list of 'Charge' element items. Cost associated with an amenity.
     * 
     * @return list
     */
    public List<FeeType> getChargeList() {
        return chargeList;
    }

    /** 
     * Set the list of 'Charge' element items. Cost associated with an amenity.
     * 
     * @param list
     */
    public void setChargeList(List<FeeType> list) {
        chargeList = list;
    }
}
