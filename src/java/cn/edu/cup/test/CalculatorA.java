/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.cup.test;

/**
 *
 * @author LiXiaoping
 */
public class CalculatorA implements DemoInterface {
    
    /**
     * 
     * @param testClazzA
     * @param testClazzB
    */
    @Override
    public void doCalculate(TestClazzA testClazzA, TestClazzB testClazzB, String name) {
        testClazzB.setName(String.format("%s:A*A+B*B dev by %s", testClazzA.getName(), name));
        testClazzB.setFieldc(testClazzA.getFielda()*testClazzA.getFielda()+ testClazzA.getFieldb()*testClazzA.getFieldb());
    }
    
}
