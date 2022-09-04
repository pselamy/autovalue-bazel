package com.github.pselamy;

import com.google.auto.value.AutoValue;
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
    assertThat(actual.foo()).equals(FOO);
    assertThat(actual.bar()).equals(BAR);
  }
  
  @AutoValue
  abstract static class ObjectUnderTest {
    private static ObjectUnderTest create(String foo, int bar) {
      return new AutoValueTest_ObjectUnderTest(foo, bar);
    }
    
    abstract String foo();
    
    abstract int bar();
  }
}
