/*
 * This file is generated by jOOQ.
 */
package eltex.tasks.database.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


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
public class UsersLanguages implements Serializable {

    private static final long serialVersionUID = -872782282;

    private final Long    usersId;
    private final Integer langId;

    public UsersLanguages(UsersLanguages value) {
        this.usersId = value.usersId;
        this.langId = value.langId;
    }

    public UsersLanguages(
        Long    usersId,
        Integer langId
    ) {
        this.usersId = usersId;
        this.langId = langId;
    }

    public Long getUsersId() {
        return this.usersId;
    }

    public Integer getLangId() {
        return this.langId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UsersLanguages (");

        sb.append(usersId);
        sb.append(", ").append(langId);

        sb.append(")");
        return sb.toString();
    }
}
