
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/** 
 * Contains descriptions of multimedia item(s).
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MultimediaDescriptionsType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:MultimediaDescriptionType" name="MultimediaDescription" maxOccurs="unbounded"/>
 *   &lt;/xs:sequence>
 *   &lt;xs:attribute type="xs:dateTime" use="optional" name="LastUpdated"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class MultimediaDescriptionsType
{
    private List<MultimediaDescriptionType> multimediaDescriptionList = new ArrayList<MultimediaDescriptionType>();
    private Date lastUpdated;

    /** 
     * Get the list of 'MultimediaDescription' element items. The description can be done using numerous items of different multimedia type   
     * 
     * @return list
     */
    public List<MultimediaDescriptionType> getMultimediaDescriptionList() {
        return multimediaDescriptionList;
    }

    /** 
     * Set the list of 'MultimediaDescription' element items. The description can be done using numerous items of different multimedia type   
     * 
     * @param list
     */
    public void setMultimediaDescriptionList(
            List<MultimediaDescriptionType> list) {
        multimediaDescriptionList = list;
    }

    /** 
     * Get the 'LastUpdated' attribute value. The date and time when the multimedia information was last updated. 
     * 
     * @return value
     */
    public Date getLastUpdated() {
        return lastUpdated;
    }

    /** 
     * Set the 'LastUpdated' attribute value. The date and time when the multimedia information was last updated. 
     * 
     * @param lastUpdated
     */
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
