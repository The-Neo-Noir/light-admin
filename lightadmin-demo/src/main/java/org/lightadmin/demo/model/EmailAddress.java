package org.lightadmin.demo.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.hibernate.validator.constraints.Email;
import org.springframework.util.Assert;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.util.regex.Pattern;

@Embeddable
@JsonSerialize(using = ToStringSerializer.class)
public class EmailAddress {

    @Email
    @Column(name = "email")
    private String value;

    protected EmailAddress() {
    }

    public EmailAddress(String emailAddress) {
        this.value = emailAddress;
    }

    @Override
    public String toString() {
        return value;
    }
}