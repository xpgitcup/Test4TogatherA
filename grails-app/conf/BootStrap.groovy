import cn.edu.cup.test.TestClazzA

class BootStrap {

    /*
     * 初始化....
     * */
    def init = { servletContext ->
        environments {
            development {
                createTestData()
            }
            production {
            }
        }
    }
    
    /*
     * 撤销、退出
     * */
    def destroy = {
    }
    
    /*
     * 测试代码
     * */
    def createTestData() {
        def random = new Random()
        for (int i=0; i<20; i++) {
            def a = random.nextDouble() * 100
            def b = random.nextDouble() * 100
            def d = new TestClazzA(name: "张${i}", fielda: a, fieldb: b)
            d.save(flush: true)
        }
    }


}
