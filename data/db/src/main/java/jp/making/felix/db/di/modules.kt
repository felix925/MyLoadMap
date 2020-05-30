package jp.making.felix.db.di

import androidx.room.Room
import jp.making.felix.db.LocalDataBase
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val dbModule = module {
    single {
        Room.databaseBuilder(androidContext(), LocalDataBase::class.java, "LocalDataBase.db")
            .build()
    }
    factory { get<LocalDataBase>().roadDao() }
    factory { get<LocalDataBase>().pathDao() }
}