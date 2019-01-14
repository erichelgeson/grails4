package four

class FooController {

    def index() {
        def foo = new Foo(name:'foo')

        respond(foo: foo, bar: 3L)
    }
}