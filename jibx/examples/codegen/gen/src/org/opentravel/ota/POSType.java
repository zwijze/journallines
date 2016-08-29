
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.List;

/** 
 * Point of Sale (POS) is the details identifying the party or connection channel making the request.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="POS_Type">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:SourceType" name="Source" maxOccurs="10"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class POSType
{
    private List<SourceType> sourceList = new ArrayList<SourceType>();

    /** 
     * Get the list of 'Source' element items. This holds details regarding the requestor. It may be repeated to also accommodate the delivery systems.
     * 
     * @return list
     */
    public List<SourceType> getSourceList() {
        return sourceList;
    }

    /** 
     * Set the list of 'Source' element items. This holds details regarding the requestor. It may be repeated to also accommodate the delivery systems.
     * 
     * @param list
     */
    public void setSourceList(List<SourceType> list) {
        sourceList = list;
    }
}
