
package org.opentravel.ota;

/** 
 * Identifes an action to take place.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:simpleType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ActionType">
 *   &lt;xs:restriction base="xs:string">
 *     &lt;xs:enumeration value="Add-Update"/>
 *     &lt;xs:enumeration value="Cancel"/>
 *     &lt;xs:enumeration value="Delete"/>
 *     &lt;xs:enumeration value="Add"/>
 *     &lt;xs:enumeration value="Replace"/>
 *   &lt;/xs:restriction>
 * &lt;/xs:simpleType>
 * </pre>
 */
public enum ActionType {
    /** 
     * 
    Typically used to add an item where it does not exist or to update an item where it does exist.
    
     */
    ADD_UPDATE("Add-Update"), /** 
                               * 
                              Typically used to cancel an existing item.
                              
                               */
    CANCEL("Cancel"), /** 
                       * 
                      Typically used to remove specified data.
                      
                       */
    DELETE("Delete"), /** 
                       * 
                      Typically used to add data whether data already exists or not.
                      
                       */
    ADD("Add"), /** 
                 * 
                Typically used to overlay existing data.
                
                 */
    REPLACE("Replace");
    private final String value;

    private ActionType(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static ActionType convert(String value) {
        for (ActionType inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}
