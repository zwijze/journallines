
package org.opentravel.ota;

import java.math.BigInteger;

/** 
 * Identifies the Loyalty Program, membership, form factor used by the certificate and its current status
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="LoyaltyCertificateGroup">
 *   &lt;xs:attributeGroup ref="ns:ID_OptionalGroup"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="ID_Context"/>
 *   &lt;xs:attributeGroup ref="ns:LoyaltyCertificateNumberGroup"/>
 *   &lt;xs:attributeGroup ref="ns:EffectiveExpireOptionalDateGroup"/>
 *   &lt;xs:attribute type="xs:integer" use="optional" name="NmbrOfNights"/>
 *   &lt;xs:attribute use="optional" name="Format">
 *     &lt;xs:simpleType>
 *       &lt;!-- Reference to inner class Format -->
 *     &lt;/xs:simpleType>
 *   &lt;/xs:attribute>
 *   &lt;xs:attribute type="xs:string" use="optional" name="Status"/>
 * &lt;/xs:attributeGroup>
 * 
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ID_OptionalGroup">
 *   &lt;xs:attribute type="xs:string" use="optional" name="ID"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class LoyaltyCertificateGroup
{
    private String ID;
    private String IDContext;
    private LoyaltyCertificateNumberGroup loyaltyCertificateNumberGroup;
    private EffectiveExpireOptionalDateGroup effectiveExpireOptionalDateGroup;
    private BigInteger nmbrOfNights;
    private Format format;
    private String status;

    /** 
     * Get the 'ID' attribute value. A unique identifying value assigned by the creating system.  The ID attribute may be used to reference a primary-key value within a database or in a particular implementation.
     * 
     * @return value
     */
    public String getID() {
        return ID;
    }

    /** 
     * Set the 'ID' attribute value. A unique identifying value assigned by the creating system.  The ID attribute may be used to reference a primary-key value within a database or in a particular implementation.
     * 
     * @param ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /** 
     * Get the 'ID_Context' attribute value. Identifies the source of the code that identifies program or promotion within a loyalty scheme
     * 
     * @return value
     */
    public String getIDContext() {
        return IDContext;
    }

    /** 
     * Set the 'ID_Context' attribute value. Identifies the source of the code that identifies program or promotion within a loyalty scheme
     * 
     * @param IDContext
     */
    public void setIDContext(String IDContext) {
        this.IDContext = IDContext;
    }

    /** 
     * Get the 'LoyaltyCertificateNumberGroup' attributeGroup value. Identifies the unique certificate number and the loyalty program and the membership ID associated with this certificate
     * 
     * @return value
     */
    public LoyaltyCertificateNumberGroup getLoyaltyCertificateNumberGroup() {
        return loyaltyCertificateNumberGroup;
    }

    /** 
     * Set the 'LoyaltyCertificateNumberGroup' attributeGroup value. Identifies the unique certificate number and the loyalty program and the membership ID associated with this certificate
     * 
     * @param loyaltyCertificateNumberGroup
     */
    public void setLoyaltyCertificateNumberGroup(
            LoyaltyCertificateNumberGroup loyaltyCertificateNumberGroup) {
        this.loyaltyCertificateNumberGroup = loyaltyCertificateNumberGroup;
    }

    /** 
     * Get the 'EffectiveExpireOptionalDateGroup' attributeGroup value. Identifies either the date range when the Certificate is valid or the dates against which the certificate is being applied
     * 
     * @return value
     */
    public EffectiveExpireOptionalDateGroup getEffectiveExpireOptionalDateGroup() {
        return effectiveExpireOptionalDateGroup;
    }

    /** 
     * Set the 'EffectiveExpireOptionalDateGroup' attributeGroup value. Identifies either the date range when the Certificate is valid or the dates against which the certificate is being applied
     * 
     * @param effectiveExpireOptionalDateGroup
     */
    public void setEffectiveExpireOptionalDateGroup(
            EffectiveExpireOptionalDateGroup effectiveExpireOptionalDateGroup) {
        this.effectiveExpireOptionalDateGroup = effectiveExpireOptionalDateGroup;
    }

    /** 
     * Get the 'NmbrOfNights' attribute value. The number of nights of the hotel stay that are used to calculate the redemption amount.
     * 
     * @return value
     */
    public BigInteger getNmbrOfNights() {
        return nmbrOfNights;
    }

    /** 
     * Set the 'NmbrOfNights' attribute value. The number of nights of the hotel stay that are used to calculate the redemption amount.
     * 
     * @param nmbrOfNights
     */
    public void setNmbrOfNights(BigInteger nmbrOfNights) {
        this.nmbrOfNights = nmbrOfNights;
    }

    /** 
     * Get the 'Format' attribute value. Indicates what form the certificate is in e.g. Paper or Electronic
     * 
     * @return value
     */
    public Format getFormat() {
        return format;
    }

    /** 
     * Set the 'Format' attribute value. Indicates what form the certificate is in e.g. Paper or Electronic
     * 
     * @param format
     */
    public void setFormat(Format format) {
        this.format = format;
    }

    /** 
     * Get the 'Status' attribute value. Used to define the status of the certificate e.g. Available, Voided, Cancelled, Reserved, Used.
     * 
     * @return value
     */
    public String getStatus() {
        return status;
    }

    /** 
     * Set the 'Status' attribute value. Used to define the status of the certificate e.g. Available, Voided, Cancelled, Reserved, Used.
     * 
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:simpleType xmlns:xs="http://www.w3.org/2001/XMLSchema">
     *   &lt;xs:restriction base="xs:string">
     *     &lt;xs:enumeration value="Paper"/>
     *     &lt;xs:enumeration value="Electronic"/>
     *   &lt;/xs:restriction>
     * &lt;/xs:simpleType>
     * </pre>
     */
    public static enum Format {
        PAPER("Paper"), ELECTRONIC("Electronic");
        private final String value;

        private Format(String value) {
            this.value = value;
        }

        public String xmlValue() {
            return value;
        }

        public static Format convert(String value) {
            for (Format inst : values()) {
                if (inst.xmlValue().equals(value)) {
                    return inst;
                }
            }
            return null;
        }
    }
}
