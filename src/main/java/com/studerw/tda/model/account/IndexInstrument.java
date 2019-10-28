package com.studerw.tda.model.account;

import com.studerw.tda.model.account.Instrument;


/**
 * Index Instrument
 */
public class IndexInstrument extends Instrument {

  public IndexInstrument(){
    this.setAssetType(AssetType.INDEX);
  }
}
