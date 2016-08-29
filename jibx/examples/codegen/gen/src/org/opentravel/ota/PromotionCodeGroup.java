
package org.opentravel.ota;

/** 
 * Used to provide a promotion code.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PromotionCodeGroup">
 *   &lt;xs:attribute type="xs:string" use="optional" name="PromotionCode"/>
 *   &lt;xs:attribute type="ns:ListOfStringLength1to8" use="optional" name="PromotionVendorCode"/>
 * &lt;/xs:attributeGroup>
 * 
 * &lt;xs:simpleType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ListOfStringLength1to8">
 *   &lt;xs:list itemType="xs:string"/>
 * &lt;/xs:simpleType>
 * </pre>
 */
public class PromotionCodeGroup
{
    private String promotionCode;
    private java.util.List<String> promotionVendorCodes = new java.util.ArrayList<String>();

    /** 
     * Get the 'PromotionCode' attribute value. Promotion code is the identifier used by the host to link directly with a specific named advertising campaign. By including the required code, the client is able to gain access to special offers which may have been created for a specifically targeted group via a CRM system or for a wider advertising campaign using Television or press adverts.
     * 
     * @return value
     */
    public String getPromotionCode() {
        return promotionCode;
    }

    /** 
     * Set the 'PromotionCode' attribute value. Promotion code is the identifier used by the host to link directly with a specific named advertising campaign. By including the required code, the client is able to gain access to special offers which may have been created for a specifically targeted group via a CRM system or for a wider advertising campaign using Television or press adverts.
     * 
     * @param promotionCode
     */
    public void setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
    }

    /** 
     * Get the list of 'PromotionVendorCode' attribute items. List of the vendor codes associated with a promotion.
     * 
     * @return list
     */
    public java.util.List<String> getPromotionVendorCodes() {
        return promotionVendorCodes;
    }

    /** 
     * Set the list of 'PromotionVendorCode' attribute items. List of the vendor codes associated with a promotion.
     * 
     * @param list
     */
    public void setPromotionVendorCodes(java.util.List<String> list) {
        promotionVendorCodes = list;
    }

    /** 
     * Serializer for 'PromotionVendorCode' attribute list.
     * 
     * @param values
     * @return text
     */
    public static String serializePromotionVendorCodes(
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
     * Deserializer for 'PromotionVendorCode' attribute list.
     * 
     * @param text
     * @return values
     * @throws org.jibx.runtime.JiBXException on conversion error
     */
    public static java.util.List<String> deserializePromotionVendorCodes(
            String text) throws org.jibx.runtime.JiBXException {
        org.jibx.runtime.IListItemDeserializer ldser = new org.jibx.runtime.IListItemDeserializer() {
            public java.lang.Object deserialize(String text) {
                return text;
            }
        };
        return (java.util.List<String>) org.jibx.runtime.Utility
                .deserializeList(text, ldser);
    }
}
