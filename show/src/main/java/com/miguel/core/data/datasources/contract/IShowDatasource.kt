package com.miguel.core.data.datasources.contract

import com.miguel.core.data.entities.ShowEntity

interface IShowDatasource {

    fun getByPage(page: Int): List<ShowEntity>

}