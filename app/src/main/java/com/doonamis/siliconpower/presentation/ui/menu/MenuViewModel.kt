package com.doonamis.siliconpower.presentation.ui.menu

import androidx.lifecycle.ViewModel
import com.doonamis.siliconpower.presentation.domain.mapper.PresentationMapperImpl
import com.doonamis.siliconpower.repository.SPMovieRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MenuViewModel
@Inject
constructor(
    private val repository: SPMovieRepository,
    private val mapper: PresentationMapperImpl,
): ViewModel(){

}