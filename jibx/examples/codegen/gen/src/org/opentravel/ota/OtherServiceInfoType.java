
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.List;

/** 
 * Other Service Information (OSI) for relevant airlines 
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="OtherServiceInfoType">
 *   &lt;xs:sequence>
 *     &lt;xs:element name="TravelerRefNumber" minOccurs="0" maxOccurs="unbounded">
 *       &lt;xs:complexType>
 *         &lt;xs:attributeGroup ref="ns:TravelerRefNumberGroup"/>
 *       &lt;/xs:complexType>
 *     &lt;/xs:element>
 *     &lt;xs:element type="ns:CompanyNameType" name="Airline"/>
 *     &lt;xs:element type="xs:string" name="Text"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class OtherServiceInfoType
{
    private List<TravelerRefNumberGroup> travelerRefNumberList = new ArrayList<TravelerRefNumberGroup>();
    private CompanyNameType airline;
    private String text;

    /** 
     * Get the list of 'TravelerRefNumber' element items. One or more travelers to whom this request applies
     * 
     * @return list
     */
    public List<TravelerRefNumberGroup> getTravelerRefNumberList() {
        return travelerRefNumberList;
    }

    /** 
     * Set the list of 'TravelerRefNumber' element items. One or more travelers to whom this request applies
     * 
     * @param list
     */
    public void setTravelerRefNumberList(List<TravelerRefNumberGroup> list) {
        travelerRefNumberList = list;
    }

    /** 
     * Get the 'Airline' element value. The airline to which the OSI applies.
     * 
     * @return value
     */
    public CompanyNameType getAirline() {
        return airline;
    }

    /** 
     * Set the 'Airline' element value. The airline to which the OSI applies.
     * 
     * @param airline
     */
    public void setAirline(CompanyNameType airline) {
        this.airline = airline;
    }

    /** 
     * Get the 'Text' element value. The OSI text.
     * 
     * @return value
     */
    public String getText() {
        return text;
    }

    /** 
     * Set the 'Text' element value. The OSI text.
     * 
     * @param text
     */
    public void setText(String text) {
        this.text = text;
    }
}
