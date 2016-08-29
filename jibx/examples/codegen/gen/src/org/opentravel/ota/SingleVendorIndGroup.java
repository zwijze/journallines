
package org.opentravel.ota;

/** 
 * Indicates the alliance status of a program.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SingleVendorIndGroup">
 *   &lt;xs:attribute name="SingleVendorInd">
 *     &lt;xs:simpleType>
 *       &lt;!-- Reference to inner class SingleVendorInd -->
 *     &lt;/xs:simpleType>
 *   &lt;/xs:attribute>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class SingleVendorIndGroup
{
    private SingleVendorInd singleVendorInd;

    /** 
     * Get the 'SingleVendorInd' attribute value. Indicates if program is affiliated with a group of related offers accumulating credits.
     * 
     * @return value
     */
    public SingleVendorInd getSingleVendorInd() {
        return singleVendorInd;
    }

    /** 
     * Set the 'SingleVendorInd' attribute value. Indicates if program is affiliated with a group of related offers accumulating credits.
     * 
     * @param singleVendorInd
     */
    public void setSingleVendorInd(SingleVendorInd singleVendorInd) {
        this.singleVendorInd = singleVendorInd;
    }
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:simpleType xmlns:xs="http://www.w3.org/2001/XMLSchema">
     *   &lt;xs:restriction base="xs:string">
     *     &lt;xs:enumeration value="SingleVndr"/>
     *     &lt;xs:enumeration value="Alliance"/>
     *   &lt;/xs:restriction>
     * &lt;/xs:simpleType>
     * </pre>
     */
    public static enum SingleVendorInd {
        /** 
         * Indicates the program is not part of an alliance.
         */
        SINGLE_VNDR("SingleVndr"), /** 
                                    * Indicates the program is part of an alliance.
                                    */
        ALLIANCE("Alliance");
        private final String value;

        private SingleVendorInd(String value) {
            this.value = value;
        }

        public String xmlValue() {
            return value;
        }

        public static SingleVendorInd convert(String value) {
            for (SingleVendorInd inst : values()) {
                if (inst.xmlValue().equals(value)) {
                    return inst;
                }
            }
            return null;
        }
    }
}
