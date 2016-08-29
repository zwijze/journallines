
package org.opentravel.ota;

/** 
 * Used to specify a preference level for something that is or will be requested (e.g. a supplier of a service, a type of service, a form of payment, etc.).

 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:simpleType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PreferLevelType">
 *   &lt;xs:restriction base="xs:string">
 *     &lt;xs:enumeration value="Only"/>
 *     &lt;xs:enumeration value="Unacceptable"/>
 *     &lt;xs:enumeration value="Preferred"/>
 *     &lt;xs:enumeration value="Required"/>
 *     &lt;xs:enumeration value="NoPreference"/>
 *   &lt;/xs:restriction>
 * &lt;/xs:simpleType>
 * </pre>
 */
public enum PreferLevelType {
    /** 
     * Preference level that indicates request is only for a specific criterion.
     */
    ONLY("Only"), /** 
                   * Preference level that indicates request is unnacceptable for a specific criterion.

                   */
    UNACCEPTABLE("Unacceptable"), /** 
                                   * Preference level that indicates request is preferred for a specific criterion.

                                   */
    PREFERRED("Preferred"), /** 
                             * Preference level that indicates request is required for a specific criterion.

                             */
    REQUIRED("Required"), /** 
                           * Preference level that indicates there is no preference.

                           */
    NO_PREFERENCE("NoPreference");
    private final String value;

    private PreferLevelType(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static PreferLevelType convert(String value) {
        for (PreferLevelType inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}
