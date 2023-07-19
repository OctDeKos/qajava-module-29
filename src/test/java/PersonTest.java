import org.testng.Assert;
import org.testng.annotations.Test;
/*
ПРЕДЫСТОРИЯ
Для написания тестового класса PersonTest.java с использованием TestNG,
мы будем создавать разнообразные тестовые методы, которые проверят корректность
работы метода isTeenager() класса Person.

ПОЯСНЕНИЕ К РЕШЕНИЮ
В первом тестовом методе мы передаем возраст 12, и ожидаемый результат - false, потому что 12 меньше 13,
и по задумке программиста, это не должен быть тинейджер.
Во втором тестовом методе мы передаем возраст 13, и ожидаемый результат - true, потому что 13 соответствует
возрасту тинейджеров.
В третьем тестовом методе мы передаем возраст 16, и ожидаемый результат - true, так как 16 находится в диапазоне
от 13 до 19 лет и также считается тинейджером.
В четвертом тестовом методе мы передаем возраст 19, и ожидаемый результат - true, потому что 19 также
соответствует возрасту тинейджеров.
В пятом тестовом методе мы передаем возраст 20, и ожидаемый результат - false, потому что 20 больше 19 и уже
не считается тинейджером.
Таким образом, в этом скорректированном тестовом классе мы проверяем, что метод isTeenager() работает правильно
для различных возрастов, определенных в задании программиста.
 */

import org.testng.Assert;
import org.testng.annotations.Test;

public class PersonTest {

    @Test
    public void testIsTeenagerWithAgeLessThan13() {
        int age = 12;
        boolean result = Person.isTeenager(age);
        Assert.assertFalse(result, "Expected false for age less than 13.");
    }

    @Test
    public void testIsTeenagerWithAgeEqualTo13() {
        int age = 13;
        boolean result = Person.isTeenager(age);
        Assert.assertTrue(result, "Expected true for age equal to 13.");
    }

    @Test
    public void testIsTeenagerWithAgeBetween13And19() {
        int age = 16;
        boolean result = Person.isTeenager(age);
        Assert.assertTrue(result, "Expected true for age between 13 and 19.");
    }

    @Test
    public void testIsTeenagerWithAgeEqualTo19() {
        int age = 19;
        boolean result = Person.isTeenager(age);
        Assert.assertTrue(result, "Expected true for age equal to 19.");
    }

    @Test
    public void testIsTeenagerWithAgeGreaterThan19() {
        int age = 20;
        boolean result = Person.isTeenager(age);
        Assert.assertFalse(result, "Expected false for age greater than 19.");
    }
}
