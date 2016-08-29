
package org.opentravel.ota;

import java.util.ArrayList;
import java.util.List;

/** 
 * A collection of errors that occurred during the processing of a message.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ErrorsType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:ErrorType" name="Error" maxOccurs="99"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ErrorsType
{
    private List<ErrorType> errorList = new ArrayList<ErrorType>();

    /** 
     * Get the list of 'Error' element items.
     * 
     * @return list
     */
    public List<ErrorType> getErrorList() {
        return errorList;
    }

    /** 
     * Set the list of 'Error' element items.
     * 
     * @param list
     */
    public void setErrorList(List<ErrorType> list) {
        errorList = list;
    }
}
