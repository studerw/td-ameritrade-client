
package com.studerw.tda.model;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.studerw.tda.model package.
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
     * Create a new ObjectFactory that can be used to createDefinition new instances of schema derived classes for package: com.studerw.tda.model
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OptionChain }
     *
     */
    public OptionChain createAmtd() {
        return new OptionChain();
    }

    /**
     * Create an instance of {@link OptionChain.OptionChainResults }
     *
     */
    public OptionChain.OptionChainResults createAmtdOptionChainResults() {
        return new OptionChain.OptionChainResults();
    }

    /**
     * Create an instance of {@link OptionChain.OptionChainResults.OptionDate }
     *
     */
    public OptionChain.OptionChainResults.OptionDate createAmtdOptionChainResultsOptionDate() {
        return new OptionChain.OptionChainResults.OptionDate();
    }

    /**
     * Create an instance of {@link OptionChain.OptionChainResults.OptionDate.OptionStrike }
     *
     */
    public OptionChain.OptionChainResults.OptionDate.OptionStrike createAmtdOptionChainResultsOptionDateOptionStrike() {
        return new OptionChain.OptionChainResults.OptionDate.OptionStrike();
    }

    /**
     * Create an instance of {@link OptionChain.OptionChainResults.OptionDate.OptionStrike.Put }
     *
     */
    public OptionChain.OptionChainResults.OptionDate.OptionStrike.Put createAmtdOptionChainResultsOptionDateOptionStrikePut() {
        return new OptionChain.OptionChainResults.OptionDate.OptionStrike.Put();
    }

    /**
     * Create an instance of {@link OptionChain.OptionChainResults.OptionDate.OptionStrike.Call }
     *
     */
    public OptionChain.OptionChainResults.OptionDate.OptionStrike.Call createAmtdOptionChainResultsOptionDateOptionStrikeCall() {
        return new OptionChain.OptionChainResults.OptionDate.OptionStrike.Call();
    }

}
