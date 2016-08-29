
package org.opentravel.ota;

/** 
 * Used to indicate if an amount is inclusive or exclusive of other charges, such as taxes, or is cumulative (amounts have been added to each other).

 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:simpleType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AmountDeterminationType">
 *   &lt;xs:restriction base="xs:string">
 *     &lt;xs:enumeration value="Inclusive"/>
 *     &lt;xs:enumeration value="Exclusive"/>
 *     &lt;xs:enumeration value="Cumulative"/>
 *   &lt;/xs:restriction>
 * &lt;/xs:simpleType>
 * </pre>
 */
public enum AmountDeterminationType {
    INCLUSIVE("Inclusive"), EXCLUSIVE("Exclusive"), CUMULATIVE("Cumulative");
    private final String value;

    private AmountDeterminationType(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static AmountDeterminationType convert(String value) {
        for (AmountDeterminationType inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}
