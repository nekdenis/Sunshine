package com.github.nekdenis.currencylist.db.provider.exchangevalue;

import android.net.Uri;
import android.provider.BaseColumns;

import com.github.nekdenis.currencylist.db.provider.Provider;

/**
 * Columns for the {@code exchangevalue} table.
 */
public class ExchangevalueColumns implements BaseColumns {
    public static final String TABLE_NAME = "exchangevalue";
    public static final Uri CONTENT_URI = Uri.parse(Provider.CONTENT_URI_BASE + "/" + TABLE_NAME);

    /**
     * Primary key.
     */
    public static final String _ID = new String(BaseColumns._ID);

    public static final String PATHVAL = "pathval";

    public static final String TITLE = "title";

    public static final String RATE = "rate";

    public static final String DATE = "date";

    public static final String DATEHOURS = "datehours";

    public static final String ASK = "ask";

    public static final String BID = "bid";


    public static final String DEFAULT_ORDER = TABLE_NAME + "." +_ID;

    // @formatter:off
    public static final String[] ALL_COLUMNS = new String[] {
            _ID,
            PATHVAL,
            TITLE,
            RATE,
            DATE,
            DATEHOURS,
            ASK,
            BID
    };
    // @formatter:on

    public static boolean hasColumns(String[] projection) {
        if (projection == null) return true;
        for (String c : projection) {
            if (c == PATHVAL || c.contains("." + PATHVAL)) return true;
            if (c == TITLE || c.contains("." + TITLE)) return true;
            if (c == RATE || c.contains("." + RATE)) return true;
            if (c == DATE || c.contains("." + DATE)) return true;
            if (c == DATEHOURS || c.contains("." + DATEHOURS)) return true;
            if (c == ASK || c.contains("." + ASK)) return true;
            if (c == BID || c.contains("." + BID)) return true;
        }
        return false;
    }

}
