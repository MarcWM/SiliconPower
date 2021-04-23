package com.doonamis.siliconpower.dataSource.network

import com.doonamis.siliconpower.dataSource.network.mapper.SPMovieNetworkMapperImpl
import com.doonamis.siliconpower.dataSource.network.service.SPMovieService

class SPMovieNetworkDataSourceImpl
constructor(
    private val service: SPMovieService,
    private val mapper: SPMovieNetworkMapperImpl
): SPMovieNetworkDataSource