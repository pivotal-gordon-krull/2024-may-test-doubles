package rocket

class DummyRocket : Rocket {
    override fun launch() {
        throw RuntimeException()
    }
}
