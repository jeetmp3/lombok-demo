package demo.lombok.tests

import demo.lombok.NonNullDemo
import spock.lang.Specification

import java.lang.reflect.Modifier

/**
 * @author Jitendra Singh.
 */
class NonNullDemoSpec extends Specification {

    def "check getters and setters"() {
        given:
        NonNullDemo demo = new NonNullDemo()

        when:
        demo.cleanup();

        then:
        thrown(IOException)


    }
}
