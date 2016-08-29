
package org.opentravel.ota;

/** 
 * Used to indicate the gender of a person, if known.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GenderGroup">
 *   &lt;xs:attribute use="optional" name="Gender">
 *     &lt;xs:simpleType>
 *       &lt;!-- Reference to inner class Gender -->
 *     &lt;/xs:simpleType>
 *   &lt;/xs:attribute>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class GenderGroup
{
    private Gender gender;

    /** 
     * Get the 'Gender' attribute value.
     * 
     * @return value
     */
    public Gender getGender() {
        return gender;
    }

    /** 
     * Set the 'Gender' attribute value.
     * 
     * @param gender
     */
    public void setGender(Gender gender) {
        this.gender = gender;
    }
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:simpleType xmlns:xs="http://www.w3.org/2001/XMLSchema">
     *   &lt;xs:restriction base="xs:string">
     *     &lt;xs:enumeration value="Male"/>
     *     &lt;xs:enumeration value="Female"/>
     *     &lt;xs:enumeration value="Unknown"/>
     *   &lt;/xs:restriction>
     * &lt;/xs:simpleType>
     * </pre>
     */
    public static enum Gender {
        MALE("Male"), FEMALE("Female"), UNKNOWN("Unknown");
        private final String value;

        private Gender(String value) {
            this.value = value;
        }

        public String xmlValue() {
            return value;
        }

        public static Gender convert(String value) {
            for (Gender inst : values()) {
                if (inst.xmlValue().equals(value)) {
                    return inst;
                }
            }
            return null;
        }
    }
}
