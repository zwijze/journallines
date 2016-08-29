
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.List;

/** 
 * Collection of warnings.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="WarningsType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:WarningType" name="Warning" maxOccurs="99"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class WarningsType
{
    private List<WarningType> warningList = new ArrayList<WarningType>();

    /** 
     * Get the list of 'Warning' element items.
     * 
     * @return list
     */
    public List<WarningType> getWarningList() {
        return warningList;
    }

    /** 
     * Set the list of 'Warning' element items.
     * 
     * @param list
     */
    public void setWarningList(List<WarningType> list) {
        warningList = list;
    }
}
