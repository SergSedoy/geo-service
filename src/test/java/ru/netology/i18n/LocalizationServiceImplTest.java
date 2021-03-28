package ru.netology.i18n;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.netology.entity.Country;

import static org.junit.jupiter.api.Assertions.*;

class LocalizationServiceImplTest {

    @Test
    void localeTest() {
        String expected = "Добро пожаловать";

        LocalizationService localizationService = new LocalizationServiceImpl();

        String actual = localizationService.locale(Country.RUSSIA);

        assertEquals(expected, actual);
    }
}