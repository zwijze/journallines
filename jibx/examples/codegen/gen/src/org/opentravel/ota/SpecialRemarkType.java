
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.List;

/** 
 * Itinerary Remarks, Invoice Remarks, etc.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SpecialRemarkType">
 *   &lt;xs:sequence>
 *     &lt;xs:element name="TravelerRefNumber" minOccurs="0" maxOccurs="unbounded">
 *       &lt;xs:complexType>
 *         &lt;xs:attributeGroup ref="ns:TravelerRefNumberGroup"/>
 *       &lt;/xs:complexType>
 *     &lt;/xs:element>
 *     &lt;xs:element name="FlightRefNumber" minOccurs="0" maxOccurs="10">
 *       &lt;!-- Reference to inner class FlightRefNumber -->
 *     &lt;/xs:element>
 *     &lt;xs:element type="xs:string" name="Text"/>
 *     &lt;xs:element type="ns:CompanyNameType" name="Airline" minOccurs="0" maxOccurs="5"/>
 *     &lt;xs:element name="AuthorizedViewers" minOccurs="0">
 *       &lt;!-- Reference to inner class AuthorizedViewers -->
 *     &lt;/xs:element>
 *   &lt;/xs:sequence>
 *   &lt;xs:attribute type="xs:string" use="required" name="RemarkType"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SpecialRemarkType
{
    private List<TravelerRefNumberGroup> travelerRefNumberList = new ArrayList<TravelerRefNumberGroup>();
    private List<FlightRefNumber> flightRefNumberList = new ArrayList<FlightRefNumber>();
    private String text;
    private List<CompanyNameType> airlineList = new ArrayList<CompanyNameType>();
    private AuthorizedViewers authorizedViewers;
    private String remarkType;

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
     * Get the list of 'FlightRefNumber' element items.
     * 
     * @return list
     */
    public List<FlightRefNumber> getFlightRefNumberList() {
        return flightRefNumberList;
    }

    /** 
     * Set the list of 'FlightRefNumber' element items.
     * 
     * @param list
     */
    public void setFlightRefNumberList(List<FlightRefNumber> list) {
        flightRefNumberList = list;
    }

    /** 
     * Get the 'Text' element value. Text associated with remark
     * 
     * @return value
     */
    public String getText() {
        return text;
    }

    /** 
     * Set the 'Text' element value. Text associated with remark
     * 
     * @param text
     */
    public void setText(String text) {
        this.text = text;
    }

    /** 
     * Get the list of 'Airline' element items. Denotes the receiver (or target) airline(s) for the remark.
     * 
     * @return list
     */
    public List<CompanyNameType> getAirlineList() {
        return airlineList;
    }

    /** 
     * Set the list of 'Airline' element items. Denotes the receiver (or target) airline(s) for the remark.
     * 
     * @param list
     */
    public void setAirlineList(List<CompanyNameType> list) {
        airlineList = list;
    }

    /** 
     * Get the 'AuthorizedViewers' element value.
     * 
     * @return value
     */
    public AuthorizedViewers getAuthorizedViewers() {
        return authorizedViewers;
    }

    /** 
     * Set the 'AuthorizedViewers' element value.
     * 
     * @param authorizedViewers
     */
    public void setAuthorizedViewers(AuthorizedViewers authorizedViewers) {
        this.authorizedViewers = authorizedViewers;
    }

    /** 
     * Get the 'RemarkType' attribute value.  Type of special remark used (e.g., itinerary remark, invoice remark). Refer to OTA Code List Special Remark Option Type (SRO).
     * 
     * @return value
     */
    public String getRemarkType() {
        return remarkType;
    }

    /** 
     * Set the 'RemarkType' attribute value.  Type of special remark used (e.g., itinerary remark, invoice remark). Refer to OTA Code List Special Remark Option Type (SRO).
     * 
     * @param remarkType
     */
    public void setRemarkType(String remarkType) {
        this.remarkType = remarkType;
    }
    /** 
     * One or more flights to whom this request applies
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FlightRefNumber" minOccurs="0" maxOccurs="10">
     *   &lt;xs:complexType>
     *     &lt;xs:attributeGroup ref="ns:FlightRefNumberGroup"/>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * 
     * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FlightRefNumberGroup">
     *   &lt;xs:attribute type="xs:string" name="RPH"/>
     * &lt;/xs:attributeGroup>
     * </pre>
     */
    public static class FlightRefNumber
    {
        private String RPH;

        /** 
         * Get the 'RPH' attribute value. A reference pointer used to link a flight number to the search or response.
         * 
         * @return value
         */
        public String getRPH() {
            return RPH;
        }

        /** 
         * Set the 'RPH' attribute value. A reference pointer used to link a flight number to the search or response.
         * 
         * @param RPH
         */
        public void setRPH(String RPH) {
            this.RPH = RPH;
        }
    }
    /** 
     * A container for authorized viewers. 
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AuthorizedViewers" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:sequence>
     *       &lt;xs:element name="AuthorizedViewer" maxOccurs="99">
     *         &lt;!-- Reference to inner class AuthorizedViewer -->
     *       &lt;/xs:element>
     *     &lt;/xs:sequence>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class AuthorizedViewers
    {
        private List<AuthorizedViewer> authorizedViewerList = new ArrayList<AuthorizedViewer>();

        /** 
         * Get the list of 'AuthorizedViewer' element items.
         * 
         * @return list
         */
        public List<AuthorizedViewer> getAuthorizedViewerList() {
            return authorizedViewerList;
        }

        /** 
         * Set the list of 'AuthorizedViewer' element items.
         * 
         * @param list
         */
        public void setAuthorizedViewerList(List<AuthorizedViewer> list) {
            authorizedViewerList = list;
        }
        /** 
         * Specifies those authorized to view a confidential special remark.  
         * 
         * Schema fragment(s) for this class:
         * <pre>
         * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AuthorizedViewer" maxOccurs="99">
         *   &lt;xs:complexType>
         *     &lt;xs:attribute type="xs:string" use="optional" name="ViewerCode"/>
         *     &lt;xs:attribute type="xs:string" use="optional" name="ViewerCarrierCode"/>
         *   &lt;/xs:complexType>
         * &lt;/xs:element>
         * </pre>
         */
        public static class AuthorizedViewer
        {
            private String viewerCode;
            private String viewerCarrierCode;

            /** 
             * Get the 'ViewerCode' attribute value. Identifies an authorized viewer of a confidential remark. Can be a 3 character ATA/IATA airport/city code, an office ID, pseudo city code, etc.
             * 
             * @return value
             */
            public String getViewerCode() {
                return viewerCode;
            }

            /** 
             * Set the 'ViewerCode' attribute value. Identifies an authorized viewer of a confidential remark. Can be a 3 character ATA/IATA airport/city code, an office ID, pseudo city code, etc.
             * 
             * @param viewerCode
             */
            public void setViewerCode(String viewerCode) {
                this.viewerCode = viewerCode;
            }

            /** 
             * Get the 'ViewerCarrierCode' attribute value. Carrier code that may be used in conjunction with the viewer code to identify those authorized to view the confidential special remark.
             * 
             * @return value
             */
            public String getViewerCarrierCode() {
                return viewerCarrierCode;
            }

            /** 
             * Set the 'ViewerCarrierCode' attribute value. Carrier code that may be used in conjunction with the viewer code to identify those authorized to view the confidential special remark.
             * 
             * @param viewerCarrierCode
             */
            public void setViewerCarrierCode(String viewerCarrierCode) {
                this.viewerCarrierCode = viewerCarrierCode;
            }
        }
    }
}
