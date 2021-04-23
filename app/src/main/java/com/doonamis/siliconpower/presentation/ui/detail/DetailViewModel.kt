package com.doonamis.siliconpower.presentation.ui.detail

import androidx.lifecycle.ViewModel
import com.doonamis.siliconpower.presentation.domain.mapper.PresentationMapperImpl
import com.doonamis.siliconpower.repository.SPMovieRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DetailViewModel

@Inject
constructor(
    private val repository: SPMovieRepository,
    private val mapper: PresentationMapperImpl,
): ViewModel(){


}