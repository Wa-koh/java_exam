"use strict";

// 問1
console.log("問1");
console.log("若井田康太");

// 問2 ~ 5
$(function () {
    $("#q2_btn").on("click", function () {
        $("#q2").css("color", "red");
    });

    $("#q3_btn").on("click", function () {
        alert($("#q3"));
    });

    $("#q4_btn").on("click", function () {
        $("#q4_btn").prop("disabled", true);
    })

    $("#q3").on("click", function () {
        $("#defo").show("初期表示");
        $("#java").show('System.out.println("Hello World");');
        $("#javascript").show('console.log("Hello World");');
    });
});
