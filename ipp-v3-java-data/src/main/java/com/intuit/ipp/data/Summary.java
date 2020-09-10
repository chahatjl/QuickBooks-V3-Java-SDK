//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.09.10 at 09:45:50 AM PDT 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * Group Summary
 * 
 * <p>Java class for Summary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Summary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ColData" type="{http://schema.intuit.com/finance/v3}ColData" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Summary", propOrder = {
    "colData"
})
public class Summary implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ColData", required = true)
    protected List<ColData> colData;

    /**
     * Gets the value of the colData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ColData }
     * 
     * 
     */
    public List<ColData> getColData() {
        if (colData == null) {
            colData = new ArrayList<ColData>();
        }
        return this.colData;
    }

    /**
     * Sets the value of the colData property.
     * 
     * @param colData
     *     allowed object is
     *     {@link ColData }
     *     
     */
    public void setColData(List<ColData> colData) {
        this.colData = colData;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Summary that = ((Summary) object);
        {
            List<ColData> lhsColData;
            lhsColData = (((this.colData!= null)&&(!this.colData.isEmpty()))?this.getColData():null);
            List<ColData> rhsColData;
            rhsColData = (((that.colData!= null)&&(!that.colData.isEmpty()))?that.getColData():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "colData", lhsColData), LocatorUtils.property(thatLocator, "colData", rhsColData), lhsColData, rhsColData, ((this.colData!= null)&&(!this.colData.isEmpty())), ((that.colData!= null)&&(!that.colData.isEmpty())))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = 1;
        {
            List<ColData> theColData;
            theColData = (((this.colData!= null)&&(!this.colData.isEmpty()))?this.getColData():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "colData", theColData), currentHashCode, theColData, ((this.colData!= null)&&(!this.colData.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
