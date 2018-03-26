/**
 Validation Rules

 <p>
 periodtype must be one of these values: DAY, MONTH,YEAR,YTD
 </p>
 <p>
 period - The valid values are dependent on the periodtype:
 <ul>
 <li>If periodtype=DAY, then period can be 1, 2, 3, 4, 5 or 10</li>
 <li>If periodtype=MONTH, then period can be 1, 2, 3 or 6</li>
 <li>If periodtype=YEAR, then period can be 1, 2, 3, 5 10, 15, or 20</li>
 <li>If periodtype=YTD, then period can only be 1</li>
 </ul>
 </p>
 <p>
 intervaltype - The valid values are dependent on the periodtype.
 <ul>
 <li>if periodtype=DAY, then intervaltype can be only be MINUTE.</li>
 <li></li>if periodtype=MONTH, then intervaltype can be DAILY or WEEKLY</li>
 <li>if periodtype=YEAR, then intervaltype can be DAILY, WEEKLY, or MONTHLY</li>
 <li>if periodtype=YTD, then intervaltype can be DAILY or WEEKLY</li>
 </ul>
 </p>
 <p>
 intervalduration - The valid values are dependent on the intervaltype.
 <ul>
 <if intervaltype=MINUTE, then intervalduration can be 1, 5, 10, 15, or 30</li>
 <li>if intervaltype=DAILY, then intervalduration can only be 1</li>
 <li>if intervaltype=WEEKLY, then intervalduration can only be 1</li>
 <li>if intervaltype=MONTHLY, then intervalduration can only be 1</li>
 </ul>
 </p>

 <p>
 startdate - If specified, then period and periodtype CANNOT be specified.

 </p>

 */
package com.studerw.tda.model.history;

