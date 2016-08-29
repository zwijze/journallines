
package org.opentravel.ota;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/** 
 * Describes a text item.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TextDescriptionType">
 *   &lt;xs:choice>
 *     &lt;xs:element type="xs:string" name="URL" minOccurs="0"/>
 *     &lt;xs:element name="Description" minOccurs="0" maxOccurs="unbounded">
 *       &lt;!-- Reference to inner class Description -->
 *     &lt;/xs:element>
 *   &lt;/xs:choice>
 *   &lt;xs:attribute type="xs:string" use="optional" name="Category"/>
 *   &lt;xs:attributeGroup ref="ns:MultimediaDescriptionGroup"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="Language"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TextDescriptionType
{
    private int choiceSelect = -1;
    private static final int URL_CHOICE = 0;
    private static final int DESCRIPTION_LIST_CHOICE = 1;
    private String URL;
    private List<Description> descriptionList = new ArrayList<Description>();
    private String category;
    private MultimediaDescriptionGroup multimediaDescriptionGroup;
    private String language;

    private void setChoiceSelect(int choice) {
        if (choiceSelect == -1) {
            choiceSelect = choice;
        } else if (choiceSelect != choice) {
            throw new IllegalStateException(
                    "Need to call clearChoiceSelect() before changing existing choice");
        }
    }

    /** 
     * Clear the choice selection.
     */
    public void clearChoiceSelect() {
        choiceSelect = -1;
    }

    /** 
     * Check if URL is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifURL() {
        return choiceSelect == URL_CHOICE;
    }

    /** 
     * Get the 'URL' element value. The URL for a specific text item.. 
     * 
     * @return value
     */
    public String getURL() {
        return URL;
    }

    /** 
     * Set the 'URL' element value. The URL for a specific text item.. 
     * 
     * @param URL
     */
    public void setURL(String URL) {
        setChoiceSelect(URL_CHOICE);
        this.URL = URL;
    }

    /** 
     * Check if DescriptionList is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifDescriptionList() {
        return choiceSelect == DESCRIPTION_LIST_CHOICE;
    }

    /** 
     * Get the list of 'Description' element items.
     * 
     * @return list
     */
    public List<Description> getDescriptionList() {
        return descriptionList;
    }

    /** 
     * Set the list of 'Description' element items.
     * 
     * @param list
     */
    public void setDescriptionList(List<Description> list) {
        setChoiceSelect(DESCRIPTION_LIST_CHOICE);
        descriptionList = list;
    }

    /** 
     * Get the 'Category' attribute value. Specifies the text category. Refer to OTA code list Picture Category Code (PIC). 
     * 
     * @return value
     */
    public String getCategory() {
        return category;
    }

    /** 
     * Set the 'Category' attribute value. Specifies the text category. Refer to OTA code list Picture Category Code (PIC). 
     * 
     * @param category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /** 
     * Get the 'MultimediaDescriptionGroup' attributeGroup value. Generic information about the text multimedia item.
     * 
     * @return value
     */
    public MultimediaDescriptionGroup getMultimediaDescriptionGroup() {
        return multimediaDescriptionGroup;
    }

    /** 
     * Set the 'MultimediaDescriptionGroup' attributeGroup value. Generic information about the text multimedia item.
     * 
     * @param multimediaDescriptionGroup
     */
    public void setMultimediaDescriptionGroup(
            MultimediaDescriptionGroup multimediaDescriptionGroup) {
        this.multimediaDescriptionGroup = multimediaDescriptionGroup;
    }

    /** 
     * Get the 'Language' attribute value. The language of the text item.
     * 
     * @return value
     */
    public String getLanguage() {
        return language;
    }

    /** 
     * Set the 'Language' attribute value. The language of the text item.
     * 
     * @param language
     */
    public void setLanguage(String language) {
        this.language = language;
    }
    /** 
     * The text in a specific language.  
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Description" minOccurs="0" maxOccurs="unbounded">
     *   &lt;xs:complexType>
     *     &lt;xs:simpleContent>
     *       &lt;xs:extension base="ns:FormattedTextTextType">
     *         &lt;xs:attribute type="xs:integer" use="optional" name="ListItem"/>
     *       &lt;/xs:extension>
     *     &lt;/xs:simpleContent>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class Description
    {
        private FormattedTextTextType formattedTextTextType;
        private BigInteger listItem;

        /** 
         * Get the extension value.
         * 
         * @return value
         */
        public FormattedTextTextType getFormattedTextTextType() {
            return formattedTextTextType;
        }

        /** 
         * Set the extension value.
         * 
         * @param formattedTextTextType
         */
        public void setFormattedTextTextType(
                FormattedTextTextType formattedTextTextType) {
            this.formattedTextTextType = formattedTextTextType;
        }

        /** 
         * Get the 'ListItem' attribute value.
         * 
         * @return value
         */
        public BigInteger getListItem() {
            return listItem;
        }

        /** 
         * Set the 'ListItem' attribute value.
         * 
         * @param listItem
         */
        public void setListItem(BigInteger listItem) {
            this.listItem = listItem;
        }
    }
}
