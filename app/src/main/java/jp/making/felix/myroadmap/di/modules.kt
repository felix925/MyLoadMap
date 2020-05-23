package jp.making.felix.myroadmap.di

import jp.making.felix.db.di.dbModule
import org.koin.core.module.Module

val moduleList:List<Module> = listOf(
    dbModule
)