
package com.msci.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.1.1
 * Thu Jul 30 15:18:38 IST 2015
 * Generated source version: 3.1.1
 */

@XmlRootElement(name = "subtractResponse", namespace = "http://msci.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subtractResponse", namespace = "http://msci.com/")

public class SubtractResponse {

    @XmlElement(name = "return")
    private int _return;

    public int getReturn() {
        return this._return;
    }

    public void setReturn(int new_return)  {
        this._return = new_return;
    }

}

