package com.doonamis.siliconpower.dataSource.network.mapper

import com.doonamis.siliconpower.dataSource.network.model.MovieDto
import com.doonamis.siliconpower.dataSource.network.model.ResultsDtoModel
import com.doonamis.siliconpower.repository.model.Movie
import com.doonamis.siliconpower.repository.model.ResultsModel
import java.util.ArrayList
import javax.inject.Inject

class SPMovieNetworkMapperImpl
@Inject constructor(): SPMovieNetworkMapper<MovieDto, Movie> {

    override fun mapToDtoModel(model: MovieDto): Movie {
        return Movie(
            pageNumber = model.pageNumber,
            resultsList = getAllResultsListToDto(model.resultsList),
            totalResults = model.totalResults,
            totalPages = model.totalPages
        )
    }

    private fun getAllResultsListToDto(resultsList: ArrayList<ResultsDtoModel>): ArrayList<ResultsModel> {
        val results = arrayListOf<ResultsModel>()

        for (result in resultsList) {
            results.add(
                ResultsModel(
                    posterPath = result.posterPath,
                    popularity = result.popularity,
                    id = result.id,
                    backdropPath = result.backdropPath,
                    voteAverage = result.voteAverage,
                    overview = result.overview,
                    firstAirDate = result.firstAirDate,
                    originCountry = result.originCountry,
                    genreIDS = result.genreIDS,
                    originalLanguage = result.originalLanguage,
                    voteCount = result.voteCount,
                    name = result.name,
                    originalName = result.originalName
                )
            )
        }

        return results
    }

    override fun mapFromDtoModel(dtoModel: Movie): MovieDto {
        return MovieDto(
            pageNumber = dtoModel.pageNumber,
            resultsList = getAllResultsListFromDto(dtoModel.resultsList),
            totalResults = dtoModel.totalResults,
            totalPages = dtoModel.totalPages
        )
    }

    private fun getAllResultsListFromDto(resultsList: ArrayList<ResultsModel>): ArrayList<ResultsDtoModel> {
        val results = arrayListOf<ResultsDtoModel>()

        for (result in resultsList) {
            results.add(
                ResultsDtoModel(
                    posterPath = result.posterPath,
                    popularity = result.popularity,
                    id = result.id,
                    backdropPath = result.backdropPath,
                    voteAverage = result.voteAverage,
                    overview = result.overview,
                    firstAirDate = result.firstAirDate,
                    originCountry = result.originCountry,
                    genreIDS = result.genreIDS,
                    originalLanguage = result.originalLanguage,
                    voteCount = result.voteCount,
                    name = result.name,
                    originalName = result.originalName
                )
            )
        }

        return results
    }
}