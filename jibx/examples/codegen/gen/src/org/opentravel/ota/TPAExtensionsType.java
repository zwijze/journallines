
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Element;

/** 
 * Allows extensions 
 to be added to the OTA specification per trading partner agreement.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TPA_ExtensionsType">
 *   &lt;xs:sequence>
 *     &lt;xs:any minOccurs="0" maxOccurs="unbounded" processContents="skip"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TPAExtensionsType
{
    private List<Element> anyList = new ArrayList<Element>();

    /** 
     * Get the list of 'TPA_ExtensionsType' complexType items.
     * 
     * @return list
     */
    public List<Element> getAnyList() {
        return anyList;
    }

    /** 
     * Set the list of 'TPA_ExtensionsType' complexType items.
     * 
     * @param list
     */
    public void setAnyList(List<Element> list) {
        anyList = list;
    }
}
