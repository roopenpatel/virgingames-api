package com.virgingames.steps;

import com.virgingames.constants.EndPoints;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class Steps1 {
    @Step
    public ValidatableResponse getData() {
        return SerenityRest.given().log().all()
                .queryParam("currency", "GBP")
                .when()
                .get(EndPoints.GET_ENDPOINT)
                .then();
    }
}
