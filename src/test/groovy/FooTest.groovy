import spock.lang.Specification


class FooTest extends Specification {
    def "foo"() {
        when:
        new Foo().thing("ffff")

        then:
        1 == 1
    }

}