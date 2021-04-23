package com.doonamis.siliconpower.dataSource.cache

import com.doonamis.siliconpower.dataSource.cache.db.SPMovieDao
import com.doonamis.siliconpower.dataSource.cache.mapper.SPMovieCacheMapperImpl

class SPMovieCacheDataSourceImpl
constructor(
    private val movieDao: SPMovieDao,
    private val mapper: SPMovieCacheMapperImpl
): SPMovieCacheDataSource