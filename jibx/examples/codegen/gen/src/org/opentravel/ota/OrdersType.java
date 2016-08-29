
package org.opentravel.ota;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/** 
 * Provides the details of one or more orders.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="OrdersType">
 *   &lt;xs:sequence>
 *     &lt;xs:element name="Order" minOccurs="0" maxOccurs="99">
 *       &lt;!-- Reference to inner class Order -->
 *     &lt;/xs:element>
 *   &lt;/xs:sequence>
 *   &lt;xs:attribute type="xs:string" use="optional" name="OrderType"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="DiscountCode"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="VendorPurchaseOrderID"/>
 *   &lt;xs:attribute type="xs:string" use="optional" name="OrderID"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class OrdersType
{
    private List<Order> orderList = new ArrayList<Order>();
    private String orderType;
    private String discountCode;
    private String vendorPurchaseOrderID;
    private String orderID;

    /** 
     * Get the list of 'Order' element items.
     * 
     * @return list
     */
    public List<Order> getOrderList() {
        return orderList;
    }

    /** 
     * Set the list of 'Order' element items.
     * 
     * @param list
     */
    public void setOrderList(List<Order> list) {
        orderList = list;
    }

    /** 
     * Get the 'OrderType' attribute value. Identifies the type of orders.
     * 
     * @return value
     */
    public String getOrderType() {
        return orderType;
    }

    /** 
     * Set the 'OrderType' attribute value. Identifies the type of orders.
     * 
     * @param orderType
     */
    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    /** 
     * Get the 'DiscountCode' attribute value. A discount code that applies to the orders.
     * 
     * @return value
     */
    public String getDiscountCode() {
        return discountCode;
    }

    /** 
     * Set the 'DiscountCode' attribute value. A discount code that applies to the orders.
     * 
     * @param discountCode
     */
    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }

    /** 
     * Get the 'VendorPurchaseOrderID' attribute value. The purchase order number of a sales intermediary.
     * 
     * @return value
     */
    public String getVendorPurchaseOrderID() {
        return vendorPurchaseOrderID;
    }

    /** 
     * Set the 'VendorPurchaseOrderID' attribute value. The purchase order number of a sales intermediary.
     * 
     * @param vendorPurchaseOrderID
     */
    public void setVendorPurchaseOrderID(String vendorPurchaseOrderID) {
        this.vendorPurchaseOrderID = vendorPurchaseOrderID;
    }

    /** 
     * Get the 'OrderID' attribute value. The identification number associated to the orders.
     * 
     * @return value
     */
    public String getOrderID() {
        return orderID;
    }

    /** 
     * Set the 'OrderID' attribute value. The identification number associated to the orders.
     * 
     * @param orderID
     */
    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }
    /** 
     * Information pertaining to a specific order.
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Order" minOccurs="0" maxOccurs="99">
     *   &lt;xs:complexType>
     *     &lt;xs:sequence>
     *       &lt;xs:element name="Products" minOccurs="0">
     *         &lt;!-- Reference to inner class Products -->
     *       &lt;/xs:element>
     *     &lt;/xs:sequence>
     *     &lt;xs:attribute type="xs:string" use="optional" name="OrderType"/>
     *     &lt;xs:attribute type="xs:string" use="optional" name="OrderID"/>
     *     &lt;xs:attribute type="ns:ListOfRPH" use="optional" name="ListOfRecipientRPH"/>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * 
     * &lt;xs:simpleType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ListOfRPH">
     *   &lt;xs:list itemType="xs:string"/>
     * &lt;/xs:simpleType>
     * </pre>
     */
    public static class Order
    {
        private Products products;
        private String orderType;
        private String orderID;
        private List<String> listOfRecipientRPHs = new ArrayList<String>();

        /** 
         * Get the 'Products' element value.
         * 
         * @return value
         */
        public Products getProducts() {
            return products;
        }

        /** 
         * Set the 'Products' element value.
         * 
         * @param products
         */
        public void setProducts(Products products) {
            this.products = products;
        }

        /** 
         * Get the 'OrderType' attribute value. Identifies the type of order.
         * 
         * @return value
         */
        public String getOrderType() {
            return orderType;
        }

        /** 
         * Set the 'OrderType' attribute value. Identifies the type of order.
         * 
         * @param orderType
         */
        public void setOrderType(String orderType) {
            this.orderType = orderType;
        }

        /** 
         * Get the 'OrderID' attribute value. The identification number associated to the orders.
         * 
         * @return value
         */
        public String getOrderID() {
            return orderID;
        }

        /** 
         * Set the 'OrderID' attribute value. The identification number associated to the orders.
         * 
         * @param orderID
         */
        public void setOrderID(String orderID) {
            this.orderID = orderID;
        }

        /** 
         * Get the list of 'ListOfRecipientRPH' attribute items. The recipient(s) to whom the order pertains.
         * 
         * @return list
         */
        public List<String> getListOfRecipientRPHs() {
            return listOfRecipientRPHs;
        }

        /** 
         * Set the list of 'ListOfRecipientRPH' attribute items. The recipient(s) to whom the order pertains.
         * 
         * @param list
         */
        public void setListOfRecipientRPHs(List<String> list) {
            listOfRecipientRPHs = list;
        }

        /** 
         * Serializer for 'ListOfRecipientRPH' attribute list.
         * 
         * @param values
         * @return text
         */
        public static String serializeListOfRecipientRPHs(List<String> values) {
            if (values == null) {
                return null;
            } else {
                java.lang.StringBuffer buff = new java.lang.StringBuffer();
                for (java.util.Iterator<String> iter = values.iterator(); iter
                        .hasNext();) {
                    if (buff.length() > 0) {
                        buff.append(' ');
                    }
                    String value = iter.next();
                    buff.append(value);
                }
                return buff.toString();
            }
        }

        /** 
         * Deserializer for 'ListOfRecipientRPH' attribute list.
         * 
         * @param text
         * @return values
         * @throws org.jibx.runtime.JiBXException on conversion error
         */
        public static List<String> deserializeListOfRecipientRPHs(String text)
                throws org.jibx.runtime.JiBXException {
            org.jibx.runtime.IListItemDeserializer ldser = new org.jibx.runtime.IListItemDeserializer() {
                public java.lang.Object deserialize(String text) {
                    return text;
                }
            };
            return (List<String>) org.jibx.runtime.Utility.deserializeList(
                    text, ldser);
        }
        /** 
         * A collection of products.
         * 
         * Schema fragment(s) for this class:
         * <pre>
         * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Products" minOccurs="0">
         *   &lt;xs:complexType>
         *     &lt;xs:sequence>
         *       &lt;xs:element name="Product" minOccurs="0" maxOccurs="99">
         *         &lt;!-- Reference to inner class Product -->
         *       &lt;/xs:element>
         *     &lt;/xs:sequence>
         *   &lt;/xs:complexType>
         * &lt;/xs:element>
         * </pre>
         */
        public static class Products
        {
            private List<Product> productList = new ArrayList<Product>();

            /** 
             * Get the list of 'Product' element items.
             * 
             * @return list
             */
            public List<Product> getProductList() {
                return productList;
            }

            /** 
             * Set the list of 'Product' element items.
             * 
             * @param list
             */
            public void setProductList(List<Product> list) {
                productList = list;
            }
            /** 
             * The details associated to a specific product.
             * 
             * Schema fragment(s) for this class:
             * <pre>
             * &lt;xs:element xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Product" minOccurs="0" maxOccurs="99">
             *   &lt;xs:complexType>
             *     &lt;xs:attribute type="xs:string" use="optional" name="ProductIssueDate"/>
             *     &lt;xs:attribute type="xs:string" use="optional" name="ProductID"/>
             *     &lt;xs:attribute type="xs:string" use="optional" name="ProductType"/>
             *     &lt;xs:attribute type="xs:integer" use="optional" name="ProductQuantity"/>
             *     &lt;xs:attribute type="xs:string" use="optional" name="ProductSerialNumber"/>
             *     &lt;xs:attribute type="xs:string" use="optional" name="DiscountCode"/>
             *     &lt;xs:attributeGroup ref="ns:CurrencyAmountGroup"/>
             *     &lt;xs:attribute use="optional" name="Status">
             *       &lt;xs:simpleType>
             *         &lt;!-- Reference to inner class Status -->
             *       &lt;/xs:simpleType>
             *     &lt;/xs:attribute>
             *     &lt;xs:attribute type="ns:ListOfRPH" use="optional" name="ListOfRecipientRPH"/>
             *   &lt;/xs:complexType>
             * &lt;/xs:element>
             * 
             * &lt;xs:simpleType xmlns:ns="http://www.opentravel.org/OTA/2003/05" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ListOfRPH">
             *   &lt;xs:list itemType="xs:string"/>
             * &lt;/xs:simpleType>
             * </pre>
             */
            public static class Product
            {
                private String productIssueDate;
                private String productID;
                private String productType;
                private BigInteger productQuantity;
                private String productSerialNumber;
                private String discountCode;
                private CurrencyAmountGroup currencyAmountGroup;
                private Status status;
                private List<String> listOfRecipientRPHs = new ArrayList<String>();

                /** 
                 * Get the 'ProductIssueDate' attribute value. The date or date and time that the product was issued.
                 * 
                 * @return value
                 */
                public String getProductIssueDate() {
                    return productIssueDate;
                }

                /** 
                 * Set the 'ProductIssueDate' attribute value. The date or date and time that the product was issued.
                 * 
                 * @param productIssueDate
                 */
                public void setProductIssueDate(String productIssueDate) {
                    this.productIssueDate = productIssueDate;
                }

                /** 
                 * Get the 'ProductID' attribute value. An identification number associated to the specific product.
                 * 
                 * @return value
                 */
                public String getProductID() {
                    return productID;
                }

                /** 
                 * Set the 'ProductID' attribute value. An identification number associated to the specific product.
                 * 
                 * @param productID
                 */
                public void setProductID(String productID) {
                    this.productID = productID;
                }

                /** 
                 * Get the 'ProductType' attribute value. Identifies the type of product being purchased.
                 * 
                 * @return value
                 */
                public String getProductType() {
                    return productType;
                }

                /** 
                 * Set the 'ProductType' attribute value. Identifies the type of product being purchased.
                 * 
                 * @param productType
                 */
                public void setProductType(String productType) {
                    this.productType = productType;
                }

                /** 
                 * Get the 'ProductQuantity' attribute value. The number of the specific product being purchased.
                 * 
                 * @return value
                 */
                public BigInteger getProductQuantity() {
                    return productQuantity;
                }

                /** 
                 * Set the 'ProductQuantity' attribute value. The number of the specific product being purchased.
                 * 
                 * @param productQuantity
                 */
                public void setProductQuantity(BigInteger productQuantity) {
                    this.productQuantity = productQuantity;
                }

                /** 
                 * Get the 'ProductSerialNumber' attribute value. The serial number of the specific product.
                 * 
                 * @return value
                 */
                public String getProductSerialNumber() {
                    return productSerialNumber;
                }

                /** 
                 * Set the 'ProductSerialNumber' attribute value. The serial number of the specific product.
                 * 
                 * @param productSerialNumber
                 */
                public void setProductSerialNumber(String productSerialNumber) {
                    this.productSerialNumber = productSerialNumber;
                }

                /** 
                 * Get the 'DiscountCode' attribute value. The discount code that applies to the specific product.
                 * 
                 * @return value
                 */
                public String getDiscountCode() {
                    return discountCode;
                }

                /** 
                 * Set the 'DiscountCode' attribute value. The discount code that applies to the specific product.
                 * 
                 * @param discountCode
                 */
                public void setDiscountCode(String discountCode) {
                    this.discountCode = discountCode;
                }

                /** 
                 * Get the 'CurrencyAmountGroup' attributeGroup value. The amount related to the specific item (e.g., if the item being purchased is a gift certificate, and only one item is being purchased the full amount is applied to the gift certificate).
                 * 
                 * @return value
                 */
                public CurrencyAmountGroup getCurrencyAmountGroup() {
                    return currencyAmountGroup;
                }

                /** 
                 * Set the 'CurrencyAmountGroup' attributeGroup value. The amount related to the specific item (e.g., if the item being purchased is a gift certificate, and only one item is being purchased the full amount is applied to the gift certificate).
                 * 
                 * @param currencyAmountGroup
                 */
                public void setCurrencyAmountGroup(
                        CurrencyAmountGroup currencyAmountGroup) {
                    this.currencyAmountGroup = currencyAmountGroup;
                }

                /** 
                 * Get the 'Status' attribute value. The status of the product.  This attribute would primarily be used in the response message to identify the status of the item being purchased.
                 * 
                 * @return value
                 */
                public Status getStatus() {
                    return status;
                }

                /** 
                 * Set the 'Status' attribute value. The status of the product.  This attribute would primarily be used in the response message to identify the status of the item being purchased.
                 * 
                 * @param status
                 */
                public void setStatus(Status status) {
                    this.status = status;
                }

                /** 
                 * Get the list of 'ListOfRecipientRPH' attribute items. The recipient(s) to whom the product pertains.
                 * 
                 * @return list
                 */
                public List<String> getListOfRecipientRPHs() {
                    return listOfRecipientRPHs;
                }

                /** 
                 * Set the list of 'ListOfRecipientRPH' attribute items. The recipient(s) to whom the product pertains.
                 * 
                 * @param list
                 */
                public void setListOfRecipientRPHs(List<String> list) {
                    listOfRecipientRPHs = list;
                }

                /** 
                 * Serializer for 'ListOfRecipientRPH' attribute list.
                 * 
                 * @param values
                 * @return text
                 */
                public static String serializeListOfRecipientRPHs(
                        List<String> values) {
                    if (values == null) {
                        return null;
                    } else {
                        java.lang.StringBuffer buff = new java.lang.StringBuffer();
                        for (java.util.Iterator<String> iter = values
                                .iterator(); iter.hasNext();) {
                            if (buff.length() > 0) {
                                buff.append(' ');
                            }
                            String value = iter.next();
                            buff.append(value);
                        }
                        return buff.toString();
                    }
                }

                /** 
                 * Deserializer for 'ListOfRecipientRPH' attribute list.
                 * 
                 * @param text
                 * @return values
                 * @throws org.jibx.runtime.JiBXException on conversion error
                 */
                public static List<String> deserializeListOfRecipientRPHs(
                        String text) throws org.jibx.runtime.JiBXException {
                    org.jibx.runtime.IListItemDeserializer ldser = new org.jibx.runtime.IListItemDeserializer() {
                        public java.lang.Object deserialize(String text) {
                            return text;
                        }
                    };
                    return (List<String>) org.jibx.runtime.Utility
                            .deserializeList(text, ldser);
                }
                /** 
                 * Schema fragment(s) for this class:
                 * <pre>
                 * &lt;xs:simpleType xmlns:xs="http://www.w3.org/2001/XMLSchema">
                 *   &lt;xs:restriction base="xs:string">
                 *     &lt;xs:enumeration value="OrderPending"/>
                 *     &lt;xs:enumeration value="BackOrder"/>
                 *     &lt;xs:enumeration value="Unavailable"/>
                 *     &lt;xs:enumeration value="Confirmed"/>
                 *   &lt;/xs:restriction>
                 * &lt;/xs:simpleType>
                 * </pre>
                 */
                public static enum Status {
                    /** 
                     * The order has been submitted, but has not yet been confirmed.
                     */
                    ORDER_PENDING("OrderPending"), /** 
                                                    * The product being purchased is on back order.
                                                    */
                    BACK_ORDER("BackOrder"), /** 
                                              * The product being purchased is unavailable.
                                              */
                    UNAVAILABLE("Unavailable"), /** 
                                                 * The order has been confirmed.
                                                 */
                    CONFIRMED("Confirmed");
                    private final String value;

                    private Status(String value) {
                        this.value = value;
                    }

                    public String xmlValue() {
                        return value;
                    }

                    public static Status convert(String value) {
                        for (Status inst : values()) {
                            if (inst.xmlValue().equals(value)) {
                                return inst;
                            }
                        }
                        return null;
                    }
                }
            }
        }
    }
}
