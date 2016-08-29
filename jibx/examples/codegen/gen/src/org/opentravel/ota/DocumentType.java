
package org.opentravel.ota;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/** 
 * Provides information on a specific documents
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DocumentType">
 *   &lt;xs:sequence>
 *     &lt;xs:choice minOccurs="0">
 *       &lt;!-- Reference to inner class Choice -->
 *     &lt;/xs:choice>
 *     &lt;xs:element type="xs:string" name="DocLimitations" minOccurs="0" maxOccurs="9"/>
 *     &lt;xs:element name="AdditionalPersonNames" minOccurs="0">
 *       &lt;!-- Reference to inner class AdditionalPersonNames -->
 *     &lt;/xs:element>
 *   &lt;/xs:sequence>
 *   &lt;xs:attributeGroup ref="ns:PrivacyGroup"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="DocIssueAuthority"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="DocIssueLocation"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="DocID"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="DocType"/>
 *   &lt;xs:attributeGroup ref="ns:GenderGroup"/>
 *   &lt;xs:attributeGroup ref="ns:BirthDateGroup"/>
 *   &lt;xs:attributeGroup ref="ns:EffectiveExpireOptionalDateGroup"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="DocIssueStateProv"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="DocIssueCountry"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="BirthCountry"/>
 *   &lt;xs:attribute type="xs:string" name="DocHolderNationality"/>
 * &lt;/xs:complexType>
 * 
 * &lt;xs:attributeGroup xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="BirthDateGroup">
 *   &lt;xs:attribute type="xs:date" use="optional" name="BirthDate"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class DocumentType
{
    private Choice choice;
    private List<String> docLimitationList = new ArrayList<String>();
    private AdditionalPersonNames additionalPersonNames;
    private PrivacyGroup privacyGroup;
    private String docIssueAuthority;
    private String docIssueLocation;
    private String docID;
    private String docType;
    private GenderGroup genderGroup;
    private Date birthDate;
    private EffectiveExpireOptionalDateGroup effectiveExpireOptionalDateGroup;
    private String docIssueStateProv;
    private String docIssueCountry;
    private String birthCountry;
    private String docHolderNationality;

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
     * Get the list of 'DocLimitations' element items. Used to indicate any limitations on the document (e.g. as a person may only be allowed to spend a max of 30 days in country on a visitor's visa).
     * 
     * @return list
     */
    public List<String> getDocLimitationList() {
        return docLimitationList;
    }

    /** 
     * Set the list of 'DocLimitations' element items. Used to indicate any limitations on the document (e.g. as a person may only be allowed to spend a max of 30 days in country on a visitor's visa).
     * 
     * @param list
     */
    public void setDocLimitationList(List<String> list) {
        docLimitationList = list;
    }

    /** 
     * Get the 'AdditionalPersonNames' element value.
     * 
     * @return value
     */
    public AdditionalPersonNames getAdditionalPersonNames() {
        return additionalPersonNames;
    }

    /** 
     * Set the 'AdditionalPersonNames' element value.
     * 
     * @param additionalPersonNames
     */
    public void setAdditionalPersonNames(
            AdditionalPersonNames additionalPersonNames) {
        this.additionalPersonNames = additionalPersonNames;
    }

    /** 
     * Get the 'PrivacyGroup' attributeGroup value.
     * 
     * @return value
     */
    public PrivacyGroup getPrivacyGroup() {
        return privacyGroup;
    }

    /** 
     * Set the 'PrivacyGroup' attributeGroup value.
     * 
     * @param privacyGroup
     */
    public void setPrivacyGroup(PrivacyGroup privacyGroup) {
        this.privacyGroup = privacyGroup;
    }

    /** 
     * Get the 'DocIssueAuthority' attribute value. Indicates the group or association that granted the document.
     * 
     * @return value
     */
    public String getDocIssueAuthority() {
        return docIssueAuthority;
    }

    /** 
     * Set the 'DocIssueAuthority' attribute value. Indicates the group or association that granted the document.
     * 
     * @param docIssueAuthority
     */
    public void setDocIssueAuthority(String docIssueAuthority) {
        this.docIssueAuthority = docIssueAuthority;
    }

    /** 
     * Get the 'DocIssueLocation' attribute value. Indicates the location where the document was issued.
     * 
     * @return value
     */
    public String getDocIssueLocation() {
        return docIssueLocation;
    }

    /** 
     * Set the 'DocIssueLocation' attribute value. Indicates the location where the document was issued.
     * 
     * @param docIssueLocation
     */
    public void setDocIssueLocation(String docIssueLocation) {
        this.docIssueLocation = docIssueLocation;
    }

    /** 
     * Get the 'DocID' attribute value. Unique number assigned by authorities to document.
     * 
     * @return value
     */
    public String getDocID() {
        return docID;
    }

    /** 
     * Set the 'DocID' attribute value. Unique number assigned by authorities to document.
     * 
     * @param docID
     */
    public void setDocID(String docID) {
        this.docID = docID;
    }

    /** 
     * Get the 'DocType' attribute value. Indicates the type of document (e.g. Passport, Military ID, Drivers License, national ID, Vaccination Certificate). Refer to OTA Code List Document Type (DOC).
     * 
     * @return value
     */
    public String getDocType() {
        return docType;
    }

    /** 
     * Set the 'DocType' attribute value. Indicates the type of document (e.g. Passport, Military ID, Drivers License, national ID, Vaccination Certificate). Refer to OTA Code List Document Type (DOC).
     * 
     * @param docType
     */
    public void setDocType(String docType) {
        this.docType = docType;
    }

    /** 
     * Get the 'GenderGroup' attributeGroup value.
     * 
     * @return value
     */
    public GenderGroup getGenderGroup() {
        return genderGroup;
    }

    /** 
     * Set the 'GenderGroup' attributeGroup value.
     * 
     * @param genderGroup
     */
    public void setGenderGroup(GenderGroup genderGroup) {
        this.genderGroup = genderGroup;
    }

    /** 
     * Get the 'BirthDate' attribute value. Indicates the date of birth as indicated in the document, in ISO 8601 prescribed format.
     * 
     * @return value
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /** 
     * Set the 'BirthDate' attribute value. Indicates the date of birth as indicated in the document, in ISO 8601 prescribed format.
     * 
     * @param birthDate
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    /** 
     * Get the 'EffectiveExpireOptionalDateGroup' attributeGroup value.
     * 
     * @return value
     */
    public EffectiveExpireOptionalDateGroup getEffectiveExpireOptionalDateGroup() {
        return effectiveExpireOptionalDateGroup;
    }

    /** 
     * Set the 'EffectiveExpireOptionalDateGroup' attributeGroup value.
     * 
     * @param effectiveExpireOptionalDateGroup
     */
    public void setEffectiveExpireOptionalDateGroup(
            EffectiveExpireOptionalDateGroup effectiveExpireOptionalDateGroup) {
        this.effectiveExpireOptionalDateGroup = effectiveExpireOptionalDateGroup;
    }

    /** 
     * Get the 'DocIssueStateProv' attribute value. State or Province where the document was issued.
     * 
     * @return value
     */
    public String getDocIssueStateProv() {
        return docIssueStateProv;
    }

    /** 
     * Set the 'DocIssueStateProv' attribute value. State or Province where the document was issued.
     * 
     * @param docIssueStateProv
     */
    public void setDocIssueStateProv(String docIssueStateProv) {
        this.docIssueStateProv = docIssueStateProv;
    }

    /** 
     * Get the 'DocIssueCountry' attribute value. Country where the document was issued.
     * 
     * @return value
     */
    public String getDocIssueCountry() {
        return docIssueCountry;
    }

    /** 
     * Set the 'DocIssueCountry' attribute value. Country where the document was issued.
     * 
     * @param docIssueCountry
     */
    public void setDocIssueCountry(String docIssueCountry) {
        this.docIssueCountry = docIssueCountry;
    }

    /** 
     * Get the 'BirthCountry' attribute value. Specifies the birth country of the document holder.
     * 
     * @return value
     */
    public String getBirthCountry() {
        return birthCountry;
    }

    /** 
     * Set the 'BirthCountry' attribute value. Specifies the birth country of the document holder.
     * 
     * @param birthCountry
     */
    public void setBirthCountry(String birthCountry) {
        this.birthCountry = birthCountry;
    }

    /** 
     * Get the 'DocHolderNationality' attribute value. The country code of the nationality of the document holder.
     * 
     * @return value
     */
    public String getDocHolderNationality() {
        return docHolderNationality;
    }

    /** 
     * Set the 'DocHolderNationality' attribute value. The country code of the nationality of the document holder.
     * 
     * @param docHolderNationality
     */
    public void setDocHolderNationality(String docHolderNationality) {
        this.docHolderNationality = docHolderNationality;
    }
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:choice xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" minOccurs="0">
     *   &lt;xs:element type="xs:string" name="DocHolderName" minOccurs="0"/>
     *   &lt;xs:element type="ns:PersonNameType" name="DocHolderFormattedName" minOccurs="0"/>
     * &lt;/xs:choice>
     * </pre>
     */
    public static class Choice
    {
        private int choiceSelect = -1;
        private static final int DOC_HOLDER_NAME_CHOICE = 0;
        private static final int DOC_HOLDER_FORMATTED_NAME_CHOICE = 1;
        private String docHolderName;
        private PersonNameType docHolderFormattedName;

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
         * Check if DocHolderName is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifDocHolderName() {
            return choiceSelect == DOC_HOLDER_NAME_CHOICE;
        }

        /** 
         * Get the 'DocHolderName' element value. The name of the document holder in unformatted text (Mr. Sam Jones). 
         * 
         * @return value
         */
        public String getDocHolderName() {
            return docHolderName;
        }

        /** 
         * Set the 'DocHolderName' element value. The name of the document holder in unformatted text (Mr. Sam Jones). 
         * 
         * @param docHolderName
         */
        public void setDocHolderName(String docHolderName) {
            setChoiceSelect(DOC_HOLDER_NAME_CHOICE);
            this.docHolderName = docHolderName;
        }

        /** 
         * Check if DocHolderFormattedName is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifDocHolderFormattedName() {
            return choiceSelect == DOC_HOLDER_FORMATTED_NAME_CHOICE;
        }

        /** 
         * Get the 'DocHolderFormattedName' element value. The name of document holder in formatted text.
         * 
         * @return value
         */
        public PersonNameType getDocHolderFormattedName() {
            return docHolderFormattedName;
        }

        /** 
         * Set the 'DocHolderFormattedName' element value. The name of document holder in formatted text.
         * 
         * @param docHolderFormattedName
         */
        public void setDocHolderFormattedName(
                PersonNameType docHolderFormattedName) {
            setChoiceSelect(DOC_HOLDER_FORMATTED_NAME_CHOICE);
            this.docHolderFormattedName = docHolderFormattedName;
        }
    }
    /** 
     * A container for additional person names.
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AdditionalPersonNames" minOccurs="0">
     *   &lt;xs:complexType>
     *     &lt;xs:sequence>
     *       &lt;xs:element type="xs:string" name="AdditionalPersonName" maxOccurs="99"/>
     *     &lt;/xs:sequence>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class AdditionalPersonNames
    {
        private List<String> additionalPersonNameList = new ArrayList<String>();

        /** 
         * Get the list of 'AdditionalPersonName' element items. The name of an additional person listed on this document. 
         * 
         * @return list
         */
        public List<String> getAdditionalPersonNameList() {
            return additionalPersonNameList;
        }

        /** 
         * Set the list of 'AdditionalPersonName' element items. The name of an additional person listed on this document. 
         * 
         * @param list
         */
        public void setAdditionalPersonNameList(List<String> list) {
            additionalPersonNameList = list;
        }
    }
}
