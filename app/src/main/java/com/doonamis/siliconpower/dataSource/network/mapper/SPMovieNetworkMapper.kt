package com.doonamis.siliconpower.dataSource.network.mapper

interface SPMovieNetworkMapper <T, DtoModel>{

    fun mapToDtoModel(model: T): DtoModel

    fun mapFromDtoModel(dtoModel: DtoModel): T
}