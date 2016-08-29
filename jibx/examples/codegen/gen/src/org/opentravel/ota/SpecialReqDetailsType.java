
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.List;

/** 
 * Remarks, OSIs, Seat Requests etc.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SpecialReqDetailsType">
 *   &lt;xs:sequence>
 *     &lt;xs:element name="SeatRequests" minOccurs="0">
 *       &lt;!-- Reference to inner class SeatRequests -->
 *     &lt;/xs:element>
 *     &lt;xs:element name="SpecialServiceRequests" minOccurs="0">
 *       &lt;!-- Reference to inner class SpecialServiceRequests -->
 *     &lt;/xs:element>
 *     &lt;xs:element name="OtherServiceInformations" minOccurs="0">
 *       &lt;!-- Reference to inner class OtherServiceInformations -->
 *     &lt;/xs:element>
 *     &lt;xs:element name="Remarks" minOccurs="0">
 *       &lt;!-- Reference to inner class Remarks -->
 *     &lt;/xs:element>
 *     &lt;xs:element name="SpecialRemarks" minOccurs="0">
 *       &lt;!-- Reference to inner class SpecialRemarks -->
 *     &lt;/xs:element>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SpecialReqDetailsType
{
    private SeatRequests seatRequests;
    private SpecialServiceRequests specialServiceRequests;
    private OtherServiceInformations otherServiceInformations;
    private Remarks remarks;
    private SpecialRemarks specialRemarks;

    /** 
     * Get the 'SeatRequests' element value.
     * 
     * @return value
     */
    public SeatRequests getSeatRequests() {
        return seatRequests;
    }

    /** 
     * Set the 'SeatRequests' element value.
     * 
     * @param seatRequests
     */
    public void setSeatRequests(SeatRequests seatRequests) {
        this.seatRequests = seatRequests;
    }

    /** 
     * Get the 'SpecialServiceRequests' element value.
     * 
     * @return value
     */
    public SpecialServiceRequests getSpecialServiceRequests() {
        return specialServiceRequests;
    }

    /** 
     * Set the 'SpecialServiceRequests' element value.
     * 
     * @param specialServiceRequests
     */
    public void setSpecialServiceRequests(
            SpecialServiceRequests specialServiceRequests) {
        this.specialServiceRequests = specialServiceRequests;
    }

    /** 
     * Get the 'OtherServiceInformations' element value.
     * 
     * @return value
     */
    public OtherServiceInformations getOtherServiceInformations() {
        return otherServiceInformations;
    }

    /** 
     * Set the 'OtherServiceInformations' element value.
     * 
     * @param otherServiceInformations
     */
    public void setOtherServiceInformations(
            OtherServiceInformations otherServiceInformations) {
        this.otherServiceInformations = otherServiceInformations;
    }

    /** 
     * Get the 'Remarks' element value.
     * 
     * @return value
     */
    public Remarks getRemarks() {
        return remarks;
    }

    /** 
     * Set the 'Remarks' element value.
     * 
     * @param remarks
     */
    public void setRemarks(Remarks remarks) {
        this.remarks = remarks;
    }

    /** 
     * Get the 'SpecialRemarks' element value.
     * 
     * @return value
     */
    public SpecialRemarks getSpecialRemarks() {
        return specialRemarks;
    }

    /** 
     * Set the 'SpecialRemarks' element value.
     * 
     * @param specialRemarks
     */
    public void setSpecialRemarks(SpecialRemarks specialRemarks) {
        this.specialRemarks = specialRemarks;
    }
    /** 
     * A collection of Seat Request
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SeatRequests" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:sequence>
     *       &lt;xs:element name="SeatRequest" maxOccurs="unbounded">
     *         &lt;!-- Reference to inner class SeatRequest -->
     *       &lt;/xs:element>
     *     &lt;/xs:sequence>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class SeatRequests
    {
        private List<SeatRequest> seatRequestList = new ArrayList<SeatRequest>();

        /** 
         * Get the list of 'SeatRequest' element items.
         * 
         * @return list
         */
        public List<SeatRequest> getSeatRequestList() {
            return seatRequestList;
        }

        /** 
         * Set the list of 'SeatRequest' element items.
         * 
         * @param list
         */
        public void setSeatRequestList(List<SeatRequest> list) {
            seatRequestList = list;
        }
        /** 
         * Seating requests for each passenger for each air leg of this trip.
         * 
         * Schema fragment(s) for this class:
         * <pre>
         * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SeatRequest" maxOccurs="unbounded">
         *   &lt;xs:complexType>
         *     &lt;xs:complexContent>
         *       &lt;xs:extension base="ns:SeatRequestType">
         *         &lt;xs:attribute type="ns:ListOfRPH" use="optional" name="TravelerRefNumberRPHList"/>
         *         &lt;xs:attribute type="ns:ListOfRPH" use="optional" name="FlightRefNumberRPHList"/>
         *         &lt;xs:attribute type="xs:boolean" use="optional" name="PartialSeatingInd"/>
         *       &lt;/xs:extension>
         *     &lt;/xs:complexContent>
         *   &lt;/xs:complexType>
         * &lt;/xs:element>
         * 
         * &lt;xs:simpleType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ListOfRPH">
         *   &lt;xs:list itemType="xs:string"/>
         * &lt;/xs:simpleType>
         * </pre>
         */
        public static class SeatRequest extends SeatRequestType
        {
            private List<String> travelerRefNumberRPHList = new ArrayList<String>();
            private List<String> flightRefNumberRPHList = new ArrayList<String>();
            private Boolean partialSeatingInd;

            /** 
             * Get the list of 'TravelerRefNumberRPHList' attribute items. One or more travelers to whom this request applies
             * 
             * @return list
             */
            public List<String> getTravelerRefNumberRPHList() {
                return travelerRefNumberRPHList;
            }

            /** 
             * Set the list of 'TravelerRefNumberRPHList' attribute items. One or more travelers to whom this request applies
             * 
             * @param list
             */
            public void setTravelerRefNumberRPHList(List<String> list) {
                travelerRefNumberRPHList = list;
            }

            /** 
             * Serializer for 'TravelerRefNumberRPHList' attribute list.
             * 
             * @param values
             * @return text
             */
            public static String serializeTravelerRefNumberRPHList(
                    List<String> values) {
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
             * Deserializer for 'TravelerRefNumberRPHList' attribute list.
             * 
             * @param text
             * @return values
             * @throws org.jibx.runtime.JiBXException on conversion error
             */
            public static List<String> deserializeTravelerRefNumberRPHList(
                    String text) throws org.jibx.runtime.JiBXException {
                org.jibx.runtime.IListItemDeserializer ldser = new org.jibx.runtime.IListItemDeserializer() {
                    public java.lang.Object deserialize(String text) {
                        return text;
                    }
                };
                return (List<String>) org.jibx.runtime.Utility.deserializeList(
                        text, ldser);
            }

            /** 
             * Get the list of 'FlightRefNumberRPHList' attribute items. One or more flights to whom this request applies
             * 
             * @return list
             */
            public List<String> getFlightRefNumberRPHList() {
                return flightRefNumberRPHList;
            }

            /** 
             * Set the list of 'FlightRefNumberRPHList' attribute items. One or more flights to whom this request applies
             * 
             * @param list
             */
            public void setFlightRefNumberRPHList(List<String> list) {
                flightRefNumberRPHList = list;
            }

            /** 
             * Serializer for 'FlightRefNumberRPHList' attribute list.
             * 
             * @param values
             * @return text
             */
            public static String serializeFlightRefNumberRPHList(
                    List<String> values) {
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
             * Deserializer for 'FlightRefNumberRPHList' attribute list.
             * 
             * @param text
             * @return values
             * @throws org.jibx.runtime.JiBXException on conversion error
             */
            public static List<String> deserializeFlightRefNumberRPHList(
                    String text) throws org.jibx.runtime.JiBXException {
                org.jibx.runtime.IListItemDeserializer ldser = new org.jibx.runtime.IListItemDeserializer() {
                    public java.lang.Object deserialize(String text) {
                        return text;
                    }
                };
                return (List<String>) org.jibx.runtime.Utility.deserializeList(
                        text, ldser);
            }

            /** 
             * Get the 'PartialSeatingInd' attribute value. When true, the carrier supports partial seating. When false, the carrier does not support partial seating.
             * 
             * @return value
             */
            public Boolean getPartialSeatingInd() {
                return partialSeatingInd;
            }

            /** 
             * Set the 'PartialSeatingInd' attribute value. When true, the carrier supports partial seating. When false, the carrier does not support partial seating.
             * 
             * @param partialSeatingInd
             */
            public void setPartialSeatingInd(Boolean partialSeatingInd) {
                this.partialSeatingInd = partialSeatingInd;
            }
        }
    }
    /** 
     * A collection of Special Service Request
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SpecialServiceRequests" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:sequence>
     *       &lt;xs:element name="SpecialServiceRequest" maxOccurs="unbounded">
     *         &lt;!-- Reference to inner class SpecialServiceRequest -->
     *       &lt;/xs:element>
     *     &lt;/xs:sequence>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class SpecialServiceRequests
    {
        private List<SpecialServiceRequest> specialServiceRequestList = new ArrayList<SpecialServiceRequest>();

        /** 
         * Get the list of 'SpecialServiceRequest' element items.
         * 
         * @return list
         */
        public List<SpecialServiceRequest> getSpecialServiceRequestList() {
            return specialServiceRequestList;
        }

        /** 
         * Set the list of 'SpecialServiceRequest' element items.
         * 
         * @param list
         */
        public void setSpecialServiceRequestList(
                List<SpecialServiceRequest> list) {
            specialServiceRequestList = list;
        }
        /** 
         * Special Service Requests (SSR) for this booking
         * 
         * Schema fragment(s) for this class:
         * <pre>
         * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SpecialServiceRequest" maxOccurs="unbounded">
         *   &lt;xs:complexType>
         *     &lt;xs:complexContent>
         *       &lt;xs:extension base="ns:SpecialServiceRequestType">
         *         &lt;xs:attribute type="ns:ListOfRPH" use="optional" name="TravelerRefNumberRPHList"/>
         *         &lt;xs:attribute type="ns:ListOfRPH" use="optional" name="FlightRefNumberRPHList"/>
         *       &lt;/xs:extension>
         *     &lt;/xs:complexContent>
         *   &lt;/xs:complexType>
         * &lt;/xs:element>
         * 
         * &lt;xs:simpleType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ListOfRPH">
         *   &lt;xs:list itemType="xs:string"/>
         * &lt;/xs:simpleType>
         * </pre>
         */
        public static class SpecialServiceRequest
                extends
                    SpecialServiceRequestType
        {
            private List<String> travelerRefNumberRPHList = new ArrayList<String>();
            private List<String> flightRefNumberRPHList = new ArrayList<String>();

            /** 
             * Get the list of 'TravelerRefNumberRPHList' attribute items. One or more travelers to whom this request applies
             * 
             * @return list
             */
            public List<String> getTravelerRefNumberRPHList() {
                return travelerRefNumberRPHList;
            }

            /** 
             * Set the list of 'TravelerRefNumberRPHList' attribute items. One or more travelers to whom this request applies
             * 
             * @param list
             */
            public void setTravelerRefNumberRPHList(List<String> list) {
                travelerRefNumberRPHList = list;
            }

            /** 
             * Serializer for 'TravelerRefNumberRPHList' attribute list.
             * 
             * @param values
             * @return text
             */
            public static String serializeTravelerRefNumberRPHList(
                    List<String> values) {
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
             * Deserializer for 'TravelerRefNumberRPHList' attribute list.
             * 
             * @param text
             * @return values
             * @throws org.jibx.runtime.JiBXException on conversion error
             */
            public static List<String> deserializeTravelerRefNumberRPHList(
                    String text) throws org.jibx.runtime.JiBXException {
                org.jibx.runtime.IListItemDeserializer ldser = new org.jibx.runtime.IListItemDeserializer() {
                    public java.lang.Object deserialize(String text) {
                        return text;
                    }
                };
                return (List<String>) org.jibx.runtime.Utility.deserializeList(
                        text, ldser);
            }

            /** 
             * Get the list of 'FlightRefNumberRPHList' attribute items. One or more flights to whom this request applies
             * 
             * @return list
             */
            public List<String> getFlightRefNumberRPHList() {
                return flightRefNumberRPHList;
            }

            /** 
             * Set the list of 'FlightRefNumberRPHList' attribute items. One or more flights to whom this request applies
             * 
             * @param list
             */
            public void setFlightRefNumberRPHList(List<String> list) {
                flightRefNumberRPHList = list;
            }

            /** 
             * Serializer for 'FlightRefNumberRPHList' attribute list.
             * 
             * @param values
             * @return text
             */
            public static String serializeFlightRefNumberRPHList(
                    List<String> values) {
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
             * Deserializer for 'FlightRefNumberRPHList' attribute list.
             * 
             * @param text
             * @return values
             * @throws org.jibx.runtime.JiBXException on conversion error
             */
            public static List<String> deserializeFlightRefNumberRPHList(
                    String text) throws org.jibx.runtime.JiBXException {
                org.jibx.runtime.IListItemDeserializer ldser = new org.jibx.runtime.IListItemDeserializer() {
                    public java.lang.Object deserialize(String text) {
                        return text;
                    }
                };
                return (List<String>) org.jibx.runtime.Utility.deserializeList(
                        text, ldser);
            }
        }
    }
    /** 
     * A collection of Other Service Information
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="OtherServiceInformations" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:sequence>
     *       &lt;xs:element name="OtherServiceInformation" maxOccurs="unbounded">
     *         &lt;!-- Reference to inner class OtherServiceInformation -->
     *       &lt;/xs:element>
     *     &lt;/xs:sequence>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class OtherServiceInformations
    {
        private List<OtherServiceInformation> otherServiceInformationList = new ArrayList<OtherServiceInformation>();

        /** 
         * Get the list of 'OtherServiceInformation' element items.
         * 
         * @return list
         */
        public List<OtherServiceInformation> getOtherServiceInformationList() {
            return otherServiceInformationList;
        }

        /** 
         * Set the list of 'OtherServiceInformation' element items.
         * 
         * @param list
         */
        public void setOtherServiceInformationList(
                List<OtherServiceInformation> list) {
            otherServiceInformationList = list;
        }
        /** 
         * Other Service Information (OSI) for relevant airlines 
         * 
         * Schema fragment(s) for this class:
         * <pre>
         * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="OtherServiceInformation" maxOccurs="unbounded">
         *   &lt;xs:complexType>
         *     &lt;xs:complexContent>
         *       &lt;xs:extension base="ns:OtherServiceInfoType">
         *         &lt;xs:attribute type="xs:string" use="optional" name="RPH"/>
         *         &lt;xs:attribute type="ns:ActionType" use="optional" name="Operation"/>
         *       &lt;/xs:extension>
         *     &lt;/xs:complexContent>
         *   &lt;/xs:complexType>
         * &lt;/xs:element>
         * </pre>
         */
        public static class OtherServiceInformation
                extends
                    OtherServiceInfoType
        {
            private String RPH;
            private ActionType operation;

            /** 
             * Get the 'RPH' attribute value. Unique value associated with the OSI.
             * 
             * @return value
             */
            public String getRPH() {
                return RPH;
            }

            /** 
             * Set the 'RPH' attribute value. Unique value associated with the OSI.
             * 
             * @param RPH
             */
            public void setRPH(String RPH) {
                this.RPH = RPH;
            }

            /** 
             * Get the 'Operation' attribute value. Indicates the required modification to the element.
             * 
             * @return value
             */
            public ActionType getOperation() {
                return operation;
            }

            /** 
             * Set the 'Operation' attribute value. Indicates the required modification to the element.
             * 
             * @param operation
             */
            public void setOperation(ActionType operation) {
                this.operation = operation;
            }
        }
    }
    /** 
     * A collection of Remark
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Remarks" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:sequence>
     *       &lt;xs:element name="Remark" maxOccurs="unbounded">
     *         &lt;!-- Reference to inner class Remark -->
     *       &lt;/xs:element>
     *     &lt;/xs:sequence>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class Remarks
    {
        private List<Remark> remarkList = new ArrayList<Remark>();

        /** 
         * Get the list of 'Remark' element items.
         * 
         * @return list
         */
        public List<Remark> getRemarkList() {
            return remarkList;
        }

        /** 
         * Set the list of 'Remark' element items.
         * 
         * @param list
         */
        public void setRemarkList(List<Remark> list) {
            remarkList = list;
        }
        /** 
         * Supplementary information for this booking
         * 
         * Schema fragment(s) for this class:
         * <pre>
         * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Remark" maxOccurs="unbounded">
         *   &lt;xs:complexType>
         *     &lt;xs:simpleContent>
         *       &lt;xs:extension base="xs:string">
         *         &lt;xs:attribute type="xs:string" use="optional" name="RPH"/>
         *         &lt;xs:attribute type="ns:ActionType" use="optional" name="Operation"/>
         *       &lt;/xs:extension>
         *     &lt;/xs:simpleContent>
         *   &lt;/xs:complexType>
         * &lt;/xs:element>
         * </pre>
         */
        public static class Remark
        {
            private String string;
            private String RPH;
            private ActionType operation;

            /** 
             * Get the extension value.
             * 
             * @return value
             */
            public String getString() {
                return string;
            }

            /** 
             * Set the extension value.
             * 
             * @param string
             */
            public void setString(String string) {
                this.string = string;
            }

            /** 
             * Get the 'RPH' attribute value. Unique value associated with the Remark.
             * 
             * @return value
             */
            public String getRPH() {
                return RPH;
            }

            /** 
             * Set the 'RPH' attribute value. Unique value associated with the Remark.
             * 
             * @param RPH
             */
            public void setRPH(String RPH) {
                this.RPH = RPH;
            }

            /** 
             * Get the 'Operation' attribute value. Indicates the required modification to the element.
             * 
             * @return value
             */
            public ActionType getOperation() {
                return operation;
            }

            /** 
             * Set the 'Operation' attribute value. Indicates the required modification to the element.
             * 
             * @param operation
             */
            public void setOperation(ActionType operation) {
                this.operation = operation;
            }
        }
    }
    /** 
     * A collection of Special Remark
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SpecialRemarks" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:sequence>
     *       &lt;xs:element name="SpecialRemark" maxOccurs="unbounded">
     *         &lt;!-- Reference to inner class SpecialRemark -->
     *       &lt;/xs:element>
     *     &lt;/xs:sequence>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class SpecialRemarks
    {
        private List<SpecialRemark> specialRemarkList = new ArrayList<SpecialRemark>();

        /** 
         * Get the list of 'SpecialRemark' element items.
         * 
         * @return list
         */
        public List<SpecialRemark> getSpecialRemarkList() {
            return specialRemarkList;
        }

        /** 
         * Set the list of 'SpecialRemark' element items.
         * 
         * @param list
         */
        public void setSpecialRemarkList(List<SpecialRemark> list) {
            specialRemarkList = list;
        }
        /** 
         * Itinerary Remarks, Invoice Remarks, etc.
         * 
         * Schema fragment(s) for this class:
         * <pre>
         * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SpecialRemark" maxOccurs="unbounded">
         *   &lt;xs:complexType>
         *     &lt;xs:complexContent>
         *       &lt;xs:extension base="ns:SpecialRemarkType">
         *         &lt;xs:attribute type="ns:ActionType" use="optional" name="Operation"/>
         *         &lt;xs:attribute type="xs:string" use="optional" name="RPH"/>
         *       &lt;/xs:extension>
         *     &lt;/xs:complexContent>
         *   &lt;/xs:complexType>
         * &lt;/xs:element>
         * </pre>
         */
        public static class SpecialRemark extends SpecialRemarkType
        {
            private ActionType operation;
            private String RPH;

            /** 
             * Get the 'Operation' attribute value. Indicates the required modification to the element.
             * 
             * @return value
             */
            public ActionType getOperation() {
                return operation;
            }

            /** 
             * Set the 'Operation' attribute value. Indicates the required modification to the element.
             * 
             * @param operation
             */
            public void setOperation(ActionType operation) {
                this.operation = operation;
            }

            /** 
             * Get the 'RPH' attribute value. Unique value associated with the Special Remark.
             * 
             * @return value
             */
            public String getRPH() {
                return RPH;
            }

            /** 
             * Set the 'RPH' attribute value. Unique value associated with the Special Remark.
             * 
             * @param RPH
             */
            public void setRPH(String RPH) {
                this.RPH = RPH;
            }
        }
    }
}
