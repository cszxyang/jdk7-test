package com.github.cszxyang.jt.common;

import java.util.Objects;

/**
 * @author yzx
 */
public class CustomKey {
    private int hashCode;

    private String uid;

    public CustomKey() {
    }

    public CustomKey(int hashCode, String uid) {
        this.hashCode = hashCode;
        this.uid = uid;
    }

    public CustomKey(int hashCode) {
        this.hashCode = hashCode;
    }

    @Override
    public int hashCode() {
        return hashCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomKey customKey = (CustomKey) o;
        return Objects.equals(uid, customKey.uid);
    }

    @Override
    public String toString() {
        return uid;
    }
}
