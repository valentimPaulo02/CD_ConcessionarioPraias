package frontend.soap.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "cancelarSombrinha", namespace = "http://soap.frontend/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cancelarSombrinha", namespace = "http://soap.frontend/")

public class CancelarSombrinha {

    @XmlElement(name = "arg0")
    private objects.Booking arg0;

    public objects.Booking getArg0() {
        return this.arg0;
    }

    public void setArg0(objects.Booking newArg0)  {
        this.arg0 = newArg0;
    }

}
