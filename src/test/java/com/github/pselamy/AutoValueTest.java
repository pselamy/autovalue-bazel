package com.github.pselamy;

import static com.google.common.truth.Truth.assertThat;

import com.google.auto.value.AutoValue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class AutoValueTest {
  private static final String FOO = "foo";
  private static final int BAR = 123;

  @Test
  public void autoValue_createsObjectUnderTest() {
    // Act
    ObjectUnderTest actual = ObjectUnderTest.create(FOO, BAR);

    // Assert
    assertThat(actual.foo()).isEqualTo(FOO);
    assertThat(actual.bar()).isEqualTo(BAR);
  }

  @AutoValue
  abstract static class ObjectUnderTest {
    private static ObjectUnderTest create(String foo, int bar) {
      return new AutoValue_AutoValueTest_ObjectUnderTest(foo, bar);
    }

    abstract String foo();

    abstract int bar();
  }
}
