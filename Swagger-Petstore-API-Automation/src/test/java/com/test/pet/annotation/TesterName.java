package com.test.pet.annotation;

public enum TesterName {
    VISHAL("Vishal Bhatia");

    public String authorName;
    TesterName(String authorName)
    {
        this.authorName=authorName;
    }

    public String toString() {
        return this.authorName;
    }
}
