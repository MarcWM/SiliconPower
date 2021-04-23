package com.doonamis.siliconpower.repository.model

data class Movie (

    val pageNumber: Int,

    val resultsList: ArrayList<ResultsModel>,

    val totalResults: Int,

    val totalPages: Int,
)

data class ResultsModel (

    val posterPath: String?,

    val popularity: Double,

    val id: Int,

    val backdropPath: String?,

    val voteAverage: Double,

    val overview: String,

    val firstAirDate: String,

    val originCountry: List<String>,

    val genreIDS: List<Int>,

    val originalLanguage: String,

    val voteCount: Int,

    val name: String,

    val originalName: String
)