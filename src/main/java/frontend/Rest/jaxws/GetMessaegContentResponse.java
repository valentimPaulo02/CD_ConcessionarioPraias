
package frontend.Rest.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.6.2
 * Tue Dec 05 15:14:59 GMT 2023
 * Generated source version: 3.6.2
 */

@XmlRootElement(name = "GetMessaegContentResponse", namespace = "http://Rest.frontend/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMessaegContentResponse", namespace = "http://Rest.frontend/")

public class GetMessaegContentResponse {

    @XmlElement(name = "return")
    private frontend.Rest.Message _return;

    public frontend.Rest.Message getReturn() {
        return this._return;
    }

    public void setReturn(frontend.Rest.Message new_return)  {
        this._return = new_return;
    }

}

