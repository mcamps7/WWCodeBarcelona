package com.womenwhocode.android.workshop.spacex.domain.model

/**
 * Created by Rocio Ortega on 19/05/2018.
 */
data class Launch(
        val flightNumber: Int,
        val missionName: String,
        val launchYear: String,
        val launchDateUnix: Long,
        val launchSuccess: Boolean,
        val details: String?,
        val rocket: Rocket,
        val site: Site,
        val image: String,
        val smallImage: String)

data class Rocket(
        val id: String,
        val name: String,
        val type: String)

data class Site(
        val id: String,
        val name: String,
        val nameLong: String)
