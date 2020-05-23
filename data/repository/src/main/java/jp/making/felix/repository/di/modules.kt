package jp.making.felix.repository.di

import jp.making.felix.repository.PathRepository
import jp.making.felix.repository.RoadRepository
import jp.making.felix.repository.impl.PathRepositoryImpl
import jp.making.felix.repository.impl.RoadRepositoryImpl
import org.koin.dsl.module

val repositoryModule = module {
    single<PathRepository> { PathRepositoryImpl(get()) }
    single<RoadRepository> { RoadRepositoryImpl(get()) }
}