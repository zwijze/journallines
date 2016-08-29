
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.List;

/** 
 * This provides name information for a person.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PersonNameType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="NamePrefix" minOccurs="0" maxOccurs="3"/>
 *     &lt;xs:element type="xs:string" name="GivenName" minOccurs="0" maxOccurs="5"/>
 *     &lt;xs:element type="xs:string" name="MiddleName" minOccurs="0" maxOccurs="3"/>
 *     &lt;xs:element type="xs:string" name="SurnamePrefix" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="Surname"/>
 *     &lt;xs:element type="xs:string" name="NameSuffix" minOccurs="0" maxOccurs="3"/>
 *     &lt;xs:element type="xs:string" name="NameTitle" minOccurs="0" maxOccurs="5"/>
 *   &lt;/xs:sequence>
 *   &lt;xs:attributeGroup ref="ns:PrivacyGroup"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="NameType"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PersonNameType
{
    private List<String> namePrefixList = new ArrayList<String>();
    private List<String> givenNameList = new ArrayList<String>();
    private List<String> middleNameList = new ArrayList<String>();
    private String surnamePrefix;
    private String surname;
    private List<String> nameSuffixList = new ArrayList<String>();
    private List<String> nameTitleList = new ArrayList<String>();
    private PrivacyGroup privacyGroup;
    private String nameType;

    /** 
     * Get the list of 'NamePrefix' element items. Salutation of honorific. (e.g., Mr. Mrs., Ms., Miss, Dr.) 
     * 
     * @return list
     */
    public List<String> getNamePrefixList() {
        return namePrefixList;
    }

    /** 
     * Set the list of 'NamePrefix' element items. Salutation of honorific. (e.g., Mr. Mrs., Ms., Miss, Dr.) 
     * 
     * @param list
     */
    public void setNamePrefixList(List<String> list) {
        namePrefixList = list;
    }

    /** 
     * Get the list of 'GivenName' element items. Given name, first name or names
     * 
     * @return list
     */
    public List<String> getGivenNameList() {
        return givenNameList;
    }

    /** 
     * Set the list of 'GivenName' element items. Given name, first name or names
     * 
     * @param list
     */
    public void setGivenNameList(List<String> list) {
        givenNameList = list;
    }

    /** 
     * Get the list of 'MiddleName' element items. The middle name of the person name
     * 
     * @return list
     */
    public List<String> getMiddleNameList() {
        return middleNameList;
    }

    /** 
     * Set the list of 'MiddleName' element items. The middle name of the person name
     * 
     * @param list
     */
    public void setMiddleNameList(List<String> list) {
        middleNameList = list;
    }

    /** 
     * Get the 'SurnamePrefix' element value. e.g "van der", "von", "de" 
     * 
     * @return value
     */
    public String getSurnamePrefix() {
        return surnamePrefix;
    }

    /** 
     * Set the 'SurnamePrefix' element value. e.g "van der", "von", "de" 
     * 
     * @param surnamePrefix
     */
    public void setSurnamePrefix(String surnamePrefix) {
        this.surnamePrefix = surnamePrefix;
    }

    /** 
     * Get the 'Surname' element value. Family name, last name.
     * 
     * @return value
     */
    public String getSurname() {
        return surname;
    }

    /** 
     * Set the 'Surname' element value. Family name, last name.
     * 
     * @param surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /** 
     * Get the list of 'NameSuffix' element items. Hold various name suffixes and letters (e.g. Jr., Sr., III, Ret., Esq.).
     * 
     * @return list
     */
    public List<String> getNameSuffixList() {
        return nameSuffixList;
    }

    /** 
     * Set the list of 'NameSuffix' element items. Hold various name suffixes and letters (e.g. Jr., Sr., III, Ret., Esq.).
     * 
     * @param list
     */
    public void setNameSuffixList(List<String> list) {
        nameSuffixList = list;
    }

    /** 
     * Get the list of 'NameTitle' element items. Degree or honors (e.g., Ph.D., M.D.)   
     * 
     * @return list
     */
    public List<String> getNameTitleList() {
        return nameTitleList;
    }

    /** 
     * Set the list of 'NameTitle' element items. Degree or honors (e.g., Ph.D., M.D.)   
     * 
     * @param list
     */
    public void setNameTitleList(List<String> list) {
        nameTitleList = list;
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
     * Get the 'NameType' attribute value. Type of name of the individual, such as former, nickname, alternate or alias name. Refer to OTA Code List Name Type (NAM).
     * 
     * @return value
     */
    public String getNameType() {
        return nameType;
    }

    /** 
     * Set the 'NameType' attribute value. Type of name of the individual, such as former, nickname, alternate or alias name. Refer to OTA Code List Name Type (NAM).
     * 
     * @param nameType
     */
    public void setNameType(String nameType) {
        this.nameType = nameType;
    }
}
