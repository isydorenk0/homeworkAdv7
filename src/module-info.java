module homeworkAdv7 {

requires jakarta.activation;
    requires java.xml;
    requires java.logging;

    requires jakarta.xml.bind;

    uses jakarta.xml.bind.JAXBContextFactory;
    opens Ex4 to jakarta.xml.bind;
}