
package org.opentravel.ota;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/** 
 * Describes the row details in a seat map
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RowDetailsType">
 *   &lt;xs:sequence>
 *     &lt;xs:element name="AirSeats">
 *       &lt;xs:complexType>
 *         &lt;xs:sequence>
 *           &lt;xs:element name="AirSeat" maxOccurs="99">
 *             &lt;!-- Reference to inner class AirSeat -->
 *           &lt;/xs:element>
 *         &lt;/xs:sequence>
 *       &lt;/xs:complexType>
 *     &lt;/xs:element>
 *     &lt;xs:element name="AirRowCharacteristics">
 *       &lt;xs:complexType>
 *         &lt;xs:attribute type="ns:ListOfOTA_CodeType" use="required" name="CharacteristicList"/>
 *       &lt;/xs:complexType>
 *     &lt;/xs:element>
 *   &lt;/xs:sequence>
 *   &lt;xs:attribute type="xs:integer" name="MaxNumberOfSeats"/>
 *   &lt;xs:attribute type="xs:integer" use="required" name="RowNumber"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="AirBookDesigCode"/>
 * &lt;/xs:complexType>
 * 
 * &lt;xs:simpleType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ListOfOTA_CodeType">
 *   &lt;xs:list itemType="xs:string"/>
 * &lt;/xs:simpleType>
 * </pre>
 */
public class RowDetailsType
{
    private List<AirSeat> airSeatList = new ArrayList<AirSeat>();
    private List<String> airRowCharacteristics = new ArrayList<String>();
    private BigInteger maxNumberOfSeats;
    private BigInteger rowNumber;
    private String airBookDesigCode;

    /** 
     * Get the list of 'AirSeat' element items. A Collection of Air Seat
     * 
     * @return list
     */
    public List<AirSeat> getAirSeatList() {
        return airSeatList;
    }

    /** 
     * Set the list of 'AirSeat' element items. A Collection of Air Seat
     * 
     * @param list
     */
    public void setAirSeatList(List<AirSeat> list) {
        airSeatList = list;
    }

    /** 
     * Get the list of 'CharacteristicList' attribute items. Contains a list of characteristics of an air row.
     * 
     * @return list
     */
    public List<String> getAirRowCharacteristics() {
        return airRowCharacteristics;
    }

    /** 
     * Set the list of 'CharacteristicList' attribute items. Contains a list of characteristics of an air row.
     * 
     * @param list
     */
    public void setAirRowCharacteristics(List<String> list) {
        airRowCharacteristics = list;
    }

    /** 
     * Serializer for 'CharacteristicList' attribute list.
     * 
     * @param values
     * @return text
     */
    public static String serializeAirRowCharacteristics(List<String> values) {
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
     * Deserializer for 'CharacteristicList' attribute list.
     * 
     * @param text
     * @return values
     * @throws org.jibx.runtime.JiBXException on conversion error
     */
    public static List<String> deserializeAirRowCharacteristics(String text)
            throws org.jibx.runtime.JiBXException {
        org.jibx.runtime.IListItemDeserializer ldser = new org.jibx.runtime.IListItemDeserializer() {
            public java.lang.Object deserialize(String text) {
                return text;
            }
        };
        return (List<String>) org.jibx.runtime.Utility.deserializeList(text,
                ldser);
    }

    /** 
     * Get the 'MaxNumberOfSeats' attribute value. Maximum number of seats per row.
     * 
     * @return value
     */
    public BigInteger getMaxNumberOfSeats() {
        return maxNumberOfSeats;
    }

    /** 
     * Set the 'MaxNumberOfSeats' attribute value. Maximum number of seats per row.
     * 
     * @param maxNumberOfSeats
     */
    public void setMaxNumberOfSeats(BigInteger maxNumberOfSeats) {
        this.maxNumberOfSeats = maxNumberOfSeats;
    }

    /** 
     * Get the 'RowNumber' attribute value. Specifies the actual row number in the seat map.
     * 
     * @return value
     */
    public BigInteger getRowNumber() {
        return rowNumber;
    }

    /** 
     * Set the 'RowNumber' attribute value. Specifies the actual row number in the seat map.
     * 
     * @param rowNumber
     */
    public void setRowNumber(BigInteger rowNumber) {
        this.rowNumber = rowNumber;
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
    /** 
     * A Seat within a row
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AirSeat" maxOccurs="99">
     *   &lt;xs:complexType>
     *     &lt;xs:attributeGroup ref="ns:SeatDetailsGroup"/>
     *     &lt;xs:attribute type="xs:string" use="optional" name="RPH"/>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class AirSeat
    {
        private SeatDetailsGroup seatDetailsGroup;
        private String RPH;

        /** 
         * Get the 'SeatDetailsGroup' attributeGroup value.
         * 
         * @return value
         */
        public SeatDetailsGroup getSeatDetailsGroup() {
            return seatDetailsGroup;
        }

        /** 
         * Set the 'SeatDetailsGroup' attributeGroup value.
         * 
         * @param seatDetailsGroup
         */
        public void setSeatDetailsGroup(SeatDetailsGroup seatDetailsGroup) {
            this.seatDetailsGroup = seatDetailsGroup;
        }

        /** 
         * Get the 'RPH' attribute value. Should be used for situations in which a passenger in the input request is already assigned a seat. The RPH value will correspond to the RPH in the element  TravelRefNumber within the element TravelerInfoSummary.
         * 
         * @return value
         */
        public String getRPH() {
            return RPH;
        }

        /** 
         * Set the 'RPH' attribute value. Should be used for situations in which a passenger in the input request is already assigned a seat. The RPH value will correspond to the RPH in the element  TravelRefNumber within the element TravelerInfoSummary.
         * 
         * @param RPH
         */
        public void setRPH(String RPH) {
            this.RPH = RPH;
        }
    }
}
