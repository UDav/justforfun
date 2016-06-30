package com.luxoft.jff;

import com.luxoft.jff.jaxb.JaxbChild;
import com.luxoft.jff.jaxb.JaxbExample;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;

/**
 * Created by idavydov on 30.05.2016.
 */
public class Main {

    public static void main(String arg[]) throws JAXBException {
        final JAXBContext context = JAXBContext.newInstance("com.luxoft.jff.jaxb");
        final Marshaller marshaller = context.createMarshaller();
        JaxbChild child = new JaxbChild();
        JaxbExample example = new JaxbExample();
        example.setChild(child);
        example.setTest("test");
        example.setValue(123);
        child.setTest("asdasd");
        marshaller.marshal(
                new JAXBElement<JaxbExample>(
                        new QName("", "JaxbExample"), JaxbExample.class, null,
                        example),
                System.out
        );
    }
}
