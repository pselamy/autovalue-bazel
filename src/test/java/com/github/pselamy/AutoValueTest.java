package com.github.pselamy;

import static com.google.common.truth.Truth.assertThat;

import com.google.auto.value.AutoValue;
import org.junit.runners.JUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnit4.class)
public class AutoValueTest {
  private static final String FOO = "foo";
  private static final int BAR = 123;
  
  @Test
  public void autoValue_createsObjectUnderTest() {
    // Act
    ObjectUnderTest actual = ObjectUnderTest.create(FOO, BAR);
    
    // Assert
    assertThat(actual.foo()).equals(FOO);
    assertThat(actual.bar()).equals(BAR);
  }
}
