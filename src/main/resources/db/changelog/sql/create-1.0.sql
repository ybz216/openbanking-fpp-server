SET DATABASE DEFAULT INITIAL SCHEMA PUBLIC;
SET SCHEMA PUBLIC;
CREATE MEMORY TABLE ACCESS_TOKEN
(
    ID                INTEGER GENERATED BY DEFAULT AS IDENTITY (START WITH 0) NOT NULL PRIMARY KEY,
    ACCESS_TOKEN      VARCHAR(64)                                             NOT NULL,
    ACCESS_TOKEN_TYPE VARCHAR(8)                                              NOT NULL,
    EXPIRES           BIGINT                                                  NOT NULL,
    REFRESH_TOKEN     VARCHAR(64),
    BANK_ID           VARCHAR(64)                                             NOT NULL,
    USERNAME          VARCHAR(64)
);
ALTER TABLE ACCESS_TOKEN ALTER COLUMN ID RESTART WITH 1;
CREATE UNIQUE INDEX UQ_ACCESS_TOKEN_USER ON ACCESS_TOKEN (BANK_ID, USERNAME);

CREATE MEMORY TABLE CONSENTS
(
    ID        INTEGER GENERATED BY DEFAULT AS IDENTITY (START WITH 0) NOT NULL PRIMARY KEY,
    BANK_ID   VARCHAR(64)                                             NOT NULL,
    CONSENTID VARCHAR(64)                                             NOT NULL,
    EXPIRES   BIGINT
);
ALTER TABLE CONSENTS
    ALTER COLUMN ID RESTART WITH 1;
CREATE MEMORY TABLE BANKS
(
    ID            VARCHAR(64) NOT NULL,
    NAME          VARCHAR(64),
    SHORTNAME     VARCHAR(64),
    LONGNAME      VARCHAR(255),
    LOGOURL       VARCHAR(255),
    TOKEN_URL     VARCHAR(255),
    ACCOUNTS_URL  VARCHAR(255),
    CLIENT_ID     VARCHAR(64),
    CLIENT_SECRET VARCHAR(64),
    CALLBACK_URL  VARCHAR(255),
    USERNAME      VARCHAR(64),
    AUTHORIZE_URL VARCHAR(255),
    PAYMENTS_URL  VARCHAR(255),
    GATEWAY_URL   VARCHAR(255),
    CONSTRAINT BANKS_PK PRIMARY KEY (ID)
);
CREATE MEMORY TABLE USERS
(
    USERNAME VARCHAR(64) COLLATE SQL_TEXT_UCC NOT NULL PRIMARY KEY,
    PASSWORD VARCHAR(500) COLLATE SQL_TEXT_UCC NOT NULL,
    ENABLED  BOOLEAN NOT NULL
);
CREATE MEMORY TABLE AUTHORITIES
(
    USERNAME  VARCHAR(50) COLLATE SQL_TEXT_UCC NOT NULL,
    AUTHORITY VARCHAR(50) COLLATE SQL_TEXT_UCC NOT NULL,
    CONSTRAINT FK_AUTHORITIES_USERS FOREIGN KEY (USERNAME) REFERENCES PUBLIC.USERS (USERNAME)
);
CREATE UNIQUE INDEX IX_AUTH_USERNAME ON AUTHORITIES (USERNAME, AUTHORITY);

CREATE TABLE PAYMENT_CONSENT
(
    BANKID             VARCHAR(64),
    CONSENTID          VARCHAR(255),
    CONSENT_RESPONSE   VARCHAR(16777216),
    DOMESTIC_PAYMENTID VARCHAR(255)
);


CREATE TABLE ACCOUNT_CONSENT
(
    ID        INTEGER GENERATED BY DEFAULT AS IDENTITY (START WITH 0) NOT NULL PRIMARY KEY,
    BANKID             VARCHAR(64),
    USERNAME           VARCHAR(64),
    CONSENTID          VARCHAR(255),
    EXPIRES            BIGINT,
    CONSENT_RESPONSE   VARCHAR(16777216)
);
