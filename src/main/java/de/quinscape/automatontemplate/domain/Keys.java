/*
 * This file is generated by jOOQ.
*/
package de.quinscape.automatontemplate.domain;


import de.quinscape.automatontemplate.domain.tables.AppConfig;
import de.quinscape.automatontemplate.domain.tables.AppLogin;
import de.quinscape.automatontemplate.domain.tables.AppTranslation;
import de.quinscape.automatontemplate.domain.tables.AppUser;
import de.quinscape.automatontemplate.domain.tables.AppUserConfig;
import de.quinscape.automatontemplate.domain.tables.Foo;
import de.quinscape.automatontemplate.domain.tables.FooType;
import de.quinscape.automatontemplate.domain.tables.records.AppConfigRecord;
import de.quinscape.automatontemplate.domain.tables.records.AppLoginRecord;
import de.quinscape.automatontemplate.domain.tables.records.AppTranslationRecord;
import de.quinscape.automatontemplate.domain.tables.records.AppUserConfigRecord;
import de.quinscape.automatontemplate.domain.tables.records.AppUserRecord;
import de.quinscape.automatontemplate.domain.tables.records.FooRecord;
import de.quinscape.automatontemplate.domain.tables.records.FooTypeRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>public</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AppConfigRecord> PK_APP_CONFIG = UniqueKeys0.PK_APP_CONFIG;
    public static final UniqueKey<AppLoginRecord> PK_APP_LOGIN = UniqueKeys0.PK_APP_LOGIN;
    public static final UniqueKey<AppTranslationRecord> PK_APP_TRANSLATION = UniqueKeys0.PK_APP_TRANSLATION;
    public static final UniqueKey<AppTranslationRecord> UC_APP_TRANSLATION = UniqueKeys0.UC_APP_TRANSLATION;
    public static final UniqueKey<AppUserRecord> PK_APP_USER = UniqueKeys0.PK_APP_USER;
    public static final UniqueKey<AppUserRecord> UC_APP_USER_LOGIN = UniqueKeys0.UC_APP_USER_LOGIN;
    public static final UniqueKey<AppUserConfigRecord> PK_APP_USER_CONFIG = UniqueKeys0.PK_APP_USER_CONFIG;
    public static final UniqueKey<FooRecord> PK_FOO = UniqueKeys0.PK_FOO;
    public static final UniqueKey<FooTypeRecord> PK_FOO_TYPE = UniqueKeys0.PK_FOO_TYPE;
    public static final UniqueKey<FooTypeRecord> FOO_TYPE_NAME_KEY = UniqueKeys0.FOO_TYPE_NAME_KEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<AppUserConfigRecord, AppUserRecord> APP_USER_CONFIG__FK_APP_USER_CONFIG_USER_ID = ForeignKeys0.APP_USER_CONFIG__FK_APP_USER_CONFIG_USER_ID;
    public static final ForeignKey<FooRecord, FooTypeRecord> FOO__FK_FOO_TYPE_ID = ForeignKeys0.FOO__FK_FOO_TYPE_ID;
    public static final ForeignKey<FooRecord, AppUserRecord> FOO__FK_FOO_OWNER_ID = ForeignKeys0.FOO__FK_FOO_OWNER_ID;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 {
        public static final UniqueKey<AppConfigRecord> PK_APP_CONFIG = Internal.createUniqueKey(AppConfig.APP_CONFIG, "pk_app_config", AppConfig.APP_CONFIG.NAME);
        public static final UniqueKey<AppLoginRecord> PK_APP_LOGIN = Internal.createUniqueKey(AppLogin.APP_LOGIN, "pk_app_login", AppLogin.APP_LOGIN.SERIES);
        public static final UniqueKey<AppTranslationRecord> PK_APP_TRANSLATION = Internal.createUniqueKey(AppTranslation.APP_TRANSLATION, "pk_app_translation", AppTranslation.APP_TRANSLATION.ID);
        public static final UniqueKey<AppTranslationRecord> UC_APP_TRANSLATION = Internal.createUniqueKey(AppTranslation.APP_TRANSLATION, "uc_app_translation", AppTranslation.APP_TRANSLATION.LOCALE, AppTranslation.APP_TRANSLATION.TAG, AppTranslation.APP_TRANSLATION.PROCESS_NAME);
        public static final UniqueKey<AppUserRecord> PK_APP_USER = Internal.createUniqueKey(AppUser.APP_USER, "pk_app_user", AppUser.APP_USER.ID);
        public static final UniqueKey<AppUserRecord> UC_APP_USER_LOGIN = Internal.createUniqueKey(AppUser.APP_USER, "uc_app_user_login", AppUser.APP_USER.LOGIN);
        public static final UniqueKey<AppUserConfigRecord> PK_APP_USER_CONFIG = Internal.createUniqueKey(AppUserConfig.APP_USER_CONFIG, "pk_app_user_config", AppUserConfig.APP_USER_CONFIG.LOGIN);
        public static final UniqueKey<FooRecord> PK_FOO = Internal.createUniqueKey(Foo.FOO, "pk_foo", Foo.FOO.ID);
        public static final UniqueKey<FooTypeRecord> PK_FOO_TYPE = Internal.createUniqueKey(FooType.FOO_TYPE, "pk_foo_type", FooType.FOO_TYPE.ORDINAL);
        public static final UniqueKey<FooTypeRecord> FOO_TYPE_NAME_KEY = Internal.createUniqueKey(FooType.FOO_TYPE, "foo_type_name_key", FooType.FOO_TYPE.NAME);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<AppUserConfigRecord, AppUserRecord> APP_USER_CONFIG__FK_APP_USER_CONFIG_USER_ID = Internal.createForeignKey(de.quinscape.automatontemplate.domain.Keys.PK_APP_USER, AppUserConfig.APP_USER_CONFIG, "app_user_config__fk_app_user_config_user_id", AppUserConfig.APP_USER_CONFIG.USER_ID);
        public static final ForeignKey<FooRecord, FooTypeRecord> FOO__FK_FOO_TYPE_ID = Internal.createForeignKey(de.quinscape.automatontemplate.domain.Keys.FOO_TYPE_NAME_KEY, Foo.FOO, "foo__fk_foo_type_id", Foo.FOO.TYPE);
        public static final ForeignKey<FooRecord, AppUserRecord> FOO__FK_FOO_OWNER_ID = Internal.createForeignKey(de.quinscape.automatontemplate.domain.Keys.PK_APP_USER, Foo.FOO, "foo__fk_foo_owner_id", Foo.FOO.OWNER_ID);
    }
}
