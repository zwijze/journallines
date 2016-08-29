
package org.opentravel.ota;

/** 
 * Booking class code and preference level for specifying booking classes preferred/not preferred in a request.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="BookingClassPrefGroup">
 *   &lt;xs:attribute type="xs:string" use="required" name="ResBookDesigCode"/>
 *   &lt;xs:attributeGroup ref="ns:PreferLevelGroup"/>
 *   &lt;xs:attribute use="optional" name="ResBookDesigCodeType">
 *     &lt;xs:simpleType>
 *       &lt;!-- Reference to inner class ResBookDesigCodeType -->
 *     &lt;/xs:simpleType>
 *   &lt;/xs:attribute>
 * &lt;/xs:attributeGroup>
 * 
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PreferLevelGroup">
 *   &lt;xs:attribute type="ns:PreferLevelType" use="optional" default="Preferred" name="PreferLevel"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class BookingClassPrefGroup
{
    private String resBookDesigCode;
    private PreferLevelType preferLevel;
    private ResBookDesigCodeType resBookDesigCodeType;

    /** 
     * Get the 'ResBookDesigCode' attribute value. Booking class code
     * 
     * @return value
     */
    public String getResBookDesigCode() {
        return resBookDesigCode;
    }

    /** 
     * Set the 'ResBookDesigCode' attribute value. Booking class code
     * 
     * @param resBookDesigCode
     */
    public void setResBookDesigCode(String resBookDesigCode) {
        this.resBookDesigCode = resBookDesigCode;
    }

    /** 
     * Get the 'PreferLevel' attribute value. Used to indicate a level of preference for an associated item.
     * 
     * @return value
     */
    public PreferLevelType getPreferLevel() {
        return preferLevel;
    }

    /** 
     * Set the 'PreferLevel' attribute value. Used to indicate a level of preference for an associated item.
     * 
     * @param preferLevel
     */
    public void setPreferLevel(PreferLevelType preferLevel) {
        this.preferLevel = preferLevel;
    }

    /** 
     * Get the 'ResBookDesigCodeType' attribute value. To specify the types of RBD's (Res Book Desig Codes) that should be returned as opposed to a specific RBD.
     * 
     * @return value
     */
    public ResBookDesigCodeType getResBookDesigCodeType() {
        return resBookDesigCodeType;
    }

    /** 
     * Set the 'ResBookDesigCodeType' attribute value. To specify the types of RBD's (Res Book Desig Codes) that should be returned as opposed to a specific RBD.
     * 
     * @param resBookDesigCodeType
     */
    public void setResBookDesigCodeType(
            ResBookDesigCodeType resBookDesigCodeType) {
        this.resBookDesigCodeType = resBookDesigCodeType;
    }
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:simpleType xmlns:xs="http://www.w3.org/2001/XMLSchema">
     *   &lt;xs:restriction base="xs:string">
     *     &lt;xs:enumeration value="Displayable"/>
     *     &lt;xs:enumeration value="NonDisplayable"/>
     *     &lt;xs:enumeration value="All"/>
     *   &lt;/xs:restriction>
     * &lt;/xs:simpleType>
     * </pre>
     */
    public static enum ResBookDesigCodeType {
        /** 
         * Only return displayable RBDs.
         */
        DISPLAYABLE("Displayable"), /** 
                                     * Only return non-displayable RBD's.
                                     */
        NON_DISPLAYABLE("NonDisplayable"), /** 
                                            * Return all RBD's, displayable and non-displayable.
                                            */
        ALL("All");
        private final String value;

        private ResBookDesigCodeType(String value) {
            this.value = value;
        }

        public String xmlValue() {
            return value;
        }

        public static ResBookDesigCodeType convert(String value) {
            for (ResBookDesigCodeType inst : values()) {
                if (inst.xmlValue().equals(value)) {
                    return inst;
                }
            }
            return null;
        }
    }
}
