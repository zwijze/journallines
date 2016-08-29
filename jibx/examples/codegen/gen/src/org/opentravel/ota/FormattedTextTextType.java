
package org.opentravel.ota;

/** 
 * Provides text and indicates whether it is formatted or not.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FormattedTextTextType">
 *   &lt;xs:simpleContent>
 *     &lt;xs:extension base="xs:string">
 *       &lt;xs:attribute type="xs:boolean" use="optional" name="Formatted"/>
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
public class FormattedTextTextType
{
    private String string;
    private Boolean formatted;
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
     * Get the 'Formatted' attribute value. Textual information, which may be formatted as a line of information, or unformatted, as a paragraph of text.
     * 
     * @return value
     */
    public Boolean getFormatted() {
        return formatted;
    }

    /** 
     * Set the 'Formatted' attribute value. Textual information, which may be formatted as a line of information, or unformatted, as a paragraph of text.
     * 
     * @param formatted
     */
    public void setFormatted(Boolean formatted) {
        this.formatted = formatted;
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
