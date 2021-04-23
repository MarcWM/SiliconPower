package com.doonamis.siliconpower.di

import com.doonamis.siliconpower.dataSource.cache.db.SPMovieDao
import com.doonamis.siliconpower.dataSource.cache.db.SPMovieDatabase
import com.doonamis.siliconpower.dataSource.cache.mapper.SPMovieCacheMapper
import com.doonamis.siliconpower.dataSource.cache.mapper.SPMovieCacheMapperImpl
import com.doonamis.siliconpower.dataSource.cache.model.MovieEntity
import com.doonamis.siliconpower.dataSource.network.service.SPMovieService
import com.doonamis.siliconpower.dataSource.network.mapper.SPMovieNetworkMapper
import com.doonamis.siliconpower.dataSource.network.mapper.SPMovieNetworkMapperImpl
import com.doonamis.siliconpower.dataSource.network.model.MovieDto
import com.doonamis.siliconpower.repository.model.Movie
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataSourceModule {

    @Singleton
    @Provides
    fun provideCacheMapper(): SPMovieCacheMapper<MovieEntity, Movie> {
        return SPMovieCacheMapperImpl()
    }

    @Singleton
    @Provides
    fun provideNetworkMapper(): SPMovieNetworkMapper<MovieDto, Movie> {
        return SPMovieNetworkMapperImpl()
    }

    @Singleton
    @Provides
    fun provideMovieDao(movieDatabase: SPMovieDatabase): SPMovieDao {
        return movieDatabase.movieDao()
    }

    @Singleton
    @Provides
    fun provideSiliconPowerService(): SPMovieService {
        return Retrofit.Builder()
            .baseUrl("https://developers.themoviedb.org/3/tv/")
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .build()
            .create(SPMovieService::class.java)
    }

    @Singleton
    @Provides
    @Named("api_key")
    fun provideApiKey(): String{
        return "c6aeee577586ba38e487b74dfede5deb"
    }
}