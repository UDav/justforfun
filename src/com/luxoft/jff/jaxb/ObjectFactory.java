package com.luxoft.jff.jaxb;

import javax.xml.bind.annotation.XmlRegistry;

/**
 * Created by udav on 30.06.16.
 */
@XmlRegistry
public class ObjectFactory {

    public JaxbExample createJaxbExample(){
        return new JaxbExample();
    }

    public JaxbChild createJaxbChild() {
        return new JaxbChild();
    }
}
