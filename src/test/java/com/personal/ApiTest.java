package com.personal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import io.restassured.response.Response;

public class ApiTest {

    ApiClass apiClass = new ApiClass();

    @ParameterizedTest
    @ValueSource(strings = { "295" })
    public void testApiGet_validaData_200Response(String bookingId) throws InterruptedException {
        Response response = apiClass.getBookingDetailsById(bookingId);
        response.prettyPrint();
        assertEquals(200, response.getStatusCode(), "Status Code didn't match");
        Thread.sleep(2000);
    }

    @ParameterizedTest
    @ValueSource(strings = { "295"})
    public void testApiGet_validaData_200Response2(String bookingId) throws InterruptedException {
        Response response = apiClass.getBookingDetailsById(bookingId);
        response.prettyPrint();
        assertEquals(200, response.getStatusCode(), "Status Code didn't match");
        Thread.sleep(2000);
    }

}
