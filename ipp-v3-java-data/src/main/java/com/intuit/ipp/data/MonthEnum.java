//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.09.10 at 09:45:50 AM PDT 
//


package com.intuit.ipp.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MonthEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MonthEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="January"/&gt;
 *     &lt;enumeration value="February"/&gt;
 *     &lt;enumeration value="March"/&gt;
 *     &lt;enumeration value="April"/&gt;
 *     &lt;enumeration value="May"/&gt;
 *     &lt;enumeration value="June"/&gt;
 *     &lt;enumeration value="July"/&gt;
 *     &lt;enumeration value="August"/&gt;
 *     &lt;enumeration value="September"/&gt;
 *     &lt;enumeration value="October"/&gt;
 *     &lt;enumeration value="November"/&gt;
 *     &lt;enumeration value="December"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MonthEnum")
@XmlEnum
public enum MonthEnum {

    @XmlEnumValue("January")
    JANUARY("January"),
    @XmlEnumValue("February")
    FEBRUARY("February"),
    @XmlEnumValue("March")
    MARCH("March"),
    @XmlEnumValue("April")
    APRIL("April"),
    @XmlEnumValue("May")
    MAY("May"),
    @XmlEnumValue("June")
    JUNE("June"),
    @XmlEnumValue("July")
    JULY("July"),
    @XmlEnumValue("August")
    AUGUST("August"),
    @XmlEnumValue("September")
    SEPTEMBER("September"),
    @XmlEnumValue("October")
    OCTOBER("October"),
    @XmlEnumValue("November")
    NOVEMBER("November"),
    @XmlEnumValue("December")
    DECEMBER("December");
    private final String value;

    MonthEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MonthEnum fromValue(String v) {
        for (MonthEnum c: MonthEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
