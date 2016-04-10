package cn.edu.cup.test

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class TestController {

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond TestClazzA.list(params), model:[testClazzAInstanceCount: TestClazzA.count()]
    }
}
