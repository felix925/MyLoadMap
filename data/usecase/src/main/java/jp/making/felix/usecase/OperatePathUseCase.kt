package jp.making.felix.usecase

import jp.making.felix.androidcomponent.entity.Path

interface OperatePathUseCase {
    fun insertPath(path: Path)
    fun deletePath(path: Path)
}