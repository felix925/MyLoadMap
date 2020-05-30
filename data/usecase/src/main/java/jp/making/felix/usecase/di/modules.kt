package jp.making.felix.usecase.di

import jp.making.felix.usecase.GetPathUseCase
import jp.making.felix.usecase.GetRoadUseCase
import jp.making.felix.usecase.OperatePathUseCase
import jp.making.felix.usecase.OperateRoadUseCase
import jp.making.felix.usecase.impl.GetPathUseCaseImpl
import jp.making.felix.usecase.impl.GetRoadUseCaseImpl
import jp.making.felix.usecase.impl.OperatePathUseCaseImpl
import jp.making.felix.usecase.impl.OperateRoadUseCaseImpl
import org.koin.dsl.module

val useCaseModule = module {
    single<GetRoadUseCase>{ GetRoadUseCaseImpl(get()) }
    single<GetPathUseCase> { GetPathUseCaseImpl(get()) }
    single<OperateRoadUseCase> { OperateRoadUseCaseImpl(get()) }
    single<OperatePathUseCase> { OperatePathUseCaseImpl(get()) }
}