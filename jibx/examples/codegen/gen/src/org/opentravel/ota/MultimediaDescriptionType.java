
package org.opentravel.ota;

/** 
 * Describes multimedia item(s).
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MultimediaDescriptionType">
 *   &lt;xs:choice minOccurs="0">
 *     &lt;!-- Reference to inner class Choice -->
 *   &lt;/xs:choice>
 *   &lt;xs:attribute type="xs:string" use="optional" name="InfoCode"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="AdditionalDetailCode"/>
 *   &lt;xs:attributeGroup ref="ns:ID_OptionalGroup"/>
 * &lt;/xs:complexType>
 * 
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ID_OptionalGroup">
 *   &lt;xs:attribute type="xs:string" use="optional" name="ID"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class MultimediaDescriptionType
{
    private Choice choice;
    private String infoCode;
    private String additionalDetailCode;
    private String ID;

    /** 
     * Get the choice value.
     * 
     * @return value
     */
    public Choice getChoice() {
        return choice;
    }

    /** 
     * Set the choice value.
     * 
     * @param choice
     */
    public void setChoice(Choice choice) {
        this.choice = choice;
    }

    /** 
     * Get the 'InfoCode' attribute value. Used to designate a particular type of description such as marketing. Refer to OTA Code List Information Type (INF).
     * 
     * @return value
     */
    public String getInfoCode() {
        return infoCode;
    }

    /** 
     * Set the 'InfoCode' attribute value. Used to designate a particular type of description such as marketing. Refer to OTA Code List Information Type (INF).
     * 
     * @param infoCode
     */
    public void setInfoCode(String infoCode) {
        this.infoCode = infoCode;
    }

    /** 
     * Get the 'AdditionalDetailCode' attribute value. Used to designate a particular type of additional information. Refer to OTA Code List Additional Detail Type (ADT).
     * 
     * @return value
     */
    public String getAdditionalDetailCode() {
        return additionalDetailCode;
    }

    /** 
     * Set the 'AdditionalDetailCode' attribute value. Used to designate a particular type of additional information. Refer to OTA Code List Additional Detail Type (ADT).
     * 
     * @param additionalDetailCode
     */
    public void setAdditionalDetailCode(String additionalDetailCode) {
        this.additionalDetailCode = additionalDetailCode;
    }

    /** 
     * Get the 'ID' attribute value. A unique identifying value assigned by the creating system.  The ID attribute may be used to reference a primary-key value within a database or in a particular implementation.
     * 
     * @return value
     */
    public String getID() {
        return ID;
    }

    /** 
     * Set the 'ID' attribute value. A unique identifying value assigned by the creating system.  The ID attribute may be used to reference a primary-key value within a database or in a particular implementation.
     * 
     * @param ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:choice xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" minOccurs="0">
     *   &lt;xs:element type="ns:VideoItemsType" name="VideoItems" minOccurs="0"/>
     *   &lt;xs:element type="ns:ImageItemsType" name="ImageItems" minOccurs="0"/>
     *   &lt;xs:element type="ns:TextItemsType" name="TextItems" minOccurs="0"/>
     * &lt;/xs:choice>
     * </pre>
     */
    public static class Choice
    {
        private int choiceSelect = -1;
        private static final int VIDEO_ITEMS_CHOICE = 0;
        private static final int IMAGE_ITEMS_CHOICE = 1;
        private static final int TEXT_ITEMS_CHOICE = 2;
        private VideoItemsType videoItems;
        private ImageItemsType imageItems;
        private TextItemsType textItems;

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
         * Check if VideoItems is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifVideoItems() {
            return choiceSelect == VIDEO_ITEMS_CHOICE;
        }

        /** 
         * Get the 'VideoItems' element value. A collection of video items. 
         * 
         * @return value
         */
        public VideoItemsType getVideoItems() {
            return videoItems;
        }

        /** 
         * Set the 'VideoItems' element value. A collection of video items. 
         * 
         * @param videoItems
         */
        public void setVideoItems(VideoItemsType videoItems) {
            setChoiceSelect(VIDEO_ITEMS_CHOICE);
            this.videoItems = videoItems;
        }

        /** 
         * Check if ImageItems is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifImageItems() {
            return choiceSelect == IMAGE_ITEMS_CHOICE;
        }

        /** 
         * Get the 'ImageItems' element value. A collection of image items.
         * 
         * @return value
         */
        public ImageItemsType getImageItems() {
            return imageItems;
        }

        /** 
         * Set the 'ImageItems' element value. A collection of image items.
         * 
         * @param imageItems
         */
        public void setImageItems(ImageItemsType imageItems) {
            setChoiceSelect(IMAGE_ITEMS_CHOICE);
            this.imageItems = imageItems;
        }

        /** 
         * Check if TextItems is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifTextItems() {
            return choiceSelect == TEXT_ITEMS_CHOICE;
        }

        /** 
         * Get the 'TextItems' element value. A collection of text items. 
         * 
         * @return value
         */
        public TextItemsType getTextItems() {
            return textItems;
        }

        /** 
         * Set the 'TextItems' element value. A collection of text items. 
         * 
         * @param textItems
         */
        public void setTextItems(TextItemsType textItems) {
            setChoiceSelect(TEXT_ITEMS_CHOICE);
            this.textItems = textItems;
        }
    }
}
