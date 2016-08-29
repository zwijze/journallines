
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.List;

/** 
 * Information about one or more recipients.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RecipientInfosType">
 *   &lt;xs:sequence>
 *     &lt;xs:element name="RecipientInfo" maxOccurs="99">
 *       &lt;!-- Reference to inner class RecipientInfo -->
 *     &lt;/xs:element>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class RecipientInfosType
{
    private List<RecipientInfo> recipientInfoList = new ArrayList<RecipientInfo>();

    /** 
     * Get the list of 'RecipientInfo' element items.
     * 
     * @return list
     */
    public List<RecipientInfo> getRecipientInfoList() {
        return recipientInfoList;
    }

    /** 
     * Set the list of 'RecipientInfo' element items.
     * 
     * @param list
     */
    public void setRecipientInfoList(List<RecipientInfo> list) {
        recipientInfoList = list;
    }
    /** 
     * Contact and/or reservation information pertaining to the recipient.
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RecipientInfo" maxOccurs="99">
     *   &lt;xs:complexType>
     *     &lt;xs:complexContent>
     *       &lt;xs:extension base="ns:ContactPersonType">
     *         &lt;xs:sequence>
     *           &lt;xs:element type="ns:UniqueID_Type" name="ReservationID" minOccurs="0" maxOccurs="2"/>
     *           &lt;xs:element name="ShippingInfo" minOccurs="0">
     *             &lt;!-- Reference to inner class ShippingInfo -->
     *           &lt;/xs:element>
     *           &lt;xs:element name="Comments" minOccurs="0">
     *             &lt;!-- Reference to inner class Comments -->
     *           &lt;/xs:element>
     *         &lt;/xs:sequence>
     *       &lt;/xs:extension>
     *     &lt;/xs:complexContent>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class RecipientInfo extends ContactPersonType
    {
        private List<UniqueIDType> reservationIDList = new ArrayList<UniqueIDType>();
        private ShippingInfo shippingInfo;
        private Comments comments;

        /** 
         * Get the list of 'ReservationID' element items. Provides the reservation number of the recipient for delivery of the product.
         * 
         * @return list
         */
        public List<UniqueIDType> getReservationIDList() {
            return reservationIDList;
        }

        /** 
         * Set the list of 'ReservationID' element items. Provides the reservation number of the recipient for delivery of the product.
         * 
         * @param list
         */
        public void setReservationIDList(List<UniqueIDType> list) {
            reservationIDList = list;
        }

        /** 
         * Get the 'ShippingInfo' element value.
         * 
         * @return value
         */
        public ShippingInfo getShippingInfo() {
            return shippingInfo;
        }

        /** 
         * Set the 'ShippingInfo' element value.
         * 
         * @param shippingInfo
         */
        public void setShippingInfo(ShippingInfo shippingInfo) {
            this.shippingInfo = shippingInfo;
        }

        /** 
         * Get the 'Comments' element value.
         * 
         * @return value
         */
        public Comments getComments() {
            return comments;
        }

        /** 
         * Set the 'Comments' element value.
         * 
         * @param comments
         */
        public void setComments(Comments comments) {
            this.comments = comments;
        }
        /** 
         * Informtion pertaining to the shipment of a product to the recipient.
         * 
         * Schema fragment(s) for this class:
         * <pre>
         * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ShippingInfo" minOccurs="0">
         *   &lt;xs:complexType>
         *     &lt;xs:attribute type="xs:string" use="optional" name="ShippingType"/>
         *     &lt;xs:attribute type="xs:string" use="optional" name="ShippingCarrier"/>
         *     &lt;xs:attributeGroup ref="ns:CurrencyAmountGroup"/>
         *   &lt;/xs:complexType>
         * &lt;/xs:element>
         * </pre>
         */
        public static class ShippingInfo
        {
            private String shippingType;
            private String shippingCarrier;
            private CurrencyAmountGroup currencyAmountGroup;

            /** 
             * Get the 'ShippingType' attribute value. The method of shipment (e.g., air, ground, pickup).
             * 
             * @return value
             */
            public String getShippingType() {
                return shippingType;
            }

            /** 
             * Set the 'ShippingType' attribute value. The method of shipment (e.g., air, ground, pickup).
             * 
             * @param shippingType
             */
            public void setShippingType(String shippingType) {
                this.shippingType = shippingType;
            }

            /** 
             * Get the 'ShippingCarrier' attribute value. The shipping carrier (e.g., USPS, UPS, FedEx).
             * 
             * @return value
             */
            public String getShippingCarrier() {
                return shippingCarrier;
            }

            /** 
             * Set the 'ShippingCarrier' attribute value. The shipping carrier (e.g., USPS, UPS, FedEx).
             * 
             * @param shippingCarrier
             */
            public void setShippingCarrier(String shippingCarrier) {
                this.shippingCarrier = shippingCarrier;
            }

            /** 
             * Get the 'CurrencyAmountGroup' attributeGroup value. The charges associated with shipment of the item.
             * 
             * @return value
             */
            public CurrencyAmountGroup getCurrencyAmountGroup() {
                return currencyAmountGroup;
            }

            /** 
             * Set the 'CurrencyAmountGroup' attributeGroup value. The charges associated with shipment of the item.
             * 
             * @param currencyAmountGroup
             */
            public void setCurrencyAmountGroup(
                    CurrencyAmountGroup currencyAmountGroup) {
                this.currencyAmountGroup = currencyAmountGroup;
            }
        }
        /** 
         * A collection of comments.
         * 
         * Schema fragment(s) for this class:
         * <pre>
         * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Comments" minOccurs="0">
         *   &lt;xs:complexType>
         *     &lt;xs:sequence>
         *       &lt;xs:element type="ns:ParagraphType" name="Comment" maxOccurs="99"/>
         *     &lt;/xs:sequence>
         *   &lt;/xs:complexType>
         * &lt;/xs:element>
         * </pre>
         */
        public static class Comments
        {
            private List<ParagraphType> commentList = new ArrayList<ParagraphType>();

            /** 
             * Get the list of 'Comment' element items. Comment information pertaining to the purchase.  This may be used to pass a message to be printed on a note card.
             * 
             * @return list
             */
            public List<ParagraphType> getCommentList() {
                return commentList;
            }

            /** 
             * Set the list of 'Comment' element items. Comment information pertaining to the purchase.  This may be used to pass a message to be printed on a note card.
             * 
             * @param list
             */
            public void setCommentList(List<ParagraphType> list) {
                commentList = list;
            }
        }
    }
}
