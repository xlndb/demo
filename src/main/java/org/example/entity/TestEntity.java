package org.example.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @author lide
 */
@Getter
@Setter
@Accessors(chain = true)
@EqualsAndHashCode(of = "id")
@ToString
public class TestEntity implements Cloneable {
    private String id;
    private String name;

    @Override
    public TestEntity clone() {
        try {
            TestEntity clone = (TestEntity) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
