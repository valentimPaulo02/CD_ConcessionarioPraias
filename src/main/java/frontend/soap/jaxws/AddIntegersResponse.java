
package frontend.soap.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.6.2
 * Sun Dec 17 19:07:55 WET 2023
 * Generated source version: 3.6.2
 */

@XmlRootElement(name = "AddIntegersResponse", namespace = "http://soap.frontend/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddIntegersResponse", namespace = "http://soap.frontend/")

public class AddIntegersResponse {

    @XmlElement(name = "return")
    private int _return;

    public int getReturn() {
        return this._return;
    }

    public void setReturn(int new_return)  {
        this._return = new_return;
    }

}

