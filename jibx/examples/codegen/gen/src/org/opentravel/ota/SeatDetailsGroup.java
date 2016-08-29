
package org.opentravel.ota;

/** 
 * Describes the seat attributes.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SeatDetailsGroup">
 *   &lt;xs:attribute type="xs:string" use="optional" name="SeatAvailability"/>
 *   &lt;xs:attribute type="xs:string" use="required" name="SeatNumber"/>
 *   &lt;xs:attribute type="ns:ListOfOTA_CodeType" use="required" name="SeatCharacteristics"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="AirBookDesigCode"/>
 * &lt;/xs:attributeGroup>
 * 
 * &lt;xs:simpleType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ListOfOTA_CodeType">
 *   &lt;xs:list itemType="xs:string"/>
 * &lt;/xs:simpleType>
 * </pre>
 */
public class SeatDetailsGroup
{
    private String seatAvailability;
    private String seatNumber;
    private java.util.List<String> seatCharacteristics = new java.util.ArrayList<String>();
    private String airBookDesigCode;

    /** 
     * Get the 'SeatAvailability' attribute value. Availability status of the particular seat. Refer to OTA Code List Seat Availability (SAV).
     * 
     * @return value
     */
    public String getSeatAvailability() {
        return seatAvailability;
    }

    /** 
     * Set the 'SeatAvailability' attribute value. Availability status of the particular seat. Refer to OTA Code List Seat Availability (SAV).
     * 
     * @param seatAvailability
     */
    public void setSeatAvailability(String seatAvailability) {
        this.seatAvailability = seatAvailability;
    }

    /** 
     * Get the 'SeatNumber' attribute value. Actual seat number within a particular row, typically A, B etc.
     * 
     * @return value
     */
    public String getSeatNumber() {
        return seatNumber;
    }

    /** 
     * Set the 'SeatNumber' attribute value. Actual seat number within a particular row, typically A, B etc.
     * 
     * @param seatNumber
     */
    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    /** 
     * Get the list of 'SeatCharacteristics' attribute items. Describes the characteristics of a specific seat. Refer to OTA Code List Air Seat Type (AST).
     * 
     * @return list
     */
    public java.util.List<String> getSeatCharacteristics() {
        return seatCharacteristics;
    }

    /** 
     * Set the list of 'SeatCharacteristics' attribute items. Describes the characteristics of a specific seat. Refer to OTA Code List Air Seat Type (AST).
     * 
     * @param list
     */
    public void setSeatCharacteristics(java.util.List<String> list) {
        seatCharacteristics = list;
    }

    /** 
     * Serializer for 'SeatCharacteristics' attribute list.
     * 
     * @param values
     * @return text
     */
    public static String serializeSeatCharacteristics(
            java.util.List<String> values) {
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
     * Deserializer for 'SeatCharacteristics' attribute list.
     * 
     * @param text
     * @return values
     * @throws org.jibx.runtime.JiBXException on conversion error
     */
    public static java.util.List<String> deserializeSeatCharacteristics(
            String text) throws org.jibx.runtime.JiBXException {
        org.jibx.runtime.IListItemDeserializer ldser = new org.jibx.runtime.IListItemDeserializer() {
            public java.lang.Object deserialize(String text) {
                return text;
            }
        };
        return (java.util.List<String>) org.jibx.runtime.Utility
                .deserializeList(text, ldser);
    }

    /** 
     * Get the 'AirBookDesigCode' attribute value. Allows that a seat may be assigned a class code.
     * 
     * @return value
     */
    public String getAirBookDesigCode() {
        return airBookDesigCode;
    }

    /** 
     * Set the 'AirBookDesigCode' attribute value. Allows that a seat may be assigned a class code.
     * 
     * @param airBookDesigCode
     */
    public void setAirBookDesigCode(String airBookDesigCode) {
        this.airBookDesigCode = airBookDesigCode;
    }
}
