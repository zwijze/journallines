
package org.opentravel.ota;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/** 
 * An indication of a new paragraph for a sub-section of a formatted text message.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ParagraphType">
 *   &lt;xs:choice minOccurs="0" maxOccurs="unbounded">
 *     &lt;!-- Reference to inner class Choice -->
 *   &lt;/xs:choice>
 *   &lt;xs:attribute type="xs:string" use="optional" name="Name"/>
 *   &lt;xs:attribute type="xs:integer" use="optional" name="ParagraphNumber"/>
 *   &lt;xs:attributeGroup ref="ns:DateTimeStampGroup"/>
 *   &lt;xs:attributeGroup ref="ns:LanguageGroup"/>
 * &lt;/xs:complexType>
 * 
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="LanguageGroup">
 *   &lt;xs:attribute type="xs:string" use="optional" name="Language"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class ParagraphType
{
    private List<Choice> choiceList = new ArrayList<Choice>();
    private String name;
    private BigInteger paragraphNumber;
    private DateTimeStampGroup dateTimeStampGroup;
    private String language;

    /** 
     * Get the list of choice items.
     * 
     * @return list
     */
    public List<Choice> getChoiceList() {
        return choiceList;
    }

    /** 
     * Set the list of choice items.
     * 
     * @param list
     */
    public void setChoiceList(List<Choice> list) {
        choiceList = list;
    }

    /** 
     * Get the 'Name' attribute value. In many cases the description repeats, this will allow you to define the information that is being sent, typically used when multiple occurrences of ParagraphType are being sent.
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' attribute value. In many cases the description repeats, this will allow you to define the information that is being sent, typically used when multiple occurrences of ParagraphType are being sent.
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'ParagraphNumber' attribute value.
     * 
     * @return value
     */
    public BigInteger getParagraphNumber() {
        return paragraphNumber;
    }

    /** 
     * Set the 'ParagraphNumber' attribute value.
     * 
     * @param paragraphNumber
     */
    public void setParagraphNumber(BigInteger paragraphNumber) {
        this.paragraphNumber = paragraphNumber;
    }

    /** 
     * Get the 'DateTimeStampGroup' attributeGroup value.
     * 
     * @return value
     */
    public DateTimeStampGroup getDateTimeStampGroup() {
        return dateTimeStampGroup;
    }

    /** 
     * Set the 'DateTimeStampGroup' attributeGroup value.
     * 
     * @param dateTimeStampGroup
     */
    public void setDateTimeStampGroup(DateTimeStampGroup dateTimeStampGroup) {
        this.dateTimeStampGroup = dateTimeStampGroup;
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
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:choice xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" minOccurs="0" maxOccurs="unbounded">
     *   &lt;xs:element type="ns:FormattedTextTextType" name="Text"/>
     *   &lt;xs:element type="xs:string" name="Image"/>
     *   &lt;xs:element type="xs:string" name="URL"/>
     *   &lt;xs:element name="ListItem">
     *     &lt;xs:complexType>
     *       &lt;xs:simpleContent>
     *         &lt;xs:extension base="ns:FormattedTextTextType">
     *           &lt;xs:attribute type="xs:integer" use="optional" name="ListItem"/>
     *         &lt;/xs:extension>
     *       &lt;/xs:simpleContent>
     *     &lt;/xs:complexType>
     *   &lt;/xs:element>
     * &lt;/xs:choice>
     * </pre>
     */
    public static class Choice
    {
        private int choiceListSelect = -1;
        private static final int TEXT_CHOICE = 0;
        private static final int IMAGE_CHOICE = 1;
        private static final int URL_CHOICE = 2;
        private static final int LIST_ITEM_CHOICE = 3;
        private FormattedTextTextType text;
        private String image;
        private String URL;
        private FormattedTextTextType listItemFormattedTextTextType;
        private BigInteger listItemListItem;

        private void setChoiceListSelect(int choice) {
            if (choiceListSelect == -1) {
                choiceListSelect = choice;
            } else if (choiceListSelect != choice) {
                throw new IllegalStateException(
                        "Need to call clearChoiceListSelect() before changing existing choice");
            }
        }

        /** 
         * Clear the choice selection.
         */
        public void clearChoiceListSelect() {
            choiceListSelect = -1;
        }

        /** 
         * Check if Text is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifText() {
            return choiceListSelect == TEXT_CHOICE;
        }

        /** 
         * Get the 'Text' element value.
         * 
         * @return value
         */
        public FormattedTextTextType getText() {
            return text;
        }

        /** 
         * Set the 'Text' element value.
         * 
         * @param text
         */
        public void setText(FormattedTextTextType text) {
            setChoiceListSelect(TEXT_CHOICE);
            this.text = text;
        }

        /** 
         * Check if Image is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifImage() {
            return choiceListSelect == IMAGE_CHOICE;
        }

        /** 
         * Get the 'Image' element value.
         * 
         * @return value
         */
        public String getImage() {
            return image;
        }

        /** 
         * Set the 'Image' element value.
         * 
         * @param image
         */
        public void setImage(String image) {
            setChoiceListSelect(IMAGE_CHOICE);
            this.image = image;
        }

        /** 
         * Check if URL is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifURL() {
            return choiceListSelect == URL_CHOICE;
        }

        /** 
         * Get the 'URL' element value.
         * 
         * @return value
         */
        public String getURL() {
            return URL;
        }

        /** 
         * Set the 'URL' element value.
         * 
         * @param URL
         */
        public void setURL(String URL) {
            setChoiceListSelect(URL_CHOICE);
            this.URL = URL;
        }

        /** 
         * Check if ListItem is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifListItem() {
            return choiceListSelect == LIST_ITEM_CHOICE;
        }

        /** 
         * Get the extension value.
         * 
         * @return value
         */
        public FormattedTextTextType getListItemFormattedTextTextType() {
            return listItemFormattedTextTextType;
        }

        /** 
         * Set the extension value.
         * 
         * @param listItemFormattedTextTextType
         */
        public void setListItemFormattedTextTextType(
                FormattedTextTextType listItemFormattedTextTextType) {
            setChoiceListSelect(LIST_ITEM_CHOICE);
            this.listItemFormattedTextTextType = listItemFormattedTextTextType;
        }

        /** 
         * Get the 'ListItem' attribute value.
         * 
         * @return value
         */
        public BigInteger getListItemListItem() {
            return listItemListItem;
        }

        /** 
         * Set the 'ListItem' attribute value.
         * 
         * @param listItemListItem
         */
        public void setListItemListItem(BigInteger listItemListItem) {
            setChoiceListSelect(LIST_ITEM_CHOICE);
            this.listItemListItem = listItemListItem;
        }
    }
}
