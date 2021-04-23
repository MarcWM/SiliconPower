package com.doonamis.siliconpower.repository

import com.doonamis.siliconpower.dataSource.cache.SPMovieCacheDataSource
import com.doonamis.siliconpower.dataSource.network.SPMovieNetworkDataSource

class SPMovieRepositoryImpl
constructor(
    cacheDataSource: SPMovieCacheDataSource,
    networkDataSource: SPMovieNetworkDataSource
) : SPMovieRepository