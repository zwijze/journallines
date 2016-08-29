
package org.opentravel.ota;

/** 
 * Allows for control of the sharing of data between parties.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PrivacyGroup">
 *   &lt;xs:attribute use="optional" name="ShareSynchInd">
 *     &lt;xs:simpleType>
 *       &lt;!-- Reference to inner class ShareSynchInd -->
 *     &lt;/xs:simpleType>
 *   &lt;/xs:attribute>
 *   &lt;xs:attribute use="optional" name="ShareMarketInd">
 *     &lt;xs:simpleType>
 *       &lt;!-- Reference to inner class ShareMarketInd -->
 *     &lt;/xs:simpleType>
 *   &lt;/xs:attribute>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class PrivacyGroup
{
    private ShareSynchInd shareSynchInd;
    private ShareMarketInd shareMarketInd;

    /** 
     * Get the 'ShareSynchInd' attribute value.
     * 
     * @return value
     */
    public ShareSynchInd getShareSynchInd() {
        return shareSynchInd;
    }

    /** 
     * Set the 'ShareSynchInd' attribute value.
     * 
     * @param shareSynchInd
     */
    public void setShareSynchInd(ShareSynchInd shareSynchInd) {
        this.shareSynchInd = shareSynchInd;
    }

    /** 
     * Get the 'ShareMarketInd' attribute value.
     * 
     * @return value
     */
    public ShareMarketInd getShareMarketInd() {
        return shareMarketInd;
    }

    /** 
     * Set the 'ShareMarketInd' attribute value.
     * 
     * @param shareMarketInd
     */
    public void setShareMarketInd(ShareMarketInd shareMarketInd) {
        this.shareMarketInd = shareMarketInd;
    }
    /** 
     *  value="Inherit" Permission for sharing data for synchronization of information held by other travel service providers.							
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:simpleType xmlns:xs="http://www.w3.org/2001/XMLSchema">
     *   &lt;xs:restriction base="xs:string">
     *     &lt;xs:enumeration value="Yes"/>
     *     &lt;xs:enumeration value="No"/>
     *     &lt;xs:enumeration value="Inherit"/>
     *   &lt;/xs:restriction>
     * &lt;/xs:simpleType>
     * </pre>
     */
    public static enum ShareSynchInd {
        YES("Yes"), NO("No"), INHERIT("Inherit");
        private final String value;

        private ShareSynchInd(String value) {
            this.value = value;
        }

        public String xmlValue() {
            return value;
        }

        public static ShareSynchInd convert(String value) {
            for (ShareSynchInd inst : values()) {
                if (inst.xmlValue().equals(value)) {
                    return inst;
                }
            }
            return null;
        }
    }
    /** 
     *  value="Inherit" Permission for sharing data for marketing purposes.
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:simpleType xmlns:xs="http://www.w3.org/2001/XMLSchema">
     *   &lt;xs:restriction base="xs:string">
     *     &lt;xs:enumeration value="Yes"/>
     *     &lt;xs:enumeration value="No"/>
     *     &lt;xs:enumeration value="Inherit"/>
     *   &lt;/xs:restriction>
     * &lt;/xs:simpleType>
     * </pre>
     */
    public static enum ShareMarketInd {
        YES("Yes"), NO("No"), INHERIT("Inherit");
        private final String value;

        private ShareMarketInd(String value) {
            this.value = value;
        }

        public String xmlValue() {
            return value;
        }

        public static ShareMarketInd convert(String value) {
            for (ShareMarketInd inst : values()) {
                if (inst.xmlValue().equals(value)) {
                    return inst;
                }
            }
            return null;
        }
    }
}
