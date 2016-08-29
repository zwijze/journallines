
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.List;

/** 
 * Details of a seat map for a particular aircraft
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SeatMapDetailsType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:CabinClassType" name="CabinClass" maxOccurs="5"/>
 *   &lt;/xs:sequence>
 *   &lt;xs:attribute type="ns:ListOfRPH" use="optional" name="TravelerRefNumberRPHs"/>
 * &lt;/xs:complexType>
 * 
 * &lt;xs:simpleType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ListOfRPH">
 *   &lt;xs:list itemType="xs:string"/>
 * &lt;/xs:simpleType>
 * </pre>
 */
public class SeatMapDetailsType
{
    private List<CabinClassType> cabinClassList = new ArrayList<CabinClassType>();
    private List<String> travelerRefNumberRPHs = new ArrayList<String>();

    /** 
     * Get the list of 'CabinClass' element items.  Describes the Cabin details in a seat map.
     * 
     * @return list
     */
    public List<CabinClassType> getCabinClassList() {
        return cabinClassList;
    }

    /** 
     * Set the list of 'CabinClass' element items.  Describes the Cabin details in a seat map.
     * 
     * @param list
     */
    public void setCabinClassList(List<CabinClassType> list) {
        cabinClassList = list;
    }

    /** 
     * Get the list of 'TravelerRefNumberRPHs' attribute items. The reference number is used as a cross reference between the AirTravelerType and the SeatMapDetails. This will be used only if different seat maps are valid for  different passengers for the same flight segment.
     * 
     * @return list
     */
    public List<String> getTravelerRefNumberRPHs() {
        return travelerRefNumberRPHs;
    }

    /** 
     * Set the list of 'TravelerRefNumberRPHs' attribute items. The reference number is used as a cross reference between the AirTravelerType and the SeatMapDetails. This will be used only if different seat maps are valid for  different passengers for the same flight segment.
     * 
     * @param list
     */
    public void setTravelerRefNumberRPHs(List<String> list) {
        travelerRefNumberRPHs = list;
    }

    /** 
     * Serializer for 'TravelerRefNumberRPHs' attribute list.
     * 
     * @param values
     * @return text
     */
    public static String serializeTravelerRefNumberRPHs(List<String> values) {
        if (values == null) {
            return null;
        } else {
            java.lang.StringBuffer buff = new java.lang.StringBuffer();
            for (java.util.Iterator<String> iter = values.iterator(); iter
                    .hasNext();) {
                if (buff.length() > 0) {
                    buff.append(' ');
                }
                String value = iter.next();
                buff.append(value);
            }
            return buff.toString();
        }
    }

    /** 
     * Deserializer for 'TravelerRefNumberRPHs' attribute list.
     * 
     * @param text
     * @return values
     * @throws org.jibx.runtime.JiBXException on conversion error
     */
    public static List<String> deserializeTravelerRefNumberRPHs(String text)
            throws org.jibx.runtime.JiBXException {
        org.jibx.runtime.IListItemDeserializer ldser = new org.jibx.runtime.IListItemDeserializer() {
            public java.lang.Object deserialize(String text) {
                return text;
            }
        };
        return (List<String>) org.jibx.runtime.Utility.deserializeList(text,
                ldser);
    }
}
