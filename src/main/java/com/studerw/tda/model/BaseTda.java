package com.studerw.tda.model;

import javax.xml.bind.annotation.XmlTransient;

/**
 * Base Tda model object for storing the original XML and easy error detection.
 */
public class BaseTda {

  @XmlTransient
  boolean tdaError;
  @XmlTransient
  private String originalXml;

  /**
   * @return the original XML as received from TDA
   */
  public String getOriginalXml() {
    return originalXml;
  }

  public void setOriginalXml(String originalXml) {
    this.originalXml = originalXml;
  }

  /**
   * The TDA XML has numerous ways to detect an error. This is a convenience method for any returned
   * TDA model object. Usually this results from the <em>error</em> element with some failure
   * string.
   *
   * @return true if an error was detected in the response, false if not.
   */
  public boolean isTdaError() {
    return this.tdaError;
  }

  /**
   * Set the convenenience error status.
   */
  public void setTdaError(boolean tdaError) {
    this.tdaError = tdaError;
  }
}
