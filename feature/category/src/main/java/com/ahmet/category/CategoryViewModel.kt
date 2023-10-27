package com.ahmet.category

import com.ahmet.common.base.BaseViewModel
import com.ahmet.common.base.IViewState
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CategoryViewModel @Inject constructor() : BaseViewModel<CategoryViewState>() {

    override fun createInitialState(): CategoryViewState = CategoryViewState()
}

data class CategoryViewState(
    val loading: Boolean = false,
    val title: String = "Category",
) : IViewState
