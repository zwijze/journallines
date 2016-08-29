
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.List;

/** 
 * The RateQualifierType complex type describes fully rate information associated with a specific rate quotation, including the description of any promotions that may apply.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RateQualifierType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="PromoDesc" minOccurs="0"/>
 *     &lt;xs:element name="RateComments" minOccurs="0">
 *       &lt;!-- Reference to inner class RateComments -->
 *     &lt;/xs:element>
 *   &lt;/xs:sequence>
 *   &lt;xs:attributeGroup ref="ns:RateQualifierCoreGroup"/>
 *   &lt;xs:attribute type="xs:boolean" use="optional" default="false" name="ArriveByFlight"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="RateAuthorizationCode"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="VendorRateID"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class RateQualifierType
{
    private String promoDesc;
    private RateComments rateComments;
    private RateQualifierCoreGroup rateQualifierCoreGroup;
    private Boolean arriveByFlight;
    private String rateAuthorizationCode;
    private String vendorRateID;

    /** 
     * Get the 'PromoDesc' element value. This may be used to provide additional information about the promotion code.
     * 
     * @return value
     */
    public String getPromoDesc() {
        return promoDesc;
    }

    /** 
     * Set the 'PromoDesc' element value. This may be used to provide additional information about the promotion code.
     * 
     * @param promoDesc
     */
    public void setPromoDesc(String promoDesc) {
        this.promoDesc = promoDesc;
    }

    /** 
     * Get the 'RateComments' element value.
     * 
     * @return value
     */
    public RateComments getRateComments() {
        return rateComments;
    }

    /** 
     * Set the 'RateComments' element value.
     * 
     * @param rateComments
     */
    public void setRateComments(RateComments rateComments) {
        this.rateComments = rateComments;
    }

    /** 
     * Get the 'RateQualifierCoreGroup' attributeGroup value.
     * 
     * @return value
     */
    public RateQualifierCoreGroup getRateQualifierCoreGroup() {
        return rateQualifierCoreGroup;
    }

    /** 
     * Set the 'RateQualifierCoreGroup' attributeGroup value.
     * 
     * @param rateQualifierCoreGroup
     */
    public void setRateQualifierCoreGroup(
            RateQualifierCoreGroup rateQualifierCoreGroup) {
        this.rateQualifierCoreGroup = rateQualifierCoreGroup;
    }

    /** 
     * Get the 'ArriveByFlight' attribute value. Indicates if this rate is only available to those customers who are flying to the vehicle rental location.
     * 
     * @return value
     */
    public Boolean getArriveByFlight() {
        return arriveByFlight;
    }

    /** 
     * Set the 'ArriveByFlight' attribute value. Indicates if this rate is only available to those customers who are flying to the vehicle rental location.
     * 
     * @param arriveByFlight
     */
    public void setArriveByFlight(Boolean arriveByFlight) {
        this.arriveByFlight = arriveByFlight;
    }

    /** 
     * Get the 'RateAuthorizationCode' attribute value. The rate authorization code for this rate.
     * 
     * @return value
     */
    public String getRateAuthorizationCode() {
        return rateAuthorizationCode;
    }

    /** 
     * Set the 'RateAuthorizationCode' attribute value. The rate authorization code for this rate.
     * 
     * @param rateAuthorizationCode
     */
    public void setRateAuthorizationCode(String rateAuthorizationCode) {
        this.rateAuthorizationCode = rateAuthorizationCode;
    }

    /** 
     * Get the 'VendorRateID' attribute value.  The identifier assigned to this rate by the vendor.
     * 
     * @return value
     */
    public String getVendorRateID() {
        return vendorRateID;
    }

    /** 
     * Set the 'VendorRateID' attribute value.  The identifier assigned to this rate by the vendor.
     * 
     * @param vendorRateID
     */
    public void setVendorRateID(String vendorRateID) {
        this.vendorRateID = vendorRateID;
    }
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RateComments" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:sequence>
     *       &lt;xs:element name="RateComment" maxOccurs="15">
     *         &lt;!-- Reference to inner class RateComment -->
     *       &lt;/xs:element>
     *     &lt;/xs:sequence>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class RateComments
    {
        private List<RateComment> rateCommentList = new ArrayList<RateComment>();

        /** 
         * Get the list of 'RateComment' element items.
         * 
         * @return list
         */
        public List<RateComment> getRateCommentList() {
            return rateCommentList;
        }

        /** 
         * Set the list of 'RateComment' element items.
         * 
         * @param list
         */
        public void setRateCommentList(List<RateComment> list) {
            rateCommentList = list;
        }
        /** 
         * This may be used to provide any additional information about rates (e.g., must return by Monday at 8 AM). 
         * 
         * Schema fragment(s) for this class:
         * <pre>
         * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RateComment" maxOccurs="15">
         *   &lt;xs:complexType>
         *     &lt;xs:simpleContent>
         *       &lt;xs:extension base="ns:FormattedTextTextType">
         *         &lt;xs:attribute type="xs:string" use="optional" name="Name"/>
         *       &lt;/xs:extension>
         *     &lt;/xs:simpleContent>
         *   &lt;/xs:complexType>
         * &lt;/xs:element>
         * </pre>
         */
        public static class RateComment
        {
            private FormattedTextTextType formattedTextTextType;
            private String name;

            /** 
             * Get the extension value.
             * 
             * @return value
             */
            public FormattedTextTextType getFormattedTextTextType() {
                return formattedTextTextType;
            }

            /** 
             * Set the extension value.
             * 
             * @param formattedTextTextType
             */
            public void setFormattedTextTextType(
                    FormattedTextTextType formattedTextTextType) {
                this.formattedTextTextType = formattedTextTextType;
            }

            /** 
             * Get the 'Name' attribute value. Defines the type of rate comments (e.g., textual rule, marketing information).
             * 
             * @return value
             */
            public String getName() {
                return name;
            }

            /** 
             * Set the 'Name' attribute value. Defines the type of rate comments (e.g., textual rule, marketing information).
             * 
             * @param name
             */
            public void setName(String name) {
                this.name = name;
            }
        }
    }
}
