
package frontend.Rest.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.6.2
 * Sun Dec 31 01:04:25 GMT 2023
 * Generated source version: 3.6.2
 */

@XmlRootElement(name = "listarSombrinhasResponse", namespace = "http://Rest.frontend/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listarSombrinhasResponse", namespace = "http://Rest.frontend/")

public class ListarSombrinhasResponse {

    @XmlElement(name = "return")
    private java.util.ArrayList<objects.Service> _return;

    public java.util.ArrayList<objects.Service> getReturn() {
        return this._return;
    }

    public void setReturn(java.util.ArrayList<objects.Service> new_return)  {
        this._return = new_return;
    }

}
