package com.studerw.tda.model.instrument;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * <p>
 * Query TDA for <em>instruments</em> , either using symbol, name, description, cusip, etc.
 * Apparently the following instrument types are queryable: {@link Instrument.AssetType}.
 *</p>
 *
 * <p>
 * The following {@link com.studerw.tda.model.instrument.Query.QueryType QueryTypes} can be made:
 * </p>
 *
 * <ul>
 *   <li><em><strong>SYMBOL_SEARCH</strong></em>: retrieve an instrument using the exact symbol name or CUSIP</li>
 *   <li><em><strong>SYMBOL_REGEX</strong></em>: Retrieve instrument data for all symbols matching regex. For example <em>XYZ.*</em> will return all symbols beginning with <em>XYZ</em></li>
 *   <li><em><strong>DESCRIPTION_SEARCH</strong></em>: Retrieve instrument data for instruments whose description contains the word supplied. Example: <em>Bank</em> will return all instruments with <em>Bank</em> in the description.</li>
 *   <li><em><strong>DESCRIPTION_REGEX</strong></em>: Search description with full regex support.
 *   For example <em>XYZ.[A-C]</em> returns all instruments whose descriptions contain a word beginning with <em>XYZ</em> followed by a character <em>A</em> through <em>C</em>.</li>
 * </ul>
 *
 * @see Instrument.AssetType
 * @see com.studerw.tda.client.TdaClient#queryInstruments(Query)
 */
public class Query {

  private String searchStr;
  private QueryType queryType;

  public Query(String searchStr, QueryType queryType) {
    this.searchStr = searchStr;
    this.queryType = queryType;
  }

  public String getSearchStr() {
    return searchStr;
  }

  public QueryType getQueryType() {
    return queryType;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .append("searchStr", searchStr)
        .append("queryType", queryType)
        .toString();
  }

  public enum QueryType {
    SYMBOL_SEARCH("symbol-search"),
    SYMBOL_REGEX("symbol-regex"),
    DESCRIPTION_SEARCH("desc-search"),
    DESCRIPTION_REGEX("desc-regex");

    private String queryType;

    QueryType(String queryType) {
      this.queryType = queryType;
    }

    public String getQueryType() {
      return queryType;
    }
  }
}
