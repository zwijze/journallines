
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.List;

/** 
 * A collection of fees.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FeesType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:FeeType" name="Fee" maxOccurs="unbounded"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FeesType
{
    private List<FeeType> feeList = new ArrayList<FeeType>();

    /** 
     * Get the list of 'Fee' element items. Fee Amount that is applied to the rate. Fees are used for non tax amounts like service charges.
     * 
     * @return list
     */
    public List<FeeType> getFeeList() {
        return feeList;
    }

    /** 
     * Set the list of 'Fee' element items. Fee Amount that is applied to the rate. Fees are used for non tax amounts like service charges.
     * 
     * @param list
     */
    public void setFeeList(List<FeeType> list) {
        feeList = list;
    }
}
