package cn.edu.cup.test

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class TestController {

    @Transactional
    def calculate(TestClazzA testClazzAInstance, String name) {

        def b = new TestClazzB()
        def test = new CalculatorA()
        test.doCalculate(testClazzAInstance, b, name)
        b.save(flush: true)
        
        chain(controller: "testClazzB", action: "index")
            
    }
    
    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond TestClazzA.list(params), model:[testClazzAInstanceCount: TestClazzA.count()]
    }
}
