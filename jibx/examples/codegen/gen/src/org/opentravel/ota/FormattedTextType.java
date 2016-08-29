
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.List;

/** 
 * Collection of formatted text sub sections.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FormattedTextType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:FormattedTextSubSectionType" name="SubSection" maxOccurs="99"/>
 *   &lt;/xs:sequence>
 *   &lt;xs:attribute type="xs:string" use="optional" name="Title"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="Language"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FormattedTextType
{
    private List<FormattedTextSubSectionType> subSectionList = new ArrayList<FormattedTextSubSectionType>();
    private String title;
    private String language;

    /** 
     * Get the list of 'SubSection' element items.
     * 
     * @return list
     */
    public List<FormattedTextSubSectionType> getSubSectionList() {
        return subSectionList;
    }

    /** 
     * Set the list of 'SubSection' element items.
     * 
     * @param list
     */
    public void setSubSectionList(List<FormattedTextSubSectionType> list) {
        subSectionList = list;
    }

    /** 
     * Get the 'Title' attribute value. This attribute may be used to provide a title for the formatted free text,
    for example, Driving Directions.  Each of the sub sections that are defined
    to be a part of the formatted text would provide detailed information about
    the subject identified by the title.
     * 
     * @return value
     */
    public String getTitle() {
        return title;
    }

    /** 
     * Set the 'Title' attribute value. This attribute may be used to provide a title for the formatted free text,
    for example, Driving Directions.  Each of the sub sections that are defined
    to be a part of the formatted text would provide detailed information about
    the subject identified by the title.
     * 
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /** 
     * Get the 'Language' attribute value.
     * 
     * @return value
     */
    public String getLanguage() {
        return language;
    }

    /** 
     * Set the 'Language' attribute value.
     * 
     * @param language
     */
    public void setLanguage(String language) {
        this.language = language;
    }
}
