/*
 * This file is generated by jOOQ.
 */
package eltex.tasks.database.tables.records;


import eltex.tasks.database.tables.Users;

import javax.annotation.Generated;

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
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UsersRecord extends UpdatableRecordImpl<UsersRecord> implements Record4<Long, String, Long, Long> {

    private static final long serialVersionUID = 1159465224;

    /**
     * Setter for <code>users.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>users.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>users.fio</code>.
     */
    public void setFio(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>users.fio</code>.
     */
    public String getFio() {
        return (String) get(1);
    }

    /**
     * Setter for <code>users.address_id</code>.
     */
    public void setAddressId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>users.address_id</code>.
     */
    public Long getAddressId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>users.passport_id</code>.
     */
    public void setPassportId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>users.passport_id</code>.
     */
    public Long getPassportId() {
        return (Long) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, String, Long, Long> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, String, Long, Long> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Users.USERS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Users.USERS.FIO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return Users.USERS.ADDRESS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return Users.USERS.PASSPORT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getFio();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getAddressId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getPassportId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getFio();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getAddressId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getPassportId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value2(String value) {
        setFio(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value3(Long value) {
        setAddressId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value4(Long value) {
        setPassportId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord values(Long value1, String value2, Long value3, Long value4) {
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
     * Create a detached UsersRecord
     */
    public UsersRecord() {
        super(Users.USERS);
    }

    /**
     * Create a detached, initialised UsersRecord
     */
    public UsersRecord(Long id, String fio, Long addressId, Long passportId) {
        super(Users.USERS);

        set(0, id);
        set(1, fio);
        set(2, addressId);
        set(3, passportId);
    }
}
