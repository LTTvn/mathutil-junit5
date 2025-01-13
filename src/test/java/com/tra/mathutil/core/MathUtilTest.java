/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.tra.mathutil.core;



//import static là dành riêng cho nhưng hàm static 
//gọi hàm mà bỏ qua tên class
import static com.tra.mathutil.junit5.core.MathUtil.*;
import java.lang.invoke.MethodHandle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author TRA
 */
public class MathUtilTest {
    //choi DDT, tach data ra khoi cau lenh kiem thu, tham so hoa data nay
    //vao trong cau lenh kiem thu
    
    //chuan bi bo data
    public static Object[][] initData(){
        return new Integer [][]{
                                 {1,1},
                                 {2,2},
                                 {5,120},
                                 {6,120}
                               };
    }
       
    
       @ParameterizedTest
       @MethodSource(value = "initData") //ten ham cung cap Java,ngam dinh thu tu 
                                         //cua cac phan tu mang,map vao tham so ham
       public void testGetFactorialGivenRightArgReturnsWell(int input,long expected){
           assertEquals(expected,getFactorial(input));
       }

       //Bắt ngoại lệ khi đưa data cà chớn!!!
       //@Test(expected = tên ngoại lệ.class )JUnit thôi, JUnit hông xài vậy
       public void testGetFactorialGivenWrongArgThrowException(){
           //xài biểu thức Lambda
           //hàm nhận tham sôs thưs 2 là 1 object/có code implement cài
           //functional interface tên là Excutable - có 1 hamf duy nhất ko code
           //tên là execute()
           //chơi chậm
     
    //       Executable exObject = () -> getFactorial(-5);
           assertThrows(IllegalArgumentException.class, () ->getFactorial(-5) );
       }
       
}
