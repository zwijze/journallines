
package org.opentravel.ota;

/** 
 * To specify a status to the transaction, usually in the response message, of the action specifed in the request message.

 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:simpleType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TransactionStatusType">
 *   &lt;xs:restriction base="xs:string">
 *     &lt;xs:enumeration value="Pending"/>
 *     &lt;xs:enumeration value="Cancelled"/>
 *     &lt;xs:enumeration value="Modified"/>
 *     &lt;xs:enumeration value="Committed"/>
 *     &lt;xs:enumeration value="Ignored"/>
 *     &lt;xs:enumeration value="On Hold"/>
 *     &lt;xs:enumeration value="Unsuccessful"/>
 *   &lt;/xs:restriction>
 * &lt;/xs:simpleType>
 * </pre>
 */
public enum TransactionStatusType {
    PENDING("Pending"), CANCELLED("Cancelled"), MODIFIED("Modified"), COMMITTED(
            "Committed"), IGNORED("Ignored"), ON_HOLD("On Hold"), UNSUCCESSFUL(
            "Unsuccessful");
    private final String value;

    private TransactionStatusType(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static TransactionStatusType convert(String value) {
        for (TransactionStatusType inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}
