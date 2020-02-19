
package toJavaBean;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the toJavaBean package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: toJavaBean
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Configurations }
     * 
     */
    public Configurations createConfigurations() {
        return new Configurations();
    }

    /**
     * Create an instance of {@link Configurations.Configuration }
     * 
     */
    public Configurations.Configuration createConfigurationsConfiguration() {
        return new Configurations.Configuration();
    }

    /**
     * Create an instance of {@link Configurations.Configuration.Module }
     * 
     */
    public Configurations.Configuration.Module createConfigurationsConfigurationModule() {
        return new Configurations.Configuration.Module();
    }

    /**
     * Create an instance of {@link Configurations.Configuration.Module.Item }
     * 
     */
    public Configurations.Configuration.Module.Item createConfigurationsConfigurationModuleItem() {
        return new Configurations.Configuration.Module.Item();
    }

}
