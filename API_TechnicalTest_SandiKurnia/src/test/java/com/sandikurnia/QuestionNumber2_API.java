package com.sandikurnia;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.path.json.JsonPath.given;
import static org.hamcrest.Matchers.equalTo;

public class QuestionNumber2_API {

    int A = 20;
    int B = 5;
    int C = 1;

    String baseUrl = "https://api.punkapi.com/v2";
    String endPoint = "/beers?page=2&per_page=";
    int statusCode = 200;


    @BeforeMethod
    public void Endpoint(){
        RestAssured.baseURI = baseUrl+endPoint;

    }

    @Test(priority = 0)
    public void A_GetRequestPUNKApiAutomation() {

        RequestSpecification http = RestAssured.given();
                Response responseA = http.request(Method.GET, String.valueOf(A));
                    String responseObjectA = responseA.getBody().asString();
                        System.out.println("My responses with value 20 is : " + responseObjectA);
                        int statuscodeA = responseA.getStatusCode();
                        System.out.println("My responses status code with value 20 is : " + statuscodeA);
                            Assert.assertEquals(statuscodeA, statusCode);
                    String StatuslineA = responseA.getStatusLine();
                            Assert.assertEquals(statuscodeA, statusCode);
                        System.out.println("My status line A : " + StatuslineA);

                        List<Object> ResponseA =
                                RestAssured
                                        .given()
                                        .get(String.valueOf(A))
                                        .as(List.class);
                            System.out.println("Amount of data is : " +ResponseA.size());
                            Assert.assertEquals(ResponseA.size(), 1);

                        System.out.println("=============================================== \n");

                            responseA.then().body("[0].id",equalTo(20))
                                    .body("[0].name", equalTo("Rabiator"))
                                    .body("[0].tagline",equalTo("Imperial Wheat Beer"))
                                    .body("[0].first_brewed",equalTo("03/2011"))
                                    .body("[0].description", equalTo("Imperial Wheat beer / Weizenbock brewed by a homesick German in leather trousers. Think banana bread, bubble gum and David Hasselhoff."))
                                    .body("[0].image_url", equalTo("https://images.punkapi.com/v2/keg.png"))
                                    .body("[0].abv",equalTo(10.27F))
                                    .body("[0].ibu",equalTo(26))
                                    .body("[0].target_fg",equalTo(1014))
                                    .body("[0].target_og",equalTo(1092))
                                    .body("[0].ebc",equalTo(24))
                                    .body("[0].srm",equalTo(12))
                                    .body("[0].ph",equalTo(4.4F))
                                        .body("[0].attenuation_level",equalTo(85))
                                        .body("[0].volume.value",equalTo(20))
                                        .body("[0].volume.unit",equalTo("litres"))
                                        .body("[0].boil_volume.value",equalTo(25))
                                        .body("[0].boil_volume.unit",equalTo("litres"))
                                            .body("[0].method.mash_temp[0].temp.value",equalTo(64))
                                            .body("[0].method.mash_temp[0].temp.unit",equalTo("celsius"))
                                            .body("[0].method.mash_temp[0].duration",equalTo(60))
                                            .body("[0].method.fermentation.temp.value",equalTo(21))
                                            .body("[0].method.fermentation.temp.unit",equalTo("celsius"))
                                                .body("[0].ingredients.malt[0].name",equalTo("Extra Pale"))
                                                .body("[0].ingredients.malt[0].amount.value",equalTo(5.63F))
                                                .body("[0].ingredients.malt[0].amount.unit",equalTo("kilograms"))
                                                .body("[0].ingredients.malt[1].name",equalTo("Wheat"))
                                                .body("[0].ingredients.malt[1].amount.value",equalTo(0.69F))
                                                .body("[0].ingredients.malt[1].amount.unit",equalTo("kilograms"))
                                                .body("[0].ingredients.malt[2].name",equalTo("Crystal"))
                                                .body("[0].ingredients.malt[2].amount.value",equalTo(0.63F))
                                                .body("[0].ingredients.malt[2].amount.unit",equalTo("kilograms"))
                                                    .body("[0].ingredients.hops[0].name",equalTo("Columbus"))
                                                    .body("[0].ingredients.hops[0].amount.value",equalTo(12.5F))
                                                    .body("[0].ingredients.hops[0].amount.unit",equalTo("grams"))
                                                    .body("[0].ingredients.hops[0].add",equalTo("start"))
                                                    .body("[0].ingredients.hops[0].attribute",equalTo("bitter"))
                                                    .body("[0].ingredients.hops[1].name",equalTo("Hersbrucker"))
                                                    .body("[0].ingredients.hops[1].amount.value",equalTo(12.5F))
                                                    .body("[0].ingredients.hops[1].amount.unit",equalTo("grams"))
                                                    .body("[0].ingredients.hops[1].add",equalTo("middle"))
                                                    .body("[0].ingredients.hops[1].attribute",equalTo("flavour"))
                                                    .body("[0].ingredients.yeast",equalTo("Wyeast 3333 - German Wheat™"))
                                                        .body("[0].food_pairing[0]",equalTo("Grilled portabello mushroom burger"))
                                                        .body("[0].food_pairing[1]",equalTo("Chicken sausages with creamy mash"))
                                                        .body("[0].food_pairing[2]",equalTo("Caramel and banana meringue pie"))
                                                            .body("[0].brewers_tips",equalTo("If you are struggling to get that authentic head retention increase your mash temperature to about 70°C."))
                                                                .and().body("[0].contributed_by",equalTo("Sam Mason <samjbmason>"));

    }

    @Test(priority = 1)
    public void B_GetRequestPUNKApiAutomation() {

        RequestSpecification http = RestAssured.given();
                Response responseB = http.request(Method.GET, String.valueOf(B));
                    String responseObjectB = responseB.getBody().asString();
                        System.out.println("My responses with value 5 is : " + responseObjectB);
                    int statuscodeB = responseB.getStatusCode();
                        System.out.println("My responses status code with value 5 is : " + statuscodeB);
                            Assert.assertEquals(statuscodeB, statusCode);
                     String StatuslineB = responseB.getStatusLine();
                            Assert.assertEquals(statuscodeB, statusCode);
                        System.out.println("My status line B : " + StatuslineB);

                        List<Object> ResponseB =
                                RestAssured
                                        .given()
                                        .get(String.valueOf(B))
                                        .as(List.class);
                        System.out.println("Amount of data is : " +ResponseB.size());
                        Assert.assertEquals(ResponseB.size(), 1);
                        System.out.println("===============================================\n");

                            responseB.then().body("[0].id",equalTo(5))
                                    .body("[0].name", equalTo("Avery Brown Dredge"))
                                    .body("[0].tagline",equalTo("Bloggers' Imperial Pilsner."))
                                    .body("[0].first_brewed",equalTo("02/2011"))
                                    .body("[0].description",equalTo("An Imperial Pilsner in collaboration with beer writers. Tradition. Homage. Revolution. We wanted to showcase the awesome backbone of the Czech brewing tradition, the noble Saaz hop, and also tip our hats to the modern beers that rock our world, and the people who make them."))
                                    .body("[0].image_url",equalTo("https://images.punkapi.com/v2/5.png"))
                                    .body("[0].abv",equalTo(7.2F))
                                    .body("[0].ibu",equalTo(59))
                                    .body("[0].target_fg",equalTo(1027))
                                    .body("[0].target_og",equalTo(1069))
                                    .body("[0].ebc",equalTo(10))
                                    .body("[0].srm",equalTo(5))
                                    .body("[0].ph",equalTo(4.4F))
                                    .body("[0].attenuation_level",equalTo(67))
                                        .body("[0].volume.value",equalTo(20))
                                        .body("[0].volume.unit",equalTo("litres"))
                                            .body("[0].boil_volume.value",equalTo(25))
                                            .body("[0].boil_volume.unit",equalTo("litres"))
                                                .body("[0].method.mash_temp[0].temp.unit",equalTo("celsius"))
                                                .body("[0].method.mash_temp[0].duration",equalTo(70))
                                                .body("[0].method.fermentation.temp.value",equalTo(10))
                                                .body("[0].method.fermentation.temp.unit",equalTo("celsius"))
                                                .body("[0].method.twist",equalTo(null))
                                                    .body("[0].ingredients.malt[0].name",equalTo("Lager Malt"))
                                                    .body("[0].ingredients.malt[0].amount.value",equalTo(6.63F))
                                                    .body("[0].ingredients.malt[0].amount.unit",equalTo("kilograms"))
                                                    .body("[0].ingredients.malt[1].name",equalTo("Wheat"))
                                                    .body("[0].ingredients.malt[1].amount.value",equalTo(0.38F))
                                                    .body("[0].ingredients.malt[1].amount.unit",equalTo("kilograms"))
                                                        .body("[0].ingredients.hops[0].name",equalTo("Saaz"))
                                                        .body("[0].ingredients.hops[0].amount.value",equalTo(60))
                                                        .body("[0].ingredients.hops[0].amount.unit",equalTo("grams"))
                                                        .body("[0].ingredients.hops[0].add",equalTo("start"))
                                                        .body("[0].ingredients.hops[0].attribute",equalTo("bitter"))
                                                        .body("[0].ingredients.hops[1].name",equalTo("Saaz"))
                                                        .body("[0].ingredients.hops[1].amount.value",equalTo(60))
                                                        .body("[0].ingredients.hops[1].amount.unit",equalTo("grams"))
                                                        .body("[0].ingredients.hops[1].add",equalTo("middle"))
                                                        .body("[0].ingredients.hops[1].attribute",equalTo("flavour"))
                                                        .body("[0].ingredients.hops[2].name",equalTo("Saaz"))
                                                        .body("[0].ingredients.hops[2].amount.value",equalTo(60))
                                                        .body("[0].ingredients.hops[2].amount.unit",equalTo("grams"))
                                                        .body("[0].ingredients.hops[2].add",equalTo("end"))
                                                        .body("[0].ingredients.hops[2].attribute",equalTo("flavour"))
                                                        .body("[0].ingredients.yeast",equalTo("Wyeast 2007 - Pilsen Lager™"))
                                                            .body("[0].food_pairing[0]",equalTo("Vietnamese squid salad"))
                                                            .body("[0].food_pairing[1]",equalTo("Chargrilled corn on the cob with paprika butter"))
                                                            .body("[0].food_pairing[2]",equalTo("Strawberry and rhubarb pie"))
                                                                .body("[0].brewers_tips",equalTo("Make sure you have a big enough yeast starter to ferment through the OG and lager successfully."))
                                                                    .and().body("[0].contributed_by",equalTo("Sam Mason <samjbmason>"));

    }

    @Test(priority =2)
    public void C_GetRequestPUNKApiAutomation() {

        RequestSpecification http = RestAssured.given();
                Response responseC = http.request(Method.GET, String.valueOf(C));
                    String responseObjectC = responseC.getBody().asString();
                        System.out.println("My responses with value 1 is : " + responseObjectC);
                    int statuscodeC = responseC.getStatusCode();
                        System.out.println("My responses status code with value 1 is : " + statuscodeC);
                            Assert.assertEquals(statuscodeC, statusCode);
                    String StatuslineC = responseC.getStatusLine();
                            Assert.assertEquals(statuscodeC, statusCode);
                        System.out.println("My status line C: " + StatuslineC);

                            List<Object> ResponseC =
                                    RestAssured
                                            .given()
                                            .get(String.valueOf(C))
                                            .as(List.class);

                                System.out.println("Amount of data is : " +ResponseC.size());
                                Assert.assertEquals(ResponseC.size(), 1);
                                System.out.println("===============================================");

                            responseC.then().body("[0].id",equalTo(1))
                                    .body("[0].name", equalTo("Buzz"))
                                    .body("[0].tagline", equalTo("A Real Bitter Experience."))
                                    .body("[0].first_brewed", equalTo("09/2007"))
                                    .body("[0].description", equalTo("A light, crisp and bitter IPA brewed with English and American hops. A small batch brewed only once."))
                                    .body("[0].image_url", equalTo("https://images.punkapi.com/v2/keg.png"))
                                    .body("[0].abv", equalTo(4.5F))
                                    .body("[0].ibu", equalTo(60))
                                    .body("[0].target_fg", equalTo(1010))
                                    .body("[0].target_og", equalTo(1044))
                                    .body("[0].ebc", equalTo(20))
                                    .body("[0].srm", equalTo(10))
                                    .body("[0].ph", equalTo(4.4F))
                                    .body("[0].attenuation_level", equalTo(75))
                                        .body("[0].volume.value", equalTo(20))
                                        .body("[0].volume.unit", equalTo("litres"))
                                            .body("[0].boil_volume.value", equalTo(25))
                                            .body("[0].boil_volume.unit", equalTo("litres"))
                                                .body("[0].method.mash_temp[0].temp.value", equalTo(64))
                                                .body("[0].method.mash_temp[0].temp.unit", equalTo("celsius"))
                                                .body("[0].method.mash_temp[0].duration", equalTo(75))
                                                .body("[0].method.fermentation.temp.value", equalTo(19))
                                                .body("[0].method.fermentation.temp.unit",equalTo("celsius"))
                                                .body("[0].method.twist", equalTo(null))
                                                    .body("[0].ingredients.malt[0].name", equalTo("Maris Otter Extra Pale"))
                                                    .body("[0].ingredients.malt[0].amount.value", equalTo(3.3F))
                                                    .body("[0].ingredients.malt[0].amount.unit", equalTo("kilograms"))
                                                    .body("[0].ingredients.malt[1].name", equalTo("Caramalt"))
                                                    .body("[0].ingredients.malt[1].amount.value", equalTo(0.2F))
                                                    .body("[0].ingredients.malt[1].amount.unit", equalTo("kilograms"))
                                                    .body("[0].ingredients.malt[2].name", equalTo("Munich"))
                                                    .body("[0].ingredients.malt[2].amount.value", equalTo(0.4F))
                                                    .body("[0].ingredients.malt[2].amount.unit", equalTo("kilograms"))
                                                        .body("[0].ingredients.hops[0].name", equalTo("Fuggles"))
                                                        .body("[0].ingredients.hops[0].amount.value", equalTo(25))
                                                        .body("[0].ingredients.hops[0].amount.unit", equalTo("grams"))
                                                        .body("[0].ingredients.hops[0].add", equalTo("start"))
                                                        .body("[0].ingredients.hops[0].attribute", equalTo("bitter"))
                                                        .body("[0].ingredients.hops[1].name", equalTo("First Gold"))
                                                        .body("[0].ingredients.hops[1].amount.value", equalTo(25))
                                                        .body("[0].ingredients.hops[1].amount.unit", equalTo("grams"))
                                                        .body("[0].ingredients.hops[1].add", equalTo("start"))
                                                        .body("[0].ingredients.hops[1].attribute", equalTo("bitter"))
                                                        .body("[0].ingredients.hops[2].name", equalTo("Fuggles"))
                                                        .body("[0].ingredients.hops[2].amount.value", equalTo(37.5F))
                                                        .body("[0].ingredients.hops[2].amount.unit", equalTo("grams"))
                                                        .body("[0].ingredients.hops[2].add", equalTo("middle"))
                                                        .body("[0].ingredients.hops[2].attribute", equalTo("flavour"))
                                                        .body("[0].ingredients.hops[3].name", equalTo("First Gold"))
                                                        .body("[0].ingredients.hops[3].amount.value", equalTo(37.5F))
                                                        .body("[0].ingredients.hops[3].amount.unit", equalTo("grams"))
                                                        .body("[0].ingredients.hops[3].add", equalTo("middle"))
                                                        .body("[0].ingredients.hops[3].attribute", equalTo("flavour"))
                                                        .body("[0].ingredients.hops[4].name", equalTo("Cascade"))
                                                        .body("[0].ingredients.hops[4].amount.value", equalTo(37.5F))
                                                        .body("[0].ingredients.hops[4].amount.unit", equalTo("grams"))
                                                        .body("[0].ingredients.hops[4].add", equalTo("end"))
                                                        .body("[0].ingredients.hops[4].attribute", equalTo("flavour"))
                                                        .body("[0].ingredients.yeast", equalTo("Wyeast 1056 - American Ale™"))
                                                            .body("[0].food_pairing[0]", equalTo("Spicy chicken tikka masala"))
                                                            .body("[0].food_pairing[1]", equalTo("Grilled chicken quesadilla"))
                                                            .body("[0].food_pairing[2]", equalTo("Caramel toffee cake"))
                                                                .body("[0].brewers_tips", equalTo("The earthy and floral aromas from the hops can be overpowering. Drop a little Cascade in at the end of the boil to lift the profile with a bit of citrus."))
                                                                    .and().body("[0].contributed_by", equalTo("Sam Mason <samjbmason>"));

    }

}
