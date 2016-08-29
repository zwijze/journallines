
package org.opentravel.ota;

/** 
 * To specify the type of action requested when more than one function could be handled by the message.

 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:simpleType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TransactionActionType">
 *   &lt;xs:restriction base="xs:string">
 *     &lt;xs:enumeration value="Book"/>
 *     &lt;xs:enumeration value="Quote"/>
 *     &lt;xs:enumeration value="Hold"/>
 *     &lt;xs:enumeration value="Initiate"/>
 *     &lt;xs:enumeration value="Ignore"/>
 *     &lt;xs:enumeration value="Modify"/>
 *     &lt;xs:enumeration value="Commit"/>
 *     &lt;xs:enumeration value="Cancel"/>
 *     &lt;xs:enumeration value="CommitOverrideEdits"/>
 *   &lt;/xs:restriction>
 * &lt;/xs:simpleType>
 * </pre>
 */
public enum TransactionActionType {
    BOOK("Book"), QUOTE("Quote"), HOLD("Hold"), INITIATE("Initiate"), IGNORE(
            "Ignore"), MODIFY("Modify"), COMMIT("Commit"), CANCEL("Cancel"), /** 
                                                                              * 
                                                                             Commit the transaction and override the end transaction edits.

                                                                              */
    COMMIT_OVERRIDE_EDITS("CommitOverrideEdits");
    private final String value;

    private TransactionActionType(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static TransactionActionType convert(String value) {
        for (TransactionActionType inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}
