package com.doonamis.siliconpower.di

import com.doonamis.siliconpower.dataSource.cache.SPMovieCacheDataSource
import com.doonamis.siliconpower.dataSource.network.SPMovieNetworkDataSource
import com.doonamis.siliconpower.repository.SPMovieRepository
import com.doonamis.siliconpower.repository.SPMovieRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideSiliconPowerRepository(
        cacheDataSource: SPMovieCacheDataSource,
        networkDataSource: SPMovieNetworkDataSource
    ): SPMovieRepository {
        return SPMovieRepositoryImpl(
            cacheDataSource,
            networkDataSource
        )
    }

}