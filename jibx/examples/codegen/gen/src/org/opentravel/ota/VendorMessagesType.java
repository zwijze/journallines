
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.List;

/** 
 * Collection of vendor messages.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="VendorMessagesType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:VendorMessageType" name="VendorMessage" maxOccurs="99"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class VendorMessagesType
{
    private List<VendorMessageType> vendorMessageList = new ArrayList<VendorMessageType>();

    /** 
     * Get the list of 'VendorMessage' element items. A specific message associated with this vendor
     * 
     * @return list
     */
    public List<VendorMessageType> getVendorMessageList() {
        return vendorMessageList;
    }

    /** 
     * Set the list of 'VendorMessage' element items. A specific message associated with this vendor
     * 
     * @param list
     */
    public void setVendorMessageList(List<VendorMessageType> list) {
        vendorMessageList = list;
    }
}
