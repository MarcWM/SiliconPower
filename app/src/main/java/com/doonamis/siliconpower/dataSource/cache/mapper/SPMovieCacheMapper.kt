package com.doonamis.siliconpower.dataSource.cache.mapper

interface SPMovieCacheMapper <T, EntityModel>{

    fun mapToEntityModel(model: T): EntityModel

    fun mapFromEntityModel(entityModel: EntityModel): T
}