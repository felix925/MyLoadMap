package jp.making.felix.myroadmap.di

import jp.making.felix.db.di.dbModule
import jp.making.felix.home.di.viewModelModule
import jp.making.felix.repository.di.repositoryModule
import jp.making.felix.usecase.di.useCaseModule
import org.koin.core.module.Module

val moduleList: List<Module> = listOf(
    dbModule,
    repositoryModule,
    useCaseModule,
    viewModelModule
)