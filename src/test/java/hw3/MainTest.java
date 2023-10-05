package hw3;

import org.example.hw3.MainHW;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    /**
     * Тестируем корректность четного числа
     * ожидаем получить от метода evenOddNumber - true
     */
    @Test
    void checkEvenNumber() {
        assertTrue(MainHW.evenOddNumber(4));
    }
}

/**
 * Тестируем корректность четного числа
 * ожидаем получить от метода evenOddNumber - false
 */