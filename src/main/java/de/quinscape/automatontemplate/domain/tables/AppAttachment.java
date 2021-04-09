/*
 * This file is generated by jOOQ.
*/
package de.quinscape.automatontemplate.domain.tables;


import de.quinscape.automatontemplate.domain.Indexes;
import de.quinscape.automatontemplate.domain.Keys;
import de.quinscape.automatontemplate.domain.Public;
import de.quinscape.automatontemplate.domain.tables.records.AppAttachmentRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class AppAttachment extends TableImpl<AppAttachmentRecord> {

    private static final long serialVersionUID = -1161137953;

    /**
     * The reference instance of <code>public.app_attachment</code>
     */
    public static final AppAttachment APP_ATTACHMENT = new AppAttachment();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AppAttachmentRecord> getRecordType() {
        return AppAttachmentRecord.class;
    }

    /**
     * The column <code>public.app_attachment.id</code>.
     */
    public final TableField<AppAttachmentRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>public.app_attachment.description</code>.
     */
    public final TableField<AppAttachmentRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.app_attachment.type</code>.
     */
    public final TableField<AppAttachmentRecord, String> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>public.app_attachment.url</code>.
     */
    public final TableField<AppAttachmentRecord, String> URL = createField("url", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>public.app_attachment</code> table reference
     */
    public AppAttachment() {
        this(DSL.name("app_attachment"), null);
    }

    /**
     * Create an aliased <code>public.app_attachment</code> table reference
     */
    public AppAttachment(String alias) {
        this(DSL.name(alias), APP_ATTACHMENT);
    }

    /**
     * Create an aliased <code>public.app_attachment</code> table reference
     */
    public AppAttachment(Name alias) {
        this(alias, APP_ATTACHMENT);
    }

    private AppAttachment(Name alias, Table<AppAttachmentRecord> aliased) {
        this(alias, aliased, null);
    }

    private AppAttachment(Name alias, Table<AppAttachmentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PK_APP_ATTACHMENT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AppAttachmentRecord> getPrimaryKey() {
        return Keys.PK_APP_ATTACHMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AppAttachmentRecord>> getKeys() {
        return Arrays.<UniqueKey<AppAttachmentRecord>>asList(Keys.PK_APP_ATTACHMENT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppAttachment as(String alias) {
        return new AppAttachment(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppAttachment as(Name alias) {
        return new AppAttachment(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AppAttachment rename(String name) {
        return new AppAttachment(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AppAttachment rename(Name name) {
        return new AppAttachment(name, null);
    }
}