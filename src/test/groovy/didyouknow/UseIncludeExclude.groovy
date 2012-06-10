package didyouknow

import spock.lang.Specification

import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

@Database
class UseIncludeExclude extends Specification {
  def "a database test"() {
    expect: true
  }

  @UI
  def "a UI database test"() {
    expect: true
  }
}

@Retention(RetentionPolicy.RUNTIME)
@interface Database {}

@Retention(RetentionPolicy.RUNTIME)
@interface UI {}

