package com.studerw.tda.model.account;

/**
 * Index Instrument
 */
public class IndexInstrument extends Instrument {

  public IndexInstrument(){
    this.setAssetType(AssetType.INDEX);
  }
}
