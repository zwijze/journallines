
package org.opentravel.ota;

/** 
 * Textual information to provide descriptions and/or additional information.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FreeTextType">
 *   &lt;xs:simpleContent>
 *     &lt;xs:extension base="xs:string">
 *       &lt;xs:attributeGroup ref="ns:LanguageGroup"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:simpleContent>
 * &lt;/xs:complexType>
 * 
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="LanguageGroup">
 *   &lt;xs:attribute type="xs:string" use="optional" name="Language"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class FreeTextType
{
    private String string;
    private String language;

    /** 
     * Get the extension value.
     * 
     * @return value
     */
    public String getString() {
        return string;
    }

    /** 
     * Set the extension value.
     * 
     * @param string
     */
    public void setString(String string) {
        this.string = string;
    }

    /** 
     * Get the 'Language' attribute value. Language identification.
     * 
     * @return value
     */
    public String getLanguage() {
        return language;
    }

    /** 
     * Set the 'Language' attribute value. Language identification.
     * 
     * @param language
     */
    public void setLanguage(String language) {
        this.language = language;
    }
}
