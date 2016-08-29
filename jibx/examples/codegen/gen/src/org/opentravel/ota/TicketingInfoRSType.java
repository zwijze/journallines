
package org.opentravel.ota;

/** 
 * 
 Extends TicketingInfoType to provide an eTicketNumber.
 Minimum information about ticketing required to complete the booking transaction plus eTicket number.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TicketingInfoRS_Type">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:TicketingInfoType">
 *       &lt;xs:attribute type="xs:string" use="optional" name="eTicketNumber"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TicketingInfoRSType extends TicketingInfoType
{
    private String ETicketNumber;

    /** 
     * Get the 'eTicketNumber' attribute value. If reservation is electronically ticketed at time of booking, this is the field for the eTicket number.
     * 
     * @return value
     */
    public String getETicketNumber() {
        return ETicketNumber;
    }

    /** 
     * Set the 'eTicketNumber' attribute value. If reservation is electronically ticketed at time of booking, this is the field for the eTicket number.
     * 
     * @param eTicketNumber
     */
    public void setETicketNumber(String eTicketNumber) {
        ETicketNumber = eTicketNumber;
    }
}
