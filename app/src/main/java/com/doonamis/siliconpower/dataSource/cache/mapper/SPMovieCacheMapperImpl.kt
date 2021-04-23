package com.doonamis.siliconpower.dataSource.cache.mapper

import com.doonamis.siliconpower.dataSource.cache.model.MovieEntity
import com.doonamis.siliconpower.dataSource.cache.model.ResultsEntityModel
import com.doonamis.siliconpower.repository.model.Movie
import com.doonamis.siliconpower.repository.model.ResultsModel
import java.util.ArrayList
import javax.inject.Inject

class SPMovieCacheMapperImpl
@Inject constructor(): SPMovieCacheMapper<MovieEntity, Movie> {

    override fun mapToEntityModel(model: MovieEntity): Movie {
        return Movie(
            pageNumber = model.pageNumber,
            resultsList = getAllResultsListToEntity(model.resultsList),
            totalResults = model.totalResults,
            totalPages = model.totalPages
        )
    }

    private fun getAllResultsListToEntity(resultsList: ArrayList<ResultsEntityModel>): ArrayList<ResultsModel> {
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

    override fun mapFromEntityModel(entityModel: Movie): MovieEntity {
        return MovieEntity(
            pageNumber = entityModel.pageNumber,
            resultsList = getAllResultsListFromEntity(entityModel.resultsList),
            totalResults = entityModel.totalResults,
            totalPages = entityModel.totalPages
        )
    }

    private fun getAllResultsListFromEntity(resultsList: ArrayList<ResultsModel>): ArrayList<ResultsEntityModel> {
        val results = arrayListOf<ResultsEntityModel>()

        for (result in resultsList) {
            results.add(
                ResultsEntityModel(
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