package com.github.nekdenis.currencylist.db.provider.exchangevalue;

import java.util.Date;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

import com.github.nekdenis.currencylist.db.provider.base.AbstractSelection;
import com.github.nekdenis.currencylist.db.provider.currencies.*;

/**
 * Selection for the {@code exchangevalue} table.
 */
public class ExchangevalueSelection extends AbstractSelection<ExchangevalueSelection> {
    @Override
    public Uri uri() {
        return ExchangevalueColumns.CONTENT_URI;
    }

    /**
     * Query the given content resolver using this selection.
     *
     * @param contentResolver The content resolver to query.
     * @param projection A list of which columns to return. Passing null will return all columns, which is inefficient.
     * @param sortOrder How to order the rows, formatted as an SQL ORDER BY clause (excluding the ORDER BY itself). Passing null will use the default sort
     *            order, which may be unordered.
     * @return A {@code ExchangevalueCursor} object, which is positioned before the first entry, or null.
     */
    public ExchangevalueCursor query(ContentResolver contentResolver, String[] projection, String sortOrder) {
        Cursor cursor = contentResolver.query(uri(), projection, sel(), args(), sortOrder);
        if (cursor == null) return null;
        return new ExchangevalueCursor(cursor);
    }

    /**
     * Equivalent of calling {@code query(contentResolver, projection, null}.
     */
    public ExchangevalueCursor query(ContentResolver contentResolver, String[] projection) {
        return query(contentResolver, projection, null);
    }

    /**
     * Equivalent of calling {@code query(contentResolver, projection, null, null}.
     */
    public ExchangevalueCursor query(ContentResolver contentResolver) {
        return query(contentResolver, null, null);
    }


    public ExchangevalueSelection id(long... value) {
        addEquals("exchangevalue." + ExchangevalueColumns._ID, toObjectArray(value));
        return this;
    }


    public ExchangevalueSelection pathval(String... value) {
        addEquals(ExchangevalueColumns.PATHVAL, value);
        return this;
    }

    public ExchangevalueSelection pathvalNot(String... value) {
        addNotEquals(ExchangevalueColumns.PATHVAL, value);
        return this;
    }

    public ExchangevalueSelection pathvalLike(String... value) {
        addLike(ExchangevalueColumns.PATHVAL, value);
        return this;
    }

    public ExchangevalueSelection currenciesPath(String... value) {
        addEquals(CurrenciesColumns.PATH, value);
        return this;
    }

    public ExchangevalueSelection currenciesPathNot(String... value) {
        addNotEquals(CurrenciesColumns.PATH, value);
        return this;
    }

    public ExchangevalueSelection currenciesPathLike(String... value) {
        addLike(CurrenciesColumns.PATH, value);
        return this;
    }

    public ExchangevalueSelection currenciesName(String... value) {
        addEquals(CurrenciesColumns.NAME, value);
        return this;
    }

    public ExchangevalueSelection currenciesNameNot(String... value) {
        addNotEquals(CurrenciesColumns.NAME, value);
        return this;
    }

    public ExchangevalueSelection currenciesNameLike(String... value) {
        addLike(CurrenciesColumns.NAME, value);
        return this;
    }

    public ExchangevalueSelection title(String... value) {
        addEquals(ExchangevalueColumns.TITLE, value);
        return this;
    }

    public ExchangevalueSelection titleNot(String... value) {
        addNotEquals(ExchangevalueColumns.TITLE, value);
        return this;
    }

    public ExchangevalueSelection titleLike(String... value) {
        addLike(ExchangevalueColumns.TITLE, value);
        return this;
    }

    public ExchangevalueSelection rate(String... value) {
        addEquals(ExchangevalueColumns.RATE, value);
        return this;
    }

    public ExchangevalueSelection rateNot(String... value) {
        addNotEquals(ExchangevalueColumns.RATE, value);
        return this;
    }

    public ExchangevalueSelection rateLike(String... value) {
        addLike(ExchangevalueColumns.RATE, value);
        return this;
    }

    public ExchangevalueSelection date(String... value) {
        addEquals(ExchangevalueColumns.DATE, value);
        return this;
    }

    public ExchangevalueSelection dateNot(String... value) {
        addNotEquals(ExchangevalueColumns.DATE, value);
        return this;
    }

    public ExchangevalueSelection dateLike(String... value) {
        addLike(ExchangevalueColumns.DATE, value);
        return this;
    }

    public ExchangevalueSelection time(String... value) {
        addEquals(ExchangevalueColumns.TIME, value);
        return this;
    }

    public ExchangevalueSelection timeNot(String... value) {
        addNotEquals(ExchangevalueColumns.TIME, value);
        return this;
    }

    public ExchangevalueSelection timeLike(String... value) {
        addLike(ExchangevalueColumns.TIME, value);
        return this;
    }

    public ExchangevalueSelection ask(String... value) {
        addEquals(ExchangevalueColumns.ASK, value);
        return this;
    }

    public ExchangevalueSelection askNot(String... value) {
        addNotEquals(ExchangevalueColumns.ASK, value);
        return this;
    }

    public ExchangevalueSelection askLike(String... value) {
        addLike(ExchangevalueColumns.ASK, value);
        return this;
    }

    public ExchangevalueSelection bid(String... value) {
        addEquals(ExchangevalueColumns.BID, value);
        return this;
    }

    public ExchangevalueSelection bidNot(String... value) {
        addNotEquals(ExchangevalueColumns.BID, value);
        return this;
    }

    public ExchangevalueSelection bidLike(String... value) {
        addLike(ExchangevalueColumns.BID, value);
        return this;
    }
}
