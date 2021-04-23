package com.doonamis.siliconpower.dataSource.network.model

import com.google.gson.annotations.SerializedName

data class MovieDto (

    @SerializedName("page")
    val pageNumber: Int,

    @SerializedName("results")
    val resultsList: ArrayList<ResultsDtoModel>,

    @SerializedName("total_results")
    val totalResults: Int,

    @SerializedName("total_pages")
    val totalPages: Int,
)

data class ResultsDtoModel (

    @SerializedName("poster_path")
    val posterPath: String?,

    @SerializedName("popularity")
    val popularity: Double,

    @SerializedName("id")
    val id: Int,

    @SerializedName("backdrop_path")
    val backdropPath: String?,

    @SerializedName("vote_average")
    val voteAverage: Double,

    @SerializedName("overview")
    val overview: String,

    @SerializedName("first_air_date")
    val firstAirDate: String,

    @SerializedName("origin_country")
    val originCountry: List<String>,

    @SerializedName("genre_ids")
    val genreIDS: List<Int>,

    @SerializedName("original_language")
    val originalLanguage: String,

    @SerializedName("vote_count")
    val voteCount: Int,

    val name: String,

    @SerializedName("original_name")
    val originalName: String
)

/*enum class OriginCountry(val value: String) {
    GB("Great Britain"),
    Jp("Japan"),
    Us("United States");

    companion object {
        fun fromValue(value: String): OriginCountry = when (value) {
            "GB" -> GB
            "JP" -> Jp
            "US" -> Us
            else -> throw IllegalArgumentException()
        }
    }
}

enum class OriginalLanguage(val value: String) {
    En("English"),
    Ja("Japanese");

    companion object {
        fun fromValue(value: String): OriginalLanguage = when (value) {
            "en" -> En
            "ja" -> Ja
            else -> throw IllegalArgumentException()
        }
    }
}*/
