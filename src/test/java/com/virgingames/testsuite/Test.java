package com.virgingames.testsuite;

import com.virgingames.steps.Steps1;
import com.virgingames.testbase.TestBase;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.runner.RunWith;

import static org.hamcrest.Matchers.hasItem;

@RunWith(SerenityRunner.class)
public class Test extends TestBase {
    @Steps
    Steps1 steps1;

    @Title("Test To Verify The Name Within The Response Body")
    @org.junit.Test
    public void test1() {
        steps1.getData().body("data.pots.name", hasItem("Adventure")).statusCode(200).log().all();
    }

    @Title("Test To Verify The Name Within The Response Body")
    @org.junit.Test
    public void test2() {
        steps1.getData().body("data.pots.name", hasItem("virgingamessession")).statusCode(200).log().all();
    }
}
