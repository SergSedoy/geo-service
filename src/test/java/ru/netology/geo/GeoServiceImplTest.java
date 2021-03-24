package ru.netology.geo;

import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;

import static org.junit.jupiter.api.Assertions.*;

class GeoServiceImplTest {

    @Test
    void byIpTest() {
        Location expected = new Location("Moscow", Country.RUSSIA, null, 0);

        String ip = "172.25.46.58";
//        String ip = "96.25.46.58";

        GeoService geoService = new GeoServiceImpl();
        Location actual = geoService.byIp(ip);

        assertEquals(expected.getCountry(), actual.getCountry());
//        assertEquals(expected.getCity(), actual.getCity());
    }
}