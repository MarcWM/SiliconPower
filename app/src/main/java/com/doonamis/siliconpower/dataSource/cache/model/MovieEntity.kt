package com.doonamis.siliconpower.dataSource.cache.model

data class MovieEntity (

    val pageNumber: Int,

    val resultsList: ArrayList<ResultsEntityModel>,
    
    val totalResults: Int,

    val totalPages: Int,
)

data class ResultsEntityModel (

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