/*
 * This file is generated by jOOQ.
*/
package de.quinscape.automatontemplate.domain.tables.records;


import de.quinscape.automatontemplate.domain.tables.AppLogin;

import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Entity
@Table(name = "app_login", schema = "public", indexes = {
    @Index(name = "pk_app_login", unique = true, columnList = "series ASC")
})
public class AppLoginRecord extends UpdatableRecordImpl<AppLoginRecord> implements Record4<String, String, String, Timestamp> {

    private static final long serialVersionUID = 104214310;

    /**
     * Setter for <code>public.app_login.username</code>.
     */
    public void setUsername(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.app_login.username</code>.
     */
    @Column(name = "username", nullable = false, length = 64)
    @NotNull
    @Size(max = 64)
    public String getUsername() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.app_login.series</code>.
     */
    public void setSeries(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.app_login.series</code>.
     */
    @Id
    @Column(name = "series", unique = true, nullable = false, length = 64)
    @NotNull
    @Size(max = 64)
    public String getSeries() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.app_login.token</code>.
     */
    public void setToken(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.app_login.token</code>.
     */
    @Column(name = "token", nullable = false, length = 64)
    @NotNull
    @Size(max = 64)
    public String getToken() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.app_login.last_used</code>.
     */
    public void setLastUsed(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.app_login.last_used</code>.
     */
    @Column(name = "last_used", nullable = false)
    @NotNull
    public Timestamp getLastUsed() {
        return (Timestamp) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, Timestamp> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return AppLogin.APP_LOGIN.USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return AppLogin.APP_LOGIN.SERIES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return AppLogin.APP_LOGIN.TOKEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return AppLogin.APP_LOGIN.LAST_USED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getSeries();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getLastUsed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getSeries();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getLastUsed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppLoginRecord value1(String value) {
        setUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppLoginRecord value2(String value) {
        setSeries(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppLoginRecord value3(String value) {
        setToken(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppLoginRecord value4(Timestamp value) {
        setLastUsed(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppLoginRecord values(String value1, String value2, String value3, Timestamp value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AppLoginRecord
     */
    public AppLoginRecord() {
        super(AppLogin.APP_LOGIN);
    }

    /**
     * Create a detached, initialised AppLoginRecord
     */
    public AppLoginRecord(String username, String series, String token, Timestamp lastUsed) {
        super(AppLogin.APP_LOGIN);

        set(0, username);
        set(1, series);
        set(2, token);
        set(3, lastUsed);
    }
}